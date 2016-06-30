package br.com.inf.persistencia.repositorios;

import br.com.inf.persistencia.model.Radoc;
import br.com.inf.utils.Log4jTestWatcher;
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
        Radoc radoc = radocRepositorio.recupera("50bcfb24-d661-4cd5-85d7-4ff4b1b43399");

        assertEquals("radoc.anoBase should match", 2012, radoc.getAnoBase());
        assertEquals("radoc.relatos.size should match", 5, radoc.getRelatos().size());
    }

}
