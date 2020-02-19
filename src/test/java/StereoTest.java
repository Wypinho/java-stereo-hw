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

    @Test
    public void stereoCanPlayRecordDeck(){
        String record = "White Album";
        assertEquals("Tra la la", stereo.playRecord(record));
    }

    @Test
    public void stereoCanTuneRadio(){
        String station = "Radio Scotland";
        assertEquals("Radio Scotland", stereo.tuneRadio(station));
    }

    @Test
    public void stereoCanRaiseVolume(){
        stereo.raiseVolume();
        stereo.raiseVolume();
        stereo.raiseVolume();
        assertEquals(3, stereo.getVolume());
    }

    @Test
    public void stereoCanLowerVolume(){
        stereo.raiseVolume();
        stereo.raiseVolume();
        stereo.raiseVolume();
        stereo.lowerVolume();
        stereo.lowerVolume();
        assertEquals(1, stereo.getVolume());
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
