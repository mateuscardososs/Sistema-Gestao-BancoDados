package com.mateus.empresa_crud.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idServico;

    @Lob
    private String relatorio;

    private LocalDate data;

    @Column(precision = 10, scale = 2)
    private BigDecimal orcamento;

    public Integer getIdServico() { return idServico; }
    public void setIdServico(Integer idServico) { this.idServico = idServico; }

    public String getRelatorio() { return relatorio; }
    public void setRelatorio(String relatorio) { this.relatorio = relatorio; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public BigDecimal getOrcamento() { return orcamento; }
    public void setOrcamento(BigDecimal orcamento) { this.orcamento = orcamento; }
}
