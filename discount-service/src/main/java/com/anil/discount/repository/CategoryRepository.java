package com.anil.discount.repository;

import com.anil.discount.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Optional<Category> findByExternalId(String id);
}
