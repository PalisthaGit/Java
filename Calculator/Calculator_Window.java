package com.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator_Window {

	private JFrame frame;
	private JTextField textField;
	double firstNumber;
	double secondNumber;
	double result;
	String operation;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_Window window = new Calculator_Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator_Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 391, 643);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(27, 98, 322, 53);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 178, 251, 394);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				String enterNumber=textField.getText() + btn9.getText();
				textField.setText(enterNumber);
				
			}
		});
		btn9.setBounds(173, 98, 60, 60);
		panel.add(btn9);
		btn9.setFont(new Font("Arial", Font.BOLD, 18));
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String enterNumber=textField.getText() + btn8.getText();
				textField.setText(enterNumber);
			}
		});
		btn8.setBounds(84, 98, 60, 60);
		panel.add(btn8);
		btn8.setFont(new Font("Arial", Font.BOLD, 18));
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String enterNumber=textField.getText() + btn7.getText();
				textField.setText(enterNumber);
				
			}
		});
		btn7.setBounds(0, 98, 60, 60);
		panel.add(btn7);
		btn7.setFont(new Font("Arial", Font.BOLD, 18));
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText() + btn6.getText();
				textField.setText(enterNumber);
				
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 18));
		btn6.setBounds(173, 171, 60, 60);
		panel.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber=textField.getText() + btn5.getText();
				textField.setText(enterNumber);
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 18));
		btn5.setBounds(84, 171, 60, 60);
		panel.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText() + btn4.getText();
				textField.setText(enterNumber);
				
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 18));
		btn4.setBounds(0, 171, 60, 60);
		panel.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText() + btn1.getText();
				textField.setText(enterNumber);
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 18));
		btn1.setBounds(0, 244, 60, 60);
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText() + btn2.getText();
				textField.setText(enterNumber);
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 18));
		btn2.setBounds(84, 244, 60, 60);
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText() + btn3.getText();
				textField.setText(enterNumber);
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 18));
		btn3.setBounds(173, 244, 60, 60);
		panel.add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText() + btn0.getText();
				textField.setText(enterNumber);
			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 18));
		btn0.setBounds(0, 321, 60, 60);
		panel.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber=textField.getText() + btnDot.getText();
				textField.setText(enterNumber);
			}
		});
		btnDot.setFont(new Font("Arial", Font.BOLD, 18));
		btnDot.setBounds(84, 321, 60, 60);
		panel.add(btnDot);
		
		JButton btnAs = new JButton("+/-");
		btnAs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(String.valueOf(textField.getText()));
				ops=ops*(-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnAs.setFont(new Font("Arial", Font.BOLD, 18));
		btnAs.setBounds(173, 321, 60, 60);
		panel.add(btnAs);
		
		JButton backSpace = new JButton("<-");
		backSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0) {
					StringBuilder strB= new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() -1);
					backspace=strB.toString();
					textField.setText(backspace);
					
				}
			}
		});
		backSpace.setFont(new Font("Arial", Font.BOLD, 18));
		backSpace.setBounds(0, 25, 60, 60);
		panel.add(backSpace);
		
		JButton clear = new JButton("C");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		clear.setFont(new Font("Arial", Font.BOLD, 18));
		clear.setBounds(84, 25, 60, 60);
		panel.add(clear);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnMod.setFont(new Font("Arial", Font.BOLD, 18));
		btnMod.setBounds(173, 25, 60, 60);
		panel.add(btnMod);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(290, 178, 60, 394);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Arial", Font.BOLD, 18));
		btnAdd.setBounds(0, 24, 60, 60);
		panel_1.add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				firstNumber=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			
			}
		});
		btnSub.setFont(new Font("Arial", Font.BOLD, 18));
		btnSub.setBounds(0, 97, 60, 60);
		panel_1.add(btnSub);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMultiply.setFont(new Font("Arial", Font.BOLD, 18));
		btnMultiply.setBounds(0, 170, 60, 60);
		panel_1.add(btnMultiply);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondNumber=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=firstNumber+secondNumber;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}
				
				else if(operation=="-")
				{
					result=firstNumber-secondNumber;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}
				
				else if(operation=="*")
				{
					result=firstNumber*secondNumber;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}
				
				else if(operation=="/")
				{
					result=firstNumber/secondNumber;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}
				else if(operation=="%")
				{
					result=firstNumber%secondNumber;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}
			}
		});
		btnEquals.setBounds(0, 321, 60, 60);
		panel_1.add(btnEquals);
		btnEquals.setFont(new Font("Arial", Font.BOLD, 18));
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Arial", Font.BOLD, 18));
		btnDivide.setBounds(0, 243, 60, 60);
		panel_1.add(btnDivide);
		
		JLabel labelCalculator = new JLabel("  Calculator");
		labelCalculator.setFont(new Font("Eras Bold ITC", Font.PLAIN, 51));
		labelCalculator.setBounds(27, 31, 322, 53);
		frame.getContentPane().add(labelCalculator);
	}
}