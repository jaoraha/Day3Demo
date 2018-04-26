
public class DoWhileEx {

	public static void main(String[] args) {
		
		int num = 5;
		System.out.println(num++); //post-increment: increment will be done AFTER sysout promp. 
		System.out.println(num);
		
		System.out.println();
		int num2 = 7;
		System.out.println(--num2); //pre-decrement: decrement will be done BEFORE sysout prompt. 
		
	
		int counter = 100; //variable declared outside of loop so the while condition (which is also outside the curly braces) can see it.
		
		
		//the do loop will always execute the code between the do brackets at least once
		do
		{
			System.out.println("Counter: " + counter--);
		}
		while(counter > 0);
	}
	
}
