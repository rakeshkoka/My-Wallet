package myWallet.entities;

import java.sql.Date;

public class Wallet {

	double price;
	
	String description;
	
	Date paymentDate;
	
	String paymentTime;
	
	String paymentType;
	
	String category;
	
	byte[] paymentRecipt;
	
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentTime() {
		return paymentTime;
	}
	public void setPaymentTime(String paymentTime) {
		this.paymentTime = paymentTime;
	}
	
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public byte[] getPaymentRecipt() {
		return paymentRecipt;
	}
	public void setPaymentRecipt(byte[] paymentRecipt) {
		this.paymentRecipt = paymentRecipt;
	}


	public Wallet(double price, String description, Date paymentDate, String paymentTime, String paymentType,
			String category, byte[] paymentRecipt) {
		super();
		this.price = price;
		this.description = description;
		this.paymentDate = paymentDate;
		this.paymentTime = paymentTime;
		this.paymentType = paymentType;
		this.category = category;
		this.paymentRecipt = paymentRecipt;
	}
	
	public Wallet(double price, String description, String paymentTime, String paymentType,
			String category) {
		super();
		this.price = price;
		this.description = description;
		this.paymentTime = paymentTime;
		this.paymentType = paymentType;
		this.category = category;
	}
	
	public Wallet() {
		
	}
	
}
