

package com.samples.userauthjuint;

import java.util.Scanner;

//import org.springframework.security.access.annotation.Secured;


public class DemoService {
	
	public String inputusername() {
		String username;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the username:");
		username=in.next();
		return username;
	}
	
	public String inputpassword() {
		String password;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the password:");
		password=in.next();
		return password;
	}
	
	public boolean validate() {
		String u = inputusername();
		String p = inputpassword();
		if(u.equals("admin")&&p.equals("password")) {
			return true;
		}else {
			return false;
		}
	}
}
