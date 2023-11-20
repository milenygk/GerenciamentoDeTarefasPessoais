/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Modelo;

/**
 *
 * @author mileny.1948
 */
public class ModHabitos {
    private int id;
    private int idCategoria;
    private String novoHabito;

    public ModHabitos() {
    }

    public ModHabitos(int id, int idCategoria, String novoHabito) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.novoHabito = novoHabito;
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

    public String getNovoHabito() {
        return novoHabito;
    }

    public void setNovoHabito(String novoHabito) {
        this.novoHabito = novoHabito;
    }
     
      @Override
    public String toString() {
        return "ModHabitos{"+ "id=" + id + ", idCategoria=" + idCategoria + ", novoHabito=" + novoHabito + '}';
    }
}
