package fr.zalzali.ahmad.ludo.repository;

import fr.zalzali.ahmad.ludo.entities.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuteurRepository extends JpaRepository<Auteur, Long> {
}
