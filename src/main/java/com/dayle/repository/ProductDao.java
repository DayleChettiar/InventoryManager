package com.dayle.repository;

import java.util.List;

import com.dayle.domain.Product;

public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product prod);

}