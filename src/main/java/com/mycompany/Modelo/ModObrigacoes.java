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
public class ModObrigacoes {
    private int id;
    private int idCategoria;
    private Date data;
    private String obrigacoes;

    public ModObrigacoes() {
    }

    public ModObrigacoes(int id, int idCategoria, Date data, String obrigacoes) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.data = data;
        this.obrigacoes = obrigacoes;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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

    public String getObrigacoes() {
        return obrigacoes;
    }

    public void setObrigacoes(String obrigacoes) {
        this.obrigacoes = obrigacoes;
    }
    
     @Override
    public String toString() {
        return "ModObrigacoes{"+ "id=" + id + ", idCategoria=" + idCategoria + ", data=" + data + ", obrigacoes=" + obrigacoes + '}';
    }
}
