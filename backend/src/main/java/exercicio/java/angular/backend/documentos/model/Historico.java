package exercicio.java.angular.backend.documentos.model;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="historico_documentos")
public class Historico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "documentos_id")
    private Documento documento;

    private Date data;

    private String mudanca;
}
