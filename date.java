import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class date{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a date(yyyy-mm-dd) :");
		String input = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(input,formatter);
		DayOfWeek w = date.getDayOfWeek();
		System.out.println("Day of week :"+w);
		
	}
}