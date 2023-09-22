package lk.ctech.controller;

import lk.ctech.entity.Cart;
import lk.ctech.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
	
	@Autowired
	private CartService cartService;

	@PreAuthorize("hasRole('User')")
	@GetMapping({"/addToCart/{productId}"})
	public Cart addTocart(@PathVariable(name="productId") Integer productId) {
		return cartService.addToCart(productId);

	}
}
