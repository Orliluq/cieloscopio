package com.cieloscopio.view;

import com.cieloscopio.model.WeatherResponse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class ConsoleFormatter {

    // 🎨 ANSI COLORS
    private static final String RESET = "\u001B[0m";
    private static final String CYAN = "\u001B[36m";
    private static final String YELLOW = "\u001B[33m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[34m";
    private static final String MAGENTA = "\u001B[35m";

    private ConsoleFormatter() {}

    public static void printWeatherBox(WeatherResponse response) {

        if (response == null || response.main() == null) {
            System.out.println("❌ No hay datos disponibles.");
            return;
        }

        String country = response.sys() != null ? response.sys().country() : "";
        String flag = getFlag(country);

        String dateTime = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        String border = "════════════════════════════════════════════";

        System.out.println(border);

        printLine(CYAN + "📍 Ciudad", response.name() + " " + flag);
        printLine(YELLOW + "🌡️ Temperatura", response.main().temp() + " °C");
        printLine(MAGENTA + "🤔 Sensación", response.main().feelsLike() + " °C");
        printLine(BLUE + "💧 Humedad", response.main().humidity() + " %");

        // 📊 extras si existen en tu modelo
        if (response.main().pressure() != 0) {
            printLine(GREEN + "📊 Presión", response.main().pressure() + " hPa");
        }

        if (response.wind() != null) {
            printLine(CYAN + "🌬️ Viento", response.wind().speed() + " m/s");
        }

        if (response.visibility() != 0) {
            printLine(MAGENTA + "👁️ Visibilidad", (response.visibility() / 1000) + " km");
        }

        if (response.weather() != null && !response.weather().isEmpty()) {
            printLine(CYAN + "☁️ Clima", response.weather().getFirst().description());
        }

        printLine(YELLOW + "🕒 Fecha", dateTime);

        System.out.println(border + RESET);
    }

    private static void printLine(String label, String value) {
        System.out.printf(" %-20s : %-20s %n", label + RESET, value + RESET);
    }

    private static String getFlag(String countryCode) {
        if (countryCode == null || countryCode.length() != 2) return "";

        countryCode = countryCode.toUpperCase();

        int first = Character.codePointAt(countryCode, 0) - 65 + 0x1F1E6;
        int second = Character.codePointAt(countryCode, 1) - 65 + 0x1F1E6;

        return new String(Character.toChars(first))
                + new String(Character.toChars(second));
    }
}