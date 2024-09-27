package mad.vall.api.medico;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mad.vall.api.endereco.Endereco;

@Table(name = "medicos")
@Entity(name = "Medicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedicos dados) {
        this.crm = dados.crm();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.nome = dados.nome();
        this.endereco = new Endereco((dados.endereco()));
        this.especialidade = dados.especialidade();
    }

    public void atualizarInformacoes(DadosAtualizacaoMedicos dados) {
        if (dados.name() != null){
            this.nome = dados.name();
        }
        if (dados.telefone() != null){
            this.telefone =dados.telefone();
        }
        if (dados.endereco() != null){
            this.endereco.atualizarInformacoes(dados.endereco());
        }
    }
}
