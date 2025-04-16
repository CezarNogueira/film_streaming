package movie.model;

public class Movie {
    private String name;
    private int releaseYear;
    private boolean includePlan;
    private int allRating;
    private double meanRating;
    private int duration;

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

    public double getMeanRating() {
        return meanRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncludePlan(boolean includePlan) {
        this.includePlan = includePlan;
    }

    public void setMeanRating(double meanRating) {
        this.meanRating = meanRating;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
