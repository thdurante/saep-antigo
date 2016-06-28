package br.com.inf.persistencia.model;

import br.com.inf.persistencia.interfaces.Avaliavel;

/**
 * Identifica resultado (pontuação) associado a um dado nome.
 */
public class Pontuacao implements Avaliavel {

    /**
     * O nome ou identificador da pontuação.
     */
    private String atributo;

    /**
     * O valor da pontuação.
     */
    private Valor valor;

    /**
     * Cria a Pontuação.
     * @param atributo O nome do atributo.
     * @param valor O valor da pontuação.
     */
    public Pontuacao(String atributo, Valor valor) {
        this.atributo = atributo;
        this.valor = valor;
    }

    /**
     * Recupera o valor da pontuação identificada pelo atributo.
     * @param atributo O identificador único do atributo.
     * @return O valor associado ao Atributo.
     */
    @Override
    public Valor getValor(String atributo) {
        return this.valor;
    }
}