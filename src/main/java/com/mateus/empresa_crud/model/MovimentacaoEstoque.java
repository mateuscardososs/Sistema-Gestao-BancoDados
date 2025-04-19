package com.mateus.empresa_crud.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Movimentacao_Estoque")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MovimentacaoEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_Material", referencedColumnName = "id_material")
    private Material material;

    @Column(name = "TIPO_MOVIMENTACAO")
    private String tipoMovimentacao;

    @Column(name = "DATA_MOVIMENTACAO")
    private LocalDate dataMovimentacao;

    @Column(name = "QUANTIDADE")
    private Integer quantidade;

    @Column(name = "RESPONSAVEL")
    private String responsavel;

    // Getters e Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Material getMaterial() { return material; }
    public void setMaterial(Material material) { this.material = material; }

    public String getTipoMovimentacao() { return tipoMovimentacao; }
    public void setTipoMovimentacao(String tipoMovimentacao) { this.tipoMovimentacao = tipoMovimentacao; }

    public LocalDate getDataMovimentacao() { return dataMovimentacao; }
    public void setDataMovimentacao(LocalDate dataMovimentacao) { this.dataMovimentacao = dataMovimentacao; }

    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }

    public String getResponsavel() { return responsavel; }
    public void setResponsavel(String responsavel) { this.responsavel = responsavel; }
}
