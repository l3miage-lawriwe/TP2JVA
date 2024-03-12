package fr.uga.l3miage.tp2.exo1.models;


import javax.persistence.*;
import java.util.Set;





@Entity
@Table
public class projet {

    @Id
    private Integer bigint;


    private String name;

    private String description;

    @ManyToMany(mappedBy = "projet")
    private Set<developer_miage_projet> developers_miage_projects;

}
