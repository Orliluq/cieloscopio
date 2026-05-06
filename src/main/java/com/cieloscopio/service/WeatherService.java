package com.cieloscopio.service;

import com.cieloscopio.client.WeatherClient;
import com.cieloscopio.model.WeatherResponse;
import com.cieloscopio.util.Constants;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class WeatherService {

    private static final Logger logger =
            LoggerFactory.getLogger(WeatherService.class);

    private final WeatherClient client;
    private final Gson gson;

    public WeatherService() {
        this.client = new WeatherClient();
        this.gson = new Gson();
    }

    public WeatherResponse getWeather(String city) {

        try {

            String encodedCity = URLEncoder.encode(city, StandardCharsets.UTF_8);

            String url = Constants.BASE_URL
                    + "?q=" + encodedCity
                    + "&appid=" + Constants.API_KEY
                    + "&units=metric&lang=es";

            logger.info("Consultando API: {}",
                    url.replace(Constants.API_KEY, "****"));

            String json = client.getWeatherData(url);

            if (json == null || json.isBlank()) {
                logger.error("Respuesta vacía de la API");
                return null;
            }

            WeatherResponse response =
                    gson.fromJson(json, WeatherResponse.class);

            if (response == null || response.main() == null) {
                logger.error("Respuesta inválida: {}", json);
                return null;
            }

            return response;

        } catch (Exception e) {
            logger.error("Error al obtener clima", e);
            return null;
        }
    }
}