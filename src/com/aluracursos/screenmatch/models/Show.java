package com.aluracursos.screenmatch.models;

public class Show extends Title {
    int seasons;
    int episodesBySeasons;
    int minutesByEpisodes;

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
}
