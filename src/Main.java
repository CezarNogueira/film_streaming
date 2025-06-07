import filmstreaming.calculation.TimeCalculator;
import filmstreaming.calculation.RecommendationFilter;
import filmstreaming.model.Episode;
import filmstreaming.model.Movie;
import filmstreaming.model.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        var favorite = new Movie("Avatar");
        favorite.setMinutesTime(200);
        favorite.setReleaseYear(2023);
        favorite.rate(10);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(favorite);
        System.out.println("Tamanho da Lista: " + movieList.size());
        System.out.println("Primeiro Filme: " + movieList.get(0));
        System.out.println(movieList);
    }
}