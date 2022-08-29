package com.samples.userauthjuint.test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import org.junit.runner.RunWith;


public class TestDemoService{
	
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
	
	@Test
    @DisplayName("User Validation")
	public void test1() {
		assertEquals("admin",inputusername());
		assertEquals("password",inputpassword());
	}
}