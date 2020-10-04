package fr.zalzali.ahmad.ludo.services.interfaces;

import fr.zalzali.ahmad.ludo.entities.Illustrateur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IIllustrateurService {
    List<Illustrateur> findAll();
    Illustrateur findById(Long id);
    Illustrateur save(Illustrateur newIllustrateur);
    Illustrateur update(Illustrateur illustrateur);
    void deleteById(Long id);
}
