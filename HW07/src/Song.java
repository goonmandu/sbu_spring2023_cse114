import java.util.Objects;

public class Song implements Comparable {
    private String title;
    private String artist;
    private int duration;

    public String getTitle() { return title; }
    public int getDuration() { return duration; }
    public String getArtist() { return artist; }

    public Song(String title, String artist, String duration) {
        this.title = title;
        this.artist = artist;
        String[] parsed = duration.split(":");
        this.duration = Integer.parseInt(parsed[0]) * 60 + Integer.parseInt(parsed[1]);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return duration == song.duration && Objects.equals(title, song.title) && Objects.equals(artist, song.artist);
    }

    public int compareTo(Object o) throws IllegalArgumentException {
        if (this == o) return 0;
        if (o == null || getClass() != o.getClass()) {
            throw new IllegalArgumentException(String.format(
                    "Expected argument type of Song, got %s instead",
                    getClass().getName()));
        }
        Song song = (Song) o;
        int titleComparison = ServiceUtils.strcmpNoCase(this.getTitle(), song.getTitle());
        if (titleComparison == 0) {
            return ServiceUtils.strcmpNoCase(this.getArtist(), song.getArtist());
        } else {
            return titleComparison;
        }
    }

    public String toString() {
        return String.format(
                "%s by %s (%d:%02d)", title, artist, duration / 60, duration % 60
        );
    }
}
