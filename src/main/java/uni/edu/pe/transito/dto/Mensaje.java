package uni.edu.pe.transito.dto;

import java.util.ArrayList;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.Date;


@Data
@AllArgsConstructor
public class Mensaje {

    private Date fecha;
    private String id, macDestino, macOrigen;
    private float latitud, longitud;

}
