package br.edu.iftm.ds.exemplos.arquitetura.control;

import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.ds.exemplos.arquitetura.domain.Cliente;
import br.edu.iftm.ds.exemplos.arquitetura.repository.ClienteRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/clientes")

public class ClienteControl {
        
    private final ClienteRepository repository;

    public ClienteControl(ClienteRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Cliente> getClientess() {
        return repository.findAll();
    }
}
