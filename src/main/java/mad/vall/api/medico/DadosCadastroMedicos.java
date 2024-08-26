package mad.vall.api.medico;

import mad.vall.api.endereco.Endereco;

public record DadosCadastroMedicos(String nome, String email, String crm, Especialidade especialidade, Endereco endereco) {
}
