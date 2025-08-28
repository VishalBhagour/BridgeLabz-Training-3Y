import java.util.Scanner;

public class PlayListManagaer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] songs = {"Song1", "Song2", "Song3"};
        boolean running = true;
        while (running) {
            System.out.println("\n--- Music Playlist Manager ---");
            System.out.println("1. Play all songs");
            System.out.println("2. Play song by index");
            System.out.println("3. Search song by name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\nPlaying all songs:");
                    for (String song : songs) {
                        System.out.println("Playing: " + song);
                    }
                    break;
                case 2:
                    System.out.print("Enter song index (0-" + (songs.length - 1) + "): ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < songs.length) {
                        System.out.println("Playing: " + songs[index]);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 3:
                    System.out.print("Enter song name to search: ");
                    String name = sc.nextLine();
                    boolean found = false;
                    for (String song : songs) {
                        if (song.equalsIgnoreCase(name)) {
                            System.out.println("Found! Playing: " + song);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Song not found!");
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting Music Playlist Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
