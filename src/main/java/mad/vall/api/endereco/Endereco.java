package mad.vall.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String complemento;
    private String numero;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logadouro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.bairro = dados.bairro();
        this.cidade = dados.bairro();
        this.complemento = dados.complemento();
        this.numero = dados.numero();
    }
}
