package workingdayeleven.collectionandsortingassign;

public class Customer {
	private Long customerId;
	private String name;
	private Integer tier;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Long customerId, String name, Integer tier) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.tier = tier;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public String getName() {
		return name;
	}
	public Integer getTier() {
		return tier;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTier(Integer tier) {
		this.tier = tier;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", tier=" + tier + "]";
	}
	public Object getCatagory() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
