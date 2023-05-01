package exercicio.java.angular.backend.documentos.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import exercicio.java.angular.backend.documentos.model.Historico;
import exercicio.java.angular.backend.documentos.model.Documento;
import exercicio.java.angular.backend.documentos.model.Situacao;
import exercicio.java.angular.backend.documentos.service.IHistoricoService;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("historico")
public class HistoricoController {

    @Autowired
    private IHistoricoService service;

    @GetMapping("{id}")
    public List<Historico> listaHistoricoDocumento(@PathVariable Long id) {
        return service.listaHistoricoDocumento(id);
    }

    @PostMapping
    public Historico insert(           
            @RequestBody Documento documento,
            @RequestBody Situacao situacao) {
        return service.insert(documento, situacao);
    }
    
}
