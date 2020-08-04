package com.api.rh.config;

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
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2 )

                .select()
                .apis(RequestHandlerSelectors.basePackage("com.api.rh.resource") )
                .paths(PathSelectors.any() )
                .build()
                .apiInfo( this.informacoesDaAPI() );
    }

    private ApiInfo informacoesDaAPI() {
        return new ApiInfo(
                "API RH - API simples",
                "API desenvolvida com Spring Boot, Spring Web e Spring REST e PostgreSQL.",
                "1.0",
                "Termo de Serviço",
                new Contact("XXXXX", "xxxxxxx", "xxxx"),
                "MIT", "API license URL", Collections.emptyList() );

    }
}
