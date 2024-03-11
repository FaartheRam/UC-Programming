import java.util.Scanner;
public class BirthDateTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Use the getRangedInt method to input the year (1950-2015), month (1-12),
        Day*, hours (1 – 24), Minutes (1-59) of a person’s birth.

        Note: use a switch() conditional selector structure to limit the user 
        to the correct number of days for the month they were born in.
        For instance if they were born in Feb [1-29], Oct [1-31].  
        HINT: there are only a few groups here not 12 different ones!
        
        31: January, March, May, July, August, October, December
        30: April, June, September, November
        28: Feb (sometimes 29 for leap year)
        */
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter a year", 1950, 2015); // limit to 1950-2015
        int month = SafeInput.getRangedInt(in, "Enter a month", 1, 12); // limit to 1-12
        int dayOfMonth;
        boolean isLeapYear = false; // set leapyear to false
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) { // every 4 years - leap year
            isLeapYear = true; // set boolean to true
        }
        switch (month) {
            case 2: // feb
                dayOfMonth = 28; // normally 28
                if (isLeapYear) { // feb leap year
                    dayOfMonth = 29; // add extra day
                }
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                dayOfMonth = 30; // set to 30 days
                break;
            default:
                dayOfMonth = 31; // everything else is 31
                break;
        }

        int day = SafeInput.getRangedInt(in, "Enter a day", 1, dayOfMonth); // set input to variable - limit to 1 - days we set
        int hours = SafeInput.getRangedInt(in, "Enter hours", 1, 24); // set input to variable - limit to 1 - 24
        int minutes = SafeInput.getRangedInt(in, "Enter minutes", 1, 59); // set input to variable - limit to 1 - 59
        System.out.printf("\nYou were born on %d/%d/%d at %d:%d.\n", month, day, year, hours, minutes); // output to user
    }
}