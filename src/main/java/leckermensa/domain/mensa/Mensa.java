package leckermensa.domain.mensa;

import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "MENSA_SEQ")
public class Mensa {

    @NotNull
    private Woche wochenplaene;

    @NotNull
    private String standort;

    @NotNull
    private int siztplaetze;
}
