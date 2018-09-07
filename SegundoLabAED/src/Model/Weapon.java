package Model;

public class Weapon {
	
	private Weapon next;
	private Weapon back;
	private String name;
	private String key;
	
	// Declaration of Constructor
	public Weapon(String k, String n) {
		
		next = null;
		back = null;
		name = n;
		key = k;
	}
    // Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Weapon getNext() {
		return next;
	}

	public void setNext(Weapon next) {
		this.next = next;
	}

	public Weapon getBack() {
		return back;
	}

	public void setBack(Weapon back) {
		this.back = back;
	}
	
	

}