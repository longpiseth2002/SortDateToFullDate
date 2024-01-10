package shortDateToFullDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MidTerm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;

        do {
            System.out.print("Enter a short date (YYYY-MM-DD): ");
            String shortDate = scanner.nextLine();

            try {
                SimpleDateFormat dateSort = new SimpleDateFormat("yyyy-MM-dd");
                Date date = dateSort.parse(shortDate);

                SimpleDateFormat fullDateFormat = new SimpleDateFormat("MMMM dd, yyyy");
                String fullDate = fullDateFormat.format(date);

                System.out.println("\nSort Date : " + dateSort.format(date));
                System.out.println("Full Date : " + fullDate);

                check = false;

            } catch (ParseException e) {
                System.out.println("Invalid date format. Please enter date in the format YYYY-MM-DD.");
            }
        } while (check);

        scanner.close();
    }
}


