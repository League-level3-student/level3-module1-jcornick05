package _03_IntroToStacks;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Stack<Character> letters = new Stack<Character>();
	JLabel label = new JLabel();
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */

	public static void main(String[] args) {
		_02_TextUndoRedo t = new _02_TextUndoRedo();
		t.Type();

	}

	public void Type() {
		label.addKeyListener(this);
		frame.add(panel);			
		panel.add(label);
		frame.pack();
		frame.setVisible(true);
	}

	@Override         
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		// String b = ;
		char character = e.getKeyChar();
		letters.push(character);
		
		for (int i = 0; i < letters.size(); i++) {
			//String s = String.valueOf(letters.get(i));
			label.setText(label.getText() + letters.pop());
			System.out.println(letters.pop());
		}
		
		
		

		// the character of the key
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
