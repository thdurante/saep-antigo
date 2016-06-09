package br.com.inf.model.test;

import br.com.inf.model.Radoc;
import br.com.inf.utils.Log4jTestWatcher;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.File;
import java.io.IOException;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class RadocSerializacao {

    @Rule
    public TestWatcher watchman = new Log4jTestWatcher(RadocSerializacao.class);

    @Mock
    private Radoc radocMock;
    private Radoc radoc;
    private ObjectMapper mapper;

    @Before
    public void setUp(){
        try {
            radoc = new Radoc();
            mapper = new ObjectMapper();
            MockitoAnnotations.initMocks(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // TODO: tratar o caso de serialização do objeto Radoc para JSON
    @Ignore ("radocToJson - Test ignored - not ready\n")
    @Test
    public void radocToJson () throws IOException {
        when(radocMock.getAnoBase()).thenReturn(2001);
        when(radocMock.getGuid()).thenReturn("6295e9d6-5ba8-41de-b231-7f96c1b3abde");
        mapper.writeValue(new File("src/radoc-mock.json"), radocMock);
    }

    // TODO: adicionar o restante dos asserts no caso do parse do Radoc
    @Test
    public void jsonToRadoc () throws IOException {
        radoc = mapper.readValue(new File("src/Radoc.json"), Radoc.class);
        assertNotNull(radoc);
        assertEquals("'guid' should match", "6295e9d6-5ba8-41de-b231-7f96c1b3abde", radoc.getGuid());
        assertEquals("'anoBase' should match", 2001, radoc.getAnoBase());
    }
}
