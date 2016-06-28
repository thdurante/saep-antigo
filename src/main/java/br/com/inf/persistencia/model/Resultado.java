package br.com.inf.persistencia.model;

import java.util.List;

/**
 * Reúne as pontuações obtidas pela aplicação
 * das regras de uma resolução a um conjunto de relatos.
 */
public class Resultado {

    /**
     * Resolução vinculada ao Resultado.
     */
    private Resolucao resolucao;

    /**
     * Lista de pontuações obtidas.
     */
    private List<Pontuacao> pontuacoes;

    /**
     * Recupera a Resolução vinculada ao Resultado.
     * @return A Resolução vinculada ao Resultado.
     */
    public Resolucao getResolucao() {
        return resolucao;
    }

    /**
     * Recupera a lista de Pontuações.
     * @return A lista de Pontuações.
     */
    public List<Pontuacao> getPontuacoes() {
        return pontuacoes;
    }
}