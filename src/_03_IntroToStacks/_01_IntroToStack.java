package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		// 1. Create a Stack of Doubles
		// Don't forget to import the Stack class
		Stack<Double> doubles = new Stack<Double>();
		// 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			Random rand = new Random();
			double d = rand.nextDouble();
			doubles.push(d * 100);

		}
		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.
		String a = JOptionPane.showInputDialog("Enter a number between 0 and 100");
		String b = JOptionPane.showInputDialog("Enter a another number between 0 and 100");
		double num1 = Double.parseDouble(a);
		double num2 = Double.parseDouble(b);

		// 4. Pop all the elements off of the Stack. Every time a double is popped that
		// is
		// between the two numbers entered by the user, print it to the screen.
		for (int i = 0; i < doubles.size(); i++) {
			double num3 = doubles.pop();
			if (num3 < num1 && num3 > num2 || num3 > num1 && num3 < num2 ) {
				System.out.println(num3);
			}
			
		}

		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}

}
