package fr.zalzali.ahmad.ludo.entities;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name ="Illustrateur")
@Table(name="illustrateurs")
@Data
public class Illustrateur {

    @Id
    @Column(name = "id_illustrateur")
    private Long illustrateurId;

    @NaturalId
    private String nom;
    private String prenom;


    @ManyToMany(mappedBy = "auteurs")
    private Set<Jeu> jeux = new HashSet<>();
}
