package br.com.inf.model;

import java.util.Map;

/**
 * Encapsula conjunto de valores que caracterizam
 * o relato de uma atividade ou produto.
 *
 * Cada relato é de um tipo específico, que
 * representa um tipo de atividade ou tipo de
 * produto. Esse tipo é mantido por uma instância
 * de {@link Tipo}. O tipo ainda define com
 * precisão os atributos correspondentes.
 *
 */
public class Relato implements Avaliavel {

    /**
     * O tipo do relato.
     */
    private Tipo tipo;

    /**
     * Cada relato possui um {@link Valor} para cada {@link Atributo}.
     * Neste caso, o Atributo é identificado por seu nome.
     */
    private Map<String, Valor> valorPorAtributo;

    /**
     * Cria um relato à partir do tipo e Valores fornecidos.
     * @param tipo O tipo do relato.
     * @param valorPorAtributo Conjunto de valores para cada um dos Atributos do Relato.
     */
    public Relato(Tipo tipo, Map<String, Valor> valorPorAtributo) {
        this.tipo = tipo;
        this.valorPorAtributo = valorPorAtributo;
    }

    /**
     * Recupera o valor do atributo.
     * @param atributo O nome do atributo.
     * @return O valor do atributo.
     */
    @Override
    public Valor getValor(String atributo) {
        return valorPorAtributo.get(atributo);
    }

    /**
     * Recupera o tipo do Relato.
     * @return O tipo do Relato.
     */
    public Tipo getTipo() {
        return tipo;
    }
}