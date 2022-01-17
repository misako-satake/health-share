package com.example.demo.Domain;
/**
 * 
 * @author satakemisako
 * ユーザー初期登録時のグループIDドメインクラス
 *
 */
public class GroupId {

	private Integer gId;
	private String groupName;
	
	
	@Override
	public String toString() {
		return "GroupId [groupId=" + gId + ", groupName=" + groupName + "]";
	}
	
	public Integer getGroupId() {
		return gId;
	}
	public void setGroupId(Integer gId) {
		this.gId = gId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	
}
