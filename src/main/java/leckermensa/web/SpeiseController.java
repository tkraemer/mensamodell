package leckermensa.web;

import leckermensa.domain.mensa.Speise;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/speises")
@Controller
@RooWebScaffold(path = "speises", formBackingObject = Speise.class)
public class SpeiseController {
}
