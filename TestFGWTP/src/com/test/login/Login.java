package com.test.login;

import java.io.Serializable;
import java.lang.String;

public class Login implements Serializable {

	private static final long serialVersionUID = -5296414875218421290L;
	private String name;
	private String pasword;

	public Login() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public String getName() {
		return name;
	}

	public String getPasword() {
		return pasword;
	}
}
