package com.anil.product.service;

import com.anil.product.model.Product;
import com.anil.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;

    public Product add(Product product) {
        return repository.save(product);
    }

    public List<Product> getAll() {
            return repository.findAll();
    }
}
