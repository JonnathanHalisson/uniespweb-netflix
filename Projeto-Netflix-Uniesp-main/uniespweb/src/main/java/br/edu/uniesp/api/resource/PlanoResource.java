package br.edu.uniesp.api.resource;
import br.edu.uniesp.api.model.Filme;
import br.edu.uniesp.api.model.Plano;
import br.edu.uniesp.api.service.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Plano")
public class PlanoResource {

    @Autowired
    private PlanoService service;


    @PostMapping
    public Plano salvar(@RequestBody Plano plano){
        plano = service.salvar(plano);
        return plano;
    }

    @GetMapping
    public List<Plano> listar(){
        return service.listar();
    }


    @DeleteMapping("{Id}")
    public void remover(@PathVariable int id){
        service.deletar(id);
    }

    @PutMapping
    public Plano atualizar(@RequestBody Plano plano) throws Exception {
        return service.atualizar(plano);

    }

}