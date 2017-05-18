package com.ld.action;

import java.util.List;

import com.ld.model.Manager;
import com.ld.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	private String card;

    private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Override
	public String execute() throws Exception {
		String message="error";
		if("学生".equals(card)){
			if(userService.getStudent(username, password)>0)  message="successStudent";
		}
		if("评定人员".equals(card)){
			List<Manager> managerList=userService.getManager(username, password);
			if(managerList.size()>0) {
				if(managerList.get(0).getMType()==1) {message="manager1";}
				else message="manager2";
			}
		}
		return message;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}

	
	
}
