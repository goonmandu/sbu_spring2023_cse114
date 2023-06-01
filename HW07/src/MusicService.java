import java.util.ArrayList;

public class MusicService {
    private static ArrayList<User> users = new ArrayList<>();

    public static void addUser(User user) {
        users.add(user);
    }
    public static void removeUser(String userName) {
        boolean found = false;
        int idx = 0;
        for (User user : users) {
            if (user.getUsername().equals(userName)) {
                found = true;
                break;
            }
            idx++;
        }
        if (found) {
            users.remove(idx);
        } else {
            System.err.printf("User \"%s\" not found!\n", userName);
        }
    }

    public static ArrayList<Playlist> getUserPlaylists(User user) {
        return getUserPlaylists(user.getUsername());
    }

    public static ArrayList<Playlist> getUserPlaylists(String userName) {
        for (User user : users) {
            if (user.getUsername().equals(userName)) {
                return user.getPlaylist();
            }
        }
        System.err.printf("User \"%s\" not found!\n", userName);
        return null;
    }
}
