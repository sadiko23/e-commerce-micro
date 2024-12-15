package org.example.billingservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.example.billingservice.model.Product;

@Entity
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productId;

    public ProductItem() {
    }


    public ProductItem(Long id, String productId, Bill bill, int quantity, double unitPrice, Product product) {
        this.id = id;
        this.productId = productId;
        this.bill = bill;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Bill bill;

    private int quantity;
    private double unitPrice;

    @Transient
    private Product product;
}
