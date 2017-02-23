package no.fint.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FintRelationConfig {
    @Bean
    public FintRelationAspect getFintRoleAspect() {
        return new FintRelationAspect();
    }
}
