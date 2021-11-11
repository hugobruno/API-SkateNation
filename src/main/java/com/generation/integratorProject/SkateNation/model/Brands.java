package com.generation.integratorProject.SkateNation.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public abstract class Brands extends BaseEntity{
    @Id
    @ManyToMany
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBrand;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String country;

    public Long getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(Long idBrand) {
        this.idBrand = idBrand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
