package id.co.mhanifmuhsin.demomvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class HomeController {

    @GetMapping("/home")
    public String home(@RequestParam(name = "name", required = false,defaultValue = "Muhamad Hanif Mushin")String name,
                       Model model){
        model.addAttribute("name", name);
        return "home";
    }
}
