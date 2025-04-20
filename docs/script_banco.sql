CREATE TABLE "Empresa" (
  "CNPJ" VARCHAR(18) PRIMARY KEY,
  "FILIAL" VARCHAR(50),
  "ENDERECO" VARCHAR(255),
  "NOME" VARCHAR(100) NOT NULL
);

CREATE TABLE "Funcionario" (
  "CPF" VARCHAR(14) PRIMARY KEY,
  "ID" INT UNIQUE NOT NULL,
  "SETOR" VARCHAR(50),
  "TELEFONE" VARCHAR(20),
  "NOME_COMPLETO" VARCHAR(100) NOT NULL
);

CREATE TABLE "Estoque" (
  "ID_Estoque" SERIAL PRIMARY KEY,
  "LOCALIZACAO" VARCHAR(255)
);

CREATE TABLE "Materiais" (
  "ID_Material" SERIAL PRIMARY KEY,
  "TIPO" VARCHAR(50),
  "DATA" DATE,
  "MODELO" VARCHAR(50),
  "MARCA_FABRICANTE" VARCHAR(100)
);

CREATE TABLE "EstoqueMateriais" (
  "ID_Estoque" INT,
  "ID_Material" INT,
  "QUANTIDADE" INT
);

CREATE TABLE "Movimentacao_Estoque" (
  "ID" SERIAL PRIMARY KEY,
  "ID_Estoque" INT,
  "ID_Material" INT,
  "TIPO_MOVIMENTACAO" VARCHAR(10),
  "DATA_MOVIMENTACAO" DATE,
  "QUANTIDADE" INT,
  "RESPONSAVEL" VARCHAR(100)
);

CREATE TABLE "Fornecedor" (
  "ID_Fornecedor" SERIAL PRIMARY KEY,
  "MARCA" VARCHAR(100),
  "ENDERECO" VARCHAR(255)
);

CREATE TABLE "Pedido_Compra" (
  "ID" SERIAL PRIMARY KEY,
  "ID_Fornecedor" INT,
  "DATA_COMPRA" DATE,
  "QUANTIDADE" INT,
  "VALOR_UNITARIO" DECIMAL(10,2),
  "STATUS" VARCHAR(20)
);

CREATE TABLE "Cliente" (
  "ID" SERIAL PRIMARY KEY,
  "CONTATO" VARCHAR(50),
  "NOME" VARCHAR(100),
  "CNPJ" VARCHAR(18),
  "ENDERECO" VARCHAR(255)
);

CREATE TABLE "Servicos" (
  "ID_Servico" SERIAL PRIMARY KEY,
  "RELATORIO" TEXT,
  "DATA" DATE,
  "ORCAMENTO" DECIMAL(10,2)
);

CREATE TABLE "Contrata" (
  "ID" SERIAL PRIMARY KEY,
  "ID_Cliente" INT,
  "ID_Servico" INT,
  "VALOR_SERVICO" DECIMAL(10,2),
  "OBSERVACOES" TEXT,
  "DATA_ATENDIMENTO" DATE
);

CREATE TABLE "Execucao" (
  "ID" SERIAL PRIMARY KEY,
  "ID_Funcionario" VARCHAR(14),
  "ID_Servico" INT,
  "STATUS" VARCHAR(20),
  "DURACAO_ESTIMADA" INTERVAL,
  "DATA_EXECUCAO" DATE,
  "DATA_CONCLUSAO" DATE
);

CREATE TABLE "Presta_Servico" (
  "CNPJ_Empresa" VARCHAR(18),
  "ID_Servico" INT
);

CREATE TABLE "Recebe_Servico" (
  "ID_Cliente" INT,
  "ID_Servico" INT,
  "DATA_INICIO" DATE
);

CREATE TABLE "EmpresaFuncionario" (
  "CNPJ_Empresa" VARCHAR(18),
  "CPF_Funcionario" VARCHAR(14)
);

COMMENT ON COLUMN "Materiais"."TIPO" IS 'Para uso ou Para venda';

COMMENT ON COLUMN "Movimentacao_Estoque"."TIPO_MOVIMENTACAO" IS 'Entrada ou Saída';

COMMENT ON COLUMN "Pedido_Compra"."STATUS" IS 'Aguardando entrega, Entregue, Cancelado, Em andamento';

COMMENT ON COLUMN "Execucao"."STATUS" IS 'Pendente, Em andamento, Concluído';

ALTER TABLE "EstoqueMateriais" ADD FOREIGN KEY ("ID_Estoque") REFERENCES "Estoque" ("ID_Estoque");

ALTER TABLE "EstoqueMateriais" ADD FOREIGN KEY ("ID_Material") REFERENCES "Materiais" ("ID_Material");

ALTER TABLE "Movimentacao_Estoque" ADD FOREIGN KEY ("ID_Estoque") REFERENCES "Estoque" ("ID_Estoque");

ALTER TABLE "Movimentacao_Estoque" ADD FOREIGN KEY ("ID_Material") REFERENCES "Materiais" ("ID_Material");

ALTER TABLE "Pedido_Compra" ADD FOREIGN KEY ("ID_Fornecedor") REFERENCES "Fornecedor" ("ID_Fornecedor");

ALTER TABLE "Contrata" ADD FOREIGN KEY ("ID_Cliente") REFERENCES "Cliente" ("ID");

ALTER TABLE "Contrata" ADD FOREIGN KEY ("ID_Servico") REFERENCES "Servicos" ("ID_Servico");

ALTER TABLE "Execucao" ADD FOREIGN KEY ("ID_Funcionario") REFERENCES "Funcionario" ("CPF");

ALTER TABLE "Execucao" ADD FOREIGN KEY ("ID_Servico") REFERENCES "Servicos" ("ID_Servico");

ALTER TABLE "Presta_Servico" ADD FOREIGN KEY ("CNPJ_Empresa") REFERENCES "Empresa" ("CNPJ");

ALTER TABLE "Presta_Servico" ADD FOREIGN KEY ("ID_Servico") REFERENCES "Servicos" ("ID_Servico");

ALTER TABLE "Recebe_Servico" ADD FOREIGN KEY ("ID_Cliente") REFERENCES "Cliente" ("ID");

ALTER TABLE "Recebe_Servico" ADD FOREIGN KEY ("ID_Servico") REFERENCES "Servicos" ("ID_Servico");

ALTER TABLE "EmpresaFuncionario" ADD FOREIGN KEY ("CNPJ_Empresa") REFERENCES "Empresa" ("CNPJ");

ALTER TABLE "EmpresaFuncionario" ADD FOREIGN KEY ("CPF_Funcionario") REFERENCES "Funcionario" ("CPF");