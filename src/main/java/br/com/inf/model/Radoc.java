/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package br.com.inf.model;

import java.util.Date;
import java.util.List;

/**
 * Relatório contendo relatos associados a um docente.
 */
public class Radoc {

    /**
     * Identificador único do relatório.
     */
    private String guid;

    /**
     * Ano base do relatório.
     */
    private int anoBase;

    private List<Relato> relatos;

    /**
     * Cria um relatório identificadaPor relatos.
     *
     * @param relatos Conjunto identificadaPor relatos que fazem parte
     *                do relatório.
     */
    public Radoc(List<Relato> relatos) {
        if (relatos == null) {
            throw new IllegalArgumentException("relatos");
        }

        this.relatos = relatos;
    }

    /*
    * Getters and setters
    */

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public void setAnoBase(int anoBase) {
        this.anoBase = anoBase;
    }

    public String getGuid() {
        return guid;
    }

    public int getAnoBase() {
        return anoBase;
    }

    public List<Relato> getRelatos() {
        return relatos;
    }
}
