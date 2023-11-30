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
    private String novoHabito;

    public ModHabitos() {
    }

    public ModHabitos(int id, String novoHabito) {
        this.id = id;
        this.novoHabito = novoHabito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNovoHabito() {
        return novoHabito;
    }

    public void setNovoHabito(String novoHabito) {
        this.novoHabito = novoHabito;
    }

    @Override
    public String toString() {
        return "ModHabitos{" + "id=" + id + ", novoHabito=" + novoHabito + '}';
    }
}
