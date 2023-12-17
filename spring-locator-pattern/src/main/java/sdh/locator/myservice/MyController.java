package sdh.locator.myservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String getGreeting() {
        return MyServiceLocator.getMyService().getGreeting();
    }
}
