package uni.edu.pe.transito.dao;


import uni.edu.pe.transito.dto.Nodo;
import uni.edu.pe.transito.dto.rest.Aristas;

import java.util.ArrayList;

public interface AristaDao {

    public Aristas getArista();
    public Aristas getArista(Nodo nodo);


}
