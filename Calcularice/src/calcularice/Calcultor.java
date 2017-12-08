package calcularice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

public class Calcultor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JLabel label;
	double num,rst;
	static int operation;
	private JButton btnC;
	private JButton btnNewButton_1;
	private JRadioButton rdbtnOn;
	private JRadioButton rdbtnOf;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcultor frame = new Calcultor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
		});
	}

	/**
	 * Create the frame.
	 * 
	 */
	
	public Calcultor() {
		//desable();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		label = new JLabel("");
		label.setBackground(Color.WHITE);
		label.setForeground(Color.RED);
		label.setToolTipText("");
		label.setBounds(158, 11, 76, 24);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(15, 34, 220, 54);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		
		btnNewButton = new JButton("/");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Double.parseDouble(textField.getText());
				textField.setText("");
				operation=4;
				label.setText(Double.toString(num)+" /");
				
			}
		});
		btnNewButton.setBounds(181, 118, 54, 54);
		contentPane.add(btnNewButton);
		
		
		
		button = new JButton("*");
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Double.parseDouble(textField.getText());
				textField.setText("");
				operation=3;
				label.setText(Double.toString(num)+" *");
			
			}
		});
		button.setBounds(181, 173, 54, 54);
		contentPane.add(button);
		
		button_1 = new JButton("-");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Double.parseDouble(textField.getText());
				textField.setText("");
				operation=2;
				label.setText(Double.toString(num)+" -");
			}
		});
		button_1.setBounds(181, 228, 54, 54);
		contentPane.add(button_1);
		
		button_2 = new JButton("+");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Double.parseDouble(textField.getText());
				textField.setText("");
				operation=1;
				label.setText(Double.toString(num)+" +");
				
			}
		});
		button_2.setBounds(181, 283, 54, 54);
		contentPane.add(button_2);
		
		button_3 = new JButton("9");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		button_3.setBounds(126, 118, 54, 54);
		contentPane.add(button_3);
		
		button_4 = new JButton("6");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		button_4.setBounds(126, 173, 54, 54);
		contentPane.add(button_4);
		
		button_5 = new JButton("3");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		button_5.setBounds(126, 228, 54, 54);
		contentPane.add(button_5);
		
		button_6 = new JButton("=");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation_arithmétique();
			}
		});
		button_6.setBounds(126, 283, 54, 54);
		contentPane.add(button_6);
		
		button_7 = new JButton("8");
		
		button_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		button_7.setBounds(71, 118, 54, 54);
		contentPane.add(button_7);
		
		button_8 = new JButton("5");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		button_8.setBounds(71, 173, 54, 54);
		contentPane.add(button_8);
		
		button_9 = new JButton("2");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		button_9.setBounds(71, 228, 54, 54);
		contentPane.add(button_9);
		
		button_10 = new JButton("0");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		button_10.setBounds(71, 283, 54, 54);
		contentPane.add(button_10);
		
		button_11 = new JButton("7");
		button_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		button_11.setBounds(15, 118, 54, 54);
		contentPane.add(button_11);
		
		button_12 = new JButton("4");
		button_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		button_12.setBounds(15, 173, 54, 54);
		contentPane.add(button_12);
		
		button_13 = new JButton("1");
		button_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		button_13.setBounds(15, 228, 54, 54);
		contentPane.add(button_13);
		
		button_14 = new JButton(".");
		button_14.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+".");
			}
		});
		button_14.setBounds(15, 283, 54, 54);
		contentPane.add(button_14);
		
		 btnNewButton_1 = new JButton(" <");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int length=textField.getText().length();
				int number=length-1;
				String store;
				if(length>0) {
					StringBuilder back=new StringBuilder(textField.getText());
				back.deleteCharAt(number);
				store=back.toString();
				textField.setText(store);
				}
				
			}
		});
		btnNewButton_1.setBounds(126, 89, 54, 26);
		contentPane.add(btnNewButton_1);
		
	    rdbtnOn = new JRadioButton("ON");
	    rdbtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enable();
				
			}
		});
		rdbtnOn.setBounds(15, 91, 54, 23);
		contentPane.add(rdbtnOn);
		
		rdbtnOf = new JRadioButton("OF");
		rdbtnOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desable();
				
			}
		});
		
		rdbtnOf.setBounds(71, 91, 54, 23);
		contentPane.add(rdbtnOf);
		rdbtnOn.setEnabled(false);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnC.setBounds(181, 89, 53, 26);
		contentPane.add(btnC);
		
		/*rdbtnOn = new JRadioButton("ON");
		rdbtnOn.setBounds(15, 88, 54, 23);
		contentPane.add(rdbtnOn);
		
		rdbtnOf = new JRadioButton("OF");
		rdbtnOf.setBounds(71, 89, 54, 23);
		contentPane.add(rdbtnOf);*/
		
		/*btnNewButton_1 = new JButton("<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(126, 92, 53, 26);
		contentPane.add(btnNewButton_1);*/
		
		
		
		
	}
public void operation_arithmétique() {
		
		switch(operation) { 
		case 1:
			rst=num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(rst));
			break;
		case 2:
			rst=num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(rst));
			break;
		case 3:
			rst=num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(rst));
			break;
		case 4:
			rst=num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(rst));
			break;	
	}
		}
public void desable() {
	textField.setEnabled(false);
	label.setEnabled(false);
	btnNewButton.setEnabled(false);
	button.setEnabled(false);
	button_1.setEnabled(false);
	button_2.setEnabled(false);
	button_3.setEnabled(false);
	button_4.setEnabled(false);
	button_5.setEnabled(false);
	button_6.setEnabled(false);
	button_7.setEnabled(false);
	button_8.setEnabled(false);
	button_9.setEnabled(false);
	button_10.setEnabled(false);
	button_11.setEnabled(false);
	button_12.setEnabled(false);
	btnC.setEnabled(false);
	button_13.setEnabled(false);
	button_14.setEnabled(false);
	btnNewButton_1.setEnabled(false);
	rdbtnOn.setEnabled(true);
	rdbtnOf.setEnabled(false);
	
	
	
	
	
}
public void enable() {
	textField.setEnabled(true);
	label.setEnabled(true);
	btnNewButton.setEnabled(true);
	button.setEnabled(true);
	button_1.setEnabled(true);
	button_2.setEnabled(true);
	button_3.setEnabled(true);
	button_4.setEnabled(true);
	button_5.setEnabled(true);
	button_6.setEnabled(true);
	button_7.setEnabled(true);
	button_8.setEnabled(true);
	button_9.setEnabled(true);
	button_10.setEnabled(true);
	button_11.setEnabled(true);
	button_12.setEnabled(true);
	btnC.setEnabled(true);
	button_13.setEnabled(true);
	button_14.setEnabled(true);
	btnNewButton_1.setEnabled(true);
	rdbtnOf.setEnabled(true);
	rdbtnOn.setEnabled(false);
	
	
	
	
	
}
}
