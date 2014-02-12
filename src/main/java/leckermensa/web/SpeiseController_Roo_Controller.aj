// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package leckermensa.web;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import leckermensa.domain.mensa.Speise;
import leckermensa.domain.mensa.Zutaten;
import leckermensa.web.SpeiseController;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect SpeiseController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String SpeiseController.create(@Valid Speise speise, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, speise);
            return "speises/create";
        }
        uiModel.asMap().clear();
        speise.persist();
        return "redirect:/speises/" + encodeUrlPathSegment(speise.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String SpeiseController.createForm(Model uiModel) {
        populateEditForm(uiModel, new Speise());
        List<String[]> dependencies = new ArrayList<String[]>();
        if (Zutaten.countZutatens() == 0) {
            dependencies.add(new String[] { "zutaten", "zutatens" });
        }
        uiModel.addAttribute("dependencies", dependencies);
        return "speises/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String SpeiseController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("speise", Speise.findSpeise(id));
        uiModel.addAttribute("itemId", id);
        return "speises/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String SpeiseController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("speises", Speise.findSpeiseEntries(firstResult, sizeNo));
            float nrOfPages = (float) Speise.countSpeises() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("speises", Speise.findAllSpeises());
        }
        return "speises/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String SpeiseController.update(@Valid Speise speise, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, speise);
            return "speises/update";
        }
        uiModel.asMap().clear();
        speise.merge();
        return "redirect:/speises/" + encodeUrlPathSegment(speise.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String SpeiseController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, Speise.findSpeise(id));
        return "speises/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String SpeiseController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        Speise speise = Speise.findSpeise(id);
        speise.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/speises";
    }
    
    void SpeiseController.populateEditForm(Model uiModel, Speise speise) {
        uiModel.addAttribute("speise", speise);
        uiModel.addAttribute("zutatens", Zutaten.findAllZutatens());
    }
    
    String SpeiseController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
