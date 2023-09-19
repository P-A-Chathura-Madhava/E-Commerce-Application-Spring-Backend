package lk.ctech.controller;

import lk.ctech.entity.Product;
import lk.ctech.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@PostMapping(path = "/add")
	public Product addNewProduct(@RequestBody Product product) {
		return productService.addNewProduct(product);
	}
}
