package com.example.demo.Repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Domain.GroupId;
import com.example.demo.Domain.User;
import com.example.demo.Domain.UserGroupIds;

/**
 * 
 * @author satakemisako
 * グループ情報のリポジトリクラス
 *
 */
@Mapper
public interface GroupMapper {
	
	public void insertJuncUserGoupId(UserGroupIds userGoupIds);
	public GroupId selectGroupId(String GroupName);
	
}
