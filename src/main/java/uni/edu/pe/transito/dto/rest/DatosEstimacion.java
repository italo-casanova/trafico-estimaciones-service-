package uni.edu.pe.transito.dto.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import uni.edu.pe.transito.dto.Arista;
import uni.edu.pe.transito.dto.Mensaje;

import java.util.List;

@AllArgsConstructor
@Data
public class DatosEstimacion {
    private List<Arista> aristas;
    private List<Mensaje> mensajes;
}
