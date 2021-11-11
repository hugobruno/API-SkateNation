package com.generation.integratorProject.SkateNation.model;

import javax.persistence.*;

@Entity
@Table(name = "length")
public abstract class Length extends BaseEntity{
    @Id
    @ManyToMany
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLength;

    public Long getIdLength() {
        return idLength;
    }

    public void setIdLength(Long idLength) {
        this.idLength = idLength;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Column(nullable = false)
    private double length;
}
