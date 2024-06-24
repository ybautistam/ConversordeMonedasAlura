import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class conectarApi {

    public  gsonexchangerateApi llamarapi(String monedabase){
        String key = "3354efedc8700ca89dc9b388";
        URI uri = URI.create("https://v6.exchangerate-api.com/v6/"+key+"/latest/" + monedabase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),gsonexchangerateApi.class);
        }catch (Exception e){
            throw new RuntimeException("tu moneda no esta disponible en la conversion");

        }

    }
}
