package com.example.productcrud.dao;

import com.example.productcrud.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductDao {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Optional<Product> getProductById(Long id);
    void deleteProduct(Long id);
    Product updateProduct(Product product);  // Add the updateProduct method here
}
