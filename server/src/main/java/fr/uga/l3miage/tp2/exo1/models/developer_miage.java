package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table
public class developer_miage {

    @Id
    private String lastname;


    private String firstname;

    private String email;

    @ManyToMany(mappedBy = "developer_miage")
    private Set<developer_miage_projet> developers_miage_projects;

}
