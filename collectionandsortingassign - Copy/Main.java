package workingdayeleven.collectionandsortingassign;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String args[]) {
		List<Customer> customers = new ArrayList<>();
		Customer cust1 = new Customer(1l, "Stefan Walker", 1);
		Customer cust2 = new Customer(2l, "Daija Von", 1);
		Customer cust3 = new Customer(3l, "Ariane Rodriguez", 1);
		Customer cust4 = new Customer(4l, "Marques Nikolaus", 2);
		Customer cust5 = new Customer(5l, "Rachelle Greenfelder", 0);
		Customer cust6 = new Customer(6l, "Larissa White", 2);
		Customer cust7 = new Customer(7l, "Fae Heidenreich", 1);
		Customer cust8 = new Customer(8l, "Dino Will", 2);
		Customer cust9 = new Customer(9l, "Eloy Stroman", 1);
		Customer cust10 = new Customer(10l, "Brisa O'Connell", 1);
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		customers.add(cust4);
		customers.add(cust5);
		customers.add(cust6);
		customers.add(cust7);
		customers.add(cust8);
		customers.add(cust9);
		customers.add(cust10);

		List<Product> products = new ArrayList<>();
		Product prod1 = new Product(1l, "omnis quod consequatur", "Games", 184.83);
		Product prod2 = new Product(2l, "vel libero suscipit", "Toys", 12.66);
		Product prod3 = new Product(3l, "non nemo iure", "Grocery", 498.02);
		Product prod4 = new Product(4l, "voluptatem voluptas aspernatur", "Toys", 536.80);
		Product prod5 = new Product(5l, "animi cum rem", "Games", 458.20);
		Product prod6 = new Product(6l, "dolorem porro debitis", "Toys", 146.52);
		Product prod7 = new Product(7l, "aspernatur rerum qui", "Books", 656.42);
		Product prod8 = new Product(8l, "deleniti earum et", "Baby", 41.46);
		Product prod9 = new Product(9l, "voluptas ut quidem", "Books", 697.57);
		Product prod10 = new Product(10l, "eos sed debitis", "Baby", 366.90);
		Product prod11 = new Product(11l, "laudantium sit nihil", "Toys", 95.50);
		Product prod12 = new Product(12l, "ut perferendis corporis", "Grocery", 302.19);
		Product prod13 = new Product(13l, "sint voluptatem ut", "Toys", 295.37);
		Product prod14 = new Product(14l, "quos sunt ipsam", "Grocery", 534.64);
		Product prod15 = new Product(15l, "qui illo error", "Baby", 623.58);
		Product prod16 = new Product(16l, "aut ex ducimus", "Books", 551.39);
		Product prod17 = new Product(17l, "accusamus repellendus minus", "Books", 240.58);
		Product prod18 = new Product(18l, "aut accusamus quia", "Baby", 881.38);
		Product prod19 = new Product(19l, "doloremque incidunt sed", "Games", 988.49);
		Product prod20 = new Product(20l, "libero omnis velit", "Baby", 177.61);
		Product prod21 = new Product(21l, "consectetur cupiditate sunt", "Toys", 95.46);
		Product prod22 = new Product(22l, "itaque ea qui", "Baby", 677.78);
		Product prod23 = new Product(23l, "non et nulla", "Grocery", 70.49);
		Product prod24 = new Product(24l, "veniam consequatur et", "Books", 893.44);
		Product prod25 = new Product(25l, "magnam adipisci voluptate", "Grocery", 366.13);
		Product prod26 = new Product(26l, "reiciendis consequuntur placeat", "Toys", 359.27);
		Product prod27 = new Product(27l, "dolores ipsum sit", "Toys", 786.99);
		Product prod28 = new Product(28l, "ut hic tempore", "Toys", 316.09);
		Product prod29 = new Product(29l, "quas quis deserunt", "Toys", 772.78);
		Product prod30 = new Product(30l, "excepturi nesciunt accusantium", "Toys", 911.46);

		products.add(prod1);
		products.add(prod2);
		products.add(prod3);
		products.add(prod4);
		products.add(prod5);
		products.add(prod6);
		products.add(prod7);
		products.add(prod8);
		products.add(prod9);
		products.add(prod10);
		products.add(prod11);
		products.add(prod12);
		products.add(prod13);
		products.add(prod14);
		products.add(prod15);
		products.add(prod16);
		products.add(prod17);
		products.add(prod18);
		products.add(prod19);
		products.add(prod20);
		products.add(prod21);
		products.add(prod22);
		products.add(prod23);
		products.add(prod24);
		products.add(prod25);
		products.add(prod26);
		products.add(prod27);
		products.add(prod28);
		products.add(prod29);
		products.add(prod30);

		List<Order> orders = new ArrayList<>();
		Order Order1 =new Order(1l, LocalDate.of(2021,2,28), LocalDate.of(2021,3,8), "NEW", 5l);
		Order Order2 =new Order(2l, LocalDate.of(2021,2,28), LocalDate.of(2021,3,5), "NEW", 3l);
		Order Order3 =new Order(3l, LocalDate.of(2021,4,10), LocalDate.of(2021,4,18), "DELIVERED", 5l);
		Order Order4 =new Order(4l, LocalDate.of(2021,3,22), LocalDate.of(2021,3,27), "PENDING", 3l);
		Order Order5 =new Order(5l, LocalDate.of(2021,3,4), LocalDate.of(2021,3,12), "NEW", 1l);
		Order Order6 =new Order(6l, LocalDate.of(2021,3,30), LocalDate.of(2021,4,7), "DELIVERED", 9l);
		Order Order7 =new Order(7l, LocalDate.of(2021,3,5), LocalDate.of(2021,3,9), "PENDING", 8l);
		Order Order8 =new Order(8l, LocalDate.of(2021,3,27), LocalDate.of(2021,4,5), "NEW", 4l);
		Order Order9 =new Order(9l, LocalDate.of(2021,4,14), LocalDate.of(2021,4,18), "NEW", 10l);
		Order Order10 =new Order(10l, LocalDate.of(2021,3,10), LocalDate.of(2021,3,19), "NEW", 8l);
		Order Order11=new Order(11l, LocalDate.of(2021,4,1), LocalDate.of(2021,4,4), "DELIVERED", 1l);
		Order Order12 =new Order(12l, LocalDate.of(2021,2,24), LocalDate.of(2021,2,28), "PENDING", 5l);
		Order Order13 =new Order(13l, LocalDate.of(2021,3,15), LocalDate.of(2021,3,21), "NEW", 5l);
		Order Order14 =new Order(14l, LocalDate.of(2021,3,30), LocalDate.of(2021,4,7), "PENDING", 4l);
		Order Order15 =new Order(15l, LocalDate.of(2021,3,13), LocalDate.of(2021,3,14), "DELIVERED", 5l);
		Order Order16 =new Order(16l, LocalDate.of(2021,3,13), LocalDate.of(2021,3,21), "NEW", 1l);
		Order Order17 =new Order(17l, LocalDate.of(2021,3,31), LocalDate.of(2021,3,31), "DELIVERED", 6l);
		Order Order18 =new Order(18l, LocalDate.of(2021,3,25), LocalDate.of(2021,3,31), "PENDING", 9l);
		Order Order19 =new Order(19l, LocalDate.of(2021,2,28), LocalDate.of(2021,3,9), "DELIVERED", 9l);
		Order Order20 =new Order(20l, LocalDate.of(2021,3,23), LocalDate.of(2021,3,30), "NEW", 5l);
		Order Order21 =new Order(21l, LocalDate.of(2021,3,19), LocalDate.of(2021,3,24), "DELIVERED", 9l);
		Order Order22 =new Order(22l, LocalDate.of(2021,2,27), LocalDate.of(2021,3,1), "NEW", 5l);
		Order Order23 =new Order(23l, LocalDate.of(2021,4,19), LocalDate.of(2021,4,24), "PENDING", 4l);
		Order Order24 =new Order(24l, LocalDate.of(2021,3,24), LocalDate.of(2021,3,24), "DELIVERED", 1l);
		Order Order25 =new Order(25l, LocalDate.of(2021,3,3), LocalDate.of(2021,3,10), "NEW", 1l);
		Order Order26 =new Order(26l, LocalDate.of(2021,3,17), LocalDate.of(2021,3,26), "NEW", 10l);
		Order Order27 =new Order(27l, LocalDate.of(2021,3,20), LocalDate.of(2021,3,25), "NEW", 1l);
		Order Order28 =new Order(28l, LocalDate.of(2021,4,9), LocalDate.of(2021,4,16), "DELIVERED", 2l);
		Order Order29 =new Order(29l, LocalDate.of(2021,4,6), LocalDate.of(2021,4,8), "PENDING", 1l);
		Order Order30 =new Order(30l, LocalDate.of(2021,4,19), LocalDate.of(2021,4,20), "DELIVERED", 1l);
		Order Order31 =new Order(31l, LocalDate.of(2021,3,3), LocalDate.of(2021,3,4), "NEW", 3l);
		Order Order32 =new Order(32l, LocalDate.of(2021,3,15), LocalDate.of(2021,3,24), "DELIVERED", 2l);
		Order Order33 =new Order(33l, LocalDate.of(2021,4,18), LocalDate.of(2021,4,24), "PENDING", 1l);
		Order Order34 =new Order(34l, LocalDate.of(2021,3,28), LocalDate.of(2021,3,28), "NEW", 6l);
		Order Order35 =new Order(35l, LocalDate.of(2021,3,15), LocalDate.of(2021,3,17), "NEW", 1l);
		Order Order36 =new Order(36l, LocalDate.of(2021,3,4), LocalDate.of(2021,3,8), "DELIVERED", 2l);
		Order Order37 =new Order(37l, LocalDate.of(2021,3,18), LocalDate.of(2021,3,25), "NEW", 8l);
		Order Order38 =new Order(38l, LocalDate.of(2021,4,11), LocalDate.of(2021,4,20), "NEW", 8l);
		Order Order39 =new Order(39l, LocalDate.of(2021,4,12), LocalDate.of(2021,4,17), "NEW", 9l);
		Order Order40 =new Order(40l, LocalDate.of(2021,3,12), LocalDate.of(2021,3,12), "PENDING", 3l);
		Order Order41 =new Order(41l, LocalDate.of(2021,2,24), LocalDate.of(2021,2,26), "NEW", 5l);
		Order Order42 =new Order(42l, LocalDate.of(2021,4,8), LocalDate.of(2021,4,14), "DELIVERED", 9l);
		Order Order43 =new Order(43l, LocalDate.of(2021,3,3), LocalDate.of(2021,3,11), "NEW", 3l);
		Order Order44 =new Order(44l, LocalDate.of(2021,3,12), LocalDate.of(2021,3,14), "DELIVERED", 4l);
		Order Order45 =new Order(45l, LocalDate.of(2021,4,1), LocalDate.of(2021,4,6), "DELIVERED", 1l);
		Order Order46 =new Order(46l, LocalDate.of(2021,3,16), LocalDate.of(2021,3,22), "NEW", 10l);
		Order Order47 =new Order(47l, LocalDate.of(2021,4,7), LocalDate.of(2021,4,12), "PENDING", 2l);
		Order Order48 =new Order(48l, LocalDate.of(2021,4,5), LocalDate.of(2021,4,6), "NEW", 2l);
		Order Order49 =new Order(49l, LocalDate.of(2021,4,10), LocalDate.of(2021,4,13), "NEW", 7l);
		Order Order50 =new Order(50l, LocalDate.of(2021,3,18), LocalDate.of(2021,3,21), "NEW", 9l);

		orders.add(Order1);
		orders.add(Order2);
		orders.add(Order3);
		orders.add(Order4);
		orders.add(Order5);
		orders.add(Order6);
		orders.add(Order7);
		orders.add(Order8);
		orders.add(Order9);
		orders.add(Order10);
		orders.add(Order11);
		orders.add(Order12);
		orders.add(Order13);
		orders.add(Order14);
		orders.add(Order15);
		orders.add(Order16);
		orders.add(Order17);
		orders.add(Order18);
		orders.add(Order19);
		orders.add(Order20);
		orders.add(Order21);
		orders.add(Order22);
		orders.add(Order23);
		orders.add(Order24);
		orders.add(Order25);
		orders.add(Order26);
		orders.add(Order27);
		orders.add(Order28);
		orders.add(Order29);
		orders.add(Order30);
		orders.add(Order31);
		orders.add(Order32);
		orders.add(Order33);
		orders.add(Order34);
		orders.add(Order35);
		orders.add(Order36);
		orders.add(Order37);
		orders.add(Order38);
		orders.add(Order39);
		orders.add(Order40);
		orders.add(Order41);
		orders.add(Order42);
		orders.add(Order43);
		orders.add(Order44);
		orders.add(Order45);
		orders.add(Order46);
		orders.add(Order47);
		orders.add(Order48);
		orders.add(Order49);
		orders.add(Order50);
		List<Product> expensiveBooks = new ArrayList<>();
		for (Product product : products) {
			if (product.getCatagory().equalsIgnoreCase("Books") && product.getPrice() > 100) {
				expensiveBooks.add(product);
			}
		}

		System.out.println("Expensive Books:");
		for (Product book : expensiveBooks) {
			System.out.println(book);
		}
		List<Product> discountedToys = new ArrayList<>();
		for (Product product : products) {
			if (product.getCatagory().equalsIgnoreCase("Toys")) {
				double discountedPrice = product.getPrice() * 0.9;
				product.setPrice(discountedPrice);
				discountedToys.add(product);
			}
		}

		System.out.println("\nDiscounted Toys:");
		for (Product toy : discountedToys) {
			System.out.println(toy);
		}
		List<Order> babyOrders = new ArrayList<>();
		for (Order order : orders) {
			for (Product product : products) {
				if (product.getId() == order.getOrderId() && product.getCatagory().equalsIgnoreCase("Baby")) {
					babyOrders.add(order);
					break; // Stop searching for this order if a match is found
				}
			}
		}

		System.out.println("\nBaby Orders:");
		for (Order babyOrder : babyOrders) {
			System.out.println(babyOrder);
		}
		List<Product> tier2CustomerProducts = new ArrayList<>();
		for (Order order : orders) {
			if (order.getOrderDate().isAfter(LocalDate.of(2021, 2, 1))
					&& order.getOrderDate().isBefore(LocalDate.of(2021, 4, 1))) {
				for (Customer customer : customers) {
					if (customer.getCustomerId() == order.getCustomerId() && customer.getTier() == 2) {
						for (Product product1 : products) {
							if (product1.getId() == order.getCustomerId()) {
								tier2CustomerProducts.add(product1);
								break; // Stop searching for this order's products if a match is found
							}
						}
						break; // Stop searching for more customers if a match is found
					}
				}
			}
		}

		System.out.println("\nProducts ordered by Tier 2 customers between 01-Feb-2021 and 01-Apr-2021:");
		for (Product product1 : tier2CustomerProducts) {
			System.out.println(product1);
		}
		Product cheapestBook = null;
		double minPrice = Double.MAX_VALUE;
		for (Product product1 : products) {
			if (product1.getCatagory().equalsIgnoreCase("Books") && product1.getPrice() < minPrice) {
				cheapestBook = product1;
				minPrice = product1.getPrice();
			}
		}

		System.out.println("\nCheapest Book:");
		System.out.println(cheapestBook);
	}

}

