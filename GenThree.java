public class GenThree { 
	
	public static void main(String[] args) {

	int min = Integer.parseInt(args[0]); 
	int max = Integer.parseInt(args[1]);  

	double random1 = Math.random();
	int num1 = (int)(random1 * (max - min)) + min;
	System.out.println(num1);

	double random2 = Math.random();
	int num2 = (int)(random2 * (max - min)) + min;
	System.out.println(num2);


	double random3 = Math.random();
	int num3 = (int)(random3 * (max - min)) + min;
	System.out.println(num3);


	int minimalNum = Math.min(num1,num2);
	minimalNum = Math.min(minimalNum,num3);
		
		System.out.println("The minimal generated number was " + minimalNum);  
	} 
}
