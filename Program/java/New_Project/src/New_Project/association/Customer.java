package New_Project.association;

public class Customer {
	
	private Integer custId;
	private String custName;
	//Has-A's Relationship
	private Address address;
	private Address homeAddress;
	private Address officeAddress;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer custId, String custName, Address address, Address homeAddress, Address officeAddress) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.address = address;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
	}
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", address=" + address + ", homeAddress="
				+ homeAddress + ", officeAddress=" + officeAddress + "]";
	}
	
}
	
