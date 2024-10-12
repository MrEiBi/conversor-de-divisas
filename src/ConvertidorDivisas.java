import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConvertidorDivisas {

    // Metodo para realizar la solicitud a la API utilizando HttpClient
    public double obtenerTasaCambio(String monedaOrigen, String monedaDestino) throws Exception {
        // API obtenida al registrarme
        String claveApi = "78c4d6c130ea20bd1307dc51";
        String urlStr = "https://v6.exchangerate-api.com/v6/" + claveApi + "/pair/" + monedaOrigen + "/" + monedaDestino;

        // Crear el cliente HTTP
        HttpClient cliente = HttpClient.newHttpClient();

        // Crear la solicitud HTTP
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(urlStr))
                .GET()  // Metodo GET
                .build();

        // Enviar la solicitud y obtener la respuesta
        HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());

        // Convertir la respuesta JSON a un objeto
        JsonObject json = JsonParser.parseString(respuesta.body()).getAsJsonObject();

        // Extraer y devolver la tasa de conversión
        return json.get("conversion_rate").getAsDouble();
    }
}
