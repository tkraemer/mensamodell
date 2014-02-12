package leckermensa.web;

import leckermensa.domain.mensa.Mensa;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/mensas")
@Controller
@RooWebScaffold(path = "mensas", formBackingObject = Mensa.class)
public class MensaController {
}
