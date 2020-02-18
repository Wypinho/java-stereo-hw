import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {
    private Radio radio;

    @Before
    public void before(){
        radio = new Radio();
    }

    @Test
    public void radioCanBeTuned(){
        radio.tune("Radio 4");
        assertEquals("Radio 4", radio.getStation());
    }
}
