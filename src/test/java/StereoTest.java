import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {
    Stereo stereo;
    Radio radio;
    CDPlayer cdPlayer;
    RecordDeck recordDeck;

    @Before
    public void before(){
        stereo = new Stereo("Bob");
        radio = new Radio("Bush", "Wireless");
        cdPlayer = new CDPlayer(5,"Sony", "Boombox");
        recordDeck = new RecordDeck("Clearaudio", "Concept");
        stereo.addComponent(radio);
        stereo.addComponent(cdPlayer);
        stereo.addComponent(recordDeck);
    }

    @Test
    public void stereoCanPlayCDPlayer(){
        String cd = "Abbey Road";
        assertEquals("Tra la la", stereo.playCD(cd));
    }



//    @Test
//    public void stereoStartsWithNoComponents(){
//        assertEquals(0, stereo.componentCount());
//    }
//
//    @Test
//    public void stereoCanAddComponents(){
//        Radio radio = new Radio("Bush", "Wireless");
//        stereo.addComponent(radio);
//        assertEquals(1, stereo.componentCount());
//    }
}