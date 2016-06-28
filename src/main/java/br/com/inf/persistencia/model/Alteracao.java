package br.com.inf.persistencia.model;

import br.com.inf.persistencia.interfaces.Avaliavel;

/**
 * Encapsula uma alteração em um relato ou em pontuação produzida pelo SAEP.
 * O elemento original não é alterado, mas uma cópia do mesmo.
 */
public class Alteracao {

    /**
     * Referência do objeto original.
     */
    private Avaliavel original;

    /**
     * Referência do novo objeto gerado com a alteração.
     */
    private Avaliavel novo;

    /**
     * Justificativa da alteração.
     */
    private String justificativa;

    /**
     * Cria uma Alteração.
     * @param original Referência para o objeto original.
     * @param novo Referência para o novo objeto gerado com a alteração.
     * @param justificativa Justificativa da alteração.
     */
    public Alteracao(Avaliavel original, Avaliavel novo, String justificativa) {
        this.original = original;
        this.novo = novo;
        this.justificativa = justificativa;
    }
}