package filmstreaming.model;

import filmstreaming.calculation.Classifiable;

public class Episode implements Classifiable {
    private int number;
    private String name;
    private Series series;
    private int allViews;

    public int getAllViews() {
        return allViews;
    }

    public void setAllViews(int totalViews) {
        this.allViews = totalViews;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClassifiable() {
        if (allViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
