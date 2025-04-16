public class Movie {
    String name;
    int releaseYear;
    boolean includePlan;
    int allRating;
    double meanRating;
    int duration;

    void infoMovie() {
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de Lançamento: " + releaseYear);
    }

    void rateMovie(double rating) {
        allRating++;
        meanRating = rating / allRating;
    }
}
