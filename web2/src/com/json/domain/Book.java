package com.json.domain;

public class Book {

//	private int id;
//	private String name;
//	private String address;
	private String productname;
	private String upc;
	private double price;
	private int amount;
	
	
	
	
	

	public Book(String productname, String upc, double price, int amount) {
		super();
		this.productname = productname;
		this.upc = upc;
		this.price = price;
		this.amount = amount;
	}






	@Override
	public String toString() {
		return "Book [productname=" + productname + ", upc=" + upc + ", price="
				+ price + ", amount=" + amount + "]";
	}






	public String getProductname() {
		return productname;
	}






	public void setProductname(String productname) {
		this.productname = productname;
	}






	public String getUpc() {
		return upc;
	}






	public void setUpc(String upc) {
		this.upc = upc;
	}






	public double getPrice() {
		return price;
	}






	public void setPrice(double price) {
		this.price = price;
	}






	public int getAmount() {
		return amount;
	}






	public void setAmount(int amount) {
		this.amount = amount;
	}






	public Book() {
		// TODO Auto-generated constructor stub
	 }

}
