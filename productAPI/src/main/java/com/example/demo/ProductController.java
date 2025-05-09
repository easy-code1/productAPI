package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("products")
	public void add(@RequestBody ProductDto pdto) {
		service.add(pdto);
	}
	
	@GetMapping("products")
	public ArrayList<ProductDto> productList(){
		return service.productList();
	}
	
	@GetMapping("products/{id}")
	public ProductDto getProduct(@PathVariable int id) {
		return service.getProduct(id);
	}
	
	@PutMapping("products/{id}")
	public void update(@PathVariable int id, @RequestBody ProductDto pdto) {
		service.update(id, pdto);
	}
	
	@DeleteMapping("products/{id}")
	public void delete(@PathVariable int id) {
		service.delete(id);
	}
}
