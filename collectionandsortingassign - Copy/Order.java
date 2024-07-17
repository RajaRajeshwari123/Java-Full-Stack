package workingdayeleven.collectionandsortingassign;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public class Order {
	private Long orderId;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private String status;
	private List<Product> product;
	private long customerId;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Long orderId, LocalDate orderDate, LocalDate deliveryDate, String status, long customerId) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.status = status;
		this.customerId = customerId;
	}
	public Long getOrderId() {
		return orderId;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public String getStatus() {
		return status;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate
				+ ", status=" + status + ", customerId=" + customerId + "]";
	}
	public Collection<Customer> getProduct() {
		// TODO Auto-generated method stub
		return null;
	}
	
}