package models;

import java.util.ArrayList;

public class Dock implements StorageSpace {
	String id;
	ArrayList<StorageItem> items= new ArrayList<StorageItem>();
	int spaces;
	
	
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		int i= items.size();
		
		for(int m=0;m<i;m++){
			if(items.get(m) instanceof Boat){
				return false;
			}
		}
		return true;
	}

	@Override
	public int getSpaces() {
		// TODO Auto-generated method stub
		return spaces;
	}

	@Override
	public void expand(int space) {
		spaces=spaces+space;

	}

	@Override
	public void shrink(int space) {
		spaces=spaces-space;

	}

	public String getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

}
