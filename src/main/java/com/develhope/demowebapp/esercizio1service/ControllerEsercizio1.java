package com.develhope.demowebapp.esercizio1service;

import com.develhope.demowebapp.esercizio1.Utente;
import com.develhope.demowebapp.serviceLezione01_03.Album;
import com.develhope.demowebapp.serviceLezione01_03.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/es1service")
public class ControllerEsercizio1 {
    @Autowired
    public UtenteService utenteService;
    @GetMapping("/ciaoTempo")
    public ResponseEntity<Utente> insertNewUtente(@RequestBody Utente utente){
        return ResponseEntity.ok().body(utente);
    }
}
