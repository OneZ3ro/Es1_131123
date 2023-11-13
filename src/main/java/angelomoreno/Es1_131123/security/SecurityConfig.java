package angelomoreno.Es1_131123.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)); // le sessioni sono senza stato
        http.csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable()); //da maggiore sicurezza, ma per ora andrebbe solo a mettere i bastoni tra le ruote
        http.formLogin(httpSecurityFormLoginConfigurer -> httpSecurityFormLoginConfigurer.disable()); // disabilita il form login che crea in automatico
        http.authorizeHttpRequests(request -> request.requestMatchers("/**").permitAll()); // aggiungo/rimuovo protezione per cui venga/non venga richiesto l'autenticazione su tutti gli endopoint
        return http.build();
    }
}
