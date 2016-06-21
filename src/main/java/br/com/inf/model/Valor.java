package br.com.inf.model;

/**
 * Encapsula um valor para um dos tipos
 * de um dado atributo de um relato.
 *
 * Um relato é descrito por uma coleção de
 * valores, por exemplo, um relato correspondente
 * a um "livro" pode ter atributos como "titulo"
 * e "numeroPaginas", dentre outros. Um valor
 * correspondente para "titulo" de um dado relato
 * pode ser "Amar e ser livre", enquanto o valor
 * para "numeroPaginas" pode ser 209, por exemplo.
 *
 * Uma instância dessa classe é empregada para
 * reter qualquer um desses valores. A recuperação
 * do valor depende do uso do método <b>get</b>
 * correspondente ao tipo. Cabe a quem envia uma
 * mensagem para uma instância de valor fazer
 * uso do método correto.
 */
public class Valor {

    /**
     * Container para o valor numérico da instância.
     */
    private float real;

    /**
     * Container para o valor lógico da instância.
     */
    private boolean logico;

    /**
     * Container para a sequência de caracteres mantida pela instância.
     */
    private String string;

    /**
     * Cria uma instância cujo valor é um número real.
     * @param real Número real correspondente ao valor.
     */
    public Valor(float real) {
        this.real = real;
    }

    /**
     * Cria uma instância cujo valor é um booleano.
     * @param logico Boolean correspondente ao valor.
     */
    public Valor(boolean logico) {
        this.logico = logico;
    }

    /**
     * Cria uma instância cujo valor é uma sequência de caracteres.
     * @param string Sequência de caracteres correspondente ao valor.
     */
    public Valor(String string) {
        this.string = string;
    }

    /**
     * Recupera o valor real (numérico) armazenado na instância.
     * @return O valor real (numérico) correspondente à instância.
     */
    public float getReal() {
        return real;
    }

    /**
     * Recupera o valor lógico armazenado na instância.
     * @return O valor {@code true} ou {@code false} correspondente à instância.
     */
    public boolean getLogico() {
        return logico;
    }

    /**
     * Recupera a sequência de caracteres armazenada na instância.
     * @return A sequência de caracteres correspondente à instância.
     */
    public String getString() {
        return string;
    }
}
