package com.xin.domain;

public class Order implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int OrderID;
	private int UserID;
	private String Address;
	private int teleNumber;
	private int State;//表明订单状态
	private java.util.Date Date;
	public Order(){}
	public int getOrderID() {
		return OrderID;
	}
	public void setOrderID(int orderID) {
		OrderID = orderID;
	}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getTeleNumber() {
		return teleNumber;
	}
	public void setTeleNumber(int teleNumber) {
		this.teleNumber = teleNumber;
	}
	public int getState() {
		return State;
	}
	public void setState(int state) {
		State = state;
	}
	public java.util.Date getDate() {
		return Date;
	}
	public void setDate(java.util.Date date) {
		Date = date;
	}

	
}
