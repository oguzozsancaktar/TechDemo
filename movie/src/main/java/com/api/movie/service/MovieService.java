package com.api.movie.service;

import com.api.movie.model.GenreEnum;
import com.api.movie.model.Movie;
import com.api.movie.utils.HttpRequest;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    public List<Movie> findAll() {

        List<Movie> movieList = new ArrayList<Movie>();
        String IMG_PATH = "https://image.tmdb.org/t/p/w1280";

        try{
            JSONObject result = HttpRequest.getRequest("https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=5782988c01d5752f8fb39440f1f8d0ce&page=1");

            JSONArray list = result.getJSONArray("results");

            for(int i = 0; i < list.length(); i++){

                JSONObject movie = list.getJSONObject(i);

                List<String> types = new ArrayList<>();

                JSONArray genreIds = movie.getJSONArray("genre_ids");

                for(int j = 0; j<genreIds.length(); j++){
                    types.add(GenreEnum.getById(genreIds.getInt(j)).toString());
                }

                Movie movieDto = new Movie(movie.getInt("id"), movie.getString("original_title"), types, types.get(0), IMG_PATH+movie.getString("poster_path"));
                movieList.add(movieDto);
            }

            return movieList;

        }catch(IOException e){
            return null;
        }catch(Exception e){
            return null;
        }
    }
}
