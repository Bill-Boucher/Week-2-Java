
public class Week2App {

	public static void main(String[] args) {
		
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
