/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Modelo;

import java.sql.Date;

/**
 *
 * @author mileny.1948
 */
public class ModViagens {
    private int id;
    private int idCategoria;
    private Date dataIda;
    private String pais;
    private String estado;
    private String cidade;
    private Date dataVolta;
    private String detalhes;

    public ModViagens() {
    }

    public ModViagens(int id, int idCategoria, Date dataIda, String pais, String estado, String cidade, Date dataVolta, String detalhes) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.dataIda = dataIda;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.dataVolta = dataVolta;
        this.detalhes = detalhes;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getDataIda() {
        return dataIda;
    }

    public void setDataIda(Date dataIda) {
        this.dataIda = dataIda;
    }

    public Date getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(Date dataVolta) {
        this.dataVolta = dataVolta;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
     @Override
    public String toString() {
        return "ModViagens{"+ "id=" + id + ", idCategoria=" + idCategoria + ", dataIda=" + dataIda + ", pais=" + pais +  ", estado=" + estado + ",cidade=" + cidade + ", dataVolta=" + dataVolta + ", detalhes=" + detalhes + '}';
    }
}
