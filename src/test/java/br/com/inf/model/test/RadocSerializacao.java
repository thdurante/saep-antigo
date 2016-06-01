package br.com.inf.model.test;

import br.com.inf.model.Radoc;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class RadocSerializacao {

    private Radoc radoc;
    private ObjectMapper mapper;

    @Before
    public void setUp(){
        try {
            radoc = new Radoc();
            mapper = new ObjectMapper();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // TODO: tratar o caso de serialização do objeto Radoc para JSON
    @Test
    public void radocToJson () {

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
