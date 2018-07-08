public class App {
	public static void main(String args[]) {
		Beverage beverage = new DarkRoast();
		beverage = new Milk(beverage);
		beverage = new Mocha(beverage);
		System.out.println(beverage.cost());
		System.out.println(beverage.getDescription());
	}
}
