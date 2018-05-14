package tim.l1.avg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class AvgApplication {

    public static void main(String[] args) {
        SpringApplication.run(AvgApplication.class, args);
    }
}
