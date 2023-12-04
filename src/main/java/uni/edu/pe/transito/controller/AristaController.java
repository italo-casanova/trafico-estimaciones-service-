package uni.edu.pe.transito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.transito.dto.Nodo;
import uni.edu.pe.transito.dto.rest.Aristas;
import uni.edu.pe.transito.service.AristaService;


@RestController
@CrossOrigin("*")
public class AristaController {

    @Autowired
    private AristaService service;

    @RequestMapping(
            value = "/api/v1/aristas/getAristas",
            method = RequestMethod.GET
    )
    public Aristas getAristas() {
        return service.getAristas();
    }


    @RequestMapping(
            value = "/api/v1/aristas/getaristasbynode/",
            method = RequestMethod.GET
    )
    @ResponseBody
    public Aristas gestArista(
            @RequestBody Nodo nodo) {
        return service.gestArista(nodo);
    }

}
