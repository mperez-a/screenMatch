package com.aluracursos.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalWithResearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Escriba el nombre de la pelicula");
        var search = keyboard.nextLine();

        String urlDirection = "https://www.omdbapi.com/?t=" + search + "&apikey=d7daaab3";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlDirection))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
