package com.aluracursos.screenmatch.models;

public class Show extends Title {
    private int seasons;
    private int episodesBySeasons;
    private int minutesByEpisodes;

    public Show(String name, int launchingDate) {
        super(name, launchingDate);
    }

    @Override
    public int getDuration() {
        return seasons * episodesBySeasons * minutesByEpisodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesBySeasons() {
        return episodesBySeasons;
    }

    public void setEpisodesBySeasons(int episodesBySeasons) {
        this.episodesBySeasons = episodesBySeasons;
    }

    public int getMinutesByEpisodes() {
        return minutesByEpisodes;
    }

    public void setMinutesByEpisodes(int minutesByEpisodes) {
        this.minutesByEpisodes = minutesByEpisodes;
    }

    @Override
    public String toString() {
        return ("Serie: " + this.getName() + " (" +this.getLaunchingDate() + ")");
    }
}
