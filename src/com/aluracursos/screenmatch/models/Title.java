package com.aluracursos.screenmatch.models;

public class Title {
    private String name;
    private int launchingDate;
    private int duration;
    private boolean planIncluded;
    private double  gradesAdittion;
    private int totalEvaluations;

    public String getName() {
        return name;
    }

    public int getLaunchingDate() {
        return launchingDate;
    }

    public int getDuration() {
        return duration;
    }

    public boolean isPlanIncluded() {
        return planIncluded;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLaunchingDate(int launchingDate) {
        this.launchingDate = launchingDate;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setPlanIncluded(boolean planIncluded) {
        this.planIncluded = planIncluded;
    }

    public int getTotalEvaluations() {
        return (totalEvaluations);
    }

    public void showDataSheet() {
        System.out.println("Movie's name is: " + name);
        System.out.println("Launching date: " + launchingDate);
        System.out.println("Duration in minutes: " + getDuration());
    }

    public void evaluate(double grade) {
        gradesAdittion += grade;
        totalEvaluations++;
    }

    public double  averageCalculation() {
        return (gradesAdittion / totalEvaluations);
    }
}
