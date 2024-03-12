package fr.uga.l3miage.tp2.exo1.models;


import org.hibernate.mapping.PrimaryKey;

import javax.persistence.*;
import java.util.Set;





@Entity
@Table
public class developer_miage_projet {

    @Id
    //@Column(ForeignKey = "projet.bigint")
    // je ne sais pas comment coder une reference/foreign key
    private Integer bigint;

    @Id
    private String lastname;

    @ManyToMany
    private Set<projet> projets;

    @ManyToMany
    private Set<developer_miage> developers_miages;

}
