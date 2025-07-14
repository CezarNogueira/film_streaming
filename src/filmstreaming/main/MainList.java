package filmstreaming.main;

import filmstreaming.model.Series;
import filmstreaming.model.Movie;
import filmstreaming.model.Title;

import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Collections;

public class MainList {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Avatar", 2023);
        Movie outherMovie = new Movie("O Poderoso Chefão", 1970);
        var favoriteMovie = new Movie("Avatar", 2023);
        Series lost = new Series("Lost", 2000);

        Movie m1 = favoriteMovie;

        ArrayList<Title> list = new ArrayList<>();
        list.add(favoriteMovie);
        System.out.println("Tamanho da Lista: " + list.size());
        System.out.println(list.getFirst());
        System.out.println(lost);
        for (Title item: list) {
            System.out.println(item.getName());
            if (item instanceof Movie movie && movie.getClassifiable() > 2) {
                System.out.println("Classificação: " + movie.getClass());
            }
        }

        ArrayList<String> searchArtist = new ArrayList<>();
        searchArtist.add("Paulo Silva");
        searchArtist.add("Adam Sandler");
        searchArtist.add("Joao Lima");
        System.out.println(searchArtist);
        Collections.sort(searchArtist);
        System.out.println("Depois da Ordenação:");
        System.out.println(searchArtist);
    }
}
