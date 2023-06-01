import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    private String playlistTitle;
    private ArrayList<Song> songs = new ArrayList<>();

    public Playlist(String playlistTitle) {
        this.playlistTitle = playlistTitle;
    }

    public String getPlaylistTitle() { return playlistTitle; }
    public void setTitle(String newTitle) { this.playlistTitle = newTitle; }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(String title) {
        int idx = -1;
        for (int i = 0; i < songs.size(); ++i) {
            if (songs.get(i).getTitle().equals(title)) {
                idx = i;
                break;
            }
        }
        if (idx >= 0) {
            songs.remove(idx);
        } else {
            System.err.printf("Song \"%s\" not found!", title);
        }
    }
    public void swapSongs(Song song1, Song song2) {
        int song1idx = -1, song2idx = -1;
        for (int i = 0; i < songs.size(); ++i) {
            if (songs.get(i).equals(song1)) {
                song1idx = i;
            }
            if (songs.get(i).equals(song2)) {
                song2idx = i;
            }
        }
        if (song1idx >= 0 && song2idx >= 0) {
            Collections.swap(songs, song1idx, song2idx);
        } else if (song1idx == -1 && song2idx >= 0){
            System.err.printf("Song \"%s\" not found!\n", song1.getTitle());
        } else {
            System.err.printf("Song \"%s\" not found!\n", song2.getTitle());
        }
    }

    public String totalDuration() {
        int duration = 0;
        for (Song s : songs) {
            duration += s.getDuration();
        }
        return String.format("%d min, %s sec", duration / 60, duration % 60);
    }

    public void sortSongs() {
        ServiceUtils.selectionSort(songs);
    }

    public String toString() {
        String ret = String.format("%s - %s\n", playlistTitle, totalDuration());
        int ord = 1;
        for (Song s : songs) {
            ret += String.format("%d. %s\n", ord++, s);
        }
        return ret;
    }
}
