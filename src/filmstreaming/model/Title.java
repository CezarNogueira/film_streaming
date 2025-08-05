package filmstreaming.model;

import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {
    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }
    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int releaseYear;
    private boolean includePlan;
    private int allRating;
    private double meanRating;
    private double sumRating;
    private int minutesTime;

    public void infoTitle() {
        System.out.println("Nome: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    public int getMinutesTime() {
        return minutesTime;
    }

    public void setMinutesTime(int minutesTime) {
        this.minutesTime = minutesTime;
    }

    public void rateTitle(double rating) {
        this.sumRating += rating;
        this.allRating++;
        this.meanRating = this.sumRating / this.allRating;
    }

    public int getAllRating() {
        return allRating;
    }

    public double getMeanRating() {
        return meanRating;
    }

    public String getName() {
        return name;
    }

    public boolean isIncludePlan() {
        return includePlan;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncludePlan(boolean includePlan) {
        this.includePlan = includePlan;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void showTechnicalSheet() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    public void rate(double grade) {
        sumRating += grade;
        allRating++;
    }

    public double mediaRating() {
        return sumRating / allRating;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {

        return "Nome: '" + name + '\'' +
                ", Ano de Lançamento: " + releaseYear;
    }
}