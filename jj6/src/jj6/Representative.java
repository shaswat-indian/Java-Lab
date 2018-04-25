package jj6;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Representative extends JFrame{
	
	JLabel repnoLabel=new JLabel("Enter RepNo: ");
	JLabel repnameLabel=new JLabel("Enter RepName: ");
	JLabel stateLabel=new JLabel("Enter State: ");
	JLabel commLabel=new JLabel("Enter Commission: ");
	JLabel rateLabel=new JLabel("Enter Rate: ");
	JLabel custnoLabel=new JLabel("Enter CustNo: ");
	JLabel custnameLabel=new JLabel("Enter CustName: ");
	JLabel custstateLabel=new JLabel("Enter CustState: ");
	JLabel creditLabel=new JLabel("Enter Credit Limit: ");
	
	JTextField repno=new JTextField(10);
	JTextField repname=new JTextField(10);
	JTextField state=new JTextField(10);
	JTextField comm=new JTextField(10);
	JTextField rate=new JTextField(10);
	JTextField custno=new JTextField(10);
	JTextField custname=new JTextField(10);
	JTextField custstate=new JTextField(10);
	JTextField credit=new JTextField(10);
	
	JButton submit=new JButton("Submit");
	
	public Representative(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		setLayout(new GridLayout(0,2));
		add(repnoLabel);add(repno);
		add(repnameLabel);add(repname);
		add(stateLabel);add(state);
		add(commLabel);add(comm);
		add(rateLabel);add(rate);
		add(custnoLabel);add(custno);
		add(custnameLabel);add(custname);
		add(custstateLabel);add(custstate);
		add(creditLabel);add(credit);
		add(submit);
		
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int repnoData=Integer.parseInt(repno.getText().toString());
				String repnameData=repname.getText().toString();
				String stateData=state.getText().toString();
				float commData=Float.parseFloat(comm.getText().toString());
				float rateData=Float.parseFloat(rate.getText().toString());
				
				int custnoData=Integer.parseInt(custno.getText().toString());
				String custnameData=custname.getText().toString();
				String custstateData=custstate.getText().toString();
				float creditData=Float.parseFloat(credit.getText().toString());

				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "msrit");
					
					java.sql.Statement stmt=conn.createStatement();
					String query="insert into representative values("+repnoData+",'"+repnameData+"','"+stateData+"',"+commData+","+rateData+");";
					stmt.executeUpdate(query);
					query="insert into customer values("+custnoData+",'"+custnameData+"','"+custstateData+"',"+creditData+","+repnoData+");";
					stmt.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Data Inserted!");
/*
					while(rs.next()) {
						System.out.println(rs.getMetaData().getColumnCount());
					}
*/					
				} catch (ClassNotFoundException e1) {
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
		
		Representative rp=new Representative("Represenataives");
		rp.setSize(500, 500);
		rp.setVisible(true);

	}

}
