package leckermensa.web;

import leckermensa.domain.mensa.Woche;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/woches")
@Controller
@RooWebScaffold(path = "woches", formBackingObject = Woche.class)
public class WocheController {
}
