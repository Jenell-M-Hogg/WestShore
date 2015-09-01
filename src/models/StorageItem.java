package models;

public interface StorageItem {
	static final String notStored="NOTSTORED";
	
	public String getId();
	public void store(String location);
	public void remove();
	public String locate();
	
}
