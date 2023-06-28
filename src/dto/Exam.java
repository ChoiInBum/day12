package dto;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam {
	public static void main(String[] args) {
		JFrame frame = new JFrame("제목");
		Container c = frame.getContentPane();
		
		JLabel label = new JLabel("test gui");
		c.add(label);
		label.setFont(new Font(null, 0, 32));
		label.setHorizontalAlignment( JLabel.CENTER );
		
		frame.setLocation(1000 , 200);
		frame.setPreferredSize( new Dimension(500, 200) );
		frame.pack(); //프레임 사이즈 설정
		
		frame.setVisible( true );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
}