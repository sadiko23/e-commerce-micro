package org.example.billingservice.repository;


import org.example.billingservice.entity.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
}
