package com.develhope.demowebapp.esercizio2service;

import com.develhope.demowebapp.esercizio2.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/es2Service")
public class ControllerEsercizio2 {
    @Autowired
    public UtenteService utenteService;
    @GetMapping("/ciaoTempo/{provincia}")
    public Utente salutaETempo(
            @RequestParam String nome,
            @PathVariable String provincia
    ){
        String collegamento = "Ciao "+ nome+ ", com'è il tempo in "+provincia+"?";
        return new Utente(nome, provincia, collegamento);
    }
}
