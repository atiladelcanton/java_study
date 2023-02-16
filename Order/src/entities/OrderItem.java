package entities;

public class OrderItem {
	private int quantity;
	private Double price;
	private Product product;
	public OrderItem() {
	}

	public OrderItem(int quantity, Double price,Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public Double getPrice() {
		return price;
	}

	public Product getProduct() {
		return product;
	}

	public double subTotal() {
		return this.price * this.quantity;
	}
}
