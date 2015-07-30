package com.xin.domain;

public class Item implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ItemID;
	private String ItemName;
	private String ItemCatetory;
	private String ItemStock;
	private float Price;
	private String picture;
	private String ItemDetail;
	private String ItemState;
	public int getItemID() {
		return ItemID;
	}
	public Item(){
		
	}
	public void setItemID(int itemID) {
		ItemID = itemID;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public String getItemCatetory() {
		return ItemCatetory;
	}

	public void setItemCatetory(String itemCatetory) {
		ItemCatetory = itemCatetory;
	}

	public String getItemStock() {
		return ItemStock;
	}

	public void setItemStock(String itemStock) {
		ItemStock = itemStock;
	}

	

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getItemDetail() {
		return ItemDetail;
	}

	public void setItemDetail(String itemDetail) {
		ItemDetail = itemDetail;
	}

	public String getItemState() {
		return ItemState;
	}

	public void setItemState(String itemState) {
		ItemState = itemState;
	}

}
