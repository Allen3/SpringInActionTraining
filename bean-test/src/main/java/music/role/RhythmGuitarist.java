package music.role;

import music.tool.Instrument;
import music.tool.LesPaul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("rhythm")
public class RhythmGuitarist implements Performer {
    private String name = "Han Wu";

    private final Instrument guitar;

    @Autowired
    public RhythmGuitarist(Instrument guitar) {
        this.guitar = guitar;
    }


    @Override
    public void perform() {
        System.out.println(name + " is playing ");
        guitar.play();
    }
}
