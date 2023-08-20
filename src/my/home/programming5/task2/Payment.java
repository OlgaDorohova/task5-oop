package my.home.programming5.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Payment {

	private List<Product> prodactList;
	
	public Payment() {
		prodactList = new ArrayList<>();
	}
		
	public List<Product> getProdactList() {
		return prodactList;
	}

	public void setProdactList(List<Product> prodactList) {
		this.prodactList = prodactList;
	}
	
	public void addProduct(String name, double price) {
		Product product = new Product(name, price);
		prodactList.add(product);
	}
	
	public Product getProduct(int index) {
		return prodactList.get(index);
	}

	public class Product {
		private String name;
		private double price;
		
		public Product() {
		}

		public Product(String productName, double price) {
			this.name = productName;
			this.price = price;
		}

		public void setProductName(String name) {
			this.name = name;
		}

		public String getProductName() {
			return name;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public double getPrice() {
			return price;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(price, name);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
					&& Objects.equals(name, other.name);
		}

		private Payment getEnclosingInstance() {
			return Payment.this;
		}

		@Override
		public String toString() {
			return "Product [productName=" + name + ", price=" + price + "]";
		}
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(prodactList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Objects.equals(prodactList, other.prodactList);
	}
	
	
	@Override
	public String toString() {
		return "Payment [prodactList=" + prodactList + "]";
	}
}
