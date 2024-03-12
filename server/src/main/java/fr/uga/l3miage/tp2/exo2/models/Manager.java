package fr.uga.l3miage.tp2.exo2.models;





import javax.persistence.*;

@Entity
@DiscriminatorValue("Manager")
public class Manager extends Employee{
    private String niveauGestion;
}
