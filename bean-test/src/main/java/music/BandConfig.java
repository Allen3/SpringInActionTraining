package music;

import music.role.*;
import music.tool.Instrument;
import music.tool.ToolPackageMarker;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {ToolPackageMarker.class, RolePackageMarker.class})
public class BandConfig {

    @Bean
    public Performer drummer(@Qualifier("drums") Instrument instrument) {
        return new Drummer(instrument);
    }

    @Bean
    public Performer lead(@Qualifier("stratocaster") Instrument instrument) {
        return new LeadGuitarist(instrument);
    }

    @Bean
    public Performer rhythm(@Qualifier("lespaul") Instrument instrument) {
        return new RhythmGuitarist(instrument);
    }

}
