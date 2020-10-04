package fr.zalzali.ahmad.ludo.services;

import fr.zalzali.ahmad.ludo.entities.Auteur;
import fr.zalzali.ahmad.ludo.repository.AuteurRepository;
import fr.zalzali.ahmad.ludo.services.interfaces.IAuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class AuteurService implements IAuteurService {

    @Autowired
    private AuteurRepository auteurRepository;

    @Override
    public List<Auteur> findAll(){
        return auteurRepository.findAll();
    }

    @Override
    public Auteur findById(Long id){
        return auteurRepository.getOne(id);
    }

    @Override
    public Auteur save(Auteur newAuteur){
        return auteurRepository.save(newAuteur);
    }

    @Override
    public Auteur update(Auteur auteur) {
        return auteurRepository.saveAndFlush(auteur);
    }

    @Override
    public void deleteById(Long id) {
        auteurRepository.deleteById(id);
    }
}
