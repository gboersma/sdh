package sdh.locator.myservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyServiceConfig {
    @Bean
    public MyServiceLocator myServiceLocator() {
        return MyServiceLocator.getInstance();
    }
}
