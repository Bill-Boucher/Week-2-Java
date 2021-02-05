
public class Week2App {

	public static void main(String[] args) {
		
		
		System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(false && false);
        System.out.println(true && (false || true));
        System.out.println(false || (true && false));
        System.out.println(false || 1 < 5);
        System.out.println(5 >= 4 && 1 > 3);
        System.out.println(10 < 4 || 1 > 4);
        System.out.println(12 >= 2 && 1 < 24);
        System.out.println("Hello".charAt(0) == 'h');
		
		
		
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;

		double costOfMilk = 2.99;
		double moneyInWallet = 50.00;
		int thirstLevel = 8;

		boolean shouldIByIcecream = isHotOutside && hasMoneyInPocket;
		System.out.println(shouldIByIcecream);
		boolean willGoSwimming = isHotOutside && !isWeekday;
		System.out.println(willGoSwimming);
		boolean isAGoodDay = isHotOutside && !isWeekday && hasMoneyInPocket;
		System.out.println(isAGoodDay);
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= costOfMilk * 2);
		System.out.println(willBuyMilk);
	}

}
