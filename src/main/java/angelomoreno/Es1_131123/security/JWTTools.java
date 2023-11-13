package angelomoreno.Es1_131123.security;

import angelomoreno.Es1_131123.entities.Utente;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JWTTools {
    @Value("${spring.jwt.secret}")
    private String secret;

    public String createToken(Utente utente) {
        return Jwts.builder().setSubject(String.valueOf(utente.getUtenteId())) // subject sarebbe colui a cui appartiene il token
                .setIssuedAt(new Date(System.currentTimeMillis())) // la data di emissione del token (IAT: Issued AT)
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 7 )) // data di scadenza del token
//                .signWith(Keys.hmacShaKeyFor(@Value("${SECRET}")))
                .signWith(Keys.hmacShaKeyFor(secret.getBytes()))
                .compact();  // serve per chiudere questo mega builder
    }

    public void verifyToken(String token) {

    }
}
