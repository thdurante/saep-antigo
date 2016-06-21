package br.com.inf.model;

import java.util.List;

/**
 * Uma regra estabelece um valor para um conjunto de objetos avaliáveis
 * (que implementam a interface {@link Avaliavel}).
 *
 * <p>Em um caso comum, uma regra é estabelecida para identificar quantos
 * pontos são obtidos por relatos de um dado tipo, por exemplo, quantos
 * pontos por livro publicado com corpo editorial.
 *
 * <p>Uma regra pode ser empregada para obter a média de pontos obtidos
 * com o ensino em determinado período. Nesse caso, não se trata de uma
 * simples contagem ou consulta a propriedades de relatos. A regra em questão
 * é aplicada sobre um conjunto de entrada no qual cada elemento possui um
 * atributo devidamente identificado, sobre o qual a média será calculada.
 */
public class Regra {

    public static final int PONTOS_POR_RELATO = 0;
    public static final int EXPRESSAO = 1;
    public static final int CONDICIONAL = 2;
    public static final int SOMATORIO = 3;
    public static final int MEDIA = 4;

    /**
     * O valor de uma das constantes acima.
     */
    private int tipo;

    /**
     * Expressão empregada pela Regra.
     */
    private String expressao;
    private String entao;
    private String senao;

    /**
     * Pontos por relato.
     */
    private int pontosPorRelato;

    /**
     * Lista de dependências diretamente relacionadas a aplicação da Regra.
     */
    private List<String> dependeDe;

    /**
     * Valores máximo e mínimo admitidos para resultados da Regra.
     */
    private double valorMaximo;
    private double valorMinimo;


    /**
     * Cria regra a partir da expressão e dos valores limites admitidos.
     * @param expressao A expressão que define o valor da regra.
     * @param valorMaximo O valor máximo admitido pela avaliação da regra.
     * @param valorMinimo O valor mínimo admitido pela avaliação da regra.
     * @param dependeDe Lista de atributos dos quais a regra depende. Ou seja,
     *                  antes da avaliação da regra, os itens correspondentes
     *                  a essa lista devem estar disponíveis (previamente avaliados).
     */
    public Regra(String expressao, double valorMaximo, double valorMinimo, List<String> dependeDe) {
        this.expressao = expressao;
        this.valorMaximo = valorMaximo;
        this.valorMinimo = valorMinimo;
        this.dependeDe = dependeDe;
    }

    /**
     * Recupera os pontos por Relato.
     * @return Os pontos por Relato.
     */
    public int getPontosPorRelato() {
        return pontosPorRelato;
    }

    /**
     * Lista de dependências diretamente empregados pela expressão cuja avaliação dá
     * origem à pontuação da regra.
     * @return Lista de dependências diretamente empregados para avaliação da regra.
     */
    public List<String> getDependeDe() {
        return dependeDe;
    }

    /**
     * Recupera a expressão empregada pela Regra.
     * @return A expressão empregada pela Regra.
     */
    public String getExpressao() {
        return expressao;
    }

    /**
     * Recupera o valor Máximo admitido para o resultado da Regra.
     * @return O valor Máximo admitido para o resultado da Regra.
     */
    public double getValorMaximo() {
        return valorMaximo;
    }

    /**
     * Recupera o valor Mínimo admitido para o resultado da Regra.
     * @return O valor Mínimo admitido para o resultado da Regra.
     */
    public double getValorMinimo() {
        return valorMinimo;
    }

    /**
     * Recupera o tipo da Regra.
     * @return O inteiro que identifica o tipo da Regra.
     */
    public int getTipo() {
        return tipo;
    }
}