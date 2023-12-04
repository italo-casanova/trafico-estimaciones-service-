package uni.edu.pe.transito.dto.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import uni.edu.pe.transito.dto.Arista;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Aristas {
    private List<Arista> aristas;
}
