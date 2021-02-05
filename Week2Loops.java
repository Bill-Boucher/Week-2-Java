
public class Week2Loops {

	public static void main(String[] args) {

		// a. A while loop that prints all even numbers from 0 to 100
		for (int i = 0; i <= 100; i += 2) {
			System.out.println(i);

			// b. A while loop that prints every 3rd number going backwards from 100 until
			// we reach 0

		}
		for (int k = 100; k >= 0; k -= 3) {
			System.out.println(k);

		}

		// c. A for loop that prints every other number from 1 to 100
		for (int d = 1; d <= 100; d = d + 2) {
			System.out.println(d);
		}

		// d. A for loop that prints every number from 0 to 100, but if the number is
		// divisible by 3, it prints “Hello”
		// instead of the number, and if the number is divisible by 5, it prints “World”
		// instead of the number, and if it
		// is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.

		for (int b = 1; b <= 100; b++) {
			if (b % 3 == 0 && b % 5 == 0) {
				System.out.println("Hello World");

			} else if (b % 3 == 0) {
				System.out.println("Hello");
			} else if (b % 5 == 0) {
				System.out.println("World");
			} else {
				System.out.println(b);
			}

		}
	}
}