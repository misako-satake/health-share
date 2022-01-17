package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.GroupId;
import com.example.demo.Domain.User;
import com.example.demo.Domain.UserGroupIds;
import com.example.demo.Repository.GroupMapper;
import com.example.demo.Repository.UserMapper;

/**
 * 
 * @author satakemisako
 * ユーザー情報関連のサービスクラス
 *
 */
@Service
public class GroupService {

	@Autowired
	private UserMapper mapper;
	
	@Autowired
	private GroupMapper gmapper;
	
	public void insertGroupId(String groupName) {
		mapper.insertGroupId(groupName);
	}
	
	public void insertUserGroupId(UserGroupIds userGroupIds) {
		gmapper.insertJuncUserGoupId(userGroupIds);
	}
	
	public GroupId selectGroupId(String groupName) {
		GroupId groupId = gmapper.selectGroupId(groupName);
		return groupId;
	}
	
}
