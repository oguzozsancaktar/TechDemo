package com.api.pokemon.model.dto;

import com.api.pokemon.model.Pokemon;

import java.util.List;

public class PokemonList {

    private String type;

    private List<Pokemon> pokeList;

    public PokemonList(List<Pokemon> pokeList) {
        this.type = "Pokemon";
        this.pokeList = pokeList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Pokemon> getPokeList() {
        return pokeList;
    }

    public void setPokeList(List<Pokemon> pokeList) {
        this.pokeList = pokeList;
    }
}
