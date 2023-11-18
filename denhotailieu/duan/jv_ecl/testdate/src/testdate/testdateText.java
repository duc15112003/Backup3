package testdate;

import javax.swing.JFrame;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.util.*;

public class testdateText {
	
	public static JFrame frame;
	
	public testdateText() {
		init();
	}
	private void init() {
		frame = new JFrame();
		frame.setSize(556, 340);
		frame.getContentPane().setLayout(null);
		
		JDateChooser datetest = new JDateChooser();
		datetest.setDateFormatString("dd-MM-yyyy");
		datetest.setBounds(158, 98, 143, 20);
		frame.getContentPane().add(datetest);
		JLabel lbldraw = new JLabel("New label");
		lbldraw.setBounds(158, 225, 227, 14);
		frame.getContentPane().add(lbldraw);
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Date dt = datetest.getDate();
				String fm = new SimpleDateFormat("dd-MM-yyyy").format(dt);
				lbldraw.setText(fm);
				
				
			}
		});
		btnNewButton.setBounds(352, 176, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new testdateText();
	}
}
