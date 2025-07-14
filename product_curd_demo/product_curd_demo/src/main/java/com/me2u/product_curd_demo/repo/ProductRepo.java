package com.me2u.product_curd_demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.me2u.product_curd_demo.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

	
}