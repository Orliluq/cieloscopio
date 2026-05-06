package com.cieloscopio.model;

import java.util.List;

public record WeatherResponse(
        MainData main,
        List<WeatherCondition> weather,
        String name,
        Wind wind,
        Sys sys,
        int visibility,
        long dt
) {}