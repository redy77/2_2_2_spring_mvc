package web.controller;

import models.Model;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ModelServiceImpl;

@Controller
public class CarController {

    @GetMapping(value ="cars")
    public String cars(@RequestParam(value = "count", required = false) String count, ModelMap model) {
        ModelServiceImpl modelService = new ModelServiceImpl();
        model.addAttribute("messages", modelService.getModels(count));
        return "cars";
    }
}