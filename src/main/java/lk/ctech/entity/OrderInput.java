package lk.ctech.entity;

import lombok.Data;

import java.util.List;

@Data
public class OrderInput {
	
	private String fullName;
	private String fullAddress;
	private String contactNumber;
	private String alternateContactNumber;
	private List<OrderProductQuantity> orderProductQuantityList;
	
	
//
//	public OrderInput() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

}
