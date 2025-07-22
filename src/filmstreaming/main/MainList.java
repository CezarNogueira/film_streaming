package filmstreaming.main;

import filmstreaming.model.Series;
import filmstreaming.model.Movie;
import filmstreaming.model.Title;

import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Collections;

public class MainList {
    public static void main(String[] args) {
        Movie outherMovie = new Movie("O Poderoso Chefão", 1970);
        var favoriteMovie = new Movie("Avatar", 2023);
        var favoriteSeries = new Series("Lost", 2000);

        ArrayList<Title> list = new ArrayList<>();
        list.add(favoriteMovie);
        list.add(outherMovie);
        list.add(favoriteSeries);
        Collections.sort(list);
        System.out.println(list);
    }
}
