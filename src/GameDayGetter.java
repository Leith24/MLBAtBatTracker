import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;


public class GameDayGetter {

    public static String getGameDayResponseData(String season, String gameId) throws IOException {
        URL url = GetGameInfo(season, gameId);
        String encoding = Base64.getEncoder().encodeToString(("GavinLeith" + ":" + "sc0tland").getBytes());

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setDoOutput(true);
        connection.setRequestProperty("Authorization", "Basic " + encoding);
        InputStream content = connection.getInputStream();
        BufferedReader in =
                new BufferedReader(new InputStreamReader(content));
        String line;
        String lines = "";
        while ((line = in.readLine()) != null) {
            lines += "\n" + line;
        }
        return lines;

    }
    public static URL GetGameInfo(String season, String gameId) throws MalformedURLException {
        URL url = new URL(String.format("https://api.mysportsfeeds.com/v1.1/pull/mlb/%s/game_playbyplay.json?gameid=%s", season, gameId));
        return url;
    }


}