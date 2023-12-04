package uni.edu.pe.transito.service;

import uni.edu.pe.transito.dto.Mensaje;

import java.util.ArrayList;

public interface MensajeService {

    public ArrayList<Mensaje> batchProcess(int tiempo);
}
