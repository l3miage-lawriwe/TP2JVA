package fr.uga.l3miage.tp2.exo3.models;





import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table
public class Client {

    @Id
    private Long id;

    private String nom;
    private String email;

    @OneToOne(mappedBy = "Client")
    private Adresse APourAdresse;


    @OneToMany(mappedBy = "Client")
    private Set<Commande> APourcommandes;


}
