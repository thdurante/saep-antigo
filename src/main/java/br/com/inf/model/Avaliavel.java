package br.com.inf.model;

/**
 * Marca um objeto que pode ser avaliado por uma Regra
 */
public interface Avaliavel {

    /**
     * Recupera o valor do atributo para o objeto em questão
     * @param atributo O identificador único do atributo
     * @return O valor do atributo
     */
    Valor getValor(String atributo);
}
