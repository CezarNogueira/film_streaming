import filmstreaming.calculation.TimeCalculator;
import filmstreaming.calculation.RecommendationFilter;
import filmstreaming.model.Episode;
import filmstreaming.model.Movie;
import filmstreaming.model.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Series Lost = new Series("Lost", 2011);

        var favoriteMovie = new Movie("Avatar", 2023);
        favoriteMovie.setMinutesTime(200);
        favoriteMovie.rate(10);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(favoriteMovie);
        System.out.println("Tamanho da Lista: " + movieList.size());
        System.out.println("Primeiro Filme: " + movieList.get(0));
        System.out.println(movieList);
    }
}