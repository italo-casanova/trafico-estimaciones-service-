package uni.edu.pe.transito.service;


import uni.edu.pe.transito.dto.Nodo;
import uni.edu.pe.transito.dto.rest.Aristas;

public interface AristaService {
    public Aristas getAristas();
    public Aristas gestArista(Nodo nodo);
}
