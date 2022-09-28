package com.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webflux.documentos.Cliente;
import com.webflux.repository.ClienteRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository repository;

    @Override
    public Flux<Cliente> findAll() {
	return repository.findAll();    }

    @Override
    public Mono<Cliente> findById(String id) {
	return repository.findById(id);
    }

    @Override
    public Mono<Cliente> save(Cliente cliente) {
	return repository.save(cliente);
    }

    @Override
    public Mono<Void> delete(Cliente cliente) {
	return repository.delete(cliente);
    }

}
