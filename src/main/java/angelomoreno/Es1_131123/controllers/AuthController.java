package angelomoreno.Es1_131123.controllers;

import angelomoreno.Es1_131123.payloads.entities.UtenteLoginDTO;
import angelomoreno.Es1_131123.payloads.entities.UtenteLoginSuccessDTO;
import angelomoreno.Es1_131123.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public UtenteLoginSuccessDTO login(@RequestParam UtenteLoginDTO body) {
        return new UtenteLoginSuccessDTO(authService.authenticateUtente(body));
    }
}
