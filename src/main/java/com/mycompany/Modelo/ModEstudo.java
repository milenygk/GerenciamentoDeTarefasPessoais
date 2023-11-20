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
    private int idCategoria;
    private Date data;
    private String materia;
    private String conteudo;
    private String tempoEstudo;

    public ModEstudo() {
    }

    public ModEstudo(int id, int idCategoria, Date data, String materia, String conteudo, String tempoEstudo) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.data = data;
        this.materia = materia;
        this.conteudo = conteudo;
        this.tempoEstudo = tempoEstudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTempoEstudo() {
        return tempoEstudo;
    }

    public void setTempoEstudo(String tempoEstudo) {
        this.tempoEstudo = tempoEstudo;
    }
    
     @Override
    public String toString() {
        return "ModEstudo{"+ "id=" + id + ", idCategoria=" + idCategoria + ", data=" + data + ", materia=" + materia +  ", conteudo=" + conteudo + ",tempoEstudo=" + tempoEstudo + '}';
    }
}
