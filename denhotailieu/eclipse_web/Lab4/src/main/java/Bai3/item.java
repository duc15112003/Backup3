package Bai3;

public class item {
	
	String name;
	String image;
	int price;
	double discount;
	
	public item() {
		// TODO Auto-generated constructor stub
	}
	
	

	public item(String name, String image, int price, double discount) {
		this.name = name;
		this.image = image;
		this.price = price;
		this.discount = discount;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	

}
