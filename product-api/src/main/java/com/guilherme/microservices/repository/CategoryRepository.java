package com.guilherme.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santana.java.back.end.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
