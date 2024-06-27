package de.saidim.shapeshifter.infrastructure.api.shapeshifter;

import de.saidim.shapeshifter.application.shapeshifter.ShapeshifterService;
import de.saidim.shapeshifter.domain.shapeshifter.Shapeshifter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class ShapeshifterController {

    ShapeshifterService service;

    @PostMapping("/new")
    public String addShapeshifter(Shapeshifter shapeshifter, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-shapeshifter";
        }
        service.save(shapeshifter);

        return "redirect:/index";
    }
}
