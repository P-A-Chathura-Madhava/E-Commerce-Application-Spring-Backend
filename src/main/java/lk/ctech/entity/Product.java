package lk.ctech.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	private String productName;
	private String productDescription;
	private Double productDiscountedPrice;
	private Double productActualPrice;
}
