package filmstreaming.main;

import filmstreaming.model.Movie;
import filmstreaming.model.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Series Lost = new Series("Lost", 2011);

        var favoriteMovie = new Movie("Avatar", 2023);
        favoriteMovie.setMinutesTime(200);
        favoriteMovie.rate(10);
    }
}