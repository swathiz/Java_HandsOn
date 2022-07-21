package encapsulation;

public class newc {
	public static void main(String[] args) {

				Product product = new Product(1, "Phone", 50000);
				int id = product.getId();
				String name = product.getName();
				System.out.println("Product Id: " + id);
				System.out.println("Product name: " + name);
	}

}
