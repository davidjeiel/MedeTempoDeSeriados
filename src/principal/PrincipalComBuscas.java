package principal;

import com.google.gson.Gson;
import modelos.Titulo;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBuscas {
    public static void main(String[] args) throws IOException, InterruptedException
    {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome de um filme");
        var busca = leitura.nextLine();

        String endereco = "https://www.omdbapi.com/?t="+ busca +"&apikey=cc75d46e";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                        .send( request, HttpResponse.BodyHandlers.ofString() );
        String json = response.body();
        System.out.println("JSON: "+json);

        Gson gson = new Gson();
        Titulo meuTitulo = (Titulo) gson.fromJson( json, Titulo.class );
        System.out.println(meuTitulo.getNome());
    }
}
