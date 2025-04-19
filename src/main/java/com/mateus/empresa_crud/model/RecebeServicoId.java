package com.mateus.empresa_crud.model;

import java.io.Serializable;
import java.util.Objects;

public class RecebeServicoId implements Serializable {
    private Integer idCliente;
    private Integer idServico;

    public RecebeServicoId() {}

    public RecebeServicoId(Integer idCliente, Integer idServico) {
        this.idCliente = idCliente;
        this.idServico = idServico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecebeServicoId)) return false;
        RecebeServicoId that = (RecebeServicoId) o;
        return Objects.equals(idCliente, that.idCliente) &&
               Objects.equals(idServico, that.idServico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, idServico);
    }
}
