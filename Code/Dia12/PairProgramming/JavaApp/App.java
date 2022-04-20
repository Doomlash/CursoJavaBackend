package com.maven_proyect;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        System.out.println("1. Mostrar Animes");
        System.out.println("2. Agregar Anime");
        System.out.println("3. Agregar Episodios");
        System.out.println("4. Buscar Anime");
        System.out.println("5. Borrar Anime");
        int opcion = s.nextInt();
        switch (opcion) {
            case 1:
                mostrarAnimes();
                break;
            case 2:
                agregarAnime();
                break;
            case 3:
                agregarEpisodio();
                break;
            case 4:
                buscarAnime();
                break;
            case 5:
                borrarAnime();
                break;
            default:
                break;
        }
        //HttpResponse <String> httpResponse = Unirest.get("https://pokeapi.co/api/v2/pokemon/"+nombre).asString();
    }

    private static void borrarAnime() {
        String nombre = s.next();
        HttpResponse <String> httpResponse = Unirest.delete("http://localhost:8080/anime/delete/"+nombre).asString();
    }

    private static void buscarAnime() {
        String nombre = s.next();
        HttpResponse <String> httpResponse = Unirest.get("http://localhost:8080/anime/get/"+nombre).asString();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(JsonParser.parseString(httpResponse.getBody())));
    }

    private static void agregarEpisodio() {
        String anime = s.next();
        String name = s.next();
        String number = s.next();
        HttpResponse<JsonNode> response = Unirest.post("http://localhost:8080/anime/"+anime+"/addEpisode?name="+name+"&number="+number).asJson();

    }

    private static void agregarAnime() {
        String name = s.next();
        String genre = s.next();
        HttpResponse<JsonNode> response = Unirest.post("http://localhost:8080/anime/post?name="+name+"&genre="+genre).asJson();
    }

    private static void mostrarAnimes() {
        HttpResponse <String> httpResponse = Unirest.get("http://localhost:8080/anime/getAll").asString();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(JsonParser.parseString(httpResponse.getBody())));
    }



}
