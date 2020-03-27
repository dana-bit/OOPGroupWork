/*Group Members
 * Daniel Collins -  1501375
`* Shemar Williams – 1704317
 * Dana-Lee Powell – 1800995

*/
package CarRental;

public class Bike extends Vehicle {

	private int NumberOfHelmets;
	
	public Bike() {
		// TODO Auto-generated constructor stub
	}
	

    public Bike(String licensePlate, String brand, String model, int year, String color, String engineSize,
            String transmission, int mileage, int numOfseats, String rentalStatus, float ratePerDay,String type,
            int numberOfHelmets) {
        super(licensePlate, brand, model, year, color, engineSize, transmission, mileage, numOfseats, rentalStatus,
                ratePerDay, type);
        NumberOfHelmets = numberOfHelmets;
    }

    public int getNumberOfHelmets() {
        return NumberOfHelmets;
    }

    public void setNumberOfHelmets(int numberOfHelmets) {
        NumberOfHelmets = numberOfHelmets;
    }
}
