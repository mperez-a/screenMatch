public class Movie {
    String name;
    int launchingDate;
    int duration;
    boolean planIncluded;
    private double  gradesAdittion;
    private int totalEvaluations;

    int getTotalEvaluations() {
        return (totalEvaluations);
    }

    void showDataSheet() {
        System.out.println("Movie's name is: " + name);
        System.out.println("Launching date: " + launchingDate);
        System.out.println("Duration in minutes: " + duration);
    }

    void evaluate(double grade) {
        gradesAdittion += grade;
        totalEvaluations++;
    }

    double  averageCalculation() {
        return (gradesAdittion / totalEvaluations);
    }
}
