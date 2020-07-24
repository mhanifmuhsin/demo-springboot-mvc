package id.co.mhanifmuhsin.demomvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class HomeController {

//    @GetMapping("/home")
//    public String home(@RequestParam(name = "name", required = false,defaultValue = "Muhamad Hanif Mushin")String name,
//                       Model model){
//        model.addAttribute("name", name);
//        return "home";
//    }
    @Autowired
    private HomeDao homeDao;

    @GetMapping("/home")
    public @ResponseBody String home(){
        return homeDao.getDataHome();
    }
}
