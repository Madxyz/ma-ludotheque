package fr.zalzali.ahmad.ludo.controllers;

import fr.zalzali.ahmad.ludo.entities.Auteur;
import fr.zalzali.ahmad.ludo.services.interfaces.IAuteurService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auteurs")
@Tag(name = "Gestion des auteurs")
public class AuteurController {

    @Autowired
    IAuteurService iAuteurService;

    @GetMapping
    @Operation(summary = "Méthode permettant de récupérer tous les Auteurs.")
    public ResponseEntity<List<Auteur>> findAll() {

        return ResponseEntity.ok(iAuteurService.findAll());
    }

    @PostMapping
    @Operation(summary = "Méthode permettant d'enregistrer un Auteur.")
    public ResponseEntity<Auteur> createAuteur(@RequestBody final Auteur auteur) {

        final Auteur saved = iAuteurService.save(auteur);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Méthode permettant de récupérer un Auteur.")
    public ResponseEntity<Auteur> getCandidatById(@PathVariable("id") final Long auteurID) {

        final Auteur auteur = iAuteurService.findById(auteurID);
        return new ResponseEntity<>(auteur, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Méthode permettant de mettre à jour un Auteur.")
    public ResponseEntity<Auteur> updateCandidat(@RequestBody final Auteur auteur) {

        final Auteur saved = iAuteurService.update(auteur);
        return new ResponseEntity<>(saved, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Méthode permettant de supprimer un Auteur.")
    public void deleteCandidat(@PathVariable("id") final Long auteurID) {

        iAuteurService.deleteById(auteurID);
    }
}