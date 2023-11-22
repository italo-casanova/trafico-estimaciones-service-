package uni.edu.pe.transito.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Arista {

    private ArrayList<String> nodos;
    private String id;
    private float distancia;

}
