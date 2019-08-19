package com.amdocs;

import java.util.HashMap;

public class Contacts {

	
	private HashMap<String , String > contacts;
	
	
	public Contacts() {
		this.contacts = new HashMap<String , String>();
	}

	public void add(String name, String mobile)
	{
		contacts.put(name, mobile);
		
		

	}
	
	public String findContactNameByMobile(String mobile)
	{
		String name = contacts.get(mobile);
			if(name == null)
				return "haha";
			else
				return name;
	}
	public static void main(String[] args) {
		Contacts contacts = new Contacts();
		contacts.add("kuldeep","12345");
		contacts.add("sunil","23456");
		String name = contacts.findContactNameByMobile("sunil1");
		System.out.println(name);
	}

}
