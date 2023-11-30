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
public class ModTrabalho {
    private int id;
    private String data;
    private String importante;
    private String urgente;
    private String importanteUrgente;
    private String naoImportanteNemUrgente;

    public ModTrabalho() {
    }

    public ModTrabalho(int id, String data, String importante, String urgente, String importanteUrgente, String naoImportanteNemUrgente) {
        this.id = id;
        this.data = data;
        this.importante = importante;
        this.urgente = urgente;
        this.importanteUrgente = importanteUrgente;
        this.naoImportanteNemUrgente = naoImportanteNemUrgente;
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

    public String getImportante() {
        return importante;
    }

    public void setImportante(String importante) {
        this.importante = importante;
    }

    public String getUrgente() {
        return urgente;
    }

    public void setUrgente(String urgente) {
        this.urgente = urgente;
    }

    public String getImportanteUrgente() {
        return importanteUrgente;
    }

    public void setImportanteUrgente(String importanteUrgente) {
        this.importanteUrgente = importanteUrgente;
    }

    public String getNaoImportanteNemUrgente() {
        return naoImportanteNemUrgente;
    }

    public void setNaoImportanteNemUrgente(String naoImportanteNemUrgente) {
        this.naoImportanteNemUrgente = naoImportanteNemUrgente;
    }

    @Override
    public String toString() {
        return "ModTrabalho{" + "id=" + id + ", data=" + data + ", importante=" + importante + ", urgente=" + urgente + ", importanteUrgente=" + importanteUrgente + ", naoImportanteNemUrgente=" + naoImportanteNemUrgente + '}';
    }
}
