package movie.model;

public class Movie {
    public String name;
    public int releaseYear;
    public boolean includePlan;
    private int allRating;
    public double meanRating;
    public int duration;

    public void infoMovie() {
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de Lançamento: " + releaseYear);
    }

    public void rateMovie(double rating) {
        allRating++;
        meanRating = rating / allRating;
    }

    public int getAllRating() {
        return allRating;
    }
}
