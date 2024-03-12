package fr.uga.l3miage.tp2.exo3.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table
public class CatégorieDeProduit {

    @Id
    private Long id;

    private String nom;

    @ManyToMany(mappedBy = "CatégorieDeProduit")
    private Set<Produit> APourProduits;
}
