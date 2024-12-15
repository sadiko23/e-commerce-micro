package org.example.billingservice.entity;


import jakarta.persistence.*;
import org.example.billingservice.model.Customer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;
    private Long customerId;

    public Bill() {
    }

    public Bill(Long id, Date billingDate, Long customerId, List<ProductItem> productItem, Customer customer) {
        this.id = id;
        this.billingDate = billingDate;
        this.customerId = customerId;
        this.productItem = productItem;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public List<ProductItem> getProductItem() {
        return productItem;
    }

    public void setProductItem(List<ProductItem> productItem) {
        this.productItem = productItem;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }





    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItem = new ArrayList<>();

    @Transient
    private Customer customer;


}
