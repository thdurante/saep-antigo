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
        String guid = "6295e9d6-5ba8-41de-b231-7f96c1b3abde";
        int anoBase = 2012;
        List<Relato> relatos = new ArrayList<>();

        relatos.add(createRelato1());
        relatos.add(createRelato2());

        radoc = new Radoc(relatos);
        radoc.setGuid(guid);
        radoc.setAnoBase(anoBase);

        return radoc;
    }

    private Relato createRelato1() {
        Relato relato;

        // RELATO - ATRIBUTOS
        Tipo tipoDoRelato;
        List<Valor> valoresDoRelato = new ArrayList<>();
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

        valoresDoRelato.add(new Valor(
                new Atributo(
                        "Título",
                        "Título da publicação acadêmica",
                        TipoPrimitivo.STRING
                ),
                "PUBLICAÇÃO ACADÊMICA NÚMERO UM. TREINAMENTO EM RAILS AVANÇADO"
        ));
        valoresDoRelato.add(new Valor(
                new Atributo(
                        "Autor",
                        "Autor da publicação acadêmica",
                        TipoPrimitivo.STRING
                ),
                "Thiago Durante Pires"
        ));
        valoresDoRelato.add(new Valor(
                new Atributo(
                        "Número de Páginas",
                        "Número de páginas da publicação acadêmica",
                        TipoPrimitivo.REAL
                ),
                674
        ));

        tipoDoRelato = new Tipo(
                "RELATÓRIO DE PUBLICAÇÕES ACADÊMICAS",
                "RPA",
                "Descreve todas as publicações acadêmicas de um docente em um dado período",
                atributosDoRelato
        );


        // CRIAÇÃO DO RELATO, DE FATO
        relato = new Relato(tipoDoRelato, valoresDoRelato);
        return relato;
    }

    private Relato createRelato2() {
        Relato relato;

        // RELATO - ATRIBUTOS
        Tipo tipoDoRelato;
        List<Valor> valoresDoRelato = new ArrayList<>();
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

        valoresDoRelato.add(new Valor(
                new Atributo(
                        "Atividade",
                        "Nome da atividade de orientação",
                        TipoPrimitivo.STRING
                ),
                "ORIENTAÇÃO DE PÓS-DOUTORADO DO ALUNO FULANO DE TAL"
        ));
        valoresDoRelato.add(new Valor(
                new Atributo(
                        "Carga Horária",
                        "Carga horária da atividade de orientação",
                        TipoPrimitivo.REAL
                ),
                274.5
        ));

        tipoDoRelato = new Tipo(
                "RELATÓRIO DE ATIVIDADES DE ORIENTAÇÃO",
                "RAO",
                "Descreve todas as atividades de orientação exercidas por um docente em um dado período",
                atributosDoRelato
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
        assertEquals("radoc.guid should match", "guid", recoveredRadoc.getGuid());
        assertEquals("radoc.anoBase should match", 2012, recoveredRadoc.getAnoBase());
    }
}
