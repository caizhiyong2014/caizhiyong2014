package com.xin.domain;

public class User implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int UserID;
	private String UserName;
	private int UserNumber;
	public User(){}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public int getUserNumber() {
		return UserNumber;
	}
	public void setUserNumber(int userNumber) {
		UserNumber = userNumber;
	}
	
}
