package com.example.demo.Domain;

import java.sql.Date;

/**
 * 
 * @author satakemisako
 * ユーザーのドメインクラス
 *
 */
public class User {

	private Integer uId;
	private String userName;
	private double targetWeight;
	private double carentWeight;
	private Date targetDate;
	
	
	@Override
	public String toString() {
		return "User [uId=" + uId + ", userName=" + userName + ", targetWeight=" + targetWeight + ", carentWeight="
				+ carentWeight + ", targetDate=" + targetDate + "]";
	}



	public Date getTargetDate() {
		return targetDate;
	}



	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}



	public Integer getuId() {
		return uId;
	}



	public void setuId(Integer uId) {
		this.uId = uId;
	}



		public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public double getTargetWeight() {
		return targetWeight;
	}



	public void setTargetWeight(double targetWeight) {
		this.targetWeight = targetWeight;
	}



	public double getCarentWeight() {
		return carentWeight;
	}



	public void setCarentWeight(double carentWeight) {
		this.carentWeight = carentWeight;
	}
}
