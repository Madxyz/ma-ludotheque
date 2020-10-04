package fr.zalzali.ahmad.ludo.repository;

import fr.zalzali.ahmad.ludo.entities.Editeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditeurRepository extends JpaRepository<Editeur, Long> {
}
