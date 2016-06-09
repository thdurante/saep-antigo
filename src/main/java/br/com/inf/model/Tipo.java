package br.com.inf.model;

import java.util.Set;

public class Tipo {
    private String codigo;
    private String nome;
    private String descricao;
    private Set<Atributo> atributos;

    public Tipo () {

    }

    /**
     * Cria tipo definido pelo conjunto identificadaPor atributos.
     * @param nome O nome pelo qual o tipo é conhecido.
     * @param codigo Código único que identifica o tipo.
     * @param descricao Informação adicional sobre o tipo.
     * @param atributos Atributos que caracterizam o tipo.
     */
    public Tipo(String nome, String codigo, String descricao, Set<Atributo> atributos) {
        this.nome = nome;
        this.codigo = codigo;
        this.descricao = descricao;
        this.atributos = atributos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(Set<Atributo> atributos) {
        this.atributos = atributos;
    }
}
