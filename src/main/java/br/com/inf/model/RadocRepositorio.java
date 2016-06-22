package br.com.inf.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

import static com.mongodb.client.model.Filters.eq;

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
        radocsCollection.deleteOne(eq("_id", identificador));
    }

    @Override
    public Radoc recupera(String identificador) {
        Document document = null;

        MongoCursor cursor = radocsCollection.find(eq("_id", identificador)).iterator();
        while (cursor.hasNext()) {
            document = (Document) cursor.next();
        }

        return gson.fromJson(document.toJson(), Radoc.class);
    }

}
