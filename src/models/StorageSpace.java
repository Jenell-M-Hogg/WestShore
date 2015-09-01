package models;

public interface StorageSpace {
	
	public boolean isEmpty();
	public int getSpaces();
	public void expand(int space);
	public void shrink(int space);
	
	
}
