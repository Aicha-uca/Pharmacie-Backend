package com.example.beans;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Garde_Pharmacie {

    @EmbeddedId
    private GardePharmaciePk pg;
    @Temporal(TemporalType.DATE)
    private Date dateFin;

    @ManyToOne
    @JoinColumn(name = "pharmacie", insertable = false, updatable = false)
    private Pharmacie pharmacie;

    @ManyToOne
    @JoinColumn(name = "garde", insertable = false, updatable = false)
    private Garde garde;
}
