package fr.uga.l3miage.tp2.exo3.models;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Produit {

    @Id
    private Long id;

    private String nom;

    private double prix;

    private Integer quantite;

    @ManyToOne
    private Commande APourProduit;

    @ManyToMany
    private Set<CatégorieDeProduit> APourCatégories;
}
