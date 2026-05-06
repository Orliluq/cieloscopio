package com.cieloscopio.util;

import io.github.cdimascio.dotenv.Dotenv;

public class Constants {

    private static final Dotenv dotenv = Dotenv.configure()
            .directory(System.getProperty("user.dir"))
            .ignoreIfMissing()
            .load();

    public static final String API_KEY = dotenv.get("OPENWEATHER_API_KEY");

    public static final String BASE_URL =
            "https://api.openweathermap.org/data/2.5/weather";
}