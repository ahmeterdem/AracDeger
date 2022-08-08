package tr.org.tarimkredi.ekoop.aracdeger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class AracDegerApplication
{

    public static void main(String[] args)
    {
        System.out.println("Başlangıç");
        SpringApplication.run(AracDegerApplication.class, args);
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("tr.org.tarimkredi.ekoop.aracdeger"))
            .build();
    }

}
