package uni.edu.pe.transito.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
public class Arista {

    private List<String> nodos;
    private String id;
    private float distancia;

}
