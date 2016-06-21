package br.com.inf.model;

import java.util.Set;

/**
 * Existem várias atividades e produtos que podem
 * ser relatados por um docente. Cada atividade ou
 * produto está associado a um tipo bem definido.
 *
 * O tipo define os atributos que caracterizam um relato, seja esse um
 * produto ou uma atividade. Dito de outra forma, define as características
 * relevantes que definem o que deve ser fornecido para o relato em questão.
 *
 * Por exemplo, segunda resolução 32/2013, CONSUNI, Anexo II, dentre as
 * atividades de ensino, na graduação, temos dois tipos, citados abaixo:
 * <ul>
 *     <li>Aulas presenciais na graduação</li>
 *     <li>Aulas do ensino a distância na graduação</li>
 * </ul>
 *
 * Esses dois tipos são ilustrados acima pelos nomes correspondentes.
 * Os códigos poderiam ser "APG" e "AEADG", respectivamente.
 */
public class Tipo {

    /**
     * Código único que identifica o tipo.
     * Por exemplo, "EG" para ensino de graduação.
     * O código é, geralmente, "curto".
     */
    private String codigo;

    /**
     * Nome pelo qual o tipo é conhecido,
     * Por exemplo, "aula presencial na graduação".
     */
    private String nome;

    /**
     * Informações adicionais sobre o tipo.
     * Por exemplo, "disciplina ministrada na graduação,
     * apenas na modalidade presencial".
     */
    private String descricao;

    /**
     * Conjunto de atributos que caracteriza um Tipo.
     */
    private Set<Atributo> atributos;

    /**
     * Cria um Tipo através de um nome, código, descrição e atributos definidos.
     * @param nome O nome pelo qual o Tipo é conhecido.
     * @param codigo Código único que identifica o Tipo.
     * @param descricao Informação adicional sobre o Tipo.
     * @param atributos Atributos que caracterizam o Tipo.
     */
    public Tipo(String nome, String codigo, String descricao, Set<Atributo> atributos) {
        this.nome = nome;
        this.codigo = codigo;
        this.descricao = descricao;
        this.atributos = atributos;
    }

    /**
     * Recupera o nome pelo qual o Tipo é conhecido.
     * @return O nome do Tipo.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Recupera a descrição do Tipo.
     * @return Descrição ou informação adicional sobre o Tipo.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Recupera o código único do Tipo.
     * @return Identificador único do Tipo.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Recupera conjunto de atributos que caracterizam o Tipo.
     * @return O conjunto de atributos que define o Tipo.
     */
    public Set<Atributo> getAtributos() {
        return atributos;
    }
}
