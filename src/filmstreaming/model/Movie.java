package filmstreaming.model;

import filmstreaming.calculation.Classifiable;

public class Movie extends Title implements Classifiable {
    private int durationMovie;

    public int getDurationMovie() {
        return durationMovie;
    }

    @Override
    public int getClassifiable() {
        return (int) (getMeanRating() / 2);
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" + this.getReleaseYear() + ") ";
    }
}
