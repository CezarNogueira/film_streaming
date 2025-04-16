public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "Harry Potter";
        myMovie.releaseYear = 2014;
        myMovie.includePlan = true;
        myMovie.meanRating = 3.5;

        myMovie.infoMovie();
    }
}