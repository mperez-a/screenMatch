package com.aluracursos.screenmatch.models;

import com.aluracursos.screenmatch.calculations.Clasification;

public class Episode implements Clasification {
    private int numEpisode;
    private String name;
    private Show show;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    private int totalViews;

    public int getNumEpisode() {
        return numEpisode;
    }

    public void setNumEpisode(int numEpisode) {
        this.numEpisode = numEpisode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    @Override
    public int getClasification() {
        if (totalViews > 100) {
            return (4);
        } else {
            return (2);
        }
    }
}
