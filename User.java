/*Group Members
 * Daniel Collins -  1501375
`* Shemar Williams – 1704317
 * Dana-Lee Powell – 1800995
 * Shavaun Randall – 1801485
*/
package CarRental;
import java.util.*;
import java.io.*;

public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public  void addVehicles() {
		try {
		
		Scanner vInput = new Scanner(System.in);
		FileWriter vehicleFile = new FileWriter("vehicles.txt",true);
		Vehicle V = new Vehicle();
		Truck T = new Truck();
		Bike B = new Bike();
		
		while(true) {
		
		System.out.println("Please input Type:");
		String Type = vInput.next();
			
		System.out.println("Please input License Plate:");
		String LicensePlate = vInput.next();
		
		System.out.println("Please input Brand:");
		String Brand = vInput.next();
		
		System.out.println("Please input Model:");
		String Model = vInput.next();
		
		System.out.println("Please input Year:");
		int Year = vInput.nextInt();
		
		System.out.println("Please input Color:");
		String Color = vInput.next();
		
		System.out.println("Please input Engine Size:");
		String EngineSize = vInput.next();
		
		System.out.println("Please input Transmission:");
		String Transmission = vInput.next();
		
		System.out.println("Please input Mileage:");
		int Mileage = vInput.nextInt();
		
		System.out.println("Please input Number of Seats:");
		int numOfseats = vInput.nextInt();
		
		System.out.println("Please input Rental Status:");
		String rentalStatus = vInput.next();
		
		System.out.println("Please input Rate Per Day:");
		float RatePerDay = vInput.nextFloat();
		
		System.out.println("Please input Towing Capacity:");
		int TowingCapacity = vInput.nextInt();
		
		System.out.println("Please input Number of Helmets:");
		int NumOfHelmets = vInput.nextInt();
		
			V.setType(Type);
			V.setLicensePlate(LicensePlate);
			V.setBrand(Brand);
			V.setModel(Model);
			V.setYear(Year);
			V.setColor(Color);
			V.setEngineSize(EngineSize);
			V.setTransmission(Transmission);
			V.setMileage(Mileage);
			V.setNumOfseats(numOfseats);
			V.setRentalStatus(rentalStatus);
			V.setRatePerDay(RatePerDay);
			T.setTowingCapacity(TowingCapacity);
			B.setNumberOfHelmets(NumOfHelmets);
			
			String Record = (V.getType() + "\t" + V.getLicensePlate() + "\t" + V.getBrand() + "\t" + V.getModel() 
			+ "\t" + V.getYear() + "\t" +  V.getColor() + "\t" + V.getEngineSize() + "\t" + V.getTransmission()
			+ "\t" + V.getMileage() + "\t" + V.getNumOfseats() + "\t" + V.getRentalStatus() + "\t" + V.getRatePerDay()
			+  "\t" + T.getTowingCapacity() + "\t" + B.getNumberOfHelmets() + "\n" );

			
			vehicleFile.write(Record);
			
			System.out.println("Do you want to Enter another Vehicle? (Yes/No): ");
			String cAns = vInput.next();
			
			if(cAns.equals("No") || (cAns.equals("no"))) {
                break;
            }
			
		}
		
		vehicleFile.close();
		
		} catch (InputMismatchException e) {
		
			e.printStackTrace();
		}
		catch (IOException ex) {
			
			ex.printStackTrace();
		}
		
		
	}
	
	
	public int viewVehicles(int count) {
	Scanner Sinput = new Scanner(System.in);
		try {
			
			Scanner vehicleFile = new Scanner(new File("vehicles.txt"));
			
			
			String Type;
			String LicensePlate;
			String Brand;
			String Model;
			int Year;
			String Color;
			String EngineSize;
			String Transmission;
			int Mileage;
			int NumOfseats;
			String RentalStatus;
			float RatePerDay;
			int Towingcapacity;
			int NumOfHelmets;
			
			System.out.println("Type  |  License Plate  |  Brand  |  Model  |  Year  |  Color  |  Engine Size  |  Transmission  |  Mileage  |  # of Seats  |  Rental Status  |  Rate per day  |  Towing Capacity  |  Helmets");
			while (vehicleFile.hasNext()) {

				Type = vehicleFile.next();
				LicensePlate = vehicleFile.next();
				Brand = vehicleFile.next();
				Model = vehicleFile.next();
				Year = vehicleFile.nextInt();
				Color = vehicleFile.next();
				EngineSize = vehicleFile.next();
				Transmission = vehicleFile.next();
				Mileage = vehicleFile.nextInt();
				NumOfseats = vehicleFile.nextInt();
				RentalStatus = vehicleFile.next();
				RatePerDay = vehicleFile.nextFloat();
				Towingcapacity = vehicleFile.nextInt();
				NumOfHelmets = vehicleFile.nextInt();

				System.out.println(Type + "   |   " + LicensePlate + "        |  " + Brand + "  |  " + Model + "    |  " + Year + "  | " + Color 
									+  "    |  " + EngineSize + "         |   " + Transmission + "            |  " + Mileage + "    |  " + NumOfseats + "           |  " + RentalStatus
									+ "      |   " + RatePerDay + "      |    " + Towingcapacity + "              |   " + NumOfHelmets);
			}
		vehicleFile.close();
		}catch (FileNotFoundException ex) {
			
			ex.printStackTrace();
		}
		//Selecting Vehicle 
		System.out.print("\nDo you wish to Rent a Vehicle? (Yes/No): ");
		String search = Sinput.next();
		
		if(search.equals("Yes") || search.equals("yes")) {
			try {
			FileWriter RentalFile = new FileWriter("rentalFile.txt",true);
			System.out.println("\nHow Do wish to search for the Vehicle?");
			System.out.println("1) License Plate #");
			System.out.println("2) Brand");
			System.out.println("3) Model");
			System.out.println("4) Year");
			System.out.print(">");
			
			//Selecting Vehicle by Choice
			int searchchoice = Sinput.nextInt();
			
			if(searchchoice == 1) { //Select by License Plate
				
				String Type;
				String LicensePlate;
				String Brand;
				String Model;
				int Year;
				String Color;
				String EngineSize;
				String Transmission;
				int Mileage;
				int NumOfseats;
				String RentalStatus;
				float RatePerDay;
				int Towingcapacity;
				int NumOfHelmets;
				
				Scanner vehicleFile = new Scanner(new File("vehicles.txt"));
				
				System.out.println("Please input License Plate #:");
				String License = Sinput.next();
				
				while (vehicleFile.hasNext()) {

				Type = vehicleFile.next();
				LicensePlate = vehicleFile.next();
				Brand = vehicleFile.next();
				Model = vehicleFile.next();
				Year = vehicleFile.nextInt();
				Color = vehicleFile.next();
				EngineSize = vehicleFile.next();
				Transmission = vehicleFile.next();
				Mileage = vehicleFile.nextInt();
				NumOfseats = vehicleFile.nextInt();
				RentalStatus = vehicleFile.next();
				RatePerDay = vehicleFile.nextFloat();
				Towingcapacity = vehicleFile.nextInt();
				NumOfHelmets = vehicleFile.nextInt();
				
				//System.out.println("This is user typed in license plate:" + License);
				//System.out.println("This is files license plate:" + LicensePlate);
				
				
				
				if(LicensePlate.equals(License)){
				

					System.out.println("Vehicle Found Successfully!\n");
					
					System.out.println("Type  |  License Plate  |  Brand  |  Model  |  Year  |  Color  |  Engine Size  |  Transmission  |  Mileage  |  # of Seats  |  Rental Status  |  Rate per day  |  Towing Capacity  |  Helmets\n");
					System.out.println(Type + "   |   " + LicensePlate + "        |  " + Brand + "  |  " + Model + "    |  " + Year + "  | " + Color 
							+  "    |  " + EngineSize + "         |   " + Transmission + "            |  " + Mileage + "    |  " + NumOfseats + "           |  " + RentalStatus
							+ "      |   " + RatePerDay + "      |    " + Towingcapacity + "              |   " + NumOfHelmets);
					
					System.out.println("\nDo you wish to Rent this Vehicle? (Yes/No):");
					
					if(count == 3) {
						System.out.println("Sorry you have reached the limit for Renting Vehicles!(Youve rented " + count + " vehicles)\n");
					
					}else if(count < 3) {
					
					count = count + 1;
					
					String schoice = Sinput.next();
					if(schoice.equals("Yes") || schoice.equals("yes")) {
					System.out.println("\nPlease enter your Name:");
					String Name = Sinput.next();
					
					System.out.println("Please enter your Home Address:");
					String homeAddress = Sinput.next();
					
					System.out.println("Please enter your Phone#:");
					String Phone = Sinput.next();
					
					System.out.println("Please enter the Date Borrowed(xx/xx/xxxx):");
					String dateBorrowed = Sinput.next();
					
					System.out.println("Please enter Expected Return Date(xx/xx/xxxx):");
					String ExpReturn = Sinput.next();
					
					String Record = (Name + "\t" + homeAddress + "\t" + Phone + "\t" + dateBorrowed + "\t" + ExpReturn + "\t" + Type + "\t" + LicensePlate + "\t" + Brand + "\t" + Model + "\t" + Year + "\t" + Color 
							+  "\t" + EngineSize + "\t" + Transmission + "\t" + Mileage + "\t" + NumOfseats + "\t" + RentalStatus
							+ "\t" + RatePerDay + "\t" + Towingcapacity + "\t" + NumOfHelmets + "\n");
					
					RentalFile.write(Record);
					
					break;
					}
					
					break;
					}
					}
				
				
				}//loop
				
			vehicleFile.close();
			}else if(searchchoice == 2) { //select by brand
				
				Scanner vehicleFile = new Scanner(new File("vehicles.txt"));
				
				String Type;
				String LicensePlate;
				String Brand;
				String Model;
				int Year;
				String Color;
				String EngineSize;
				String Transmission;
				int Mileage;
				int NumOfseats;
				String RentalStatus;
				float RatePerDay;
				int Towingcapacity;
				int NumOfHelmets;
				
				System.out.println("Please input Brand:");
				String brand = Sinput.next();
				
				while (vehicleFile.hasNext()) {

				Type = vehicleFile.next();
				LicensePlate = vehicleFile.next();
				Brand = vehicleFile.next();
				Model = vehicleFile.next();
				Year = vehicleFile.nextInt();
				Color = vehicleFile.next();
				EngineSize = vehicleFile.next();
				Transmission = vehicleFile.next();
				Mileage = vehicleFile.nextInt();
				NumOfseats = vehicleFile.nextInt();
				RentalStatus = vehicleFile.next();
				RatePerDay = vehicleFile.nextFloat();
				Towingcapacity = vehicleFile.nextInt();
				NumOfHelmets = vehicleFile.nextInt();
				
				if(Brand.equals(brand)){
				

					System.out.println("Vehicle Found Successfully!\n");
					
					System.out.println("Type  |  License Plate  |  Brand  |  Model  |  Year  |  Color  |  Engine Size  |  Transmission  |  Mileage  |  # of Seats  |  Rental Status  |  Rate per day  |  Towing Capacity  |  Helmets\n");
					System.out.println(Type + "   |   " + LicensePlate + "        |  " + Brand + "  |  " + Model + "    |  " + Year + "  | " + Color 
							+  "    |  " + EngineSize + "         |   " + Transmission + "            |  " + Mileage + "    |  " + NumOfseats + "           |  " + RentalStatus
							+ "      |   " + RatePerDay + "      |    " + Towingcapacity + "              |   " + NumOfHelmets);
					
					System.out.println("\nDo you wish to Rent this Vehicle? (Yes/No):");
					
					if(count == 3) {
						System.out.println("Sorry you have reached the limit for Renting Vehicles!(Youve rented " + count + " vehicles)\n");
					
					}else if(count < 3) {
					
					count = count + 1;
					
					String schoice = Sinput.next();
					if(schoice.equals("Yes") || schoice.equals("yes")) {
					System.out.println("\nPlease enter your Name:");
					String Name = Sinput.next();
					
					System.out.println("Please enter your Home Address:");
					String homeAddress = Sinput.next();
					
					System.out.println("Please enter your Phone#:");
					String Phone = Sinput.next();
					
					System.out.println("Please enter the Date Borrowed(xx/xx/xxxx):");
					String dateBorrowed = Sinput.next();
					
					System.out.println("Please enter Expected Return Date(xx/xx/xxxx):");
					String ExpReturn = Sinput.next();
					
					String Record = (Name + "\t" + homeAddress + "\t" + Phone + "\t" + dateBorrowed + "\t" + ExpReturn + "\t" + Type + "\t" + LicensePlate + "\t" + Brand + "\t" + Model + "\t" + Year + "\t" + Color 
							+  "\t" + EngineSize + "\t" + Transmission + "\t" + Mileage + "\t" + NumOfseats + "\t" + RentalStatus
							+ "\t" + RatePerDay + "\t" + Towingcapacity + "\t" + NumOfHelmets + "\n");
					
					RentalFile.write(Record);
					
					break;
					}
					
					break;
					}
					}
			
				}//End Loop
			
				
				vehicleFile.close();
				
			}else if(searchchoice == 3) { //Select by Model
				
				Scanner vehicleFile = new Scanner(new File("vehicles.txt"));
				
				String Type;
				String LicensePlate;
				String Brand;
				String Model;
				int Year;
				String Color;
				String EngineSize;
				String Transmission;
				int Mileage;
				int NumOfseats;
				String RentalStatus;
				float RatePerDay;
				int Towingcapacity;
				int NumOfHelmets;
				
				System.out.println("Please input Model:");
				String model = Sinput.next();
				
				
				while (vehicleFile.hasNext()) {

				Type = vehicleFile.next();
				LicensePlate = vehicleFile.next();
				Brand = vehicleFile.next();
				Model = vehicleFile.next();
				Year = vehicleFile.nextInt();
				Color = vehicleFile.next();
				EngineSize = vehicleFile.next();
				Transmission = vehicleFile.next();
				Mileage = vehicleFile.nextInt();
				NumOfseats = vehicleFile.nextInt();
				RentalStatus = vehicleFile.next();
				RatePerDay = vehicleFile.nextFloat();
				Towingcapacity = vehicleFile.nextInt();
				NumOfHelmets = vehicleFile.nextInt();
				
				if(Model.equals(model)){
				

					System.out.println("Vehicle Found Successfully!\n");
					
					System.out.println("Type  |  License Plate  |  Brand  |  Model  |  Year  |  Color  |  Engine Size  |  Transmission  |  Mileage  |  # of Seats  |  Rental Status  |  Rate per day  |  Towing Capacity  |  Helmets\n");
					System.out.println(Type + "   |   " + LicensePlate + "        |  " + Brand + "  |  " + Model + "    |  " + Year + "  | " + Color 
							+  "    |  " + EngineSize + "         |   " + Transmission + "            |  " + Mileage + "    |  " + NumOfseats + "           |  " + RentalStatus
							+ "      |   " + RatePerDay + "      |    " + Towingcapacity + "              |   " + NumOfHelmets);
					
					System.out.println("\nDo you wish to Rent this Vehicle? (Yes/No):");
					
					if(count == 3) {
						System.out.println("Sorry you have reached the limit for Renting Vehicles!(Youve rented " + count + " vehicles)\n");
					
					}else if(count < 3) {
					
					count = count + 1;
					
					String schoice = Sinput.next();
					if(schoice.equals("Yes") || schoice.equals("yes")) {
					System.out.println("\nPlease enter your Name:");
					String Name = Sinput.next();
					
					System.out.println("Please enter your Home Address:");
					String homeAddress = Sinput.next();
					
					System.out.println("Please enter your Phone#:");
					String Phone = Sinput.next();
					
					System.out.println("Please enter the Date Borrowed(xx/xx/xxxx):");
					String dateBorrowed = Sinput.next();
					
					System.out.println("Please enter Expected Return Date(xx/xx/xxxx):");
					String ExpReturn = Sinput.next();
					
					String Record = (Name + "\t" + homeAddress + "\t" + Phone + "\t" + dateBorrowed + "\t" + ExpReturn + "\t" + Type + "\t" + LicensePlate + "\t" + Brand + "\t" + Model + "\t" + Year + "\t" + Color 
							+  "\t" + EngineSize + "\t" + Transmission + "\t" + Mileage + "\t" + NumOfseats + "\t" + RentalStatus
							+ "\t" + RatePerDay + "\t" + Towingcapacity + "\t" + NumOfHelmets + "\n");
					
					RentalFile.write(Record);
					
					break;
					}
					
					break;
					}
					}
				
				}//End Loop
				vehicleFile.close();
				
			}else if(searchchoice == 4) {//Search by Year
				
				Scanner vehicleFile = new Scanner(new File("vehicles.txt"));
				System.out.println("Please input Year:");
				int year = Sinput.nextInt();
				
				String Type;
				String LicensePlate;
				String Brand;
				String Model;
				int Year;
				String Color;
				String EngineSize;
				String Transmission;
				int Mileage;
				int NumOfseats;
				String RentalStatus;
				float RatePerDay;
				int Towingcapacity;
				int NumOfHelmets;
				
				while (vehicleFile.hasNext()) {

				Type = vehicleFile.next();
				LicensePlate = vehicleFile.next();
				Brand = vehicleFile.next();
				Model = vehicleFile.next();
				Year = vehicleFile.nextInt();
				Color = vehicleFile.next();
				EngineSize = vehicleFile.next();
				Transmission = vehicleFile.next();
				Mileage = vehicleFile.nextInt();
				NumOfseats = vehicleFile.nextInt();
				RentalStatus = vehicleFile.next();
				RatePerDay = vehicleFile.nextFloat();
				Towingcapacity = vehicleFile.nextInt();
				NumOfHelmets = vehicleFile.nextInt();
				
				if(Year == year){
				

					System.out.println("Vehicle Found Successfully!\n");
					
					System.out.println("Type  |  License Plate  |  Brand  |  Model  |  Year  |  Color  |  Engine Size  |  Transmission  |  Mileage  |  # of Seats  |  Rental Status  |  Rate per day  |  Towing Capacity  |  Helmets\n");
					System.out.println(Type + "   |   " + LicensePlate + "        |  " + Brand + "  |  " + Model + "    |  " + Year + "  | " + Color 
							+  "    |  " + EngineSize + "         |   " + Transmission + "            |  " + Mileage + "    |  " + NumOfseats + "           |  " + RentalStatus
							+ "      |   " + RatePerDay + "      |    " + Towingcapacity + "              |   " + NumOfHelmets);
					
					System.out.println("\nDo you wish to Rent this Vehicle? (Yes/No):");
					
					if(count == 3) {
						System.out.println("Sorry you have reached the limit for Renting Vehicles!(Youve rented " + count + " vehicles)\n");
					
					}else if(count < 3) {
					
					count = count + 1;
					
					String schoice = Sinput.next();
					if(schoice.equals("Yes") || schoice.equals("yes")) {
					System.out.println("\nPlease enter your Name:");
					String Name = Sinput.next();
					
					System.out.println("Please enter your Home Address:");
					String homeAddress = Sinput.next();
					
					System.out.println("Please enter your Phone#:");
					String Phone = Sinput.next();
					
					System.out.println("Please enter the Date Borrowed(xx/xx/xxxx):");
					String dateBorrowed = Sinput.next();
					
					System.out.println("Please enter Expected Return Date(xx/xx/xxxx):");
					String ExpReturn = Sinput.next();
					
					String Record = (Name + "\t" + homeAddress + "\t" + Phone + "\t" + dateBorrowed + "\t" + ExpReturn + "\t" + Type + "\t" + LicensePlate + "\t" + Brand + "\t" + Model + "\t" + Year + "\t" + Color 
							+  "\t" + EngineSize + "\t" + Transmission + "\t" + Mileage + "\t" + NumOfseats + "\t" + RentalStatus
							+ "\t" + RatePerDay + "\t" + Towingcapacity + "\t" + NumOfHelmets + "\n");
					
					RentalFile.write(Record);
					
					break;
					}
					
					break;
					}
					}
				
				}//End Loop
			vehicleFile.close();
			}
			
			RentalFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
			}//Select Vehicle
		
		
	return count;
	}

	
	
	
	
	public int searchVehicles(int count) {

		Scanner Sinput = new Scanner(System.in);
				
					try {
					FileWriter RentalFile = new FileWriter("rentalFile.txt",true);
					System.out.println("\nHow Do wish to search for the Vehicle?");
					System.out.println("1) License Plate #");
					System.out.println("2) Brand");
					System.out.println("3) Model");
					System.out.println("4) Year");
					System.out.print(">");
					
					//Selecting Vehicle by Choice
					int searchchoice = Sinput.nextInt();
					
					if(searchchoice == 1) { //Select by License Plate
						
						String Type;
						String LicensePlate;
						String Brand;
						String Model;
						int Year;
						String Color;
						String EngineSize;
						String Transmission;
						int Mileage;
						int NumOfseats;
						String RentalStatus;
						float RatePerDay;
						int Towingcapacity;
						int NumOfHelmets;
						
						Scanner vehicleFile = new Scanner(new File("vehicles.txt"));
						
						System.out.println("Please input License Plate #:");
						String License = Sinput.next();
						
						while (vehicleFile.hasNext()) {

						Type = vehicleFile.next();
						LicensePlate = vehicleFile.next();
						Brand = vehicleFile.next();
						Model = vehicleFile.next();
						Year = vehicleFile.nextInt();
						Color = vehicleFile.next();
						EngineSize = vehicleFile.next();
						Transmission = vehicleFile.next();
						Mileage = vehicleFile.nextInt();
						NumOfseats = vehicleFile.nextInt();
						RentalStatus = vehicleFile.next();
						RatePerDay = vehicleFile.nextFloat();
						Towingcapacity = vehicleFile.nextInt();
						NumOfHelmets = vehicleFile.nextInt();
						
						//System.out.println("This is user typed in license plate:" + License);
						//System.out.println("This is files license plate:" + LicensePlate);
						
						
						
						if(LicensePlate.equals(License)){
						
						System.out.println("Vehicle Found Successfully!\n");
							
						System.out.println("Type  |  License Plate  |  Brand  |  Model  |  Year  |  Color  |  Engine Size  |  Transmission  |  Mileage  |  # of Seats  |  Rental Status  |  Rate per day  |  Towing Capacity  |  Helmets\n");
						System.out.println(Type + "   |   " + LicensePlate + "        |  " + Brand + "  |  " + Model + "    |  " + Year + "  | " + Color 
								+  "    |  " + EngineSize + "         |   " + Transmission + "            |  " + Mileage + "    |  " + NumOfseats + "           |  " + RentalStatus
								+ "      |   " + RatePerDay + "      |    " + Towingcapacity + "              |   " + NumOfHelmets);
						
						System.out.println("\nDo you wish to Rent this Vehicle? (Yes/No):");
						
						if(count == 3) {
							System.out.println("Sorry you have reached the limit for Renting Vehicles!(Youve rented " + count + " vehicles)\n");
						
						}else if(count < 3) {
						
						count = count + 1;
						
						String schoice = Sinput.next();
						if(schoice.equals("Yes") || schoice.equals("yes")) {
						System.out.println("\nPlease enter your Name:");
						String Name = Sinput.next();
						
						System.out.println("Please enter your Home Address:");
						String homeAddress = Sinput.next();
						
						System.out.println("Please enter your Phone#:");
						String Phone = Sinput.next();
						
						System.out.println("Please enter the Date Borrowed(xx/xx/xxxx):");
						String dateBorrowed = Sinput.next();
						
						System.out.println("Please enter Expected Return Date(xx/xx/xxxx):");
						String ExpReturn = Sinput.next();
						
						String Record = (Name + "\t" + homeAddress + "\t" + Phone + "\t" + dateBorrowed + "\t" + ExpReturn + "\t" + Type + "\t" + LicensePlate + "\t" + Brand + "\t" + Model + "\t" + Year + "\t" + Color 
								+  "\t" + EngineSize + "\t" + Transmission + "\t" + Mileage + "\t" + NumOfseats + "\t" + RentalStatus
								+ "\t" + RatePerDay + "\t" + Towingcapacity + "\t" + NumOfHelmets + "\n");
						
						RentalFile.write(Record);
						
						break;
						}
						
						break;
						}
						}
						
						}//loop
						
					vehicleFile.close();
					}else if(searchchoice == 2) { //select by brand
						
						Scanner vehicleFile = new Scanner(new File("vehicles.txt"));
						
						String Type;
						String LicensePlate;
						String Brand;
						String Model;
						int Year;
						String Color;
						String EngineSize;
						String Transmission;
						int Mileage;
						int NumOfseats;
						String RentalStatus;
						float RatePerDay;
						int Towingcapacity;
						int NumOfHelmets;
						
						System.out.println("Please input Brand:");
						String brand = Sinput.next();
						
						while (vehicleFile.hasNext()) {

						Type = vehicleFile.next();
						LicensePlate = vehicleFile.next();
						Brand = vehicleFile.next();
						Model = vehicleFile.next();
						Year = vehicleFile.nextInt();
						Color = vehicleFile.next();
						EngineSize = vehicleFile.next();
						Transmission = vehicleFile.next();
						Mileage = vehicleFile.nextInt();
						NumOfseats = vehicleFile.nextInt();
						RentalStatus = vehicleFile.next();
						RatePerDay = vehicleFile.nextFloat();
						Towingcapacity = vehicleFile.nextInt();
						NumOfHelmets = vehicleFile.nextInt();
						
						if(Brand.equals(brand)){
						
							System.out.println("Vehicle Found Successfully!\n");
							
							System.out.println("Type  |  License Plate  |  Brand  |  Model  |  Year  |  Color  |  Engine Size  |  Transmission  |  Mileage  |  # of Seats  |  Rental Status  |  Rate per day  |  Towing Capacity  |  Helmets\n");
							System.out.println(Type + "   |   " + LicensePlate + "        |  " + Brand + "  |  " + Model + "    |  " + Year + "  | " + Color 
									+  "    |  " + EngineSize + "         |   " + Transmission + "            |  " + Mileage + "    |  " + NumOfseats + "           |  " + RentalStatus
									+ "      |   " + RatePerDay + "      |    " + Towingcapacity + "              |   " + NumOfHelmets);
							
							System.out.println("\nDo you wish to Rent this Vehicle? (Yes/No):");
							
							if(count == 3) {
								System.out.println("Sorry you have reached the limit for Renting Vehicles!(Youve rented " + count + " vehicles)\n");
							
							}else if(count < 3) {
							
							count = count + 1;
							
							String schoice = Sinput.next();
							if(schoice.equals("Yes") || schoice.equals("yes")) {
							System.out.println("\nPlease enter your Name:");
							String Name = Sinput.next();
							
							System.out.println("Please enter your Home Address:");
							String homeAddress = Sinput.next();
							
							System.out.println("Please enter your Phone#:");
							String Phone = Sinput.next();
							
							System.out.println("Please enter the Date Borrowed(xx/xx/xxxx):");
							String dateBorrowed = Sinput.next();
							
							System.out.println("Please enter Expected Return Date(xx/xx/xxxx):");
							String ExpReturn = Sinput.next();
							
							String Record = (Name + "\t" + homeAddress + "\t" + Phone + "\t" + dateBorrowed + "\t" + ExpReturn + "\t" + Type + "\t" + LicensePlate + "\t" + Brand + "\t" + Model + "\t" + Year + "\t" + Color 
									+  "\t" + EngineSize + "\t" + Transmission + "\t" + Mileage + "\t" + NumOfseats + "\t" + RentalStatus
									+ "\t" + RatePerDay + "\t" + Towingcapacity + "\t" + NumOfHelmets + "\n");
							
							RentalFile.write(Record);
							
							break;
							}
							
							break;
							}
							}
							
					
						}//End Loop
					
						
						vehicleFile.close();
						
					}else if(searchchoice == 3) { //Select by Model
						
						Scanner vehicleFile = new Scanner(new File("vehicles.txt"));
						
						String Type;
						String LicensePlate;
						String Brand;
						String Model;
						int Year;
						String Color;
						String EngineSize;
						String Transmission;
						int Mileage;
						int NumOfseats;
						String RentalStatus;
						float RatePerDay;
						int Towingcapacity;
						int NumOfHelmets;
						
						System.out.println("Please input Model:");
						String model = Sinput.next();
						
						
						while (vehicleFile.hasNext()) {

						Type = vehicleFile.next();
						LicensePlate = vehicleFile.next();
						Brand = vehicleFile.next();
						Model = vehicleFile.next();
						Year = vehicleFile.nextInt();
						Color = vehicleFile.next();
						EngineSize = vehicleFile.next();
						Transmission = vehicleFile.next();
						Mileage = vehicleFile.nextInt();
						NumOfseats = vehicleFile.nextInt();
						RentalStatus = vehicleFile.next();
						RatePerDay = vehicleFile.nextFloat();
						Towingcapacity = vehicleFile.nextInt();
						NumOfHelmets = vehicleFile.nextInt();
						
						if(Model.equals(model)){
						
							System.out.println("Vehicle Found Successfully!\n");
							
							System.out.println("Type  |  License Plate  |  Brand  |  Model  |  Year  |  Color  |  Engine Size  |  Transmission  |  Mileage  |  # of Seats  |  Rental Status  |  Rate per day  |  Towing Capacity  |  Helmets\n");
							System.out.println(Type + "   |   " + LicensePlate + "        |  " + Brand + "  |  " + Model + "    |  " + Year + "  | " + Color 
									+  "    |  " + EngineSize + "         |   " + Transmission + "            |  " + Mileage + "    |  " + NumOfseats + "           |  " + RentalStatus
									+ "      |   " + RatePerDay + "      |    " + Towingcapacity + "              |   " + NumOfHelmets);
							
							System.out.println("\nDo you wish to Rent this Vehicle? (Yes/No):");
							
							if(count == 3) {
								System.out.println("Sorry you have reached the limit for Renting Vehicles!(Youve rented " + count + " vehicles)\n");
							
							}else if(count < 3) {
							
							count = count + 1;
							
							String schoice = Sinput.next();
							if(schoice.equals("Yes") || schoice.equals("yes")) {
							System.out.println("\nPlease enter your Name:");
							String Name = Sinput.next();
							
							System.out.println("Please enter your Home Address:");
							String homeAddress = Sinput.next();
							
							System.out.println("Please enter your Phone#:");
							String Phone = Sinput.next();
							
							System.out.println("Please enter the Date Borrowed(xx/xx/xxxx):");
							String dateBorrowed = Sinput.next();
							
							System.out.println("Please enter Expected Return Date(xx/xx/xxxx):");
							String ExpReturn = Sinput.next();
							
							String Record = (Name + "\t" + homeAddress + "\t" + Phone + "\t" + dateBorrowed + "\t" + ExpReturn + "\t" + Type + "\t" + LicensePlate + "\t" + Brand + "\t" + Model + "\t" + Year + "\t" + Color 
									+  "\t" + EngineSize + "\t" + Transmission + "\t" + Mileage + "\t" + NumOfseats + "\t" + RentalStatus
									+ "\t" + RatePerDay + "\t" + Towingcapacity + "\t" + NumOfHelmets + "\n");
							
							RentalFile.write(Record);
							
							break;
							}
							
							break;
							}
							}
							
						}//End Loop
						vehicleFile.close();
						
					}else if(searchchoice == 4) {//Search by Year
						
						Scanner vehicleFile = new Scanner(new File("vehicles.txt"));
						System.out.println("Please input Year:");
						int year = Sinput.nextInt();
						
						String Type;
						String LicensePlate;
						String Brand;
						String Model;
						int Year;
						String Color;
						String EngineSize;
						String Transmission;
						int Mileage;
						int NumOfseats;
						String RentalStatus;
						float RatePerDay;
						int Towingcapacity;
						int NumOfHelmets;
						
						while (vehicleFile.hasNext()) {

						Type = vehicleFile.next();
						LicensePlate = vehicleFile.next();
						Brand = vehicleFile.next();
						Model = vehicleFile.next();
						Year = vehicleFile.nextInt();
						Color = vehicleFile.next();
						EngineSize = vehicleFile.next();
						Transmission = vehicleFile.next();
						Mileage = vehicleFile.nextInt();
						NumOfseats = vehicleFile.nextInt();
						RentalStatus = vehicleFile.next();
						RatePerDay = vehicleFile.nextFloat();
						Towingcapacity = vehicleFile.nextInt();
						NumOfHelmets = vehicleFile.nextInt();
						
						if(Year == year){
						

							System.out.println("Vehicle Found Successfully!\n");
							
							System.out.println("Type  |  License Plate  |  Brand  |  Model  |  Year  |  Color  |  Engine Size  |  Transmission  |  Mileage  |  # of Seats  |  Rental Status  |  Rate per day  |  Towing Capacity  |  Helmets\n");
							System.out.println(Type + "   |   " + LicensePlate + "        |  " + Brand + "  |  " + Model + "    |  " + Year + "  | " + Color 
									+  "    |  " + EngineSize + "         |   " + Transmission + "            |  " + Mileage + "    |  " + NumOfseats + "           |  " + RentalStatus
									+ "      |   " + RatePerDay + "      |    " + Towingcapacity + "              |   " + NumOfHelmets);
							
							System.out.println("\nDo you wish to Rent this Vehicle? (Yes/No):");
							
							if(count == 3) {
								System.out.println("Sorry you have reached the limit for Renting Vehicles!(Youve rented " + count + " vehicles)\n");
							
							}else if(count < 3) {
							
							count = count + 1;
							
							String schoice = Sinput.next();
							if(schoice.equals("Yes") || schoice.equals("yes")) {
							System.out.println("\nPlease enter your Name:");
							String Name = Sinput.next();
							
							System.out.println("Please enter your Home Address:");
							String homeAddress = Sinput.next();
							
							System.out.println("Please enter your Phone#:");
							String Phone = Sinput.next();
							
							System.out.println("Please enter the Date Borrowed(xx/xx/xxxx):");
							String dateBorrowed = Sinput.next();
							
							System.out.println("Please enter Expected Return Date(xx/xx/xxxx):");
							String ExpReturn = Sinput.next();
							
							String Record = (Name + "\t" + homeAddress + "\t" + Phone + "\t" + dateBorrowed + "\t" + ExpReturn + "\t" + Type + "\t" + LicensePlate + "\t" + Brand + "\t" + Model + "\t" + Year + "\t" + Color 
									+  "\t" + EngineSize + "\t" + Transmission + "\t" + Mileage + "\t" + NumOfseats + "\t" + RentalStatus
									+ "\t" + RatePerDay + "\t" + Towingcapacity + "\t" + NumOfHelmets + "\n");
							
							RentalFile.write(Record);
							
							break;
							}
							
							break;
							}
							}
						
						}//End Loop
					vehicleFile.close();
					}
					
					RentalFile.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				
					return count;
		}
	
	public int myRentals(int count) {
		
		Scanner Sinput = new Scanner(System.in);
		try {
			
			Scanner returnFile = new Scanner(new File("rentalFile.txt"));
			String Name;
			String Address;
			String Phone;
			String DateBorrowed;
			String ExpReturn;
			String Type;
			String LicensePlate;
			String Brand;
			String Model;
			int Year;
			String Color;
			String EngineSize;
			String Transmission;
			int Mileage;
			int NumOfseats;
			String RentalStatus;
			float RatePerDay;
			int Towingcapacity;
			int NumOfHelmets;
			
			System.out.println("Type  |  License Plate  |  Brand  |  Model  |  Year  |  Color  |  Engine Size  |  Transmission  |  Mileage  |  # of Seats  |  Rental Status  |  Rate per day  |  Towing Capacity  |  Helmets");
		
			while (returnFile.hasNext()) {
				Name = returnFile.next();
				Address = returnFile.next();
				Phone = returnFile.next();
				DateBorrowed = returnFile.next();
				ExpReturn = returnFile.next();
				Type = returnFile.next();
				LicensePlate = returnFile.next();
				Brand = returnFile.next();
				Model = returnFile.next();
				Year = returnFile.nextInt();
				Color = returnFile.next();
				EngineSize = returnFile.next();
				Transmission = returnFile.next();
				Mileage = returnFile.nextInt();
				NumOfseats = returnFile.nextInt();
				RentalStatus = returnFile.next();
				RatePerDay = returnFile.nextFloat();
				Towingcapacity = returnFile.nextInt();
				NumOfHelmets = returnFile.nextInt();

				System.out.println(Type + "   |   " + LicensePlate + "        |  " + Brand + "  |  " + Model + "    |  " + Year + "  | " + Color 
						+  "    |  " + EngineSize + "         |   " + Transmission + "            |  " + Mileage + "    |  " + NumOfseats + "           |  " + RentalStatus
						+ "      |   " + RatePerDay + "      |    " + Towingcapacity + "              |   " + NumOfHelmets);
			}
			
		returnFile.close();
		}catch (FileNotFoundException ex) {
			
			ex.printStackTrace();
		}
	return count;
	}
	
	
	public int returnVehicle(int count) {
		
		Scanner Sinput = new Scanner(System.in);
		String Name;
		String Address;
		String Phone;
		String DateBorrowed;
		String ExpReturn;
		String Type;
		String LicensePlate;
		String Brand;
		String Model;
		int Year;
		String Color;
		String EngineSize;
		String Transmission;
		int Mileage;
		int NumOfseats;
		String RentalStatus;
		float RatePerDay;
		int Towingcapacity;
		int NumOfHelmets;
		
		Scanner returnFile;
	
		try {
			
			returnFile = new Scanner(new File("rentalFile.txt"));
		
		System.out.println("Please input License Plate #:");
		String License = Sinput.next();
		
		while (returnFile.hasNext()) {

			Name = returnFile.next();
			Address = returnFile.next();
			Phone = returnFile.next();
			DateBorrowed = returnFile.next();
			ExpReturn = returnFile.next();
			Type = returnFile.next();
			LicensePlate = returnFile.next();
			Brand = returnFile.next();
			Model = returnFile.next();
			Year = returnFile.nextInt();
			Color = returnFile.next();
			EngineSize = returnFile.next();
			Transmission = returnFile.next();
			Mileage = returnFile.nextInt();
			NumOfseats = returnFile.nextInt();
			RentalStatus = returnFile.next();
			RatePerDay = returnFile.nextFloat();
			Towingcapacity = returnFile.nextInt();
			NumOfHelmets = returnFile.nextInt();
		
		//System.out.println("This is user typed in license plate:" + License);
		//System.out.println("This is files license plate:" + LicensePlate);
		
		
		
		if(LicensePlate.equals(License)){
		
		System.out.println("Vehicle Found Successfully!\n");
			
		System.out.println("License Plate   |   Actual Return Date  |  Mileage  |  ");
		System.out.println(LicensePlate + "          |     " +  ExpReturn + "          |   " + Mileage + "   |\n" );
		break;
		
		}
		
		}//Loop
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return count;
	}

		
}
