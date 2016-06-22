package br.com.inf.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 * Classe que representa o repositório de Radocs.
 */
public class RadocRepositorio implements Repositorio<Radoc> {

    /**
     * Representação da collection específica advinda do banco de dados.
     */
    private MongoCollection radocsCollection;

    /**
     * Objeto para serialização e parse de documentos JSON.
     */
    private Gson gson;

    /**
     * Cria um novo repositório de Radocs, já abrindo a conexão com o
     * banco de dados e inicializando o serializador/parser Gson.
     */
    public RadocRepositorio() {
        this.radocsCollection = new DBManager("radocs").abrirConexao();
        gson = new GsonBuilder().serializeNulls().setPrettyPrinting().create();
    }

    @Override
    public void persiste(Radoc radoc) {
        Document radocDocument = Document.parse(gson.toJson(radoc));
        radocsCollection.insertOne(radocDocument);
    }

    @Override
    public void remove(String identificador) {

    }

    @Override
    public Radoc recupera(String identificador) {
        return null;
    }

}
