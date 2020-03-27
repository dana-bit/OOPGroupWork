/*Group Members
 * Daniel Collins -  1501375
`* Shemar Williams – 1704317
 * Dana-Lee Powell – 1800995
 * Shavaun Randall – 1801485
*/
package CarRental;


import java.io.*;
import java.util.*;


public class driver {

	
	
	
	public static void main(String[] args) {
	
		User U = new User();
		Vehicle V = new Vehicle();
		Car C = new Car();
		Truck T = new Truck();
		Bike B = new Bike();
		int count = 0; //To keep track of amount of vehicles rented
		
		Scanner Input = new Scanner (System.in);
		
		while(true) {
		System.out.println("*********************************");
        System.out.println("*      W E L C O M E   T O      *");
        System.out.println("*                               *");
        System.out.println("*       C A R S 4 R E N T       *");   
        System.out.println("*********************************");
        System.out.println("\nPLEASE MAKE A SELECTION:");
        System.out.println("1). Add Vehicle     ");
        System.out.println("2). View Vehicle    ");
        System.out.println("3). Search Vehicle  ");
        System.out.println("4). My Rentals      ");
        System.out.println("5). Return Vehicle  ");
        System.out.println("6). Exit            ");
        System.out.print("> ");
		
        int userInput = Input.nextInt();
       
        boolean exit = false; //To help break out of loop from case
        
        System.out.print("");
		
		
        	switch(userInput) {
			
			case 1: //Add Vehicle
			
			U.addVehicles();
			exit = false;
			
			break;
			
			case 2: //View Vehicle
			
			count = U.viewVehicles(count);	
			exit = false;
			
			break;
			
			case 3: //Search Vehicle
			
			count = U.searchVehicles(count);	
			exit = false;
			
			break;
	
			case 4://My Rentals
				
			count = U.myRentals(count);	
			exit = false;
			
			break;
        	
			case 5:  //Return Vehicle
			
			count = U.returnVehicle(count);	
			exit = false;
			
				break;
			
			case 6:
			
			exit = true;
			break;
			
			default:
				
			break;
        	
        	}
        	
        	if(exit == true) {// to end the program
        		System.out.println("Thank you for making it Cars4Rent!\n\t Goodbye!");
        		break;
        	}
		
		}//loop
	
	}

}
