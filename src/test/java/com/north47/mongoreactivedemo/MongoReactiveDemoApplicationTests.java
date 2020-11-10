package com.north47.mongoreactivedemo;

import com.north47.mongoreactivedemo.models.Kayak;
import com.north47.mongoreactivedemo.repositories.KayakRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class MongoReactiveDemoApplicationTests {

    @Autowired
    private KayakRepository repository;

    @Test
    void contextLoads() {
    }

    @Test
    public void givenValue_whenFindAllByValue_thenFindAccount() {
        repository.save(new Kayak("kayak-name", "Bojan", 32.3, "Decathlon")).block();
        Flux<Kayak> kayakFlux = repository.findByOwner("Bojan");

        StepVerifier
                .create(kayakFlux)
                .assertNext(kayak -> {
                    assertEquals("Bojan", kayak.getOwner());
                    assertEquals(Double.valueOf(32.3) , kayak.getValue());
                    assertNotNull(kayak.getId());
                })
                .expectComplete()
                .verify();
    }

    @Test
    public void givenAccount_whenSave_thenSaveAccount() {
        Mono<Kayak> accountMono = repository.save(new Kayak("kayak-name", "Bill", 32.3, "Decathlon"));

        StepVerifier
                .create(accountMono)
                .assertNext(account -> assertNotNull(account.getId()))
                .expectComplete()
                .verify();
    }
}
