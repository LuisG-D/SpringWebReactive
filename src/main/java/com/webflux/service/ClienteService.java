package com.webflux.service;

import com.webflux.documentos.Cliente;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClienteService {
    
    //Flux te devuelve una lista de elementos o varios elementos
    public Flux<Cliente> findAll();
    
    //Mono te devuelve solo un elemento
    public Mono<Cliente> findById(String id);
    
    //Guarda SOLO UN cliente
    public Mono<Cliente> save(Cliente cliente);
    
    //Elimina UN cliente
    public Mono<Void> delete(Cliente cliente);

}
