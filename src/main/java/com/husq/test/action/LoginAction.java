package com.husq.test.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import com.husq.test.vo.User;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage(value="struts-default")
@Namespace(value="/")

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User user;
	private int count = 0;

	 @Action(value="login",results={
			 @Result(name="success",location="/jsp/common/success.jsp",type="redirect"),  
	         @Result(name="login",location="/jsp/login.jsp",type="redirect",params={"username","${user.username}","password","%{user.password}"}),  
	         @Result(name="error",location="/jsp/common/error.jsp",type="redirect")})
	public String login(){
		 count++;
		 System.out.println("enter login method");
		 System.out.println("username:"+user.getUsername());
		 System.out.println("password:"+user.getPassword());
		 System.out.println("**********************************************"+count);

		return "login";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
