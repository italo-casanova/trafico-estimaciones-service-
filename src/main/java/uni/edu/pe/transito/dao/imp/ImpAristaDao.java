package uni.edu.pe.transito.dao.imp;

import com.mongodb.MongoException;
import com.mongodb.client.model.Filters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.transito.dao.AristaDao;
import uni.edu.pe.transito.dao.Conexion;
import uni.edu.pe.transito.dto.Arista;
import uni.edu.pe.transito.dto.Nodo;
import uni.edu.pe.transito.dto.rest.Aristas;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

@Repository
public class ImpAristaDao implements AristaDao {

    @Autowired
    MongoTemplate mongoTemplate;
    private final Conexion conexion = new Conexion();
    @Override
    public Aristas getArista() {
        Aristas aristas = new Aristas(new ArrayList<>());

        try{

            conexion.obtenerConexion(mongoTemplate);

            conexion.getDatabase().getCollection("aristas")
                    .find()
                    .iterator()
                    .forEachRemaining((Document doc) -> {
                Arista a = new Arista(
                        doc.getList("nodos", String.class),
                        doc.getString("_id"),
                        doc.getDouble("distancia").floatValue()
                );
               aristas.getAristas().add(a);
            });

            conexion.cerrarConexion();
        } catch(MongoException e){
            throw new RuntimeException(e);
        }
        return aristas;
    }

    @Override
    public Aristas getArista(Nodo nodo) {

        Aristas aristas = new Aristas(new ArrayList<>());

        try{

            conexion.obtenerConexion(mongoTemplate);

            conexion.getDatabase().getCollection("aristas")
                    .find(Filters.elemMatch(
                           "nodos", new Document("$eq", nodo.getId())
                    ))
                    .iterator()
                    .forEachRemaining((Document doc) -> {
                        Arista a = new Arista(
                                doc.getList("nodos", String.class),
                                doc.getString("id"),
                                doc.getDouble("distancia").floatValue()
                        );
                        aristas.getAristas().add(a);
                    });

            conexion.cerrarConexion();
        } catch(MongoException e){
            throw new RuntimeException(e);
        }
        return aristas;
    }
}
