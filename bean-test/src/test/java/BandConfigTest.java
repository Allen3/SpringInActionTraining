import music.BandConfig;
import music.role.Performer;
import music.tool.Instrument;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BandConfig.class)
public class BandConfigTest {
//    @Autowired
//    @Qualifier("drums")
//    private Instrument drums;
//
//    @Qualifier("stratocaster")
//    @Autowired
//    private Instrument leadGuitar;
//
//    @Autowired
//    @Qualifier("lespaul")
//    private Instrument rhythmGuitar;

//    @Autowired
//    @Qualifier("drummer")
    private Performer drummer;

//    @Autowired
//    @Qualifier("lead")
    private Performer lead;

//    @Autowired
//    @Qualifier("rhythm")
    private Performer rhythm;

    @Test
    public void show() {
        rhythm.perform();
        lead.perform();
        drummer.perform();
    }
}
