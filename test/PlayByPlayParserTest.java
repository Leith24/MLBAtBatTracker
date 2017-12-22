import org.junit.Test;

import static org.junit.Assert.*;

public class PlayByPlayParserTest {
    @Test
    public void ParseGameDay_CreatesNewGameDayDocument(){
        String data = "";
        PlayByPlayParser subject = new PlayByPlayParser();
        GameDayObject result = subject.ParsePlayByPlayData(data);

        assertNotNull(result);
    }
}
