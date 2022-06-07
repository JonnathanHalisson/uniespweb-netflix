package br.edu.uniesp.api.resource;
import br.edu.uniesp.api.model.Cartao;
import br.edu.uniesp.api.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cartao")
public class CartaoResource {

    @Autowired
    private CartaoService service;


    @PostMapping
    public Cartao salvar(@RequestBody Cartao cartao){
        cartao = service.salvar(cartao);
        return cartao;
    }

    @GetMapping
    public List<Cartao> listar(){
        return service.listar();
    }


    @DeleteMapping("{Id}")
    public void remover(@PathVariable int id){
        service.deletar(id);
    }

    @PutMapping
    public Cartao atualizar(@RequestBody Cartao cartao) throws Exception {
        return service.atualizar(cartao);

    }

}

