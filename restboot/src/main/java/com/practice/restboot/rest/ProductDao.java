package com.practice.restboot.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.restboot.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

}
