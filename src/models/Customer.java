package models;

import java.util.ArrayList;

public class Customer {
	ArrayList<StorageItem> items=new ArrayList<StorageItem>();
	String name;
	String surname;
	
	public void own(StorageItem item){
		items.add(item);
	}
	
	public StorageItem search(String id) throws Exception{
		for (int i=0; i<items.size();i++){
			if (items.get(i).getId().equals(id)){
				return items.get(i);
				
			}
		}
		Exception e = new Exception();
		throw e;
	}
	
	public StorageItem get(String location) throws Exception{
		for (int i=0; i<items.size();i++){
			if(items.get(i).locate().equals(location)){
				return items.get(i);
			}
			
		}
		Exception e= new Exception();
		throw e;
	}

}
