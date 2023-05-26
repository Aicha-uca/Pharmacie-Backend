package com.example.beans;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class GardePharmaciePk implements Serializable {
    private int pharmacie;
    private int garde;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;

}