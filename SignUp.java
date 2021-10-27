package com.xworkz.polymorphism;

public class SignUp {
String userName;
long mobileNo;
String password;

public SignUp() {
	System.out.println("------- SignUp -------- ");
}
public void userSignup(String userName,String password) {
	this.userName=userName;
	this.password=password;
	System.out.println("signup successfully by providing user name");
}
public void userSignup(long mobileNo,String password) {
	this.mobileNo=mobileNo;
	this.password=password;
	System.out.println("signup successfully by providing user mobile number");
}
}
