package com.cieloscopio.view;

public final class TemperatureColor {

    private TemperatureColor() {}

    public static String color(double temp) {

        if (temp <= 10) return "\u001B[36m"; // azul frío
        if (temp <= 20) return "\u001B[34m"; // azul normal
        if (temp <= 28) return "\u001B[33m"; // amarillo cálido
        if (temp <= 35) return "\u001B[31m"; // rojo calor
        return "\u001B[35m"; // extremo
    }
}