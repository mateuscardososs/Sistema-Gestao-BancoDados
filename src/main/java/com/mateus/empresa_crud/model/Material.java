package com.mateus.empresa_crud.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "material")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_material")
    private Integer idMaterial;

    @Column(name = "data")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate data;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "tipo_material")
    private String tipo;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "marca_fabricante")
    private String marcaFabricante;

    @Column(name = "localizacao")
    private String localizacao;

    // Getters e Setters
    public Integer getIdMaterial() { return idMaterial; }
    public void setIdMaterial(Integer idMaterial) { this.idMaterial = idMaterial; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getMarcaFabricante() { return marcaFabricante; }
    public void setMarcaFabricante(String marcaFabricante) { this.marcaFabricante = marcaFabricante; }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
}   