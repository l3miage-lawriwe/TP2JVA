package fr.uga.l3miage.tp2.exo3.models;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table
public class Commande {

    @Id
    private Long id;

    private Date date;

    private Double montantTotal;


    @OneToMany(mappedBy = "Commande")
    private Set<Produit> APourProduits;

    @ManyToOne
    private Client APourClient;

}
