import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class DOB {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your birthdate (format: YYYY-MM-DD):");
        String date = obj.nextLine();

        // Using a specific DateTimeFormatter for validation
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = null;

        try {
            birthDate = LocalDate.parse(date, formatter);
            System.out.println("Valid Date: " + birthDate);
        } catch (Exception e) {
            System.out.println("Invalid Date");
            return; // Exit if the date is invalid
        }

        // Calculate age
        LocalDate current = LocalDate.now();
        int age = current.getYear() - birthDate.getYear();
        if (current.getDayOfYear() < birthDate.getDayOfYear()) {
            age--; // Adjust if birthday hasn't occurred yet this year
        }
        System.out.println("Your age is " + age);

        // Find day, month, year
        System.out.println("Day: " + birthDate.getDayOfMonth());
        System.out.println("Month: " + birthDate.getMonthValue());
        System.out.println("Year: " + birthDate.getYear());

        // Yesterday and tomorrow date
        System.out.println("Yesterday: " + birthDate.minusDays(1));
        System.out.println("Tomorrow: " + birthDate.plusDays(1));

        // Leap year check
        System.out.println("Is your birth year a leap year? " + birthDate.isLeapYear());

        // Day of the year
        System.out.println("Day of year: " + birthDate.getDayOfYear());

        // Check if today is your birthday
        if (birthDate.getMonthValue() == current.getMonthValue() &&
            birthDate.getDayOfMonth() == current.getDayOfMonth()) {
            System.out.println("Happy birthday!");
        }

        // Reminder (one week before birthday)
        System.out.println("Reminder (one week before): " + birthDate.minusDays(7));
    }
}
