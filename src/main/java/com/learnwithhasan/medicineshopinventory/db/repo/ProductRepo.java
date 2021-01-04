package com.learnwithhasan.medicineshopinventory.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnwithhasan.medicineshopinventory.db.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, String> {

}
