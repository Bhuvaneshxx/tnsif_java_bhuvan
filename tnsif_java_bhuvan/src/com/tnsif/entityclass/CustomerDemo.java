package com.tnsif.entityclass;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.id= 1;
		c1.name="bhuvan";
		c1.city="chennai";
		System.out.println("Id:"+c1.id+" ,Name :"+c1.name+" ,City :"+c1.city);
		Customer c2=new Customer();
		c2.id=01;
		c2.name="abc";
		c2.city="chennai";
		System.out.println("Id:"+c2.id+" ,Name :"+c2.name+" ,City :"+c2.city);
	}

}
