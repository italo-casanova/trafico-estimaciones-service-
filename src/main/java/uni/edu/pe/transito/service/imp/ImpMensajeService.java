package uni.edu.pe.transito.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.transito.dao.MensajeDao;
import uni.edu.pe.transito.dto.Arista;
import uni.edu.pe.transito.dto.Mensaje;
import uni.edu.pe.transito.service.MensajeService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImpMensajeService implements MensajeService {

    @Autowired
    private MensajeDao dao;
    @Override
    public ArrayList<Mensaje> batchProcess(int tiempo) {
        return dao.batchProcess(tiempo);
    }
}
