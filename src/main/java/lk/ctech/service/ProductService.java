package lk.ctech.service;

import lk.ctech.dao.ProductDao;
import lk.ctech.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

	public Product addNewProduct(Product product) {
		return productDao.save(product);		
	}

	public List<Product> getAllProducts(){
			return (List<Product>) productDao.findAll();
	}
}
