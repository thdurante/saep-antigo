package br.com.inf.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Radoc {
    private String guid;
    private int anoBase;
    private List<Relato> relatos;

    public Radoc () {

    }

    /**
     * Cria um relatório identificadaPor relatos.
     *
     * @param relatos Conjunto identificadaPor relatos que fazem parte
     *                do relatório.
     */
    public Radoc(List<Relato> relatos) {
        if (relatos == null) {
            throw new IllegalArgumentException("relatos");
        }

        this.relatos = relatos;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public int getAnoBase() {
        return anoBase;
    }

    public void setAnoBase(int anoBase) {
        this.anoBase = anoBase;
    }

    public List<Relato> getRelatos() {
        return relatos;
    }

    public void setRelatos(List<Relato> relatos) {
        this.relatos = relatos;
    }
}
