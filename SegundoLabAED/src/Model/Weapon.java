package Model;

public class Weapon {
	
//	private String key;
	private String bullets;
	private String name;
	private Weapon next;
	

	// Declaration of Constructor
	public Weapon(String b,String name) {
		
//		key = null;
		bullets = b;
		this.name = name;
	}
    // Getters and Setters

//	public String getKey() {
//		return key;
//	}
//
//	public void setKey(String key) {
//		this.key = key;
//	}
	
	public String getName() {
		
		return name;
	}
	
	public String getBullets() {
		
		return bullets;
	}
	
	public void setBullets(String b) {
		
		bullets = b;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Weapon getNext() {
		return next;
	}

	public void setNext(Weapon next) {
		this.next = next;
	}
	
	

}
