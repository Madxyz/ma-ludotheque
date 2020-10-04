package fr.zalzali.ahmad.ludo.entities;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity(name ="Editeur")
@Table(name="editeurs")
@Data
public class Editeur {

    @Id
    @Column(name = "id_editeur")
    private Long editeurId;

    @NaturalId
    private String nom;


    @ManyToMany(mappedBy = "editeurs")
    private Set<Jeu> jeux = new HashSet<>();
}
