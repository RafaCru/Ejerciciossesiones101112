package com.example.Ejerciciossesiones101112.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /*
     *
     * Documentación de Swagger
     *
     *  http://springfox.github.io/springfox/docs/current/
     *
     *
     *
     * */
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetalles())
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.Ejercicio123"))
                .build();
    }
    private ApiInfo apiDetalles(){
        return new ApiInfo("Spring Boot ApiRes Laptop",
                "Implementacion de los métodos CRUD en el API REST de Laptop creada en ejercicios anteriores.",
                "1.0","https://www.google.es",
                new Contact("Rafael Cruañes","https://www.google.es","rafacrucu@gmail.com"),
                "Free",
                "https://www.google.es",
                Collections.emptyList());
    }
}