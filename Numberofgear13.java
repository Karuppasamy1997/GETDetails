package Gearprocess;


import java.util.Scanner;

public class Numberofgear13 extends Numberofspeed13 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the Gear: ");
		int n = s.nextInt();

		Numberofgear13 g = new Numberofgear13();
		g.limit(n);

		System.out.println("If you want to apply brake: ");
		char a = s.next().charAt(0);

		if (a == 'y') {
			System.out.println("Gear is Reduced");
			g.limit(n - 1);
		} else if (a == 'n') {
			System.out.println("No Brake is applied");
		}
	}

}