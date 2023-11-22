package uni.edu.pe.transito.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.ArrayList;

@Data
@AllArgsConstructor
public class ZonaWifi {

    private String nombre, id, direccionIp;
    private float latitud, longitud;
}
