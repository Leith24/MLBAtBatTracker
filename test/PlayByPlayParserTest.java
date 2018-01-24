import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.Assert.assertNotNull;

public class PlayByPlayParserTest {
    @Test
    public void ParseGameDay_CreatesNewGameDayDocument(){
        String data = "";
        PlayByPlayParser subject = new PlayByPlayParser();
        GameDayObject result = subject.ParsePlayByPlayData(data);

        assertNotNull(result);
    }
    @Test
    public void ParseGameDay_CorrectlyParsesGameDayData(){
        JSONObject object = new JSONObject();
        try {
            FileReader reader = new FileReader("C:\\Users\\gavin\\Desktop\\gamedayPBPinfo.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String data = "";
    }
}
