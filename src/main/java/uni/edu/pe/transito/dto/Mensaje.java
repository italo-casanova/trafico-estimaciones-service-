package uni.edu.pe.transito.dto;

import java.util.ArrayList;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.Date;


@Data
@AllArgsConstructor
public class Mensaje {

    private Date fecha = new Date();
    private String id;
    private float latitud, longitud;

}
