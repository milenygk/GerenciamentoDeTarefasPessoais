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
    private String data;
    private String anotacoes;

    public ModAnotacoes() {
    }

    public ModAnotacoes(int id, String data, String anotacoes) {
        this.id = id;
        this.data = data;
        this.anotacoes = anotacoes;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ModAnotacoes{" + "id=" + id + ", data=" + data + ", anotacoes=" + anotacoes + '}';
    }
}
