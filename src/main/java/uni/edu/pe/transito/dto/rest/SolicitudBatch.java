package uni.edu.pe.transito.dto.rest;

import lombok.Data;
import uni.edu.pe.transito.dto.Arista;

import java.util.List;

@Data
public class SolicitudBatch {
    private int time;
    private List<Arista> aristas;
}
