package com.imooc.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	
	@Override
	public String execute() throws Exception {
		System.out.println("Ö´ÐÐdefaultAction");				
		return SUCCESS;		
	}
	
	public String add() {
		System.out.println("Ö´ÐÐAddAction");	
		return "add";
	}
	
	public String update() {
		System.out.println("Ö´ÐÐUpdateAction");	
		return "update";
	}
}

