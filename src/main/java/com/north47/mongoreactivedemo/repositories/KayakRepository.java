package com.north47.mongoreactivedemo.repositories;

import com.north47.mongoreactivedemo.models.Kayak;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface KayakRepository extends ReactiveMongoRepository<Kayak, Long> {
    Flux<Kayak> findByOwner(String owner);
}
