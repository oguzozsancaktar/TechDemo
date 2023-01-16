package com.api.pokemon.controller;

import com.api.pokemon.model.Pokemon;
import com.api.pokemon.model.dto.PokemonList;
import com.api.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/findAll")
public class PokemonController {

    @Autowired
    private PokemonService service;

    @GetMapping("/")
    public ResponseEntity<PokemonList> findAll(){
        List<Pokemon> pokemonList = service.findAll();
        PokemonList result = new PokemonList(pokemonList);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
