package com.cieloscopio.view;

public final class WindDirection {

    private WindDirection() {}

    public static String fromDegrees(double deg) {

        String[] dirs = {
                "N", "NNE", "NE", "ENE",
                "E", "ESE", "SE", "SSE",
                "S", "SSW", "SW", "WSW",
                "W", "WNW", "NW", "NNW"
        };

        int index = (int) Math.round(((deg % 360) / 22.5)) % 16;

        return dirs[index];
    }
}