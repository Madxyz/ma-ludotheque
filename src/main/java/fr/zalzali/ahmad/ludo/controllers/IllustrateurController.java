package fr.zalzali.ahmad.ludo.controllers;

import fr.zalzali.ahmad.ludo.entities.Illustrateur;
import fr.zalzali.ahmad.ludo.services.interfaces.IIllustrateurService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/illustrateurs")
@Tag(name = "Gestion des illustrateurs")
public class IllustrateurController {

    @Autowired
    IIllustrateurService iIllustrateurservice;

    @GetMapping
    @Operation(summary = "Méthode permettant de récupérer tous les Illustrateurs.")
    public ResponseEntity<List<Illustrateur>> findAll() {

        return ResponseEntity.ok(iIllustrateurservice.findAll());
    }

    @PostMapping
    @Operation(summary = "Méthode permettant d'enregistrer un Illustrateur.")
    public ResponseEntity<Illustrateur> createIllustrateur(@RequestBody final Illustrateur illustrateur) {

        final Illustrateur saved = iIllustrateurservice.save(illustrateur);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Méthode permettant de récupérer un Illustrateur.")
    public ResponseEntity<Illustrateur> getIllustrateurById(@PathVariable("id") final Long illustrateurID) {

        final Illustrateur illustrateur = iIllustrateurservice.findById(illustrateurID);
        return new ResponseEntity<>(illustrateur, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Méthode permettant de mettre à jour un Illustrateur.")
    public ResponseEntity<Illustrateur> updateIllustrateur(@RequestBody final Illustrateur illustrateur) {

        final Illustrateur saved = iIllustrateurservice.update(illustrateur);
        return new ResponseEntity<>(saved, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Méthode permettant de supprimer un Illustrateur.")
    public void deleteIllustrateur(@PathVariable("id") final Long illustrateurID) {

        iIllustrateurservice.deleteById(illustrateurID);
    }
}