package sdh.locator.myservice;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String getGreeting() {
        return "Greetings from MyService!";
    }
}
