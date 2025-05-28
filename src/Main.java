import filmstreaming.calculation.TimeCalculator;
import filmstreaming.calculation.RecommendationFilter;
import filmstreaming.model.Movie;
import filmstreaming.model.Series;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O Poderoso Chefão");
        myMovie.setReleaseYear(1970);
        myMovie.setMinutesTime(180);
        System.out.println("Duração do Filme:" + myMovie.getMinutesTime());
    }
}