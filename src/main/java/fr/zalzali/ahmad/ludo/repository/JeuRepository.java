package fr.zalzali.ahmad.ludo.repository;

import fr.zalzali.ahmad.ludo.entities.Jeu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JeuRepository extends JpaRepository<Jeu, Long> {
}
