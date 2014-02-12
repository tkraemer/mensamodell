package leckermensa.domain.mensa;

import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import leckermensa.domain.Ausstattung;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "SPEISE_SEQ")
public class Speise {

    @Enumerated
    private Ausstattung ausstattung;

    @NotNull
    private String Myname;

    @NotNull
    private Zutaten zutaten;
}
