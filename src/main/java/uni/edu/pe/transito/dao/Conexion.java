package uni.edu.pe.transito.dao;

import com.mongodb.MongoException;
import com.mongodb.client.MongoDatabase;
import lombok.Data;
import org.springframework.data.mongodb.core.MongoTemplate;

@Data
public class Conexion {


    private MongoDatabase database;
    public void obtenerConexion(MongoTemplate mongoTemplate) {
        try{
            database = mongoTemplate.getDb();

        }catch (MongoException e){
            throw new RuntimeException(e);
        }
    }
    public void cerrarConexion(){
        try {
            database.drop();
            database = null;
        }catch (MongoException e){
            throw new RuntimeException(e);
        }
    }
}
