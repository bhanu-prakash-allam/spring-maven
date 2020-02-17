package com.cts.springboot.boothibernet.services;

import java.util.List;

import com.cts.springboot.boothibernet.entity.Product;


public interface IProductService {

	List<Product> findAllProducts();
	Product findProductById(Integer id);
	boolean addProduct(Product product);
	boolean updateProduct(Product product);
	boolean deleteProduct(Integer id);
}
