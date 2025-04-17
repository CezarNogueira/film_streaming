package filmstreaming.model;

public class Movie extends Title implements Classifiable {
    private int durationMovie;

    public int getDurationMovie() {
        return durationMovie;
    }

    @Override
    public int getClassifiable() {
        return 0;
    }
}
