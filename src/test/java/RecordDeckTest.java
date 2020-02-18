import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {
    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck();
    }


    @Test
    public void recordDeckHasSpeeds(){
        assertEquals(33, recordDeck.getSpeedByIndex(0));
    }
}
