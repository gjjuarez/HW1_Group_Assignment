import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.Scanner;

import org.junit.Test;

public class random {
	public static void main(String[] args) {		
		randomMethod();
    }
	
	private static void randomMethod() {
		Random rand = new Random();
		int n = rand.nextInt(10) + 0;
		System.out.println("Guess the number between 0 and 10");
		Scanner reader = new Scanner(System.in);
		System.out.println(n);
		System.out.println("Enter a number: ");
		int guess = reader.nextInt(); 
		
		if(guess == n) {
			System.out.println("Answer is correct!");
		}else {
			System.out.println("Wrong!");
		}
		reader.close();
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	@Test
	public void testAdd1Plus1() 
	{
	    int x  = 1 ; int y = 1;
	    assertEquals(2, add(x,y));
	}
}
