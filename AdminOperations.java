package foodorderingsystem;
import static foodorderingsystem.RestaurantService.*;
import java.util.Scanner;
import static foodorderingsystem.MenuOperations.*;
import static foodorderingsystem.MainMenu.*;
public class AdminOperations {
	static Scanner sc=new Scanner(System.in);
	static Menu createMenu() {
		System.out.println("Enter menu id:");
		int id= sc.nextInt();
		sc.nextLine();
		System.out.println("enter menu name:");
		String name=sc.nextLine();
		System.out.println("enter rating:");
		float ratings=sc.nextFloat();
		System.out.println("enter price:");
		double price=sc.nextDouble();
		
		return new Menu(id,name,ratings,price);
	}
	static Restaurant createRestaurant() {
		System.out.println("Enter restaurant id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter restaurant name:");
		String name=sc.nextLine();
		System.out.println("Enter restaurant address");
		String address=sc.nextLine();
		
		return new Restaurant(id,name,address);
	}
	static void adminOperation() {
		int choice;
		while (true) {
			System.out.println("Press 1.Add menu\n Press 2.Update Menu\n Press 3.Delete Menu\n Press 4 get order detail\nPress 5.Add restaurant\nPress 6.Get all Menus Details\n Press 7.Get all restaurant details\nPress 8.Assign restaurant to menu\nPress 9.get back to the main menu");
			System.out.println("Enter choice:");
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				Menu m= createMenu();
				addmenu(m);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				Restaurant r=createRestaurant();
				addRestaurant(r);
				break;
			case 6:
				getAllMenus();
				break;
			case 7:
				getAllRestaurant();
				break;
			case 8:assignRestaurantToMenu();
			case 9:
				allMenus();
				break;
			}
		}
		
	}
}
