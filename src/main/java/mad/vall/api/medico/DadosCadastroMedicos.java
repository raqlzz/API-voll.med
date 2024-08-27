package mad.vall.api.medico;

import mad.vall.api.endereco.DadosEndereco;

public record DadosCadastroMedicos(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
