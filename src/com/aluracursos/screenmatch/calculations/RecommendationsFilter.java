package com.aluracursos.screenmatch.calculations;

public class RecommendationsFilter {
    public void filter(Clasification clasification) {
        if (clasification.getClasification() >= 4) {
            System.out.println("Muy bien evaluado en el momento");
        } else if (clasification.getClasification() >= 2) {
            System.out.println("Popular en el momento");
        } else {
            System.out.println("Colocalo en tu lista para verlo despues");
        }
    }
}
