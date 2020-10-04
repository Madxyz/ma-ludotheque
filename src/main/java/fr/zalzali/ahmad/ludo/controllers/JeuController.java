package fr.zalzali.ahmad.ludo.controllers;

import fr.zalzali.ahmad.ludo.entities.Jeu;
import fr.zalzali.ahmad.ludo.services.interfaces.IJeuService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jeux")
@Tag(name = "Gestion des Jeux")
public class JeuController {

    @Autowired
    IJeuService iJeuService;

    @GetMapping
    @Operation(summary = "Méthode permettant de récupérer tous les Jeux.")
    public ResponseEntity<List<Jeu>> findAll() {

        return ResponseEntity.ok(iJeuService.findAll());
    }

    @PostMapping
    @Operation(summary = "Méthode permettant d'enregistrer un Jeu.")
    public ResponseEntity<Jeu> createJeu(@RequestBody final Jeu jeu) {

        final Jeu saved = iJeuService.save(jeu);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Méthode permettant de récupérer un Jeu.")
    public ResponseEntity<Jeu> getCandidatById(@PathVariable("id") final Long jeuID) {

        final Jeu Jeu = iJeuService.findById(jeuID);
        return new ResponseEntity<>(Jeu, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Méthode permettant de mettre à jour un Jeu.")
    public ResponseEntity<Jeu> updateCandidat(@RequestBody final Jeu jeu) {

        final Jeu saved = iJeuService.update(jeu);
        return new ResponseEntity<>(saved, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Méthode permettant de supprimer un Jeu.")
    public void deleteCandidat(@PathVariable("id") final Long jeuID) {

        iJeuService.deleteById(jeuID);
    }
}