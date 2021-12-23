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

    @GetMapping
    public ResponseEntity<?> home(){
        return ResponseEntity.ok("Digite um número decimal ao final da URL (acrescentando uma \"/\" antes do número), para saber o seu correspondente em números romanos.");
    }

    @GetMapping("/{numero}")
    public ResponseEntity<?> converteNumeroDecimalParaRomano(@PathVariable Integer numero){
        return (conversorService.converteNumeroDecParaRomano(numero) != null)
                ? ResponseEntity.ok("O número \"" + numero + "\" em números romanos é: \"" + conversorService.converteNumeroDecParaRomano(numero) + "\"")
                : ResponseEntity.badRequest().body("Tente com um número que seja menor que \"10000\".");
    }
}
