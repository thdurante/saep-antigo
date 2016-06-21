package br.com.inf.model;

/**
 * Representa um item avaliado por uma resolução.
 * Ou seja, qualquer elemento que direta ou indiretamente
 * produz um valor considerado por uma resolução.
 *
 * <p>Uma resolução é definida por meio do conjunto de itens
 * por ela avaliados.
 */
public class ItemAvaliado {

    /**
     * Regra cuja execução produz o valor
     * ou pontuação para o item avaliado.
     */
    private Regra regra;

    /**
     * Descrição do item avaliado.
     */
    private String descricao;

    /**
     * Retém o tipo avaliado, se for o caso. Convém ressaltar que
     * nem toda avaliação é sobre um conjunto de relatos de determinado
     * tipo. Quando não for, o valor dessa propriedade é irrelevante.
     */
    private String tipo;

    /**
     * Atributo por meio do qual o item avaliado pode ter o seu valor
     * recuperado. Observe que não inclui o valor propriamente dito, mas o
     * identificador do resultado.
     */
    private String resultado;

    /**
     * Cria um item que pode ser avaliado.
     * @param regra Regra empregada na avaliação do Item.
     * @param descricao Descrição do Item.
     * @param resultado Código único do resultado (nome).
     */
    public ItemAvaliado(Regra regra, String descricao, String resultado) {
        this.regra = regra;
        this.descricao = descricao;
        this.resultado = resultado;
    }

    /**
     * Recupera a Regra pela qual o item é avaliado.
     * @return A Regra pela qual o item é avaliado.
     */
    public Regra getRegra() {
        return regra;
    }

    /**
     * Recupera a Descrição do Item Avaliado.
     * @return A Descrição do Item Avaliado.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Recupera o tipo do Item Avaliado.
     * @return O tipo Item Avaliado.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Recupera o identificador do resultado.
     * @return O identificador do resultado.
     */
    public String getResultado() {
        return resultado;
    }
}
