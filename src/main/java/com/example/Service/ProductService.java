package com.example.Service;

import com.example.Entity.Product;
import com.example.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Created by Wishwa Prabodha on 3/23/2018.
 */


@Transactional
@Service
public class ProductService {

    @Autowired
    public ProductRepository productRepository;

    public void insert(Product product) {
        productRepository.save(product);
    }

    public Optional<Product> find(int id) {
        return productRepository.findById(id);
    }

    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }


}
