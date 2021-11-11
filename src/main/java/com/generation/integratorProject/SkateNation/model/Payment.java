package com.generation.integratorProject.SkateNation.model;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Table(name = "payment")
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private UUID idCart;

    @OneToMany(mappedBy = "payment", orphanRemoval = true)
    private List<Cart> cart;

    @Column(name = "PRODUCT", nullable = false)
    private String product;

    @Column(name = "PRICE", nullable = false)
    private double price;

    @Column(name = "TOTAL", nullable = false)
    private double quantity;

    @ManyToOne
    @JoinColumn(name = "FK_INVOICE", nullable = false, updatable = false)
    private Cart invoice;

    public UUID getIdCart() {
        return idCart;
    }

    public void setIdCart(UUID idCart) {
        this.idCart = idCart;
    }

    public List<Cart> getCart() {
        return cart;
    }

    public void setCart(List<Cart> cart) {
        this.cart = cart;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Cart getInvoice() {
        return invoice;
    }

    public void setInvoice(Cart invoice) {
        this.invoice = invoice;
    }
}