package music.role;

import music.tool.Instrument;
import music.tool.StratoCaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("lead")
public class LeadGuitarist implements Performer {
    private String name = "Allen Young";

    private final Instrument guitar;

    @Autowired
    public LeadGuitarist(Instrument guitar) {
        this.guitar = guitar;
    }

    @Override
    public void perform() {
        System.out.println(name + " is playing ");
        guitar.play();
    }
}
