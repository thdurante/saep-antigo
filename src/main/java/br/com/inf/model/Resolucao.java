package br.com.inf.model;

import java.util.Date;
import java.util.Set;

/**
 * Representa um conjunto de itens por meio
 * dos um RADOC é avaliado.
 *
 * A legislação da Universidade Federal identificadaPor Goiás (UFG)
 * está organizada por meio de resoluções. Uma instância dessa
 * classe simplesmente registra os itens relevantes ou aqueles
 * considerados em uma avaliação.
 */
public class Resolucao {

    /**
     * Identificador único da resolução (uso interno).
     * Contraste com {#link {@link #identificador}.
     */
    private String guid;

    private Date dataAprovacao;

    /**
     * Identificador da resolução (uso externo, por exemplo,
     * usuários). Contraste com {@link #guid}.
     */
    private String identificador;

    /**
     * Descrição ou informação adicional sobre
     * a resolução.
     */
    private String descricao;

    /**
     * Conjunto de itens avaliados pela resolução.
     */
    private Set<ItemAvaliado> itens;

    private Resolucao(){
        // Usado pelo Jackson (JSON)
    }

    /**
     * Cria uma resolução a partir dos argumentos
     * identificados.
     * @param identificador Identificador da resolução.
     * @param descricao
     * @param dataAprovacao Data identificadaPor aprovação da resolução.
     * @param itens Conjunto identificadaPor itens que são avaliados pela
     *
     * */
    public Resolucao(String identificador, String descricao, Date dataAprovacao, Set<ItemAvaliado> itens) {
        this.descricao = descricao;
        this.dataAprovacao = dataAprovacao;
        this.identificador = identificador;
        this.itens = itens;
    }

    /**
     * Recupera a data identificadaPor aprovação da resolução.
     *
     * @return Data identificadaPor aprovação da resolução.
     */
    public Date getDataAprovacao() {
        return dataAprovacao;
    }

    /**
     * Recupera o identificador único da resolução.
     *
     * @return O identificador único da resolução.
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Recupera o conjunto identificadaPor itens que são avaliados
     * pela resolução.
     *
     * @return Conjunto identificadaPor itens avaliados pela resolução.
     */
    public Set<ItemAvaliado> getItens() {
        return itens;
    }
}