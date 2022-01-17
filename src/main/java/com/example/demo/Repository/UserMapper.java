package com.example.demo.Repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Domain.GroupId;
import com.example.demo.Domain.User;

/**
 * 
 * @author satakemisako
 * ユーザー登録情報のリポジトリクラス
 *
 */
@Mapper
public interface UserMapper {

	public void insertUser(User user);
	public void insertGroupId(String groupName);
	public User selectUserId(String userName);
	public GroupId selectGroupId(String groupName);
	
}
