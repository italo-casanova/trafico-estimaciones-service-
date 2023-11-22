package uni.edu.pe.transito.dto;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Nodo {

    private String descripcion, nombre;
    private String id;
    private float latitud, longitud;

}
