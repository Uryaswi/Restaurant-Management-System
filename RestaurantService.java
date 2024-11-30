package foodorderingsystem;

public class RestaurantService {
	static Restaurant[] restaurant=new Restaurant[10];
	static int index=0;
	static void addRestaurant(Restaurant rest)
	{
		restaurant[index++]=rest;
		System.out.println("Restaurant added successfully");
	}
	static void getAllRestaurant() {
		for(int i=0;i<index;i++) {
			System.out.println("Restaurant id:"+restaurant[i].getId());
			System.out.println("Restaurant name:"+restaurant[i].getName());
			System.out.println("Restaurant address:"+restaurant[i].getAddress());
		}
	}
	
}
