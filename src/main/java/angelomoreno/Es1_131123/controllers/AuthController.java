package angelomoreno.Es1_131123.controllers;

import angelomoreno.Es1_131123.payloads.entities.UtenteLoginDTO;
import angelomoreno.Es1_131123.payloads.entities.UtenteLoginSuccessDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @PostMapping
    public UtenteLoginSuccessDTO login(@RequestParam UtenteLoginDTO body) {
        return new UtenteLoginSuccessDTO("token");
    }
}
