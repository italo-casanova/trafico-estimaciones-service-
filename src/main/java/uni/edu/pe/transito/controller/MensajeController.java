package uni.edu.pe.transito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.transito.dto.rest.Aristas;
import uni.edu.pe.transito.dto.rest.DatosEstimacion;
import uni.edu.pe.transito.dto.rest.SolicitudBatch;
import uni.edu.pe.transito.service.MensajeService;

@RestController
@CrossOrigin("*")
public class MensajeController {

    @Autowired
    private MensajeService service;

    @RequestMapping(
            value = "/api/v1/mensajes/batchProcess",
            method = RequestMethod.GET
    )
    @ResponseBody
    public DatosEstimacion batchProcess(@RequestBody SolicitudBatch solicitudBatch) {
        return new DatosEstimacion(solicitudBatch.getAristas(),
                service.batchProcess(solicitudBatch.getTime()));
    }
}
