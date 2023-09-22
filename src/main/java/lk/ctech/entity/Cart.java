package lk.ctech.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cartId;
	@OneToOne
	private Product product;
	@OneToOne
	private User user;
	
	
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Cart(Product product, User user) {
		super();
		this.product = product;
		this.user = user;
	}
}
