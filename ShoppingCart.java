
public class ShoppingCart {

	public enum BillingType {
	    NORMAL, HALFPRICE, HAPPYHOUR 
	}
	
	private double rawWidgetPrice;
	private BillingType strategy;

	public ShoppingCart() {
		rawWidgetPrice = 5.0;
		this.strategy = BillingType.NORMAL;
	}

	public void setBillingStrategy(BillingType strategy)
	{
		this.strategy = strategy;
	}
	
	// get the bill with billing strategy applied
	public double getBill() {
		
		double price = 0;
		
		switch(strategy) 
		{
		case NORMAL:
			price = rawWidgetPrice;
			break;
		case HALFPRICE:
			price = rawWidgetPrice * .5;
			break;
		case HAPPYHOUR:
			price = rawWidgetPrice - 1;
			break;
		}
		return price;
	}
	
}
