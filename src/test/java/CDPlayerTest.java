import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {
    private CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer(5, "Sony", "Boombox");
    }

    @Test
    public void cdPlayerHasCDCapacity(){
        assertEquals(5, cdPlayer.getCdCapacity());
    }

}
