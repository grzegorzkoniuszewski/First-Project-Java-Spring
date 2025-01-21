package pl.edu.vistula.firstprojectjavaspring.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping(value = "/")
    @ResponseBody
    public String hello() {
        return "Hello Vistula, in my first Spring controller.";
    }

    @GetMapping(value = "/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "League of Legends") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
