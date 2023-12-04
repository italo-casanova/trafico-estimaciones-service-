package uni.edu.pe.transito.dao;

import uni.edu.pe.transito.dto.Mensaje;
import uni.edu.pe.transito.dto.rest.DatosEstimacion;

import java.util.ArrayList;
import java.util.List;

public interface MensajeDao {

    public ArrayList<Mensaje> batchProcess(int tiempo);
}
