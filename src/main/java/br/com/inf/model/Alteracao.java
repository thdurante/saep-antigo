package br.com.inf.model;

/**
 * Encapsula uma alteração no RADOC (Relato) ou
 * em valor produzido pelo SAEP (Pontuacao).
 *
 * O elemento original não é alterado. Em vez
 * disso, uma referência é mantida, assim como
 * a referência para o item que substitui o
 * original.
 */
public class Alteracao {
    private Alteravel antigo;
    private Alteravel novo;
    private String justificativa;

    public Alteracao(Alteravel origem, Alteravel destino, String justificativa) {
        this.antigo = origem;
        this.novo = origem;
        this.justificativa = justificativa;
    }
}