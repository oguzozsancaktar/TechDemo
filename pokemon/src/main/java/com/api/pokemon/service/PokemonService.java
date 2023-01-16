package com.api.pokemon.service;

import com.api.pokemon.model.Pokemon;
import com.api.pokemon.utils.HttpRequest;
import com.api.pokemon.utils.RNG;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class PokemonService {

    public List<Pokemon> findAll(){

        List pokeList = new ArrayList<Pokemon>();
        Set<Integer> numberSet = RNG.generateRandomNumbers(20, 906);

        try{
            for(int i : numberSet){
                JSONObject result = HttpRequest.getRequest("https://pokeapi.co/api/v2/pokemon/"+i);
                JSONArray arr =  result.getJSONArray("types");
                List<String> types = new ArrayList<>();

                for (int j = 0; j < arr.length(); j++) {
                    types.add(arr.getJSONObject(j).getJSONObject("type").getString("name"));
                }

                Pokemon poke = new Pokemon(i, result.getString("name"), types, types.get(0));
                pokeList.add(poke);
            }
        }catch(IOException e){
            return null;
        }catch(Exception e){
            return null;
        }
        return pokeList;
    }
}
