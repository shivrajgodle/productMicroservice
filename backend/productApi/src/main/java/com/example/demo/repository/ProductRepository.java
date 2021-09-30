package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.product;

@RepositoryRestResource(collectionResourceRel = "productdata",path = "productdata")
public interface ProductRepository extends MongoRepository<product, String> {

}
