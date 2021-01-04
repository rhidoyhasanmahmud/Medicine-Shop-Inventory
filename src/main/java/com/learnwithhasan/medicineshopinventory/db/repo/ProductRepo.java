package com.learnwithhasan.medicineshopinventory.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnwithhasan.medicineshopinventory.db.model.Product;

public interface ProductRepo extends JpaRepository<Product, String> {

}
