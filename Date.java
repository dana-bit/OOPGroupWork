/*Group Members
 * Daniel Collins -  1501375
`* Shemar Williams – 1704317
 * Dana-Lee Powell – 1800995
*/
package CarRental;

public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date() {
		// TODO Auto-generated constructor stub
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void Display() {
		System.out.print(day+ "-" + month + "-" + year);
	}
}
