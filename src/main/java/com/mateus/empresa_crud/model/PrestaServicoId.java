package com.mateus.empresa_crud.model;

import java.io.Serializable;
import java.util.Objects;

public class PrestaServicoId implements Serializable {
    private String cnpjEmpresa;
    private Integer idServico;

    public PrestaServicoId() {}

    public PrestaServicoId(String cnpjEmpresa, Integer idServico) {
        this.cnpjEmpresa = cnpjEmpresa;
        this.idServico = idServico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrestaServicoId)) return false;
        PrestaServicoId that = (PrestaServicoId) o;
        return Objects.equals(cnpjEmpresa, that.cnpjEmpresa) &&
               Objects.equals(idServico, that.idServico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpjEmpresa, idServico);
    }
}
