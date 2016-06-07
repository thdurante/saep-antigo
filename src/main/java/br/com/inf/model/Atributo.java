package br.com.inf.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Atributo {
    private String nome;
    private TipoPrimitivo tipo;
    private String descricao;

    public Atributo(String nome, String descricao, TipoPrimitivo tipo) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPrimitivo getTipo() {
        return tipo;
    }

    public void setTipo(TipoPrimitivo tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
