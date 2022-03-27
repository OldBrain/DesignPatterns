import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartVk {

    public static void main(String[] args) {
        SpringApplication.run(StartVk.class, args);
        System.out.println("Application started. port: 8189 context-path: /vk");
    }
}
