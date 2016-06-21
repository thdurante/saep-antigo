package br.com.inf.model;

import java.util.Date;
import java.util.List;

/**
 * Conjunto de relatos associados a um docente em um dado ano base.
 * <p>Eventualmente um mesmo docente, em um dado ano, pode possuir
 * mais de um RADOC, decorrente, por exemplo, da correação de alguma
 * informação.
 */
public class Radoc {

    /**
     * Identificador único do Radoc.
     */
    private String guid;

    /**
     * Ano base do Radoc.
     */
    private int anoBase;

    /**
     * Lista de relatos que compõem o Radoc.
     */
    private List<Relato> relatos;

    /**
     * Cria um relatório à partir de um dado conjunto de Relatos.
     * @param relatos Conjunto de Relatos que fazem parte do Radoc.
     */
    public Radoc(List<Relato> relatos) {
        if (relatos == null) {
            throw new IllegalArgumentException("relatos");
        }
        this.relatos = relatos;
    }

    /**
     * Atribui ao Radoc um determinado ano base.
     * @param anoBase O ano base do Radoc.
     */
    public void setAnoBase(int anoBase) {
        this.anoBase = anoBase;
    }

    /**
     * Recupera o identificador único do Radoc.
     * @return O identificador do Radoc.
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Recupera o ano base do Radoc.
     * @return O ano base do Radoc.
     */
    public int getAnoBase() {
        return anoBase;
    }

    /**
     * Recupera a lista que Relatos que compõem o Radoc.
     * @return A list de Relatos que compõem o Radoc.
     */
    public List<Relato> getRelatos() {
        return relatos;
    }
}
