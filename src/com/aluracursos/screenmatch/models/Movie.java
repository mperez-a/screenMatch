package com.aluracursos.screenmatch.models;

import com.aluracursos.screenmatch.calculations.Clasification;

public class Movie extends Title implements Clasification {
    private String director;

    public Movie(String name, int launchingDate) {
        super(name, launchingDate);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasification() {
        return (int) (averageCalculation() / 2);
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getName() + " (" + getLaunchingDate() + ")";
    }
}
