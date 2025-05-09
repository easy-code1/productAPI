package com.example.demo;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
	public void add(ProductDto pdto);
	public ArrayList<ProductDto> productList();
	public ProductDto getProduct(int id);
	public void update(ProductDto pdto);
	public void delete(int id);
}
