package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductMapper mapper;
	
	public void add(ProductDto pdto) {
		mapper.add(pdto);
	}
	
	public ArrayList<ProductDto> productList(){
		return mapper.productList();
	}
	
	public ProductDto getProduct(int id) {
		return mapper.getProduct(id);
	}
	
	public void update(int id, ProductDto pdto) {
		pdto.setId(id);
		mapper.update(pdto);
	}
	
	public void delete(int id) {
		mapper.delete(id);
	}
}
