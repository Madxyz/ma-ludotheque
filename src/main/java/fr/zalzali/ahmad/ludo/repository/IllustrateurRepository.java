package fr.zalzali.ahmad.ludo.repository;

import fr.zalzali.ahmad.ludo.entities.Illustrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IllustrateurRepository extends JpaRepository<Illustrateur, Long> {
}
