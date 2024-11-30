package foodorderingsystem;

import java.time.LocalTime;
import java.util.Arrays;
public class Menu {
	private int id;
	private String name;
	private float ratings;
	private double price;
	private LocalTime time=LocalTime.of(00, 30);
	Restaurant[] restaurant=new Restaurant[5];
	
//	public Menu(int id2, String name2, float rating, double price2) {
//		// TODO Auto-generated constructor stub
//	}
//
//	public Menu(int id2, String name2, float rating, double price2) {
//		// TODO Auto-generated constructor stub
//	}

//	public Restaurant[] getrestaurants(){
//		return restaurant;
//	}
//
	public Restaurant[] getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant[] restaurant) {
		this.restaurant = restaurant;
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
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	public Menu() {		
		super();
		
		// TODO Auto-generated constructor stub
	}

	public Menu(int id,String name,float ratings,double price) {
		super();
		this.id=id;
		this.name=name;
		this.ratings=ratings;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", ratings=" + ratings + ", price=" + price + ", time=" + time
				+ ", restaurant=" + Arrays.toString(restaurant) + "]";
	}
	
	}


