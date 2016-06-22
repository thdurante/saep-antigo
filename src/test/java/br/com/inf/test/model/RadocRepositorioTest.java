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

import static org.junit.Assert.assertEquals;

/**
 * Classe de Teste para o Repositório de Radocs.
 */
public class RadocRepositorioTest {

    RadocRepositorio radocRepositorio;

    @Rule
    public TestWatcher watchman = new Log4jTestWatcher(RadocRepositorio.class);

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

    @Test
    public void recuperaRadoc() {
        Radoc radoc = radocRepositorio.recupera("fb47148b-6cce-48f1-bcab-4e235bec0db5");

        assertEquals("radoc.anoBase should match", 2001, radoc.getAnoBase());
        assertEquals("radoc.relatos.size should match", 5, radoc.getRelatos().size());
    }

}
