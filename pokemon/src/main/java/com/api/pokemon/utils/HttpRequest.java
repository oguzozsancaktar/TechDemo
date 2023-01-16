package com.api.pokemon.utils;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequest {

    public static JSONObject getRequest(String source) throws IOException {

        HttpURLConnection conn = null;
        BufferedReader reader;
        String line;
        StringBuilder responseContent = new StringBuilder();

        try{
            URL url = new URL(source);
            conn = (HttpURLConnection) url.openConnection();

            // Request setup
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);// 5000 milliseconds = 5 seconds
            conn.setReadTimeout(5000);

            // Test if the response from the server is successful
            int status = conn.getResponseCode();

            if (status == 200){
                reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }

            JSONObject response = new JSONObject(responseContent.toString());

            return response;
        }
         catch (IOException e) {
            e.printStackTrace();
            throw e;
        }finally {
            conn.disconnect();
        }
    }
}
