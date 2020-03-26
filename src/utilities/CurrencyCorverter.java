package utilities;

public class CurrencyCorverter {
	
	public static double dollarPrice = (3.10/100*6)+3.10 ;
	public static double payDollar;
	
	public static double converterReal() {
		return (payDollar * dollarPrice);
		
	}
	
}
