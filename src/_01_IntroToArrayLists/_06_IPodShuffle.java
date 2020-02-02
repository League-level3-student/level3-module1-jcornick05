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
	JButton stop = new JButton();
	Song song1 = new Song("demo.mp3");
	Song song2 = new Song("The Duck - The Duck Song (The Duck and the Lemonade Stand) my-free-mp3s.com .mp3");
	Song song3 = new Song("The Birthday Singers - Happy Birthday to You my-free-mp3s.com .mp3");
	Song song4 = new Song("GAS! - Gas! (Club Mix) (Club Mix) my-free-mp3s.com .mp3");
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
	songs.add(song1);
		shuffle.setText("shuffle");
		stop.setText("Stop");
		stop.addActionListener(this);
		shuffle.addActionListener(this);
		frame.add(panel);
		panel.add(shuffle);
		panel.add(stop);
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
			song1.stop();
			song2.stop();
			song3.stop();
			song4.stop();
			Random rand = new Random();
			int random = rand.nextInt(4);
			if (random==0) {
				song1.play();
			}
			else if (random==1) {
				song2.play();
			}
			else if(random==2){
				song3.play();
			}else {
				song4.play();
			}
			
		}
		if (e.getSource()==stop) {
			song1.stop();
			song2.stop();
			song3.stop();
		}
	}
}