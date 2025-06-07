import filmstreaming.calculation.TimeCalculator;
import filmstreaming.calculation.RecommendationFilter;
import filmstreaming.model.Episode;
import filmstreaming.model.Movie;
import filmstreaming.model.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.showTechnicalSheet();

        Series lost = new Series();

        Movie outherMovie = new Movie();

        TimeCalculator calculator = new TimeCalculator();

        RecommendationFilter filtro = new RecommendationFilter();

        Episode episode = new Episode();

        var favorite = new Movie();
        favorite.setMinutesTime(200);
        favorite.setName("Avatar");
        favorite.setReleaseYear(2023);
        favorite.rate(10);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(favorite);
        System.out.println("Tamanho da Lista: " + movieList.size());
        System.out.println("Primeiro Filme: " + movieList.get(0));
        System.out.println(movieList);
    }
}