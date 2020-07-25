package id.co.mhanifmuhsin.demomvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * In Spring’s approach to building web sites, HTTP requests are handled by a controller.
 * You can easily identify the controller by the @Controller annotation.
 * In the following example,
 * GreetingController handles GET requests for /greeting by returning the name of a View (in this case, greeting).
 * A View is responsible for rendering the HTML content.
 * The following listing (from src/main/java/id/co/mhanifmuhsin/demomvc/HomeController.java)
 * shows the controller:
 * This Class
 * <p>
 * This controller is concise and simple, but there is plenty going on. We break it down step by step.
 * The @GetMapping annotation ensures that HTTP GET requests to /home are mapped to the home() method.
 *
 * @RequestParam binds the value of the query string parameter name into the name parameter of the home() method.
 * This query string parameter is not required.
 * If it is absent in the request, the defaultValue of World is used.
 * The value of the name parameter is added to a Model object, ultimately making it accessible to the view template.
 * <p>
 * The implementation of the method body relies on a view technology (in this case, Thymeleaf)
 * to perform server-side rendering of the HTML.
 * Thymeleaf parses the greeting.
 * html template and evaluates the th:text expression to render the value of the ${name} parameter that was set in
 * the controller.
 * The following listing (from src/main/resources/templates/home.html) shows the home.html template: resource
 * /templates/home.html
 */

@org.springframework.stereotype.Controller
public class HomeController {
//    @Autowired
//    private HomeDao homeDao;

    @GetMapping("/home")
    public String home(@RequestParam(name = "name", required = false, defaultValue = "Muhamad Hanif Mushin") String name,
                       Model model) {
        model.addAttribute("name", name);
        return "home";
    }

//
//    @GetMapping("/home")
//    public @ResponseBody String home(){
//        return homeDao.getDataHome();
//    }
}
