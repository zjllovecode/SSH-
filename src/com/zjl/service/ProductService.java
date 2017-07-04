package com.zjl.service;

import org.springframework.transaction.annotation.Transactional;

//ok
import com.zjl.dao.ProductDao;
import com.zjl.domain.Product;
@Transactional
public class ProductService {

	//注入Dao并提供set方法供Spring使用
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	public void save (Product product){
		System.out.println("Service 类的save方法");
		productDao.save(product);
	}
	
}
