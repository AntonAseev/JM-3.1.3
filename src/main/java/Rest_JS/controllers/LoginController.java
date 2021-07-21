package Rest_JS.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class LoginController {

    @GetMapping(value = "/")
    public String getHomePage() {
        return "redirect:/login";
    }

    @GetMapping(value = "/login")
    public String getLoginPage() {
        return "login";
    }
}