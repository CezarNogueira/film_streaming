import filmstreaming.calculation.TimeCalculator;
import filmstreaming.calculation.RecommendationFilter;
import filmstreaming.model.Episode;
import filmstreaming.model.Movie;
import filmstreaming.model.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O Poderoso Chefão");
        myMovie.setReleaseYear(1970);
        myMovie.setMinutesTime(180);
        System.out.println("Duração do Filme:" + myMovie.getMinutesTime());

        myMovie.showTechnicalSheet();
        myMovie.rate(8);
        myMovie.rate(5);
        myMovie.rate(10);
        System.out.println("Total de avaliações: " + myMovie.getAllRating());
        System.out.println(myMovie.mediaRating());

        Series lost = new Series();
        lost.setName("Lost");
        lost.setReleaseYear(2000);
        lost.showTechnicalSheet();
        lost.setSeasonNumber(10);
        lost.setEpisodeNumber(10);
        lost.setEpisodeDuration(50);
        System.out.println("Duração para maratonar Lost: " + lost.getMinutesTime());

        Movie outherMovie = new Movie();
        outherMovie.setName("Avatar");
        outherMovie.setReleaseYear(2023);
        outherMovie.setMinutesTime(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(myMovie);
        calculator.includes(outherMovie);
        calculator.includes(lost);
        System.out.println(calculator.getAllTime());

        RecommendationFilter filtro = new RecommendationFilter();
        filtro.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSeries(lost);
        episode.setAllViews(300);
        filtro.filter(episode);

        var movieTest = new Movie();
        movieTest.setMinutesTime(200);
        movieTest.setName("Avatar");
        movieTest.setReleaseYear(2023);
        movieTest.rate(10);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(movieTest);
        movieList.add(movieTest);
        movieList.add(outherMovie);
        System.out.println("Tamanho da Lista: " + movieList.size());
        System.out.println("Primeiro Filme: " + movieList.get(0).getName());
        System.out.println(movieList);
        System.out.println("toString of Movie: " + movieList.get(0).toString());
    }
}