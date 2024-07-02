package shivang.dholaria.Oauth_Project.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {
    
    @GetMapping("/")
    public String homeString() {
        return "Hello, This the main webpage";
    }
    
    @GetMapping("/secured")
    public String secured() {
        return "Hello, this is the secure page";
    }
    

}
