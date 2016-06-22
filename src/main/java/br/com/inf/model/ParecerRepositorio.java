package br.com.inf.model;

public class ParecerRepositorio implements Repositorio<Parecer> {

    @Override
    public void persiste(Parecer objeto) {

    }

    @Override
    public void remove(String identificador) {

    }

    @Override
    public Parecer recupera(String identificador) {
        return null;
    }

    public void alteraParecer(String identificador, Alteracao alteracao) {
        
    }
}
