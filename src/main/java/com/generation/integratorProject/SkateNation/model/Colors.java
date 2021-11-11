package com.generation.integratorProject.SkateNation.model;

import javax.persistence.*;

@Entity
@Table(name = "colors")
public abstract class Colors extends BaseEntity{
    @Id
    @ManyToMany
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idColor;

    @Column(nullable = false)
    private String color;

    public Long getIdColor() {
        return idColor;
    }

    public void setIdColor(Long idColor) {
        this.idColor = idColor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
