package com.develhope.demowebapp.esercizio1;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/es1")
public class ControllerEsercizio {
    @GetMapping("/ciaoTempo")
    public String salutaETempo(@RequestParam String nome, @RequestParam String provincia){
        return "Ciao "+ nome+ ", com'è il tempo in "+provincia;
    }
}
