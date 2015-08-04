package models;

import java.util.ArrayList;

import interfaces.StorageItem;

public class Customer {
	String name;
	String surname;
	
	public Customer(String n, String l){
		this.name=n;
		this.surname=l;
		
		//A customer may have one or many boats, as well as one or many trailers....
		ArrayList<StorageItem> items=new ArrayList<StorageItem>();
	}

}
