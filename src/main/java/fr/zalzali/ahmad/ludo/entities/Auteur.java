package fr.zalzali.ahmad.ludo.entities;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name ="Auteur")
@Table(name="auteurs")
@Data
public class Auteur {

    @Id
    @Column(name = "id_auteur")
    private Long auteurId;

    @NaturalId
    private String nom;
    private String prenom;


    @ManyToMany(mappedBy = "auteurs")
    private Set<Jeu> jeux = new HashSet<>();
}
