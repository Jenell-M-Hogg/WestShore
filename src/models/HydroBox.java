package models;

import java.util.ArrayList;

public class HydroBox implements StorageItem, StorageSpace{
	private String id;
	private int plugs;
	private String location;
	ArrayList<String> connections=new ArrayList<String>();
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public void store(String location) {
		this.location=location;
		
	}

	@Override
	public void remove() {
		this.location=StorageItem.notStored;
		
	}

	@Override
	public String locate() {
		return location;
	}

	@Override
	public boolean isEmpty() {
		if (this.connections.size()==0){
			return true;
		}
		return false;
	}

	@Override
	public int getSpaces() {
		// TODO Auto-generated method stub
		return this.plugs;
	}

	@Override
	public void expand(int space) {
		plugs=plugs+space;
		
	}

	@Override
	public void shrink(int space) {
		plugs=plugs-space;
	}
	
	
}
