package com.api.movie.model;

import java.util.List;

public class Movie {

    private int id;

    private String name;

    private List<String> types;

    private String mainType;

    private String imageUrl;

    public Movie() {
    }

    public Movie(int id, String name, List<String> types, String mainType, String imageUrl) {
        this.id = id;
        this.name = name;
        this.types = types;
        this.mainType = mainType;
        this.imageUrl = imageUrl;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
