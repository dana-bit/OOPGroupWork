/*Group Members
 * Daniel Collins -  1501375
`* Shemar Williams – 1704317
 * Dana-Lee Powell – 1800995
*/
package CarRental;

public class Vehicle {

	private String LicensePlate;
	private String Brand;
	private String Model;
	private int Year;
	private String Color;
	private String EngineSize;
	private String Transmission;
	private int mileage;
	private int numOfseats;
	private String rentalStatus;
	private float RatePerDay;
	private String Type;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	

	public Vehicle(String licensePlate, String brand, String model, int year, String color, String engineSize,
			String transmission, int mileage, int numOfseats, String rentalStatus, float ratePerDay, String type) {
		super();
		LicensePlate = licensePlate;
		Brand = brand;
		Model = model;
		Year = year;
		Color = color;
		EngineSize = engineSize;
		Transmission = transmission;
		this.mileage = mileage;
		this.numOfseats = numOfseats;
		this.rentalStatus = rentalStatus;
		RatePerDay = ratePerDay;
		Type = type;
	}



	public String getType() {
		return Type;
	}



	public void setType(String type) {
		Type = type;
	}



	public String getLicensePlate() {
		return LicensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		LicensePlate = licensePlate;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getEngineSize() {
		return EngineSize;
	}

	public void setEngineSize(String engineSize) {
		EngineSize = engineSize;
	}

	public String getTransmission() {
		return Transmission;
	}

	public void setTransmission(String transmission) {
		Transmission = transmission;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getNumOfseats() {
		return numOfseats;
	}

	public void setNumOfseats(int numOfseats) {
		this.numOfseats = numOfseats;
	}

	public String getRentalStatus() {
		return rentalStatus;
	}

	public void setRentalStatus(String rentalStatus) {
		this.rentalStatus = rentalStatus;
	}

	public float getRatePerDay() {
		return RatePerDay;
	}

	public void setRatePerDay(float ratePerDay) {
		RatePerDay = ratePerDay;
	}

	
	
}
