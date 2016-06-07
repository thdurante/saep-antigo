package br.com.inf.model;

import java.util.Set;

public class Grupo extends Tipo{
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
