package uni.edu.pe.transito.dto.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import uni.edu.pe.transito.dto.Nodo;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Nodos {
    private ArrayList<Nodo> nodos;
}
