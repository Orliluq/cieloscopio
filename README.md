# 🌤️ Cieloscopio Chiqui

> *“Un pequeño oráculo en Java que traduce el cielo en datos.”* ☁️✨ *“El cielo no se mira… se consulta.”* ☁️✨

---

## 🧩 Badges

![Java](https://img.shields.io/badge/Java-21-blue?style=for-the-badge&logo=java)
![Maven](https://img.shields.io/badge/Maven-Build-orange?style=for-the-badge&logo=apachemaven)
![OpenWeatherMap](https://img.shields.io/badge/OpenWeatherMap-API-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Active-success?style=for-the-badge)
![CLI App](https://img.shields.io/badge/Type-Console_App-lightgrey?style=for-the-badge)

---

## 🌎 ¿Qué es Cieloscopio Chiqui?

Cieloscopio Chiqui es una aplicación de consola desarrollada en **Java 21** que consume datos meteorológicos en tiempo real desde la API de OpenWeatherMap, el objetivo es aplicar habilidades reales de desarrollo backend ligero: consumo de APIs, procesamiento de JSON y construcción de una experiencia funcional desde terminal. Es una **app de consola en Java** que consulta el clima en tiempo real usando OpenWeatherMap y lo muestra como un dashboard meteorológico elegante, colorido y con personalidad.

No es solo código… es una conversación con el cielo 🌤️

[//]: # (---)

[//]: # ()
[//]: # (## 🎬 Demo)

[//]: # ()
[//]: # (![Demo GIF]&#40;https://media.giphy.com/media/3o7aD2saalBwwftBIY/giphy.gif&#41;)

[//]: # ()
[//]: # (> ⚠️ Reemplaza este GIF con uno grabado desde tu terminal para más impacto.)

[//]: # ()
[//]: # (---)

---

## 📸 Screenshots

### 🌤️ Resultado en consola
![Weather Output](/cieloscopio.jpg)

[//]: # (### 🎨 Interfaz estilo dashboard)

[//]: # (![Console UI]&#40;https://via.placeholder.com/800x300.png?text=CLI+Weather+Dashboard&#41;)

### 🌤️ Resultado en postman
![Weather Output](/postman1.jpg)

---

## 🚀 Características

- 🌍 Consulta el clima en cualquier ciudad del mundo
- 🌡️ Muestra temperatura, sensación térmica y humedad
- 📊 Incluye presión, viento y visibilidad
- ☁️ Describe el estado del cielo en lenguaje natural
- 🌎 Detecta país y muestra bandera
- 🕒 Agrega fecha y hora de la consulta
- 🔁 Incluye animaciones tipo “consultando el clima…”
- 🎨 Presenta la información en una interfaz de consola estilizada

---

## 🧠 ¿Qué se practica en este proyecto?

Este proyecto pone en práctica habilidades clave del desarrollo Java moderno:

- Consumo de APIs externas con `HttpClient`
- Procesamiento de JSON con `Gson`
- Separación por capas (client, service, model, view, util)
- Manejo de variables de entorno (`.env`)
- Buenas prácticas de logging con SLF4J
- Diseño de salida por consola tipo dashboard

---

## 🧠 Arquitectura del proyecto

```text
com.cieloscopio
│
├── Main                 → Punto de entrada
├── client              → HTTP requests a la API
├── service             → lógica de negocio
├── model               → datos (Records / POJOs)
├── util                → configuración (.env)
└── view                → UI de consola + animaciones
```

---


## ⚙️ Tecnologías
- ☕ Java 21
- 🌐 HttpClient (API REST)
- 🧩 Gson (JSON parsing)
- 🔐 dotenv-java (variables de entorno)
- 📜 SLF4J (logging)
- 🎨 ANSI colors en consola
- 🚀 Postman
- 📌 Trello

---


## 🔐 Configuración

Crea un archivo `.env` en la raíz del proyecto:

```text
OPENWEATHER_API_KEY=tu_api_key_aqui
```

⚠️ Este archivo está protegido en .gitignore y NO se sube al repositorio.

---

## ▶️ Ejecución

```text
mvn clean install
java -jar target/cieloscopio.jar
``````

--- 

## 🌤️ Ejemplo de salida Postman

```text
{
    "coord": {
        "lon": -0.1257,
        "lat": 51.5085
    },
    "weather": [
        {
            "id": 802,
            "main": "Clouds",
            "description": "scattered clouds",
            "icon": "03d"
        }
    ],
    "base": "stations",
    "main": {
        "temp": 12.34,
        "feels_like": 11.2,
        "temp_min": 11.68,
        "temp_max": 13.88,
        "pressure": 1013,
        "humidity": 60,
        "sea_level": 1013,
        "grnd_level": 1009
    },
    "visibility": 10000,
    "wind": {
        "speed": 3.6,
        "deg": 70
    },
    "clouds": {
        "all": 40
    },
    "dt": 1778090978,
    "sys": {
        "type": 2,
        "id": 2075535,
        "country": "GB",
        "sunrise": 1778041410,
        "sunset": 1778095842
    },
    "timezone": 3600,
    "id": 2643743,
    "name": "London",
    "cod": 200
}
```

---

## 🌤️ Ejemplo de salida consola

```tex
════════════════════════════════════════════
📍 Ciudad   : Caracas 🇻🇪     
 🌡️ Temperatura : 29.82 °C         
 🤔 Sensación : 0.0 °C           
 💧 Humedad  : 52 %             
 📊 Presión  : 1013 hPa         
 🌬️ Viento  : 2.57 m/s (ENE)   
 👁️ Visibilidad : 10 km            
 ☁️ Clima    : algo de nubes    
 🌅 Amanecer : 06:07            
 🌇 Atardecer : 18:40            
 🕒 Fecha    : 05/05/2026 14:58
════════════════════════════════════════════
``` 
---

## 🎯 Filosofía del proyecto

> “El software no solo debe funcionar… debe sentirse vivo.” Cieloscopio Chiqui convierte una simple consulta API en una experiencia visual.

--- 

## 🔮 Roadmap
- 🌈 Colores dinámicos según temperatura
- 📊 Gráficas ASCII del clima
- 🗺️ Historial de ciudades consultadas
- 🧭 CLI commands tipo Linux (weather caracas)
- 🌙 Modo oscuro/claro automático
- ⚡ Cache de consultas

--- 

## 🎯 Aprendizaje del challenge

Este proyecto simula un caso real de consumo de API meteorológica, donde se aprende a construir una aplicación funcional desde cero, integrando datos externos y presentándolos de forma clara al usuario.

---

## 🌱 Inspiración

Basado en el challenge Cieloscópio: Practicando Java de Alura, cuyo objetivo es fortalecer habilidades de backend en Java mediante consumo de APIs y procesamiento de datos reales.

---

## 📄 **Licencia**

MIT License - ver archivo [LICENSE](LICENSE) para detalles.

---

## 👨‍💻 Autor

Hecho con ☕ curiosidad, lógica y amor por el código limpio.

---

## ⭐ Si te gustó

Dale ⭐ al repo y deja que el cielo se entere 🌤️✨

--- 