package br.com.inf.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Relato {
    private Tipo tipo;
    private Valor valorPorNome;

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Valor getValorPorNome() {
        return valorPorNome;
    }

    public void setValorPorNome(Valor valorPorNome) {
        this.valorPorNome = valorPorNome;
    }
}
