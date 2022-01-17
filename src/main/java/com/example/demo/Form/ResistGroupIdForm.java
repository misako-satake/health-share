package com.example.demo.Form;
/**
 * 
 * @author satakemisako
 *
 *グループ作成時のフォームグループ
 */
public class ResistGroupIdForm {
	
	private String groupName;
	private String userName;

	@Override
	public String toString() {
		return "ResistGroupIdForm [groupName=" + groupName + ", userName=" + userName + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	
}
