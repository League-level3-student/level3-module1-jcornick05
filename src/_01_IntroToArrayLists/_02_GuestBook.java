package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addName = new JButton("Add Name");
	JButton viewName = new JButton("View Names");
	List <String> names = new ArrayList<>();
	public static void main(String[] args) {
		_02_GuestBook gb = new _02_GuestBook();
		gb.Gui();
	}
	
	public void Gui () {
		
		frame.add(panel);
		panel.add(addName);
		panel.add(viewName);
		addName.addActionListener(this);
		viewName.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==addName) {
			names.add(JOptionPane.showInputDialog("Add a name"));
			
		}
		if (e.getSource()==viewName) {
			for (int i = 0; i < names.size(); i++) {
				System.out.println(names.get(i));
				JOptionPane.showMessageDialog(null, "Guest #"+ i + ": " + names.get(i));
			}
		}
		
	}
	
}
