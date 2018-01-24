import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GameDayGetterTest {
    @Test
    public void getsCorrectUrl() throws MalformedURLException {
        String season = "2017-regular";
        String gameId = "20170731-TOR-CWS";

        String result = GameDayGetter.GetGameInfo(season, gameId).toString();
        System.out.println(result);
        assertEquals(result,
                "https://api.mysportsfeeds.com/v1.1/pull/mlb/2017-regular/game_playbyplay.json?gameid=20170731-TOR-CWS");
    }

    @Test
    public void getsGameDayInformation() throws IOException {
        URL url = new URL("https://api.mysportsfeeds.com/v1.1/pull/mlb/2017-regular/game_playbyplay.json?gameid=20170612-TEX-HOU");

        String season = "2017-regular";
        String gameId = "20170612-TEX-HOU";
        //String userName =

        //assertNotNull(GameDayGetter.getGameDayResponseData(season, gameId));
    }
}
