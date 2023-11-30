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
    private String data;
    private String obrigacoes;

    public ModObrigacoes() {
    }

    public ModObrigacoes(int id, String data, String obrigacoes) {
        this.id = id;
        this.data = data;
        this.obrigacoes = obrigacoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getObrigacoes() {
        return obrigacoes;
    }

    public void setObrigacoes(String obrigacoes) {
        this.obrigacoes = obrigacoes;
    }

    @Override
    public String toString() {
        return "ModObrigacoes{" + "id=" + id + ", data=" + data + ", obrigacoes=" + obrigacoes + '}';
    }
}
