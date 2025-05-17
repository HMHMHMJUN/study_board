package fastCampus.project_board.config;

import jakarta.persistence.EntityListeners;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

@Configuration
@EnableJpaAuditing
public class JpaConfig {


    @Bean
    public AuditorAware<String> auditorAware() {
        return () -> Optional.of("me");
    }

}
