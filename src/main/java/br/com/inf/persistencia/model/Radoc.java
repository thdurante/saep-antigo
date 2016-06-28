package br.com.inf.persistencia.model;

import br.com.inf.persistencia.mockStrategies.AnoMockStrategy;
import br.com.inf.persistencia.mockStrategies.GuidMockStrategy;
import com.google.gson.annotations.SerializedName;
import uk.co.jemos.podam.common.PodamCollection;
import uk.co.jemos.podam.common.PodamStrategyValue;

import java.util.List;
import java.util.UUID;

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
    @PodamStrategyValue(GuidMockStrategy.class)
    @SerializedName("_id")
    private String guid;

    /**
     * Ano base do Radoc.
     */
    @PodamStrategyValue(AnoMockStrategy.class)
    private int anoBase;

    /**
     * Lista de relatos que compõem o Radoc.
     */
    @PodamCollection(nbrElements = 2)
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
        this.guid = UUID.randomUUID().toString();
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
