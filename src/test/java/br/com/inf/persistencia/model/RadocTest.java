package br.com.inf.persistencia.model;

import br.com.inf.utils.Log4jTestWatcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Classe de Teste para Radoc.
 */
public class RadocTest {

    PodamFactory factory;

    @Rule
    public TestWatcher watchman = new Log4jTestWatcher(RadocTest.class);

    @Before
    public void setUp() {
        factory = new PodamFactoryImpl();
    }

    @Test(expected=IllegalArgumentException.class)
    public void criaRadocInvalido() {
        new Radoc(null);
    }

    @Test
    public void criaRadocValido() {
        List<Relato> relatos = new ArrayList<>();
        relatos.add(factory.manufacturePojo(Relato.class));
        relatos.add(factory.manufacturePojo(Relato.class));
        relatos.add(factory.manufacturePojo(Relato.class));

        Radoc radoc = new Radoc(relatos);
        radoc.setAnoBase(2016);

        assertEquals("radoc.anoBase should match", 2016, radoc.getAnoBase());
        assertEquals("radoc.relatos.size should match", 3, radoc.getRelatos().size());
    }
}
