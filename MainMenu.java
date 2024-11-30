package foodorderingsystem;
import static foodorderingsystem.AdminOperations.*;
public class MainMenu {
	public static void allMenus() {
		int choice;
		while(true) {
			System.out.println("Press 1.Admin Panel\n Press 2.User Panel\n Press 3.Quit");
			System.out.println("Enter choice");
			choice=sc.nextInt();
			switch(choice){
			case 1:adminOperation();
				break;
			case 2: break;
			case 3:
				System.exit(0);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to foody");
		allMenus();
	}

}
