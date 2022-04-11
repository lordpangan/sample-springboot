package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldCtrl {

    @RequestMapping("/")
    public String index() {
        String prefix = System.getenv().getOrDefault("ENV_PREFIX", "Blank");
        return "<h1 style='background-color:tomato;width: 100%;height: 100%;text-align: center;'> 'Greetings from "+prefix+"' </h1>";
    }

}
