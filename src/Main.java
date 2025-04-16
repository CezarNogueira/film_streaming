public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "Harry Potter";
        myMovie.releaseYear = 2014;
        myMovie.includePlan = true;

        myMovie.infoMovie();
        myMovie.rateMovie(3.5);
        myMovie.rateMovie(4.5);
        System.out.println(myMovie.meanRating);
    }
}