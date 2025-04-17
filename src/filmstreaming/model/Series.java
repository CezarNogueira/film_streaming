package filmstreaming.model;

public class Series extends Title {
    private int seasonNumber;
    private int episodeNumber;
    private boolean activeSeries;
    private int episodeDuration;

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public boolean isActiveSeries() {
        return activeSeries;
    }

    public void setActiveSeries(boolean activeSeries) {
        this.activeSeries = activeSeries;
    }

    public int getEpisodeDuration() {
        return episodeDuration;
    }

    public void setEpisodeDuration(int episodeDuration) {
        this.episodeDuration = episodeDuration;
    }
}
