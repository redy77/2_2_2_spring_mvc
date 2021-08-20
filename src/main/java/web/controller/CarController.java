package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ModelService;
import web.service.ModelServiceImpl;

@Controller
public class CarController {
    ModelService modelService = new ModelServiceImpl();
    @GetMapping(value ="cars")

    public String cars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        model.addAttribute("cars", modelService.getModels(count));
        return "cars";
    }
}
