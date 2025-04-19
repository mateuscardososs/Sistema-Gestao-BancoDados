package com.mateus.empresa_crud.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class PedidoCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer idFornecedor;
    private LocalDate dataCompra;
    private Integer quantidade;

    @Column(precision = 10, scale = 2)
    private BigDecimal valorUnitario;

    private String status;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getIdFornecedor() { return idFornecedor; }
    public void setIdFornecedor(Integer idFornecedor) { this.idFornecedor = idFornecedor; }

    public LocalDate getDataCompra() { return dataCompra; }
    public void setDataCompra(LocalDate dataCompra) { this.dataCompra = dataCompra; }

    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }

    public BigDecimal getValorUnitario() { return valorUnitario; }
    public void setValorUnitario(BigDecimal valorUnitario) { this.valorUnitario = valorUnitario; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
