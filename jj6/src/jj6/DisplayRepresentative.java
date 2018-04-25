package jj6;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import com.mysql.jdbc.Connection;

public class DisplayRepresentative extends JFrame {
	
	//JLabel clickhere=new JLabel("Click Here to Display Representative Details having Credit Limit greater than 15000.");
	JButton click=new JButton("Click Here to Display Representative Details having Credit Limit greater than 15000.");
	JTextArea area=new JTextArea();
	
	
	public DisplayRepresentative(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		
		area.setEditable(false);
		setLayout(new GridLayout(0, 1));
		//add(clickhere);
		add(click);
		add(area);
		click.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				area.setText("");
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "msrit");
					java.sql.Statement stmt=conn.createStatement();
					String query="select * from customer,representative where customer.repno=representative.repno and credit_limit>15000 ;";
					ResultSet rs=stmt.executeQuery(query);
					while(rs.next()) {
					
						int repnoData=Integer.parseInt(rs.getString(6));
						String repnameData=rs.getString(7);
						String stateData=rs.getString(8);
						float commData=Float.parseFloat(rs.getString(9));
						float rateData=Float.parseFloat(rs.getString(10));
						
						area.append("\nRepNo:"+repnoData+"\nRepName:"+repnameData+"\nState:"+stateData+"\nCommission:"+commData+"\nRate:"+rateData+"\n");
						
					}
				}
				catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
			}
		});
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayRepresentative dr=new DisplayRepresentative("Representative Deatils");
		dr.setSize(500, 500);
		dr.setVisible(true);

	}

}
