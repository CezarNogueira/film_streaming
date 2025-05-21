package filmstreaming.calculation;

import filmstreaming.model.Movie;
import filmstreaming.model.Series;
import filmstreaming.model.Title;

public class TimeCalculator {
    private int allTime;

    public int getAllTime() {
        return this.allTime;
    }

    //public void includes(Movie m) {
    //  this.tempoTotal += m.getMinutesTime();
    //}
    //public void includes(Series s) {
    //  this.tempoTotal += s.getMinutesTime();
    //}

    public void includes(Title title) {
        System.out.println("Adicionando duração em minutos de " + title);
        this.allTime += title.getMinutesTime();
    }
}
