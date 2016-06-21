package br.com.inf.model;

/**
 * Definição dos conjuntos de valores que podem
 * ser assumidos por um determinado atributo.
 */
public enum TipoPrimitivo {

    /**
     * Domínio binário: true ou false.
     */
    LOGICO,

    /**
     * Subconjunto dos números reais. Por exemplo, 0.12, 345.
     */
    REAL,

    /**
     * Sequência de caracteres. Por exemplo, "Construção de Software".
     */
    STRING
}