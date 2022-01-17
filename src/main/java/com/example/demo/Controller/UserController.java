package com.example.demo.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Domain.User;
import com.example.demo.Form.ResistUserForm;
import com.example.demo.Service.UserService;

/**
 * 
 * @author satakemisako
 * ユーザー情報関連のコントローラークラス
 *
 */
@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private HttpSession session;
	
	@Autowired
	private UserService service;
	
	@RequestMapping("regist")
	public String registUser(ResistUserForm form) {
		System.out.println(form);
		User user = new User();
		BeanUtils.copyProperties(form,user);
		service.insertUser(user);
		return "toppage";
	}
	
	@RequestMapping("toRegist")
	public String toRegist() {
		return "registuser";
	}
	
	@RequestMapping("toToppage")
	public String toToppage() {
		return "toppage";
	}
	
}
