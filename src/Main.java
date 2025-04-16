import movie.model.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Harry Potter");
        myMovie.setReleaseYear(2009);
        myMovie.setIncludePlan(true);

        myMovie.infoMovie();
        myMovie.rateMovie(3.5);
        myMovie.rateMovie(4.5);
        System.out.println(myMovie.getMeanRating());
        System.out.println(myMovie.getAllRating());
    }
}