package mad.vall.api.controller;

import mad.vall.api.pacientes.DadosCastroPacientes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("paciente")
public class PacientesController {

    @PostMapping
    public void cadatrar(@RequestBody DadosCastroPacientes dados){
        System.out.print(dados);
    }
}
