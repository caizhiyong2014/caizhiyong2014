package com.xin.domain;

public class OrderInformation implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID;
	private int OrderID;
	private int ItemID;
	private int ItemNumber;
	public OrderInformation(){}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getOrderID() {
		return OrderID;
	}
	public void setOrderID(int orderID) {
		OrderID = orderID;
	}
	public int getItemID() {
		return ItemID;
	}
	public void setItemID(int itemID) {
		ItemID = itemID;
	}
	public int getItemNumber() {
		return ItemNumber;
	}
	public void setItemNumber(int itemNumber) {
		ItemNumber = itemNumber;
	}
	

}
