package lk.ctech.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
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
	
	
	public Cart(Product product, User user) {
		this.product = product;
		this.user = user;
	}
}
