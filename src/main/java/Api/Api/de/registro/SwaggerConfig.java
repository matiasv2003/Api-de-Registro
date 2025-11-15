package Api.Api.de.registro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Registro - Level Up Gamer")
                        .version("1.0")
                        .description("Documentación de la API para Registro"));
    }
}

//http://localhost:8081/swagger-ui/index.html