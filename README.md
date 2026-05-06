# 🌤️ Cieloscopio Chiqui

> *“El cielo no se mira… se consulta.”* ☁️✨

---

## 🧩 Badges

![Java](https://img.shields.io/badge/Java-21-blue?style=for-the-badge&logo=java)
![Maven](https://img.shields.io/badge/Maven-Build-orange?style=for-the-badge&logo=apachemaven)
![OpenWeatherMap](https://img.shields.io/badge/OpenWeatherMap-API-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Active-success?style=for-the-badge)
![CLI App](https://img.shields.io/badge/Type-Console_App-lightgrey?style=for-the-badge)

---

## 🌎 ¿Qué es Cieloscopio Chiqui?

Cieloscopio Chiqui es una **app de consola en Java** que consulta el clima en tiempo real usando OpenWeatherMap y lo muestra como un dashboard meteorológico elegante, colorido y con personalidad.

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

## 📸 Screenshots

### 🌤️ Resultado en consola
![Weather Output](/cieloscopio.jpg)

[//]: # (### 🎨 Interfaz estilo dashboard)

[//]: # (![Console UI]&#40;https://via.placeholder.com/800x300.png?text=CLI+Weather+Dashboard&#41;)

---

## 🚀 Características

- 🌍 Consulta clima en cualquier ciudad del mundo
- 🌡️ Temperatura, sensación térmica y humedad
- 📊 Presión, viento y visibilidad
- ☁️ Descripción del clima en lenguaje natural
- 🌎 Bandera automática por país
- 🕒 Fecha y hora en tiempo real
- 🔁 Animación tipo “consultando clima…”
- 🎨 Interfaz de consola estilizada

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

## 🌤️ Ejemplo de salida

```tex
════════════════════════════════════════════
📍 Ciudad        : Caracas 🇻🇪
🌡️ Temperatura   : 27.3 °C
🤔 Sensación     : 28.4 °C
💧 Humedad       : 59 %
📊 Presión       : 1013 hPa
🌬️ Viento        : 2.4 m/s
👁️ Visibilidad   : 10 km
☁️ Clima         : algo de nubes
🕒 Fecha         : 06/05/2026 19:42
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

## 📄 **Licencia**

MIT License - ver archivo [LICENSE](LICENSE) para detalles.

---

## 👨‍💻 Autor

Hecho con ☕ curiosidad, lógica y amor por el código limpio.

---

## ⭐ Si te gustó

Dale ⭐ al repo y deja que el cielo se entere 🌤️✨

--- 