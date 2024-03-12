package fr.uga.l3miage.tp2.exo1.models;
import javax.persistence.*;
import java.util.Set;





@Entity
@Table
public class Etudiant {

    @Id
    private Long agalan;

    private String nom;

    private String Email;
    @ManyToMany
    private Set<ClubSportif> clubSportifs;
}
