/*Group Members
 * Daniel Collins -  1501375
`* Shemar Williams – 1704317
 * Dana-Lee Powell – 1800995
*/
package CarRental;

public class Rental_Info {

	private Date ActualReturnDate;
    private Date ExpectedReturnDate;
    private int CurrentMileage;
    private int LicensePlateNumber;
    private int DaysBorrowed;


    public Rental_Info() {
	
    }
    
    public Rental_Info(Date actualReturnDate, Date expectedReturnDate, int currentMileage, int licensePlateNumber,
            int daysBorrowed) {
        ActualReturnDate = actualReturnDate;
        ExpectedReturnDate = expectedReturnDate;
        CurrentMileage = currentMileage;
        LicensePlateNumber = licensePlateNumber;
        DaysBorrowed = daysBorrowed;
    }

    public Date getActualReturnDate() {
        return ActualReturnDate;
    }

    public void setActualReturnDate(Date actualReturnDate) {
        ActualReturnDate = actualReturnDate;
    }

    public Date getExpectedReturnDate() {
        return ExpectedReturnDate;
    }

    public void setExpectedReturnDate(Date expectedReturnDate) {
        ExpectedReturnDate = expectedReturnDate;
    }

    public int getCurrentMileage() {
        return CurrentMileage;
    }

    public void setCurrentMileage(int currentMileage) {
        CurrentMileage = currentMileage;
    }

    public int getLicensePlateNumber() {
        return LicensePlateNumber;
    }

    public void setLicensePlateNumber(int licensePlateNumber) {
        LicensePlateNumber = licensePlateNumber;
    }

    public int getDaysBorrowed() {
        return DaysBorrowed;
    }

    public void setDaysBorrowed(int daysBorrowed) {
        DaysBorrowed = daysBorrowed;
    }

	

}
