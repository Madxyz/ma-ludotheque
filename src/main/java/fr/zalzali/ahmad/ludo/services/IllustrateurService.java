package fr.zalzali.ahmad.ludo.services;

import fr.zalzali.ahmad.ludo.entities.Illustrateur;
import fr.zalzali.ahmad.ludo.repository.IllustrateurRepository;
import fr.zalzali.ahmad.ludo.services.interfaces.IIllustrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class IllustrateurService implements IIllustrateurService {

    @Autowired
    private IllustrateurRepository illustrateurRepository;

    @Override
    public List<Illustrateur> findAll(){
        return illustrateurRepository.findAll();
    }

    @Override
    public Illustrateur findById(Long id){
        return illustrateurRepository.getOne(id);
    }

    @Override
    public Illustrateur save(Illustrateur newIllustrateur){
        return illustrateurRepository.save(newIllustrateur);
    }

    @Override
    public Illustrateur update(Illustrateur illustrateur) {
        return illustrateurRepository.saveAndFlush(illustrateur);
    }

    @Override
    public void deleteById(Long id) {
        illustrateurRepository.deleteById(id);
    }
}
