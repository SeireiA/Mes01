package cool.liwu.mes01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "cool.liwu")
public class Mes01Application {

    public static void main(String[] args) {
        SpringApplication.run(Mes01Application.class, args);
    }

}
