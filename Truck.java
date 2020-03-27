/*Group Members
 * Daniel Collins -  1501375
`* Shemar Williams – 1704317
 * Dana-Lee Powell – 1800995
*/
package CarRental;

public class Truck extends Vehicle{

	private int towingCapacity;
	
	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public Truck(String licensePlate, String brand, String model, int year, String color, String engineSize,
			String transmission, int mileage, int numOfseats, String rentalStatus, float ratePerDay,String type,int towingCapacity) {
		super(licensePlate, brand, model, year, color, engineSize, transmission, mileage, numOfseats, rentalStatus, ratePerDay, type);
		this.towingCapacity = towingCapacity;
		// TODO Auto-generated constructor stub
	}

	public int getTowingCapacity() {
		return towingCapacity;
	}

	public void setTowingCapacity(int towingCapacity) {
		this.towingCapacity = towingCapacity;
	}


	
}
