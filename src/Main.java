import java.net.MalformedURLException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws MalformedURLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String userName = scanner.next();
        System.out.println("Please enter your password");
        String pass = scanner.next();
        System.out.println("Enter the season you are looking for:");
        String season =  scanner.next();
        String seasonEntry = season + "-regular";
        System.out.println("Which day are you looking for? (ex: 0903)");
        String day = season + scanner.next();
        System.out.println("What game are you looking for? (ex: HOU-NYM)");
        String game = scanner.next();
        String gameId = day + "-" + game;
        System.out.println("Here is the url for game data for your entered information:");
        System.out.println(GameDayGetter.GetGameInfo(seasonEntry, gameId));
    }
}
