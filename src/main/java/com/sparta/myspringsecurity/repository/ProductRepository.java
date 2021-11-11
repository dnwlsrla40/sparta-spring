package com.sparta.myspringsecurity.repository;

import com.sparta.myspringsecurity.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
