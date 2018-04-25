package jj6;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame implements ActionListener{
	
	
	JButton insert=new JButton("Insert Data");
	JButton show=new JButton("Show Data");
	
	
	public MainWindow(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		setLayout(new GridLayout(0, 2));
		add(insert);add(show);
		insert.addActionListener(this);
		show.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==insert)
			Representative.main(null);
		else
			DisplayRepresentative.main(null);
			
		
	}
	
	public static void main(String args[]) {
		MainWindow mw=new MainWindow("Main Window");
		mw.setSize(500, 500);
		mw.setVisible(true);
		
	}

}
