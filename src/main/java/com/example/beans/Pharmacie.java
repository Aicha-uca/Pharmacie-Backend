package com.example.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Pharmacie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String adresse;
    private double latitude;
    private double longitude;
    @Column(length = 50000)
    private String photos;

    @ManyToOne(fetch = FetchType.EAGER)
    private Zone zone;

    @OneToMany(mappedBy = "pharmacie")
    @JsonIgnore
    private Collection<Garde_Pharmacie> pharmacieGardes;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "user")
    @JsonIgnore
    private User user;
}
