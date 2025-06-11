package filmstreaming.main;

import filmstreaming.model.Series;
import filmstreaming.model.Movie;
import filmstreaming.model.Title;

import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Avatar", 2023);
        Movie outherMovie = new Movie("O Poderoso Chefão", 1970);
        var favoriteMovie = new Movie("Avatar", 2023);
        Series lost = new Series("Lost", 2000);

        ArrayList<Title> list = new ArrayList<>();
        list.add(favoriteMovie);
        System.out.println("Tamanho da Lista: " + list.size());
        System.out.println("Primeiro Filme: " + list.getFirst());
        System.out.println(lost);
        for (Title item: list) {
            System.out.println(item);
        }
    }
}
