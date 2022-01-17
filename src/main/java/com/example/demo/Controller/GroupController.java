package com.example.demo.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Domain.GroupId;
import com.example.demo.Domain.User;
import com.example.demo.Domain.UserGroupIds;
import com.example.demo.Form.ResistGroupIdForm;
import com.example.demo.Form.ResistUserForm;
import com.example.demo.Service.GroupService;
import com.example.demo.Service.UserService;

/**
 * 
 * @author satakemisako
 * グループ情報関連のコントローラークラス
 *
 */
@Controller
@RequestMapping("group")
public class GroupController {

	@Autowired
	private HttpSession session;
	
	@Autowired
	private GroupService service;
	
	@Autowired
	private UserService uservice;
	
	@RequestMapping("createGroup")
	public String createGroup(ResistGroupIdForm form,Model model) {
		System.out.println(form);//ユーザー名と、グループ名を取得
		
		UserGroupIds userGroupIds = new UserGroupIds();
		
		//グループテーブルにグループ名を登録
		service.insertGroupId(form.getGroupName());
		
		//グループテーブルから自動採番したグループIDを取得
		GroupId groupId = uservice.searchGroupId(form.getGroupName());
		//中間テーブルドメインにセット
		userGroupIds.setjGroupId(groupId.getGroupId());
		
		
		User user = uservice.searchUserId(form.getUserName());
		if(user==null) {
			model.addAttribute("userabsence", "登録されていないユーザーです");
		}else {
			userGroupIds.setJUserId(user.getuId());
			//中間テーブルにユーザーID、グループIDをインサート
			service.insertUserGroupId(userGroupIds);
		}
		
		return "toppage";
	}
	
	
	
	@RequestMapping("loginGroup")
	public String loginGroup(String loginGroupId,Model model) {
		
		GroupId groupId = service.selectGroupId(loginGroupId);
		
		if(groupId==null) {
			model.addAttribute("groupabsence", "グループがありません");
			return "toppage";
		}
		else {
			session.setAttribute("loginGroupId", loginGroupId);
			return "grouptoppage";
			
		}
	}
	
	
	
	@RequestMapping("toCreateGroup")
	public String toCreateGroup() {
		return "registgroup";
	}
	
	@RequestMapping("toToppage")
	public String toToppage() {
		return "toppage";
	}
	
}
