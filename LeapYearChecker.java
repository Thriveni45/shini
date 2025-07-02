// LeapYearChecker.java
public class LeapYearChecker {
    private int year;

    // Constructor
    public LeapYearChecker(int year) {
        this.year = year;
    }

    // Method to check if it's a leap year
    public boolean isLeapYear() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Method to display result
    public void displayResult() {
        if (isLeapYear()) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // Main method
    public static void main(String[] args) {
        LeapYearChecker year1 = new LeapYearChecker(2024);  // You can change this value
        year1.displayResult();
    }
}