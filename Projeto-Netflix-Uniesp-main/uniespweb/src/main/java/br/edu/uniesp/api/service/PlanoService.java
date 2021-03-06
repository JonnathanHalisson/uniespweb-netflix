package br.edu.uniesp.api.service;
import br.edu.uniesp.api.model.Plano;
import br.edu.uniesp.api.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanoService {
    @Autowired
    private PlanoRepository repository;

    public Plano salvar(Plano plano){
        return repository.save(plano);
    }

    public Plano atualizar(Plano plano) throws Exception {
        if(plano.getId()==null){
            throw new Exception("ID não encontrado");
        }
        return repository.save(plano);
    }

    public void deletar(int id){
        repository.deleteById(id);
    }

    public List<Plano> listar(){
        return repository.findAll();
    }
}
