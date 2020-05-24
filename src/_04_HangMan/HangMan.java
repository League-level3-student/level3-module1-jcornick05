package _04_HangMan;

import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	String word = "";
	String numberOfLives = "";
	String unguessedLetters = "";
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int lives = 10;
	Stack<String> stack = new Stack<String>();

	public static void main(String[] args) {
		new HangMan().GUI();
	}

	void GUI() {
		String size = JOptionPane.showInputDialog("Enter the number of letters:");
		int wordSize = Integer.parseInt(size);
		frame.setVisible(true);
		frame.add(panel);
		frame.add(label);
		frame.setSize(500, 500);
		frame.addKeyListener(this);
		frame.setTitle("Lives: 10");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < Utilities.getTotalWordsInFile("dictionary.txt"); i++) {
			String word = Utilities.readRandomLineFromFile("dictionary.txt");
			if (!stack.contains(word)) {
				if (word.length() == wordSize) {
					stack.push(word);
				}
			}
		}
		word = stack.pop();
		for (int i = 0; i < word.length(); i++) {
			unguessedLetters = "_" + unguessedLetters;
		}
		label.setText(unguessedLetters);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		boolean correct = false;
		String newLetter = "";
		String visibleWord = label.getText();
		for (int i = 0; i < word.length(); i++) {
			if (e.getKeyChar() == word.charAt(i)) {
				correct = true;
				newLetter += word.charAt(i);
			} else {
				newLetter += visibleWord.charAt(i);
			}
		}
		if (correct == false) {
			lives -= 1;
			numberOfLives = String.valueOf(lives);
			frame.setTitle("Lives: " + numberOfLives);
		}
		visibleWord = newLetter;
		label.setText(visibleWord);
		if (visibleWord.equals(word)) {
			word = stack.pop();
			label.setText(unguessedLetters);
		}
		if (lives == 0) {
			JOptionPane.showMessageDialog(null, "Game over!");
			String input = JOptionPane.showInputDialog("Continue?");
			if (input.equals("Yes")) {
				lives = 10;
				numberOfLives = String.valueOf(lives);
				frame.setTitle("Lives: " + numberOfLives);
				word = stack.pop();
				label.setText(unguessedLetters);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
