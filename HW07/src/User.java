import java.util.ArrayList;

public class User {
    private String userName;
    private ArrayList<Playlist> playlists = new ArrayList<>();

    public User(String userName) {
        this.userName = userName;
    }

    public String getUsername() { return userName; }
    public ArrayList<Playlist> getPlaylist() { return playlists; }
    public void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public void removePlaylist(String playlistTitle) {
        int i = 0;
        boolean found = false;
        for (Playlist p : playlists) {
            if (p.getPlaylistTitle().equals(playlistTitle)) {
                found = true;
                break;
            }
            i++;
        }
        if (found) {
            playlists.remove(i);
        } else {
            System.err.printf("Playlist \"%s\" not found!\n", playlistTitle);
        }
    }

    public Playlist getPlaylist(String playlistTitle) {
        for (Playlist p : playlists) {
            if (p.getPlaylistTitle().equals(playlistTitle)) {
                return p;
            }
        }
        System.err.printf("Playlist \"%s\" not found!\n", playlistTitle);
        return null;
    }

    public void makeCollaborativePlaylist(String playlistTitle, User friend) {
        friend.addPlaylist(this.getPlaylist(playlistTitle));
    }

    public String toString() {
        String ret = String.format("%s's Playlists:\n", userName);
        for (Playlist p : playlists) {
            ret += p;
        }
        return ret;
    }
}
