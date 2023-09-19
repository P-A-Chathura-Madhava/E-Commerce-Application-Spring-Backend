package lk.ctech.service;

import lk.ctech.dao.ProductDao;
import lk.ctech.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

	public Product addNewProduct(Product product) {
		return productDao.save(product);		
	}
}
