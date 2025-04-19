package com.mateus.empresa_crud.model;

import jakarta.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String contato;

    @Column(length = 100)
    private String nome;

    @Column(length = 18)
    private String cnpj;

    @Column(length = 255)
    private String endereco;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getContato() { return contato; }
    public void setContato(String contato) { this.contato = contato; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}
