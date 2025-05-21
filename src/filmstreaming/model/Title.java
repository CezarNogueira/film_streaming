package filmstreaming.model;

public class Title {
    private String name;
    private int releaseYear;
    private boolean includePlan;
    private int allRating;
    private double meanRating;
    private int minutesTime;

    public void infoTitle() {
        System.out.println(name);
        System.out.println(releaseYear);
    }

    public int getMinutesTime() {
        return minutesTime;
    }

    public void rateTitle(double rating) {
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

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
