package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	ArrayList <Song> songs= new ArrayList<Song>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton shuffle = new JButton();
	Song song = new Song("demo.mp3");
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
	songs.equals("Baby Shark Dance Sing and Dance! Animal Songs PINKFONG Songs for Children.mp3");
		shuffle.setText("shuffle");
		shuffle.addActionListener(this);
		frame.add(panel);
		panel.add(shuffle);
		frame.pack();
		frame.setVisible(true);
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
				
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	
//		song.setDuration(5);
//			song.play();

	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==shuffle) {
			Random rand = new Random();
			rand.nextInt(4);
			
		}
	}
}