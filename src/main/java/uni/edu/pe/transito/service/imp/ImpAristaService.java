package uni.edu.pe.transito.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.transito.dao.AristaDao;
import uni.edu.pe.transito.dto.Nodo;
import uni.edu.pe.transito.dto.rest.Aristas;
import uni.edu.pe.transito.service.AristaService;

@Service
public class ImpAristaService implements AristaService {
    @Autowired
    private AristaDao dao;
    @Override
    public Aristas getAristas() {
        return dao.getArista();
    }

    @Override
    public Aristas gestArista(Nodo nodo) {
        return dao.getArista(nodo);
    }
}
