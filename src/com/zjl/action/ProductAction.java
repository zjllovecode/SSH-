package com.zjl.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import com.zjl.domain.Product;
import com.zjl.service.ProductService;
//ModelDriven用来接收参数
public class ProductAction extends ActionSupport implements ModelDriven<Product> {
	// 模型驱动使用的类
	private Product product = new Product();
	@Override
	public Product getModel() {
		return null;
	}
	
	//struts2和Spring整合过程中按名称自动注入的业务类
	private ProductService productService;
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public String save() {
		System.out.println("名字"+product.getPname()+"价钱"+product.getPrice());
		productService.save(product);
		return NONE;
	}

}
