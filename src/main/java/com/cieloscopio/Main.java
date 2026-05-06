package com.cieloscopio;

import com.cieloscopio.model.WeatherResponse;
import com.cieloscopio.service.WeatherService;
import com.cieloscopio.view.ConsoleFormatter;
import com.cieloscopio.view.LoadingAnimation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {

    private static final Logger logger =
            LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("Iniciando aplicación Cieloscopio Chiqui...");

        try (Scanner scanner = new Scanner(System.in)) {

            WeatherService service = new WeatherService();

            System.out.println("🌤️ Bienvenido(a) a Cieloscopio Chiqui ️🌤️");
            System.out.print("Ingresa una ciudad: ");

            String city = scanner.nextLine().trim();

            if (city.isBlank()) {
                System.out.println("⚠️ Debes ingresar una ciudad válida.");
                return;
            }

            // 🌦️ Animación ANTES de la llamada real
            System.out.println();
            LoadingAnimation.show("Consultando clima, espera un momento...", 1200);

            WeatherResponse response = service.getWeather(city);

            if (response == null || response.main() == null) {
                System.out.println("❌ No se pudo obtener información del clima.");
                return;
            }

            ConsoleFormatter.printWeatherBox(response);

        } catch (Exception e) {

            logger.error("Error al consultar el clima", e);
            System.out.println("❌ Error al consultar el clima. Revisa los logs.");

        } finally {
            logger.info("Aplicación finalizada. Gracias por consultar \uD83C\uDF24️ Cieloscopio Chiqui");
        }
    }
}