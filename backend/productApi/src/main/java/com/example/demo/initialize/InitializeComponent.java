package com.example.demo.initialize;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.product;
import com.example.demo.repository.ProductRepository;

@Component
public class InitializeComponent {

	
	@Autowired
	private ProductRepository productRepository;
	
	@PostConstruct
	private void init() {
	
		productRepository.deleteAll();
		
		product product = new product();
		product.setName("samsung s3");
		product.setCode("samsung2323");
		product.setTitle("samsung s3 5 inch");
		product.setDescription("AI POWERED");
		product.setImgUrl("abc.jpeg");
		product.setPrice(12000.00);
		
		productRepository.save(product);
		
		product product2 = new product();
		product2.setName("Apple");
		product2.setCode("Apple23");
		product2.setTitle("Apple 13 4 inch");
		product2.setDescription("AI POWERED with svg system enabled");
		product2.setImgUrl("apple.jpeg");
		product2.setPrice(120000.00);
		
		productRepository.save(product2);
		
	}
}
