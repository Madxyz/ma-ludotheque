package fr.zalzali.ahmad.ludo.services.interfaces;

import fr.zalzali.ahmad.ludo.entities.Auteur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IAuteurService {
    List<Auteur> findAll();
    Auteur findById(Long id);
    Auteur save(Auteur newAuteur);
    Auteur update(Auteur auteur);
    void deleteById(Long id);
}
