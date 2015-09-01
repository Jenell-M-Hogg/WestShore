package models;

public class Boat implements StorageItem{
	String location;
	String id;
	
	String description;
	String make;
	String hull;
	int length;
	int beam;
	
	
	public Boat(String id){
		this.id=id;
	}
	
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
		location=StorageItem.notStored;
		
	}

	@Override
	public String locate() {
		return location;
		
	}

	
	
}
