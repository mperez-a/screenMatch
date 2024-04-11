import com.aluracursos.screenmatch.calculations.TimeCalculator;
import com.aluracursos.screenmatch.models.Movie;
import com.aluracursos.screenmatch.models.Show;

public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Encanto");
        myMovie.setLaunchingDate(2021);
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

        Show dragonHouse = new Show();
        dragonHouse.setName("Dragon House");
        dragonHouse.setLaunchingDate(2022);
        dragonHouse.setSeasons(1);
        dragonHouse.setMinutesByEpisodes(50);
        dragonHouse.setEpisodesBySeasons(10);
        dragonHouse.showDataSheet();
        System.out.println(dragonHouse.getDuration());

        Movie anotherMovie = new Movie();
        anotherMovie.setName("Matrix");
        anotherMovie.setLaunchingDate(1998);
        anotherMovie.setDuration(180);

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.includes(myMovie);
        timeCalculator.includes(dragonHouse);
        timeCalculator.includes(anotherMovie);
        System.out.println(timeCalculator.getTotalTime());
    }
}
