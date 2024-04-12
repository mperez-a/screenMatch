package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.models.Movie;
import com.aluracursos.screenmatch.models.Show;
import com.aluracursos.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalWithLists {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Encanto", 2021);
        myMovie.evaluate(9);
        Movie anotherMovie = new Movie("Avatar", 2023);
        anotherMovie.evaluate(6);
        Movie manuelasMovie = new Movie("El señor de los anillos", 2001);
        manuelasMovie.evaluate(10);
        Show lost = new Show("Lost", 2022);

        ArrayList<Title> list = new ArrayList<>();
        list.add(myMovie);
        list.add(anotherMovie);
        list.add(manuelasMovie);
        list.add(lost);

        for (Title item: list) {
            System.out.println(item.getName());
            if (item instanceof Movie movie && movie.getClasification() > 2) {
                System.out.println(movie.getClasification());
            }
        }

        ArrayList<String> artistsList = new ArrayList<>();
        artistsList.add("Penelope Cruz");
        artistsList.add("Antonio Banderas");
        artistsList.add("Ricardo Darin");
        System.out.println(artistsList);

        Collections.sort(artistsList);
        System.out.println("Lista de artistas ordenada: " + artistsList);

        Collections.sort(list);
        System.out.println("Lista de titulos ordenados: " + list);

        list.sort(Comparator.comparing(Title::getLaunchingDate));
        System.out.println("List ordenada por fecha: " + list);
    }
}
