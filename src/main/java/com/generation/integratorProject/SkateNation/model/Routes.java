package com.generation.integratorProject.SkateNation.model;

import javax.persistence.*;

@Entity
@Table(name = "routes")
public abstract class Routes extends BaseEntity {
    @Id
    @ManyToMany
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRoute;

    @Column(nullable = false)
    private String imageDescription;

    @Column(nullable = false)
    private String route;

    public Long getIdRoute() {
        return idRoute;
    }

    public void setIdRoute(Long idRoute) {
        this.idRoute = idRoute;
    }

    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
