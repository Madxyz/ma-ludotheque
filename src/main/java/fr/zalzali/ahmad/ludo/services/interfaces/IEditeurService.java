package fr.zalzali.ahmad.ludo.services.interfaces;

import fr.zalzali.ahmad.ludo.entities.Editeur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IEditeurService {
    List<Editeur> findAll();
    Editeur findById(Long id);
    Editeur save(Editeur newEditeur);
    Editeur update(Editeur editeur);
    void deleteById(Long id);
}
