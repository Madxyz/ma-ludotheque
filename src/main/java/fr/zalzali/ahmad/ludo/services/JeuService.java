package fr.zalzali.ahmad.ludo.services;

import fr.zalzali.ahmad.ludo.entities.Jeu;
import fr.zalzali.ahmad.ludo.repository.JeuRepository;
import fr.zalzali.ahmad.ludo.services.interfaces.IJeuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Service
public class JeuService implements IJeuService {

    @Autowired
    private JeuRepository jeuRepository;

    @Override
    public List<Jeu> findAll(){
        return jeuRepository.findAll();
    }

    @Override
    public Jeu findById(Long id){
        return jeuRepository.getOne(id);
    }

    @Override
    public Jeu save(Jeu newJeu){
        return jeuRepository.save(newJeu);
    }

    @Override
    public Jeu update(Jeu jeu) {
        return jeuRepository.saveAndFlush(jeu);
    }

    @Override
    public void deleteById(Long id) {
        jeuRepository.deleteById(id);
    }
}
