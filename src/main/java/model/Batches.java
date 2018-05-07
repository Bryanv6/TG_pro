package model;


import javax.persistence.*;

import javax.persistence.Entity;

@Entity
@Table(name="Batches")
public class Batches {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   // @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqname")
    //@SequenceGenerator(initialValue=1, sequenceName="seq_name", allocationSize=1, name="seqname")
    //name, curriculum, focus, trainer, location
    @Column(name="a_name", length=40)
    private String name;


}
