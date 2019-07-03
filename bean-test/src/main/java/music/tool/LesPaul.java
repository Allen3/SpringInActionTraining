package music.tool;

import org.springframework.stereotype.Component;

@Component("lespaul")
public class LesPaul implements Instrument {
    private String manufactory = "Gibson";
    private String type = "electric";

    @Override
    public void play() {
        System.out.println(manufactory + " " + type + " " +
                this.getClass().getSimpleName());
    }
}
