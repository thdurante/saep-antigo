package br.com.inf.persistencia.repositorios;

import br.com.inf.persistencia.model.Alteracao;
import br.com.inf.persistencia.model.Parecer;
import br.com.inf.persistencia.interfaces.Repositorio;

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
