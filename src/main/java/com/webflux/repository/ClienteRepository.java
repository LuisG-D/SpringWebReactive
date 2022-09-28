package com.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.webflux.documentos.Cliente;

public interface ClienteRepository extends ReactiveMongoRepository<Cliente, String>{

}
