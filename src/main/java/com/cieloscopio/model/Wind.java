package com.cieloscopio.model;

public record Wind(
        double speed,
        int deg,
        double gust
) {}