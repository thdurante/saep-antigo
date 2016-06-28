/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package br.com.inf.persistencia.model;

import java.util.Set;

/**
 * Tipos de relato podem estar classificados em
 * um grupo. Por exemplo, "aulas presenciais na graduação"
 * e "aulas do ensino a distância na graduação" são
 * tipos do grupo "graduação".
 */
public class Grupo extends Tipo {
    private Set<Tipo> tipos;

    /**
     * Cria um grupo (reunião de tipos).
     *
     * @param tipos Conjunto identificadaPor tipos contidos no grupo.
     * @param nome     O nome do grupo.
     * @param descricao A descrição do grupo.
     * @param codigo    O código do grupo.
     * @param atributos O conjunto de atributos definido para o grupo.
     */
    public Grupo(String nome,
                 String codigo,
                 String descricao,
                 Set<Atributo> atributos,
                 Set<Tipo> tipos) {
        super(nome, codigo, descricao, atributos);
        this.tipos = tipos;
    }

    public Set<Tipo> getTipos() {
        return tipos;
    }
}