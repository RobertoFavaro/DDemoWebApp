package com.develhope.demowebapp.esercizio1service;

import com.develhope.demowebapp.esercizio1.Utente;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class UtenteService {
    public String salutaETempo(Utente utente){
        return "Ciao "+ utente.getNome()+ ", com'è il tempo in "+utente.getProvincia();
    }
}
