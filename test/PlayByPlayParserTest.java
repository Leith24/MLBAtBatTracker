import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlayByPlayParserTest {
    @Test
    public void ParseGameDay_CreatesNewGameDayDocument(){
        String data = "";
        PlayByPlayParser subject = new PlayByPlayParser();
        GameDayObject result = subject.ParsePlayByPlayData(data);

        assertNotNull(result);
    }
}
