package fr.zalzali.ahmad.ludo.controllers;

import fr.zalzali.ahmad.ludo.entities.Editeur;
import fr.zalzali.ahmad.ludo.services.interfaces.IEditeurService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Editeurs")
@Tag(name = "Gestion des Editeurs")
public class EditeurController {

    @Autowired
    IEditeurService iEditeurService;

    @GetMapping
    @Operation(summary = "Méthode permettant de récupérer tous les Editeurs.")
    public ResponseEntity<List<Editeur>> findAll() {

        return ResponseEntity.ok(iEditeurService.findAll());
    }

    @PostMapping
    @Operation(summary = "Méthode permettant d'enregistrer un Editeur.")
    public ResponseEntity<Editeur> createEditeur(@RequestBody final Editeur editeur) {

        final Editeur saved = iEditeurService.save(editeur);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Méthode permettant de récupérer un Editeur.")
    public ResponseEntity<Editeur> getEditeurById(@PathVariable("id") final Long editeurID) {

        final Editeur editeur = iEditeurService.findById(editeurID);
        return new ResponseEntity<>(editeur, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Méthode permettant de mettre à jour un Editeur.")
    public ResponseEntity<Editeur> updateEditeur(@RequestBody final Editeur editeur) {

        final Editeur saved = iEditeurService.update(editeur);
        return new ResponseEntity<>(saved, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Méthode permettant de supprimer un Editeur.")
    public void deleteEditeur(@PathVariable("id") final Long editeurID) {

        iEditeurService.deleteById(editeurID);
    }
}