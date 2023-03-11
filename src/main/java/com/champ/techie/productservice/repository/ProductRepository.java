package com.champ.techie.productservice.repository;

import com.champ.techie.productservice.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}
