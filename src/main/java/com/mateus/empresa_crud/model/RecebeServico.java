package com.mateus.empresa_crud.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@IdClass(RecebeServicoId.class)
public class RecebeServico {

    @Id
    private Integer idCliente;

    @Id
    private Integer idServico;

    private LocalDate dataInicio;

    public Integer getIdCliente() { return idCliente; }
    public void setIdCliente(Integer idCliente) { this.idCliente = idCliente; }

    public Integer getIdServico() { return idServico; }
    public void setIdServico(Integer idServico) { this.idServico = idServico; }

    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }
}
