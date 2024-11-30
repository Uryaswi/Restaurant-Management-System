package foodorderingsystem;
import static foodorderingsystem.RestaurantService.*;
import static foodorderingsystem.Restaurant.*;
import java.util.Scanner;

public class MenuOperations {
static Menu[] menus=new Menu[10];
static int index=0;
static Restaurant[] rest=new Restaurant[10];
static int tempIndex=0;
    static void addmenu(Menu menu) {
    	menus[index++] = menu;
    	System.out.println("Menu added successfully");
  
    	
//	menu[]=new Menu(1,hhhm,j);
}
    static void getAllMenus() {
    	for(int i=0;i<index;i++)// index=0 
    		{
    		System.out.println("Menu Id:"+menus[i].getId());
    		System.out.println("Menu Name:"+menus[i].getName());
    		System.out.println("Menu ratings:"+menus[i].getRatings());
    		System.out.println("Menu price:"+menus[i].getPrice());
    		System.out.println("Expected delivery time:"+menus[i].getTime());
    		
    		for(int j=0;j<menus[i].getRestaurant().length;j++) {
    			Restaurant[] res=menus[i].getRestaurant();
    			if(res[j]==null)
    			{
    				continue;
    			}
    			else {
    				
    				System.out.println("Restaurant id:"+res[j].getId());
    				System.out.println("Restaurant name:"+res[j].getName());
    				System.out.println("Restaurant address:"+res[j].getAddress());
    			}
    				
    		}
    	}
    }
    static Restaurant checkRestaurant(int rid) {
    	int rindex = 0;
		for(int i=0;i<rindex;i++) {
    		if(restaurant[i].getId()==rid) {
    			return restaurant[i];
    		}
    	}
    	return null;
    }
    static void assignRestaurantToMenu() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter menu id:");
    	int mid=sc.nextInt();
    	for(int i=0;i<index;i++) {
    		if(menus[i].getId()==mid)
    		{
    			System.out.println("Enter restaurant id:");
    	    	int rid=sc.nextInt();
    	    	Restaurant r=checkRestaurant(rid);
    	    	if(r!=null) {
    				rest[tempIndex++]=r;
    	    		menus[i].setRestaurant(rest);
    	    		System.out.println("Restaurant added successfully");
    	    		break;
    	    	}
    	    	else
    	    			continue;
    	    					
    	    	}
    		}
    	}
//    	System.out.println("Enter restaurant id:");
//    	int rid=sc.nextInt();
//    	Restaurant r=checkRestaurant(rid);
//    	if(r!=null) {
//			rest[tempIndex++]=r;
//    		menus[i].setRestaurant(rest);
//    		System.out.println("Restaurant added successfully");
//    		break;
//    	}
//    	else
//    			continue;
//    					
//    	}
    }

