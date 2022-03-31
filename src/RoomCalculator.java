import java.util.Scanner;

public class RoomCalculator {
	public static void main(String[] args) {

		System.out.println("What is the length of the room?");
		Scanner scanner = new Scanner(System.in);
		double length = scanner.nextDouble();

		System.out.println("What is the width of the room?");
		double width = scanner.nextDouble();
		
		System.out.println("What is the height of the room?");
		double height = scanner.nextDouble();

		double area = width * length;
		System.out.println("The area of the room is " + area);

		double perimeter = (2 * length) + (2 * width);
		System.out.println("The perimeter of the room is " + perimeter);
		
		double volume = width * length * height;
		System.out.println("The area of the room is " + volume);
		
		System.out.println("Do you want to measure another room?");
		scanner.nextLine();
		String measureAnotherRoom = scanner.nextLine();
	

		if (measureAnotherRoom.toLowerCase().equals("yes")) {
			main(null);
		} else if (measureAnotherRoom.toLowerCase().equals("no")) {
			System.out.println("Thank you. Good Bye.");
		} else {
			System.out.println("Please enter yes or no");
		}
		
		scanner.close();

	}
}
