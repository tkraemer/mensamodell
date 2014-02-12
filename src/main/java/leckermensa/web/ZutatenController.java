package leckermensa.web;

import leckermensa.domain.mensa.Zutaten;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/zutatens")
@Controller
@RooWebScaffold(path = "zutatens", formBackingObject = Zutaten.class)
public class ZutatenController {
}
