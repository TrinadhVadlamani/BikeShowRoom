import java.util.Scanner;

public class BikeApp {
	static Scanner sc = new Scanner(System.in);
	
	 public static void displayMenu( ) {
		   	
	   	 System.out.println(" enter 1 to create Bikes");
	   	 System.out.println(" enter 2 to display all the bikes sorted by name");
	   	 System.out.println(" enter 3 to display bikes first sorted by Type then cc");
	   	 System.out.println(" enter 4 to Find least and most expensive bikes in store");
	   	 System.out.println(" enter 5 to search a bike with name and model");
	   	 System.out.println(" enter 6 to exit");
	  }
  
	public static void main(String[] args) {
		
		System.out.println("enter the number of bike");
		int numberofbikes =sc.nextInt();
		Car[] bikes=new Car[numberofbikes];
		
	
   boolean exit=true;
do {
	displayMenu();
System.out.println(" enter your choice");
int choice=sc.nextInt();
  switch(choice) {
  case 1 :
	   getGenerateBikes( bikes);
	  
	  break; 
	  
  case 2:
	 BikeService.SortBikeByName(bikes);
	 
	   break;
  case 3:
	 
	 BikeService.SortBikeByType(bikes);
	
	   break;
  case 4:
	
	   break;
  case 5:
	  
	   System.out.println("enter the bike name tosearch ");
	   String bikename= sc.next();
	   System.out.println("enter the bike model tosearch ");
	   String bikemodel= sc.next();
	 int index=BikeService.SearchBike(bikes, bikename, bikemodel);
	 if(index==-1) {
		 System.out.println("element not found");
	 }
	 else {
		 System.out.println(" bike found at index::"+index);
	 }
	   break;
  case 6:
	   exit=false;
	   break;
 default :
	  System.out.println("invalid choice!!!!!");
	   break;
  }
} while(exit);

	}

	public  static Car[] getGenerateBikes(Car[] bikes) {
		
		for (int i = 0; i < bikes.length; i++) {
		    System.out.println("enter the"+ (i+1)+" th Bike details");
			System.out.println("Enter the Name of bike:");
			String name=sc.next();
           System.out.println("enter the bike Model :");
			String model = sc.next();
			System.out.println("enter the bike Type :");
			String type = sc.next();
			System.out.println("Enter the Engine CC:");
			int engineCC = sc.nextInt();
			System.out.println("enter the Bike Price:");
			int price = sc.nextInt();
			bikes[i]=new Car(name, model, type, engineCC, price);
		}
		return bikes;
	}

	 

}
