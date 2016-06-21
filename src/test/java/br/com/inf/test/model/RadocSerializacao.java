package br.com.inf.test.model;

import br.com.inf.model.Atributo;
import br.com.inf.model.Radoc;
import br.com.inf.model.Relato;
import br.com.inf.model.Tipo;
import br.com.inf.model.TipoPrimitivo;
import br.com.inf.model.Valor;
import br.com.inf.test.utils.Log4jTestWatcher;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class RadocSerializacao {

    /*
     *  GSON
     */
    private Gson gson;
    private JsonReader reader;

    /*
     *  MODEL INSTANCES
     */
    private Radoc radoc;

    /*
     *  MODEL SAMPLE CREATORS
     */
    private Radoc createSampleRadoc () {

        Radoc radoc;

        // RADOC - ATRIBUTOS
        int anoBase = 2016;
        List<Relato> relatos = new ArrayList<>();

        relatos.add(createRelato1());
        relatos.add(createRelato2());

        radoc = new Radoc(relatos);
        radoc.setAnoBase(anoBase);

        return radoc;
    }

    private Relato createRelato1() {
        Relato relato;

        // RELATO - ATRIBUTOS
        Tipo tipoDoRelato;
        Map<String, Valor> valoresDoRelato = new HashMap<>();

        // TIPO
        Set<Atributo> atributosDoRelato = new HashSet<>();
        atributosDoRelato.add(new Atributo(
                "Título",
                "Título da publicação acadêmica",
                TipoPrimitivo.STRING
        ));
        atributosDoRelato.add(new Atributo(
                "Autor",
                "Autor da publicação acadêmica",
                TipoPrimitivo.STRING
        ));
        atributosDoRelato.add(new Atributo(
                "Número de Páginas",
                "Número de páginas da publicação acadêmica",
                TipoPrimitivo.REAL
        ));

        tipoDoRelato = new Tipo(
                "RELATÓRIO DE PUBLICAÇÕES ACADÊMICAS",
                "RPA",
                "Descreve todas as publicações acadêmicas de um docente em um dado período",
                atributosDoRelato
        );

        // VALORES
        valoresDoRelato.put(
                "Título",
                new Valor("Um título qualquer para uma publicação acadêmica")
        );
        valoresDoRelato.put(
                "Autor",
                new Valor("Thiago Durante Pires")
        );
        valoresDoRelato.put(
                "Número de Páginas",
                new Valor(537)
        );

        // CRIAÇÃO DO RELATO, DE FATO
        relato = new Relato(tipoDoRelato, valoresDoRelato);
        return relato;
    }

    private Relato createRelato2() {
        Relato relato;

        // RELATO - ATRIBUTOS
        Tipo tipoDoRelato;
        Map<String, Valor> valoresDoRelato = new HashMap<>();

        // TIPO
        Set<Atributo> atributosDoRelato = new HashSet<>();
        atributosDoRelato.add(new Atributo(
                "Atividade",
                "Nome da atividade de orientação",
                TipoPrimitivo.STRING
        ));
        atributosDoRelato.add(new Atributo(
                "Carga Horária",
                "Carga horária da atividade de orientação",
                TipoPrimitivo.REAL
        ));

        tipoDoRelato = new Tipo(
                "RELATÓRIO DE ATIVIDADES DE ORIENTAÇÃO",
                "RAO",
                "Descreve todas as atividades de orientação exercidas por um docente em um dado período",
                atributosDoRelato
        );

        // VALORES
        valoresDoRelato.put(
                "Atividade",
                new Valor("Orientação de pós-doutorado do aluno Fulano de Tal")
        );
        valoresDoRelato.put(
                "Carga Horária",
                new Valor(274.5)
        );

        // CRIAÇÃO DO RELATO, DE FATO
        relato = new Relato(tipoDoRelato, valoresDoRelato);
        return relato;
    }

    /*
     *  TESTS
     */

    @Rule
    public TestWatcher watchman = new Log4jTestWatcher(RadocSerializacao.class);

    @Before
    public void setUp() {
        gson = new GsonBuilder().serializeNulls()
                                .setPrettyPrinting()
                                .create();
        radoc = createSampleRadoc();
        try {
            reader = new JsonReader(new FileReader("src/Radoc.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void radocToJson () throws IOException {
        System.out.println(gson.toJson(radoc) + "\n");
    }

    // TODO: adicionar o restante dos asserts no caso do parse do Radoc
    @Test
    public void jsonToRadoc () {
        Radoc recoveredRadoc = gson.fromJson(reader, Radoc.class);

        assertNotNull("should not be null", recoveredRadoc);
        assertEquals("radoc.guid should match", "c3223d17-135f-473e-b01f-2f37705d3945", recoveredRadoc.getGuid());
        assertEquals("radoc.anoBase should match", 2016, recoveredRadoc.getAnoBase());
    }
}
