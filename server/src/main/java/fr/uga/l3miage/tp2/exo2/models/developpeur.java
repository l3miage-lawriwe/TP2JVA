package fr.uga.l3miage.tp2.exo2.models;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Manager")
public class developpeur extends Employee{
    private String languagePrefere;

    private String NiveauCompetence;
}
