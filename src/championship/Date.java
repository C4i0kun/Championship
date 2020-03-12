/*
 * Caio de Souza Barbosa Costa - NUSP: 11257734
 * Lucas Rodrigues Cupertino Cardoso - NUSP: 11257543
 * 
 */

package championship;

public class Date {
	private int day;
	private int month;
	private int year;
	
	/* Constructor */
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	/* Getters and Setters*/
	
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
	
	/* Static functions */
	
	public static boolean datePassed(Date date, Date today) {
		if (today.getYear() > date.getYear()) {
			return true;
		} else if (today.getYear() < date.getYear()) {
			return false;
		} else {
			if (today.getMonth() > date.getMonth()) {
				return true;
			} else if (today.getMonth() < date.getMonth()) {
				return false;
			} else {
				if (today.getDay() > date.getDay()) {
					return true;
				} else if (today.getDay() < date.getDay()) {
					return false;
				} else {
					return true; /* Imagine it's the end of the day */
				}
			}
		}
	}
}
