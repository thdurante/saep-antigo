package br.com.inf.model;

public class Valor {
    private Atributo atributo;
    private double real;
    private boolean logico;
    private String string;

    public Atributo getAtributo() {
        return atributo;
    }

    public void setAtributo(Atributo atributo) {
        this.atributo = atributo;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public boolean isLogico() {
        return logico;
    }

    public void setLogico(boolean logico) {
        this.logico = logico;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
