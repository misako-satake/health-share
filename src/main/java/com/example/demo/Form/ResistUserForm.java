package com.example.demo.Form;

import java.sql.Date;

/**
 * 
 * @author satakemisako
 * ユーザー登録用フォーム
 *
 */
public class ResistUserForm {
	private String userName;
	private double targetWeight;
	private double carentWeight;
	private Date targetDate;
	
	
	@Override
	public String toString() {
		return "ResistUserForm [userName=" + userName + ", targetWeight=" + targetWeight + ", carentWeight="
				+ carentWeight + ", targetDate=" + targetDate + "]";
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
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
