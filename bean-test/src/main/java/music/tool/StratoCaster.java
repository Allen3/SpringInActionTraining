package music.tool;

import org.springframework.stereotype.Component;

@Component("stratocaster")
public class StratoCaster implements Instrument {
    private String manufactory = "Fender";
    private String type = "electric";

    @Override
    public void play() {
        System.out.println(manufactory + " " + type + " " +
                this.getClass().getSimpleName());
    }
}
