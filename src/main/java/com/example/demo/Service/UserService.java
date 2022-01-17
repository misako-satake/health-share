package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.GroupId;
import com.example.demo.Domain.User;
import com.example.demo.Repository.UserMapper;

/**
 * 
 * @author satakemisako
 * ユーザー情報関連のサービスクラス
 *
 */
@Service
public class UserService {

	@Autowired
	private UserMapper mapper;
	
	public void insertUser(User user) {
		mapper.insertUser(user);
	}
	
	public void insertGroupId(String groupName) {
		mapper.insertGroupId(groupName);
	}
	
	public User searchUserId(String userName) {
		User user = mapper.selectUserId(userName);
		return user;
	}
	
	public GroupId searchGroupId(String groupName) {
		GroupId groupId = mapper.selectGroupId(groupName);
		return groupId;
	}
}
