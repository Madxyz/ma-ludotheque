package fr.zalzali.ahmad.ludo.services.interfaces;

import fr.zalzali.ahmad.ludo.entities.Jeu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IJeuService {
    List<Jeu> findAll();
    Jeu findById(Long id);
    Jeu save(Jeu newJeu);
    Jeu update(Jeu jeu);
    void deleteById(Long id);
}
