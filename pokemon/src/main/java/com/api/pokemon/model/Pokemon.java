package com.api.pokemon.model;

import java.util.List;

public class Pokemon {
    private int id;

    private String name;

    private List<String> types;

    private String mainType;

    public Pokemon() {
    }

    public Pokemon(int id, String name, List<String> types, String mainType) {
        this.id = id;
        this.name = name;
        this.types = types;
        this.mainType = mainType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public String getMainType() {
        return mainType;
    }

    public void setMainType(String mainType) {
        this.mainType = mainType;
    }
}
