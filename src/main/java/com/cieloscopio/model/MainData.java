package com.cieloscopio.model;

import com.google.gson.annotations.SerializedName;

public record MainData(
        double temp,
        @SerializedName("feels_like") double feelsLike,
        int humidity,
        int pressure
) {}