package com.sctp.jpa.service;

import com.sctp.jpa.model.Product;

import java.util.Collection;
import java.util.Optional;

public interface ProductService {
    public abstract void createProduct(Product product);
    public abstract void updateProduct(String id, Product product);
    public abstract void deleteProduct(String id);
    public abstract Collection<Product> getProducts();
    public abstract Optional<Product> getProduct(String id);
    public abstract Collection<Product> getProductsByName(String name);
}
