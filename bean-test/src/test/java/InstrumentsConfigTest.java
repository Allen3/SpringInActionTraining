import music.tool.Instrument;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import music.tool.InstrumentsConfig;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = InstrumentsConfig.class)
public class InstrumentsConfigTest {
    @Rule
    public final SystemOutRule rule = new SystemOutRule();

    @Autowired
    @Qualifier("stratocaster")
    private Instrument guitar;

    @Autowired
    @Qualifier("lespaul")
    private Instrument drum;

    @Test
    public void guitarShouldNotBeNull() {
        assertNotNull(guitar);
    }

    @Test
    public void drumShouldNotBeNull() {
        assertNotNull(drum);
    }

    @Test
    public void perform() {
        rule.enableLog();

        guitar.play();
        drum.play();
        assertEquals("Fender electric StratoCaster" + System.lineSeparator() +
                        "Gibson electric LesPaul" + System.lineSeparator(),
                rule.getLog());

        rule.clearLog();
    }
}
