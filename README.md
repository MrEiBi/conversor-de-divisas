
# Proyecto: Conversor de Divisas

Este proyecto es una aplicación de consola en Java que permite realizar conversiones de divisas entre varias monedas. El programa presenta un menú interactivo al usuario con las siguientes opciones de conversión:

1. Dólares (USD) a Pesos Argentinos (ARS)
2. Pesos Argentinos (ARS) a Dólares (USD)
3. Dólares (USD) a Reales Brasileños (BRL)
4. Reales Brasileños (BRL) a Dólares (USD)
5. Dólares (USD) a Pesos Colombianos (COP)
6. Pesos Colombianos (COP) a Dólares (USD)
7. Dólares (USD) a Pesos Mexicanos (MXN)
8. Pesos Mexicanos (MXN) a Dólares (USD)
9. Salir 

El programa utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener las tasas de conversión actualizadas en tiempo real.

## Funcionalidades

- Conversión entre las principales monedas de América Latina.
- Interfaz de usuario simple basada en consola.
- Uso de `HttpClient` para realizar solicitudes a la API.
- Manejo de excepciones para errores de red o problemas en la API.

## Requisitos

Antes de ejecutar este proyecto, asegúrate de tener instalados los siguientes requisitos:

- **Java 11 o superior**: El proyecto utiliza las clases `HttpClient`, `HttpRequest`, y `HttpResponse`, que están disponibles a partir de Java 11.
- **Dependencias externas**: 
  - [Gson](https://github.com/google/gson) para manejar el formato JSON en las respuestas de la API. Puedes incluirla descargando la librería o configurándola en tu gestor de dependencias favorito (por ejemplo, Maven o Gradle).

## Instalación y ejecución

1. Clona este repositorio en tu máquina local:

   ```bash
   git clone https://github.com/tu-usuario/nombre-repositorio.git
   ```

2. Navega al directorio del proyecto:

   ```bash
   cd nombre-repositorio
   ```

3. Abre el proyecto en tu IDE favorito y asegúrate de que el JDK 11 o superior esté configurado.

4. Añade la librería **Gson** al proyecto. Si estás utilizando **Maven**, puedes agregar la siguiente dependencia al archivo `pom.xml`:

   ```xml
   <dependency>
       <groupId>com.google.code.gson</groupId>
       <artifactId>gson</artifactId>
       <version>2.8.8</version>
   </dependency>
   ```

5. Regístrate en [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener una clave de API y reemplaza `TU_API_KEY` en la clase `ConvertidorDivisas` con tu clave personal.

6. Ejecuta la clase `Principal` desde tu IDE o mediante el siguiente comando en la terminal:

   ```bash
   java -cp ruta/al/clase Principal
   ```

## Uso

El programa te mostrará un menú donde podrás seleccionar el tipo de conversión que deseas realizar. Después de seleccionar una opción, deberás ingresar el monto que deseas convertir y el programa te mostrará el valor convertido en la divisa seleccionada.

## Estructura del Proyecto

- **`ConvertidorDivisas`**: Clase encargada de gestionar las solicitudes HTTP y realizar la conversión de divisas utilizando la API.
- **`Menu`**: Clase que gestiona la interacción con el usuario mediante un menú de opciones.
- **`Principal`**: Clase principal que inicia el programa y ejecuta el flujo del menú.

## Contribuciones

Si deseas contribuir a este proyecto, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama para tu feature o bug fix.
3. Envía un pull request para su revisión.

## Licencia

Este proyecto está licenciado bajo la licencia MIT. 
