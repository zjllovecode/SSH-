package com.zjl.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zjl.domain.Product;

public class ProductDao  extends HibernateDaoSupport{

	public void save(Product product) {
		
		System.out.println("Dao层的save方法");
	 	this.getHibernateTemplate().save(product);
	}

}
