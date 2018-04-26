
public class Recap {

	public static void main(String[] args) {
		int numOfItems = 5;
		
		System.out.println(3.0/1.5);
		System.out.println(3/2.0); //implied conversion, converts int (2) into a double
		System.out.println((numOfItems + 10) / 2); //parenthesis for order of operations. this outputs an int so just 7 instead of 7.5
		System.out.println((numOfItems + 10) / 2.0); //this will output the correct 7.5 because you have a double in the equation so it converts to the more complex double over int.
	
	
	
	}

}
