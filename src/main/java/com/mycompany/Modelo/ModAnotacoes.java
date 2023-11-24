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
public class ModAnotacoes {
    private int id;
    private int idCategoria;
    private Date data;
    private String anotacoes;

    public ModAnotacoes() {
    }

    public ModAnotacoes(int id, int idCategoria, Date data, String anotacoes) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.data = data;
        this.anotacoes = anotacoes;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
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
    
     @Override
    public String toString() {
        return "ModObrigacoes{"+ "id=" + id + ", idCategoria=" + idCategoria + ", data=" + data + ", anotacoes=" + anotacoes + '}';
    }
}
