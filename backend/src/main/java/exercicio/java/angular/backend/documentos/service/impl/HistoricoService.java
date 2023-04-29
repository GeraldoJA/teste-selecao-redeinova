package exercicio.java.angular.backend.documentos.service.impl;

import exercicio.java.angular.backend.documentos.model.Historico;
import exercicio.java.angular.backend.documentos.model.Documento;
import exercicio.java.angular.backend.documentos.model.Situacao;
import exercicio.java.angular.backend.documentos.repository.HistoricoRepository;
import exercicio.java.angular.backend.documentos.service.IHistoricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class HistoricoService implements IHistoricoService {
    
    @Autowired
    private HistoricoRepository historicoRepository;

    @Override
    public List<Historico> listaHistoricoDocumento(Long documentoId) {
        return historicoRepository.listaHistoricoDocumento(documentoId);
    }

    @Override
    @Transactional
    public Historico insert(Documento documento, Situacao situacao) {

        Historico hist = new Historico();
        hist.setDocumento(documento);
        hist.setData( new Date() );
        hist.setMudanca(situacao.getNome() +" -> "+ documento.getPasta().getSetor().getNome() +" / "+ documento.getPasta().getNome());

        return historicoRepository.save(hist);
    }
}
