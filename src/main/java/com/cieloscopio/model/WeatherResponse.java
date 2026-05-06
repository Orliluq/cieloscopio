package com.cieloscopio.model;

import java.util.List;

public record WeatherResponse(
        MainData main,
        List<WeatherCondition> weather,
        String name,
        Sys sys,
        Wind wind,
        int visibility
) {}