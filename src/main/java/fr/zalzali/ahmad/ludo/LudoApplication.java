package fr.zalzali.ahmad.ludo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class LudoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LudoApplication.class, args);
    }

}
