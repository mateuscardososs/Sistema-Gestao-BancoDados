package com.mateus.empresa_crud.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Execucao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String idFuncionario;
    private Integer idServico;
    private String status;
    private String duracaoEstimada;
    private LocalDate dataExecucao;
    private LocalDate dataConclusao;

    @Column(length = 100)
    private String empresa; // NOVO CAMPO

    // Getters e Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getIdFuncionario() { return idFuncionario; }
    public void setIdFuncionario(String idFuncionario) { this.idFuncionario = idFuncionario; }

    public Integer getIdServico() { return idServico; }
    public void setIdServico(Integer idServico) { this.idServico = idServico; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getDuracaoEstimada() { return duracaoEstimada; }
    public void setDuracaoEstimada(String duracaoEstimada) { this.duracaoEstimada = duracaoEstimada; }

    public LocalDate getDataExecucao() { return dataExecucao; }
    public void setDataExecucao(LocalDate dataExecucao) { this.dataExecucao = dataExecucao; }

    public LocalDate getDataConclusao() { return dataConclusao; }
    public void setDataConclusao(LocalDate dataConclusao) { this.dataConclusao = dataConclusao; }

    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }
}