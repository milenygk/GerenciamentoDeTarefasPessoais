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
public class ModHobbies {
    private int id;
    private int idCategoria;
    private String esportes;
    private String jogos;
    private String leitura;
    private String filmes;
    private String series;

    public ModHobbies() {
    }

    public ModHobbies(int id, int idCategoria, String esportes, String jogos, String leitura, String filmes, String series) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.esportes = esportes;
        this.jogos = jogos;
        this.leitura = leitura;
        this.filmes = filmes;
        this.series = series;
    }

    public String getEsportes() {
        return esportes;
    }

    public void setEsportes(String esportes) {
        this.esportes = esportes;
    }

    public String getFilmes() {
        return filmes;
    }

    public void setFilmes(String filmes) {
        this.filmes = filmes;
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

    public String getJogos() {
        return jogos;
    }

    public void setJogos(String jogos) {
        this.jogos = jogos;
    }

    public String getLeitura() {
        return leitura;
    }

    public void setLeitura(String leitura) {
        this.leitura = leitura;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
    
      @Override
    public String toString() {
        return "ModHobbies{"+ "id=" + id + ", idCategoria=" + idCategoria + ", esportes=" + esportes + ", jogos=" + jogos +  ", leitura=" + leitura + ",filmes=" + filmes + ", series=" + series + '}';
    }
}
