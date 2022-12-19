package com.lm.service;

import com.lm.dao.ILoginDAO;

public class LoginMgmtService implements ILoginMgmtService {

	private ILoginDAO logindao;
	
	public LoginMgmtService(ILoginDAO logindao) {
		this.logindao = logindao;
	}
	
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		if(username.equals("" )|| password.equals(""))
			throw new IllegalArgumentException("empty credentials");
		System.out.println(username+" "+password);
		//use LoginDAO
		int count = logindao.authenticate(username,password);
		if(count == 0)
		return false;
		else
			return true;
	}

}
