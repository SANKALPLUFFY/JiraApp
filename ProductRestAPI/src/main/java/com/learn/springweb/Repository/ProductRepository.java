package com.learn.springweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.springweb.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
