package music.tool;

import org.springframework.stereotype.Component;

@Component("drums")
public class DrumKits implements Instrument {
    private String manufactory = "Yamaha";
    private String type = "classic";

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName());
    }
}
