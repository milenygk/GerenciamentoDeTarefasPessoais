/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Modelo;

/**
 *
 * @author mileny.1948
 */
public class ModMetas {
    private int id;
    private int idCategoria;
    private String meta;
    private int ano;
    private String categoria;

    public ModMetas() {
    }

    public ModMetas(int id, int idCategoria, String meta, int ano, String categoria) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.meta = meta;
        this.ano = ano;
        this.categoria = categoria;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    @Override
    public String toString() {
        return "ModMetas{"+ "id=" + id + ", idCategoria=" + idCategoria + ", meta=" + meta + ", ano=" + ano +  ", categoria=" + categoria + '}';
    }
}
