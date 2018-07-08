public class Milk extends CondimentDecorator {

	private Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + " add Milk ";
	}

	public double cost() {
		return beverage.cost() + 100;
	}
}
