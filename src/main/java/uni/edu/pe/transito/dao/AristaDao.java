package uni.edu.pe.transito.dao;

import lombok.Data;
import lombok.AllArgsConstructor;

import uni.edu.pe.transito.dto.Arista;
import uni.edu.pe.transito.dto.Nodo;

@Data
@AllArgsConstructor
public interface AristaDao {

    public Arista getArista();
    public Arista getArista(Nodo nodo);

}
