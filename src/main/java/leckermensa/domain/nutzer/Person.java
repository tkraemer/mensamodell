package leckermensa.domain.nutzer;

import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import leckermensa.domain.Rolle;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "PERSON_SEQ")
public class Person {

    @NotNull
    @Enumerated
    private Rolle rolle;

    @NotNull
    private String Myname;
}
