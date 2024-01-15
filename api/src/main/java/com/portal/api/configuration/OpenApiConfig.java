package com.portal.api.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Car Post Api",
                version = "1",
                contact = @Contact(name = "Pedro Henrique Pereira", email = "pedrohp36@gmail.com", url = "https://www.linkedin.com/in/pedro-h-pereira-dev/"),
                license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0"),
                termsOfService = "",
                description = "Api para criar e gerenciar anúncios de vendas de carros")
)
public class OpenApiConfig {
}
