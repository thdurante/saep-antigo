package br.com.inf.persistencia.interfaces;

/**
 * Representa um objeto genérico que faz o papel de repositório,
 * tendo acesso à operações básicas do banco de dados.
 */
public interface Repositorio<T> {

    /**
     * Persiste um objeto ou lista de objetos no banco de dados.
     * @param objeto Objeto a ser persistido.
     */
    void persiste(T objeto);

    /**
     * Remove um objeto do banco de dados de acordo com seu identificador.
     * @param identificador O identificador único do objeto.
     */
    void remove(String identificador);

    /**
     * Remove um objeto do banco de dados de acordo com seu identificador.
     * @param identificador O identificador único do objeto.
     * @return Retorna o objeto recuperado do banco de dados.
     */
    T recupera(String identificador);

}
