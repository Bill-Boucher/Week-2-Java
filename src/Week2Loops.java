
public class Week2Loops {

	public static void main(String[] args) {
		for (int i = 0; i <=100; i += 2) {
		System.out.println(i);

	} for (int k = 100; k >= 0; k -= 3) {
		System.out.println(k);
		
	}
	
		for (int d=1; d<=100; d = d+2) {
			System.out.println(d);
		}
		
		
		for (int b=1; b <=100; b++) {
			if (b % 3 == 0 && b % 5 ==0) {
				System.out.println("Hello World");
				
			} else if (b % 3 ==0) {
				System.out.println("Hello");
			} else if (b % 5 ==0) {
				System.out.println("World");
			} else {
				System.out.println(b);
			}

	
	
	}
	}}