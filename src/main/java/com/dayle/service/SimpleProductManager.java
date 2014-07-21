package com.dayle.service;
import java.util.ArrayList;
import java.util.List;

import com.dayle.domain.Product;
import com.dayle.repository.ProductDao;

public class SimpleProductManager implements ProductManager {
	//private List<Product> products;
	private ProductDao productDao;
    public List<Product> getProducts() {
    	//return products;
    	return productDao.getProductList();
    }

    public void increasePrice(int percentage) {
    	List<Product> products = productDao.getProductList();
    	if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() * 
                                    (100 + percentage)/100;
                product.setPrice(newPrice);
                productDao.saveProduct(product);
            }
        }       
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }
    
    //public void setProducts(List<Product> products) {
    //	this.products = products;        
    //}

}