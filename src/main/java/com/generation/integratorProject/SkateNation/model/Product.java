package com.generation.integratorProject.SkateNation.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public abstract class Product extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private float price;

    @ManyToMany
    @Column(nullable = false)
    private Long idBrand;

    @ManyToMany
    @Column(nullable = false)
    private Long idColor;

    @ManyToMany
    @Column(nullable = false)
    private Long idLength;

    @ManyToMany
    @Column(nullable = false)
    private Long idRoute;

    @ManyToOne
    @JoinColumn(name = "product_list_id_cart")
    private Cart productList;

    public Cart getProductList() {
        return productList;
    }

    public void setProductList(Cart productList) {
        this.productList = productList;
    }

    public Long getId() {
        return idProduct;
    }

    public void setId(Long id) {
        this.idProduct = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Long getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(Long idBrand) {
        this.idBrand = idBrand;
    }

    public Long getIdColor() {
        return idColor;
    }

    public void setIdColor(Long idColor) {
        this.idColor = idColor;
    }

    public Long getIdLength() {
        return idLength;
    }

    public void setIdLength(Long idLength) {
        this.idLength = idLength;
    }

    public Long getIdRoute() {
        return idRoute;
    }

    public void setIdRoute(Long idRoute) {
        this.idRoute = idRoute;
    }
}
