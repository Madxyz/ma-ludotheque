package fr.zalzali.ahmad.ludo.services;

import fr.zalzali.ahmad.ludo.entities.Editeur;
import fr.zalzali.ahmad.ludo.repository.EditeurRepository;
import fr.zalzali.ahmad.ludo.services.interfaces.IEditeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class EditeurService implements IEditeurService {

    @Autowired
    private EditeurRepository editeurRepository;

    @Override
    public List<Editeur> findAll(){
        return editeurRepository.findAll();
    }

    @Override
    public Editeur findById(Long id){
        return editeurRepository.getOne(id);
    }

    @Override
    public Editeur save(Editeur newEditeur){
        return editeurRepository.save(newEditeur);
    }

    @Override
    public Editeur update(Editeur editeur) {
        return editeurRepository.saveAndFlush(editeur);
    }

    @Override
    public void deleteById(Long id) {
        editeurRepository.deleteById(id);
    }
}
