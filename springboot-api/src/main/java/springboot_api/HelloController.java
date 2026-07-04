package springboot_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "🚀 DevOps Spring Boot API is Running";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}