package com.arij.hrms.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title("HR Management System API")
                        .description("API documentation for HRMS project")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Arij")
                                .email("arij.saleh@gmail.com")
                        ));
    }
}
