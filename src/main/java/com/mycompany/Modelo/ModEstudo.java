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
public class ModEstudo {
    private int id;
    private String data;
    private String materia;
    private String conteudo;
    private String tempoEstudo;

    public ModEstudo(int id, String data, String materia, String conteudo, String tempoEstudo) {
        this.id = id;
        this.data = data;
        this.materia = materia;
        this.conteudo = conteudo;
        this.tempoEstudo = tempoEstudo;
    }

    public ModEstudo() {
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getTempoEstudo() {
        return tempoEstudo;
    }

    public void setTempoEstudo(String tempoEstudo) {
        this.tempoEstudo = tempoEstudo;
    }

    @Override
    public String toString() {
        return "ModEstudo{" + "id=" + id + ", data=" + data + ", materia=" + materia + ", conteudo=" + conteudo + ", tempoEstudo=" + tempoEstudo + '}';
    }
}
