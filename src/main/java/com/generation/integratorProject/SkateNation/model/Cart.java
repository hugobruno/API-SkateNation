package com.generation.integratorProject.SkateNation.model;

import ch.qos.logback.core.status.Status;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "cart")
public class Cart extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private UUID idCart;

    @OneToOne
    @Column(nullable = false)
    private Long idUser;

    @OneToMany(mappedBy = "productList")
    @Column(nullable = false)
    private List<Product> productList;

    @Column(name = "STATUS", length = 20, nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REGIST_DATE", nullable = false)
    private Calendar registDate;

    @JoinColumn(name = "client_cart", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private User customer;

    @OneToOne(mappedBy = "invoice", cascade = CascadeType.ALL)
    private Payment payment;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
    private List<Payment> lines;

    public UUID getIdCart() {
        return idCart;
    }

    public void setIdCart(UUID idCart) {
        this.idCart = idCart;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Calendar getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Calendar registDate) {
        this.registDate = registDate;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<Payment> getLines() {
        return lines;
    }

    public void setLines(List<Payment> lines) {
        this.lines = lines;
    }
}
