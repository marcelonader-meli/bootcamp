package br.com.meli.controller;

import br.com.meli.service.ConversorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/0.1")
public class Controller{

    @Autowired
    private ConversorService conversorService;

    @GetMapping("/{numero}")
    public ResponseEntity<?> converteNumeroDecimalParaRomano(@PathVariable Integer numero){
        return (conversorService.converteNumeroDecParaRomano(numero) != null)
                ? ResponseEntity.ok(conversorService.converteNumeroDecParaRomano(numero))
                : ResponseEntity.badRequest().body("Tente com um número que seja menor que 4000.");
    }
}
