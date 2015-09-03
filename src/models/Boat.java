package models;

public class Boat implements StorageItem {
	private String location;
	private String id;
	private String description;
	private String make;
	private String hull;
	private String customer;
	private boolean hasHydro;
	private boolean isBilled = false;
	private int length;
	private int beam;
	private String name;

	public Boat(String id, String customer, String location) {
		this.id = id;
		this.customer = customer;
		this.location = location;
	}

	@Override
	public String getId() {
		return id;

	}

	@Override
	public void store(String location) {
		this.location = location;
	}

	@Override
	public void remove() {
		location = StorageItem.notStored;

	}

	@Override
	public String locate() {
		return location;

	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public boolean isHasHydro() {
		return hasHydro;
	}

	public void setHasHydro(boolean hasHydro) {
		this.hasHydro = hasHydro;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getHull() {
		return hull;
	}

	public void setHull(String hull) {
		this.hull = hull;
	}

	public boolean isBilled() {
		return isBilled;
	}

	public void setBilled(boolean isBilled) {
		this.isBilled = isBilled;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBeam() {
		return beam;
	}

	public void setBeam(int beam) {
		this.beam = beam;
	}

	public String getName() {
		return this.name;
	}


}
