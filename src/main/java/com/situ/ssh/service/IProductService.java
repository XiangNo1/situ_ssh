package com.situ.ssh.service;

import com.situ.ssh.pojo.Product;
import com.situ.ssh.util.PageBean;

public interface IProductService {

	void findProduct(PageBean pageBean);

	void addProduct(Product model);

	void updateProduct(Product model);

	void deleteProduct(String ids);

}
