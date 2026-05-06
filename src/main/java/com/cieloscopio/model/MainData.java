package com.cieloscopio.model;

public record MainData(
        double temp,
        double feelsLike,
        int humidity,
        int pressure,
        double tempMin,
        double tempMax
) {}