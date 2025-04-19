package com.mateus.empresa_crud.model;

import jakarta.persistence.*;

@Entity
@IdClass(PrestaServicoId.class)
public class PrestaServico {

    @Id
    private String cnpjEmpresa;

    @Id
    private Integer idServico;

    public String getCnpjEmpresa() { return cnpjEmpresa; }
    public void setCnpjEmpresa(String cnpjEmpresa) { this.cnpjEmpresa = cnpjEmpresa; }

    public Integer getIdServico() { return idServico; }
    public void setIdServico(Integer idServico) { this.idServico = idServico; }
}
