package hw3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    static {
        maxPlayers = 2;
    }

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void setMaxPlayers(int players) {
        maxPlayers = players;
    }

    void addPlayer() {
        currentPlayers++;
    }

    void printGameStatus() {
        System.out.println("название " + gameName + " текущее " + currentPlayers + " максимальное количество игроков " + maxPlayers);
    }
}
