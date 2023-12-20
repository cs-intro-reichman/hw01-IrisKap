public class Coins { 
	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);

		int quarters = n / 25 ;
		int cents = n % 25 ;
		System.out.println("Use "+ quarters +" quarters and "+ cents + " cents"); 
	} 
}
