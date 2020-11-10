package com.north47.mongoreactivedemo.controllers;

import com.north47.mongoreactivedemo.models.Kayak;
import com.north47.mongoreactivedemo.repositories.KayakRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@RequiredArgsConstructor
@RequestMapping("/kayaks")
public class KayakController {
    private final KayakRepository kayakRepository;

    @PostMapping
    public @ResponseBody Mono<Kayak> createKayak(@RequestBody Kayak kayak) {
        return kayakRepository.save(kayak);
    }

    @GetMapping
    public @ResponseBody Flux<Kayak> getAllKayaks() {
        return kayakRepository.findAll();
    }
}
