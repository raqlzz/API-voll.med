package mad.vall.api.medico;

import jakarta.validation.constraints.NotNull;
import mad.vall.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedicos(
        @NotNull
        Long id,
        String name,
        String telefone,
        DadosEndereco endereco) {
}
