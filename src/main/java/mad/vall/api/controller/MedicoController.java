package mad.vall.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import mad.vall.api.medico.DadosCadastroMedicos;
import mad.vall.api.medico.DadosListagemMedicos;
import mad.vall.api.medico.Medico;
import mad.vall.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedicos dados){
        repository.save(new Medico(dados));
    }
    @GetMapping
    public List<DadosListagemMedicos> listar(){
        return repository.findAll().stream().map(DadosListagemMedicos::new).toList();
    }
}
