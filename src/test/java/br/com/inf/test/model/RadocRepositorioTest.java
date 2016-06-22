package br.com.inf.test.model;

import br.com.inf.model.Radoc;
import br.com.inf.model.RadocRepositorio;
import br.com.inf.test.utils.Log4jTestWatcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 * Classe de Teste para o repositório de Radocs.
 */
public class RadocRepositorioTest {

    RadocRepositorio radocRepositorio;

    @Rule
    public TestWatcher watchman = new Log4jTestWatcher(RadocSerializacao.class);

    @Before
    public void setUp() {
        radocRepositorio = new RadocRepositorio();
    }

    @Test
    public void persisteRadoc() {
        PodamFactory factory = new PodamFactoryImpl();
        Radoc radoc = factory.manufacturePojo(Radoc.class);
        radocRepositorio.persiste(radoc);
    }

}
