package models;

public class Finger implements StorageSpace {
	int length;
	String[] signs=new String[2];
	int spaces;
	
	
	
	public Finger(int length, int spaces, String[] signs){
		this.length= length;
		this.spaces=spaces;
		this.signs=signs;
		
	}
	
	@Override
	public boolean isEmpty() {
		if (spaces==0){
			return true;
		}
		return false;
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

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String[] getSigns() {
		return signs;
	}

	public void setSigns(String[] signs) {
		this.signs = signs;
	}

	

}
