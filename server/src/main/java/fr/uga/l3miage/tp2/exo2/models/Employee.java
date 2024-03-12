package fr.uga.l3miage.tp2.exo2.models;


import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="emplois")
public class Employee {

    @Id
    private Long id;

    private String nom;

    private String email;

    private Double salaire;


}
