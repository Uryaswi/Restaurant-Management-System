package foodorderingsystem;

public class Restaurant {

	private int id;
	private String name;
	private String address;
	public Restaurant(int id, String name, String address) {
		super();
		this.id=id;
		this.name=name;
		this.address=address;
		
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
