import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String name  = "Felipe";
		int   idade  = 31;
		double renda = 4000.0;
		
		System.out.printf("O %s tem %d anos e uma renda de R$:%.2f.", name, idade, renda);

	}

}
