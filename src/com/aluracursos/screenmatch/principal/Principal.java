package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculations.RecommendationsFilter;
import com.aluracursos.screenmatch.calculations.TimeCalculator;
import com.aluracursos.screenmatch.models.Episode;
import com.aluracursos.screenmatch.models.Movie;
import com.aluracursos.screenmatch.models.Show;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Encanto", 2021);
        myMovie.setDuration(120);
        myMovie.setPlanIncluded(true);

//        myMovie.showDataSheet();
        myMovie.evaluate(10);
        myMovie.evaluate(10);
        myMovie.evaluate(7.8);

        System.out.println(myMovie.getName());
        System.out.println(myMovie.getLaunchingDate());
        System.out.println(myMovie.getDuration());
        System.out.println(myMovie.isPlanIncluded());
        System.out.println(myMovie.getTotalEvaluations());
        System.out.println(myMovie.averageCalculation());

        Show lost = new Show("Lost", 2022);
        lost.setSeasons(1);
        lost.setMinutesByEpisodes(50);
        lost.setEpisodesBySeasons(10);
        lost.showDataSheet();
        System.out.println(lost.getDuration());

        Movie anotherMovie = new Movie("Avatar", 1998);
        anotherMovie.setDuration(180);

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.includes(myMovie);
        timeCalculator.includes(lost);
        timeCalculator.includes(anotherMovie);
        System.out.println(timeCalculator.getTotalTime());

        RecommendationsFilter recommendationsFilter = new RecommendationsFilter();
        recommendationsFilter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumEpisode(1);
        episode.setName("La casa de papel");
        episode.setShow(lost);
        episode.setTotalViews(50);

        recommendationsFilter.filter(episode);

        var manuelasMovie = new Movie("El señor de los anillos", 2001);
        manuelasMovie.setDuration(180);

        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(manuelasMovie);
        moviesList.add(myMovie);
        moviesList.add(anotherMovie);

        System.out.println("Tamaño de la lista: " + moviesList.size());
        System.out.println("La primera pelicula es: " + moviesList.getFirst().getName());

        System.out.println(moviesList.toString());

        System.out.println("ToString de la pelicula: " + moviesList.getFirst().toString());

    }
}
