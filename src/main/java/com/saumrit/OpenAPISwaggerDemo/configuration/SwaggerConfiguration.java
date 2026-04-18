package com.saumrit.OpenAPISwaggerDemo.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    public OpenAPI MySpringBootSwaggerDemo(){
        return new OpenAPI()
                .info(new Info().title("Sample Programme for SpringBoot as Docker Container")
                        .description("It is a demo project to show SpringBoot App running as Docker COntainer and communucating " +
                                "with MongoDB hosted In localhost"));

    }
}
