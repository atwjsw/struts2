package com.imooc.struts2.action;

import com.imooc.struts2.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User>{
	
	
	
	//�������ݷ���һ�� �����ֶ���ƥ��
	//	private String username;
	//	private String password;
	
	//�������ݷ������� �����ֶ���ƥ��
	private User user = new User();
	
	public String login() {	
		
		
		
		
		//System.out.println("LoginAction: " + username + "   " + password);	
		System.out.println("LoginAction: " + user.getUsername() + "   " + user.getPassword());	
		System.out.println("LoginAction: " + user.getBookList().get(0).getUsername());	
		System.out.println("LoginAction: " + user.getBookList().get(1).getPassword());
		//System.out.println("LoginAction: " + user.getBookList().get(2));	
		return SUCCESS;
	}

	/*public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}*/

	@Override
	public void validate() {
		if (user.getUsername()==null || user.getUsername().equals("")) {
			System.out.println("Username is empty");
			this.addFieldError("username", "�û�������Ϊ��");
			this.addFieldError("password", "���벻��Ϊ��");
		}
	}

	@Override
	public User getModel() {
		
		return user;
	}

//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}

}
