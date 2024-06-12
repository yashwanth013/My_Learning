package Java;

import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateTime);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateTime.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
