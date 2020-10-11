package fr.zalzali.ahmad.ludo.entities;

import fr.zalzali.ahmad.ludo.entities.enums.Interaction;
import fr.zalzali.ahmad.ludo.entities.enums.Mecanique;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity(name="Jeu")
@Table(name="jeux")
@Data
public class Jeu {

    @Id
    @Column(name = "id_jeu")
    @GeneratedValue
    private Long id;

    private String nom;

    @Lob
    private String description;
    @Lob
    private String avis;

    private int nombreJoueursMin;
    private int nombreJoueursMax;
    private int age;
    private int dureePartie;
    private float note;

    private Date dateSortie;
    private String langue;

    @Lob
    private byte[] image;

    private Interaction interaction;
    private Mecanique mecanique;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE})
    @JoinTable(name = "jeu_auteur",
            joinColumns = @JoinColumn(name = "id_jeu"),
            inverseJoinColumns = @JoinColumn(name = "id_auteur")
    )
    private Set<Auteur> auteurs = new HashSet<>();

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE})
    @JoinTable(name = "jeu_editeur",
            joinColumns = @JoinColumn(name = "id_jeu"),
            inverseJoinColumns = @JoinColumn(name = "id_editeur")
    )
    private Set<Editeur> editeurs = new HashSet<>();

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE})
    @JoinTable(name = "jeu_illustrateur",
            joinColumns = @JoinColumn(name = "id_jeu"),
            inverseJoinColumns = @JoinColumn(name = "id_illustrateur")
    )
    private Set<Illustrateur> illustrateurs = new HashSet<>();
}
