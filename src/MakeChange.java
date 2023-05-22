
import java.util.Scanner;

public class MakeChange {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double twenties = 20.00;
		double tens = 10.00;
		double fives = 5.00;
		double ones = 1.00;
		double quarters = 0.25;
		double dimes = 0.1;
		double nickels = 0.05;
		double pennies = 0.01;
		int answer;

		System.out.println("How much is the item?");
		double priceOfItem = sc.nextDouble();
		System.out.println("How much $$ where you given?");
		double moneyGiven = sc.nextDouble();

		double change = moneyGiven - priceOfItem;

		if (moneyGiven < priceOfItem) {
			System.out.println("Not enough $$");
		} else if (moneyGiven > priceOfItem) {
			System.out.printf("The change is $%.2f\n", change);
		} else if (change == 0) {
			System.out.println("No change needed");
		}
		
		while (change > pennies) {

			if (change >= twenties) {
				answer = (int) findFloor(change / 20);
				if (change > 20.999) {
					System.out.println("Return " + answer + "x" + " Twenties");
					change = change - (answer * 20);
				} else {
					System.out.println("Return a Twenty");
					change = (change - 20);
				}

			} else if (change >= tens) {
				System.out.println("Return a Ten");
				change = change - 10;

			} else if (change >= fives) {
				System.out.println("Return a Five");
				change = change - 5;

			} else if (change >= ones) {
				answer = (int) findFloor(change);
				if (change > 1.999) {
					System.out.println("Return " + answer + "x" + " Ones");
					change = change - answer;
				} else {
					System.out.println("Return a Dollar");
					change = (change - 1);
				}

			} else if (change >= quarters) {
				answer = (int) Math.round(change * 4);
				if (change > 0.499) {
					System.out.println("Return " + answer + "x" + " quarters");
					change = change - (0.25 * answer);
				} else {
					System.out.println("Return a quarter");
					change = (change - 0.25);
				}

			} else if (change >= dimes) {
				answer = (int) Math.round(change * 10);
				if (change > 0.199) {
					System.out.println("Return " + answer + "x" + " dimes");
					change = change - (0.10 * answer);
				} else {
					System.out.println("Return a dime");
					change = (change - 0.10);
				}

			} else if (change >= nickels) {
				System.out.println("Return a nickel");
				change = (change - nickels);

			} else if (change >= pennies) {
				answer = (int) Math.round(change * 100);
				if (change > 0.019 && change != 5) {
					System.out.println("Return " + answer + "x" + " pennies");
				} else {
					System.out.println("Return a penny");
				}
				change = (change - pennies * answer);
			    }
		}
		sc.close();
	}

	public static double findFloor(double x) {
		int floor = (int) x;
		if (x < 0 && (x % floor != 0)) {
			floor = floor - 1;
		}
		return floor;
	}
}