package blairhacks;


	/** *Represents a date on the Gregorian Calendar. *A MyCalendar object holds:

	-the day (int) of the month, with 1 representing the first of the month
	-the month (int) of the year, with 1 representing January
	-the year (int), with 1970 representing 1970 CE *All numbers are indexed from 1. *A MyCalendar object is Comparable, and also has an after() and before() method.
	*

	*AoA Exercise 01: Fish Street *2/18/2019 * *@author Bracklinn Williams */ 
public class MyCalendar implements Comparable<MyCalendar> { 
	private int day; private int month; private int year;

	//constructors
	public MyCalendar(int d, int m, int y) { //month as a number
		day = d;
		month = m;
		year = y;
	}
	public MyCalendar(int d, String m, int y) { //month as a 3 letter string, eg "jan"
		day = d;
		year = y;
		switch (m.toLowerCase()) {
			case "jan": month = 1;
				break;
			case "feb": month = 2;
				break;
			case "mar": month = 3;
				break;
			case "apr": month = 4;
				break;
			case "may": month = 5;
				break;
			case "jun": month = 6;
				break;
			case "jul": month = 7;
				break;
			case "aug": month = 8;
				break;
			case "sep": month = 9;
				break;
			case "oct": month = 10;
				break;
			case "nov": month = 11;
				break;
			case "dec": month = 12;
				break;
			case "january": month = 1;
				break;
			case "february": month = 2;
				break;
			case "march": month = 3;
				break;
			case "april": month = 4;
				break;
			case "june": month = 6;
				break;
			case "july": month = 7;
				break;
			case "august": month = 8;
				break;
			case "september": month = 9;
				break;
			case "october": month = 10;
				break;
			case "november": month = 11;
				break;
			case "december": month = 12;
				break;
			default:    month = 0;
				break;
		}
	}
	public MyCalendar(int m, int y) {
		this(1, m, y);
	}
	public MyCalendar(String m, int y) {
		this(1, m, y);
	}
	public MyCalendar(int y) {
		this(1, 1, y);
	}
	/**
	* Default constructor of January 1st, 1970
	*
	* @author bracklinn-williams
	*/
	public MyCalendar() {
		this(1, 1, 1970);
	}

	//setters
	public void setDay(int d) {
		day = d;
	}
	public void setMonth(int m) {
		month = m;
	}
	public void setMonth(String m) {
		switch (m.toLowerCase()) {
			case "jan": month = 1;
				break;
			case "feb": month = 2;
				break;
			case "mar": month = 3;
				break;
			case "apr": month = 4;
				break;
			case "may": month = 5;
				break;
			case "jun": month = 6;
				break;
			case "jul": month = 7;
				break;
			case "aug": month = 8;
				break;
			case "sep": month = 9;
				break;
			case "oct": month = 10;
				break;
			case "nov": month = 11;
				break;
			case "dec": month = 12;
				break;
			case "january": month = 1;
				break;
			case "february": month = 2;
				break;
			case "march": month = 3;
				break;
			case "april": month = 4;
				break;
			case "june": month = 6;
				break;
			case "july": month = 7;
				break;
			case "august": month = 8;
				break;
			case "september": month = 9;
				break;
			case "october": month = 10;
				break;
			case "november": month = 11;
				break;
			case "december": month = 12;
				break;
			default:    month = 0;
				break;
		}
	}
	public void setYear(int y) {
		year = y;
	}

	//getters
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	/**
	* Returns the month as a three letter abbreviation (eg "jan" or "feb")
	* @author bracklinn-williams
	* @return a String, three letters long, to represent the month
	*/
	public String getMonthShort() {
		switch (month) {
			case 1: return "Jan";
			case 2: return "Feb";
			case 3: return "Mar";
			case 4: return "Apr";
			case 5: return "May";
			case 6: return "Jun";
			case 7: return "Jul";
			case 8: return "Aug";
			case 9: return "Sep";
			case 10: return "Oct";
			case 11: return "Nov";
			case 12: return "Dec";
			default: return "Jan";
		}
	}
	/**
	* Returns the month as a String
	* @author bracklinn-williams
	* @return a String of the name of the month
	*/
	public String getMonthLong() {
		switch (month) {
			case 1: return "January";
			case 2: return "February";
			case 3: return "March";
			case 4: return "April";
			case 5: return "May";
			case 6: return "June";
			case 7: return "July";
			case 8: return "August";
			case 9: return "September";
			case 10: return "October";
			case 11: return "November";
			case 12: return "December";
			default: return "January";
		}
	}
	/**
	* Returns the date in DD MMM YYYY format (eg 01 Jan 1970)
	* @author bracklinn-williams
	* @return a String, of length 11, with the date
	*/
	public String toString() {
		String d = String.valueOf(this.getDay());
		if (d.length() == 1) {
			d = "0" + d;
		}
		return String.valueOf(d + " " + getMonthShort() + " " 
				+ String.valueOf(this.getYear()));
	}

	/**
	* Compares this and another MyCalendar date
	* Orders the two chronologically.
	*
	* @author bracklinn-williams
	* @param MyCalendar other to compare to this one
	* @return 1 if this date comes after other, -1 if this one comes before other, 0 if they are the same day.
	*/
	public int compareTo(MyCalendar other) {
		if (this.getYear() < other.getYear()) {
			return -1;
		} else if (this.getYear() > other.getYear()) {
			return 1;
		} else {
			if (this.getMonth() < other.getMonth()) {
				return -1;
			} else if (this.getMonth() > other.getMonth()) {
				return 1;
			} else {
				if (this.getDay() < other.getDay()) {
					return -1;
				} else if (this.getDay() > other.getDay()) {
					return 1;
				} else {
					return 0;
				}
			}
		}
	}
	/**
	* Compares this and another MyCalendar date.
	* Returns true if this MyCalendar date comes before another MyCalendar date passed in.
	*
	* @author bracklinn-williams
	* @param MyCalendar other, to compare to this one
	* @return true if this MyCalendar date is earlier than other, false if this one is later or the same day
	*/
	public boolean before(MyCalendar other) {
		if (this.compareTo(other) == -1) {
			return true;
		} else {
			return false;
		}
	}
	/**
	* Compares this and another MyCalendar date.
	* Returns true if this MyCalendar date comes after another MyCalendar date passed in.
	*
	* @author bracklinn-williams
	* @param MyCalendar other, to compare to this one
	* @return true if this MyCalendar date is later than other, false if this one is earlier or the same day
	*/
	public boolean after(MyCalendar other) {
		if (this.compareTo(other) == 1) {
			return true;
		} else {
			return false;
		}
	}


	}

