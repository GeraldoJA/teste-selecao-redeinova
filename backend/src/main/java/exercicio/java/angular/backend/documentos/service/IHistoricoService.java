package exercicio.java.angular.backend.documentos.service;

import exercicio.java.angular.backend.documentos.model.Documento;
import exercicio.java.angular.backend.documentos.model.Historico;
import exercicio.java.angular.backend.documentos.model.Situacao;
import java.util.List;

public interface IHistoricoService {

    List<Historico> listaHistoricoDocumento(Long documentoId);

    Historico insert(Documento documento, Situacao situacao);
}