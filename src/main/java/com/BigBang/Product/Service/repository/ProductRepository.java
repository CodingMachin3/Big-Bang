package com.BigBang.Product.Service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.BigBang.Product.Service.model.Product;
public interface ProductRepository extends MongoRepository<Product,String> {

}
