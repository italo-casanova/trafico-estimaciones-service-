package uni.edu.pe.transito.dao.imp;

import com.mongodb.MongoException;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import uni.edu.pe.transito.dao.Conexion;
import uni.edu.pe.transito.dao.MensajeDao;
import uni.edu.pe.transito.dto.Arista;
import uni.edu.pe.transito.dto.Mensaje;
import uni.edu.pe.transito.dto.rest.DatosEstimacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Repository
public class ImpMensajeDao implements MensajeDao  {

    @Autowired
    MongoTemplate mongoTemplate;

    private final Conexion conexion = new Conexion();
    @Override
    public ArrayList<Mensaje> batchProcess(int tiempo) {
        ArrayList<Mensaje> mensajes = new ArrayList<>();
        try{
            conexion.obtenerConexion(mongoTemplate);

            conexion.getDatabase().getCollection("mensajes")
                    .find()
                    .iterator()
                    .forEachRemaining((Document doc) -> {
                        Mensaje m = new Mensaje(
                                doc.getDate("fecha"),
                                doc.getString("_id"),
                                doc.getString("mac_destino"),
                                doc.getString("mac_origen"),
                                doc.getDouble("latitud").floatValue(),
                                doc.getDouble("longitud").floatValue()
                                                );
                        mensajes.add(m);
                    });

            conexion.cerrarConexion();
        } catch(MongoException e){
            throw new RuntimeException(e);
        }
        mensajes.sort(Comparator.comparing(Mensaje::getMacOrigen));
        return mensajes;
    }
}
