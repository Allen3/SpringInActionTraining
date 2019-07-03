package music.role;

import music.tool.DrumKits;
import music.tool.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("drummer")
public class Drummer implements Performer {
    private String name = "Yuqi Zhang";

    private final Instrument drums;

    @Autowired
    public Drummer(Instrument drums) {
        this.drums = drums;
    }

    @Override
    public void perform() {
        System.out.println(name + " is playing ");
        drums.play();
    }
}
