package workingdayeleven.collectionandsortingassign;

public class Product {
	 
	private Long Id;
	private String name;
	private String catagory;
	private Double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Long productId, String name, String catagory, Double price) {
		super();
		this.Id = productId;
		this.name = name;
		this.catagory = catagory;
		this.price = price;
	}
	public Long getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	public String getCatagory() {
		return catagory;
	}
	public Double getPrice() {
		return price;
	}
	public void setId(Long Id) {
		this.Id = Id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [Id=" + Id + ", name=" + name + ", catagory=" + catagory + ", price=" + price
				+ "]";
	}
	
}
