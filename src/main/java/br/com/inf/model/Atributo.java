package br.com.inf.model;

/**
 * Um atributo permite identificar cada um
 * dos possíveis valores que podem ser empregados
 * na descrição de um relato e/ou em uma expressão.
 *
 * Um atributo define um nome e um tipo que
 * define o conjunto de valores que uma
 * "variável" com esse nome pode assumir.
 *
 * Um relato é composto por um conjunto de
 * valores, cada um deles para um atributo.
 */
public class Atributo {

    /**
     * O nome do atributo, por exemplo, "cha" ou "nome".
     */
    private String nome;

    /**
     * A identificação do conjunto de valores associado ao atributo.
     * Por exemplo, um atributo "real" significa que apenas valores
     * reais (numéricos) podem ser assumidos pelo atributo em questão.
     */
    private TipoPrimitivo tipo;

    /**
     * Informação adicional que detalha o uso esperado do tipo (informação de ajuda).
     * Por exemplo, para o Atributo "nome", pode ser algo como "nome completo do periódico".
     */
    private String descricao;

    /**
     * Cria um atributo dado um nome, uma descrição e um tipo.
     * @param nome O nome dado ao atributo.
     * @param descricao A descrição ou informação de ajuda do atributo.
     * @param tipo O tipo de valores associados ao atributo.
     */
    public Atributo(String nome, String descricao, TipoPrimitivo tipo) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    /**
     * Recupera o nome do Atributo.
     * @return O nome do Atributo.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Recupera a descrição (ou informação de ajuda) do Atributo.
     * @return A descrição do Atributo.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Recupera o tipo do Atributo.
     * @return O tipo do Atributo.
     */
    public TipoPrimitivo getTipo() {
        return tipo;
    }
}
