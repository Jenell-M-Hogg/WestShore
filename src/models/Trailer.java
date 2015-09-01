package models;

public class Trailer implements StorageItem {
	String id;
	String plate;
	boolean hasLock=false;
	String location;
	
	
	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public boolean hasLock() {
		return hasLock;
	}

	public void setHasLock(boolean hasLock) {
		this.hasLock = hasLock;
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
		// TODO Auto-generated method stub
		location=StorageItem.notStored;
	}

}
