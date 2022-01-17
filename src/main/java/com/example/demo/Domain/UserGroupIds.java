package com.example.demo.Domain;
/**
 * 
 * @author satakemisako
 * ユーザー初期登録時のグループIDドメインクラス
 *
 */
public class UserGroupIds {

	private Integer jGroupId;
	private Integer jUserId;
	
	
	@Override
	public String toString() {
		return "UserGroupIds [groupName=" + jGroupId + ", userId=" + jUserId + "]";
	}

	public Integer getJUserId() {
		return jUserId;
	}

	public void setJUserId(Integer jUserId) {
		this.jUserId = jUserId;
	}

	public Integer getjGroupId() {
		return jGroupId;
	}
	public void setjGroupId(Integer jGroupId) {
		this.jGroupId = jGroupId;
	}
	
	
}
