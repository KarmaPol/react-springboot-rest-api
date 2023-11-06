package com.pgms.prodmgmt.repository;

import com.pgms.prodmgmt.model.Category;
import com.pgms.prodmgmt.model.Product;

import java.beans.PropertyDescriptor;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductRepository {

    List<Product> findAll();

    Product insert(Product product);

    Product update(Product product);

    Optional<Product> findById(UUID productId);

    Optional<Product> findByName(String productName);

    List<Product> findByCategory(Category category);

    void deleteAll();
}
