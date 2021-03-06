package br.edu.uniesp.api.resource;


import br.edu.uniesp.api.model.Filme;
import br.edu.uniesp.api.model.Usuario;
import br.edu.uniesp.api.service.FilmeService;
import br.edu.uniesp.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuario")
public class UsuarioResource {

    @Autowired
    private UsuarioService service;


    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario){
        usuario = service.salvar(usuario);
        return usuario;
    }

    @GetMapping
    public List<Usuario> listar(){
        return service.listar();
    }


    @DeleteMapping("{Id}")
    public void remover(@PathVariable int id){
        service.deletar(id);
    }

    @PutMapping
    public Usuario atualizar(@RequestBody Usuario usuario) throws Exception {
        return service.atualizar(usuario);

    }

}

