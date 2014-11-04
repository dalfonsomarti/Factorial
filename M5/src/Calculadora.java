import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextField;


public class Calculadora {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private JTextField textField;
	
	String text = "";
	String operacio = "";
	float numero1 = 0;
	float numero2 = 0;
	float resultat = 0;
	int contadorP = 0;
	boolean acavat = false;
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 282);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		// Boto 0
		JButton button = new JButton("0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (acavat == true){
					text = "";
					textField.setText(text);
					acavat = false;
				}
				if (text.length() < 8){
					
					if (text.length() == 0) {
						if (text == "0") {
						text = "";
						textField.setText(text);
						}
					} else {
						text += "0";
						textField.setText(text);
					}
					 
				}
			}
		});
		button.setBounds(10, 202, 97, 30);
		frame.getContentPane().add(button);
		// Boto 1
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (acavat == true){
					text = "";
					textField.setText(text);
					acavat = false;
				}
				if (text.length() < 8){
					if ((text.length() == 1) && (text == "0")) {
						
						text = "1";
						textField.setText(text);
						 
					} else {
						text += "1";
						textField.setText(text);
					}
						
				}
			}
		});
		button_1.setBounds(10, 152, 48, 39);
		frame.getContentPane().add(button_1);
		// Boto 2
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (acavat == true){
					text = "";
					textField.setText(text);
					acavat = false;
				}
				if (text.length() < 8){
					text += "2";
					textField.setText(text);
					}
			}
		});
		button_2.setBounds(59, 152, 48, 39);
		frame.getContentPane().add(button_2);
		// Boto 3
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (acavat == true){
					text = "";
					textField.setText(text);
					acavat = false;
				}
				if (text.length() < 8){
					text += "3";
					textField.setText(text);
					}
			}
		});
		button_3.setBounds(109, 152, 48, 39);
		frame.getContentPane().add(button_3);
		// Boto 4
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (acavat == true){
					text = "";
					textField.setText(text);
					acavat = false;
				}
				if (text.length() < 8){
					text += "4";
					textField.setText(text);
					}
			}
		});
		button_4.setBounds(10, 110, 48, 39);
		frame.getContentPane().add(button_4);
		// Boto 5
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (acavat == true){
					text = "";
					textField.setText(text);
					acavat = false;
				}
				if (text.length() < 8){
					text += "5";
					textField.setText(text);
					}
			}
		});
		button_5.setBounds(59, 110, 48, 39);
		frame.getContentPane().add(button_5);
		// Boto 6
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (acavat == true){
					text = "";
					textField.setText(text);
					acavat = false;
				}
				if (text.length() < 8){
					text += "6";
					textField.setText(text);
					}
			}
		});
		button_6.setBounds(109, 110, 48, 39);
		frame.getContentPane().add(button_6);
		// Boto 7
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (acavat == true){
					text = "";
					textField.setText(text);
					acavat = false;
				}
				if (text.length() < 8){
					text += "7";
					textField.setText(text);
					}
			}
		});
		button_7.setBounds(10, 68, 48, 39);
		frame.getContentPane().add(button_7);
		// Boto 8
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (acavat == true){
					text = "";
					textField.setText(text);
					acavat = false;
				}
				if (text.length() < 8){
					text += "8";
					textField.setText(text);
					}
			}
		});
		button_8.setBounds(59, 68, 48, 39);
		frame.getContentPane().add(button_8);
		// Boto 9
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (acavat == true){
					text = "";
					textField.setText(text);
					acavat = false;
				}
				if (text.length() < 8){
					text += "9";
					textField.setText(text);
					}
			}
		});
		button_9.setBounds(109, 68, 48, 39);
		frame.getContentPane().add(button_9);
		// Boto +
		JButton button_10 = new JButton("+");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (text == ""){
					text = "0";
				}
				numero1 = Float.parseFloat(text);
				operacio = "+";
				text = "";
				textField.setText(text);
				contadorP = 0;
			}
		});
		button_10.setBounds(172, 68, 56, 58);
		frame.getContentPane().add(button_10);
		// Boto -
		JButton button_11 = new JButton("-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (text == ""){
					text = "0";
				}
				numero1 = Float.parseFloat(text);
				operacio = "-";
				text = "";
				textField.setText(text);
				contadorP = 0;
			}
		});
		button_11.setBounds(172, 133, 56, 58);
		frame.getContentPane().add(button_11);
		// Boto *
		JButton button_12 = new JButton("*");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (text == ""){
					text = "0";
				}
				numero1 = Float.parseFloat(text);
				operacio = "*";
				text = "";
				textField.setText(text);
				contadorP = 0;
			}
		});
		button_12.setBounds(238, 68, 56, 57);
		frame.getContentPane().add(button_12);
		// Boto /
		JButton button_13 = new JButton("/");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (text == ""){
					text = "0";
				}
				numero1 = Float.parseFloat(text);
				operacio = "/";
				text = "";
				textField.setText(text);
				contadorP = 0;
			}
		});
		button_13.setBounds(238, 133, 56, 58);
		frame.getContentPane().add(button_13);
		// Boto C
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = "";
				textField.setText(text);
				contadorP = 0;
				numero1 = 0;
				numero2 = 0;
				resultat = 0;
			}
		});
		btnC.setBounds(172, 202, 56, 30);
		frame.getContentPane().add(btnC);
		// Boto =
		JButton button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (text == ""){
					text = "0";
				}
				
				if (resultat == 0) { 
					numero2 = Float.parseFloat(text);
				} else {
					numero1 += Float.parseFloat(text);
				}
				if (operacio == "") {
					numero1 += Float.parseFloat(text);
					resultat = numero1 + numero2;		
				}				
				if (operacio == "+"){
					resultat = numero1 + numero2;
				}
				if (operacio == "-"){
					resultat = numero1 - numero2;
				}
				if (operacio == "*"){
					resultat = numero1 * numero2;
				}
				if (operacio == "/"){
					resultat = numero1 / numero2;
				}
				
				if ((operacio == "/") && (numero2 == 0)){
					textField.setText("Error");
				}else{
					text = String.valueOf(resultat);
					textField.setText(text);
					numero1 = 0;
					
					contadorP = 0;
					acavat = true;
				}
				
			}
		});
		button_14.setBounds(238, 202, 56, 30);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton(".");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (text == ""){
					text = "0";
				}
				if ((text.length() < 8) && (contadorP == 0)){
					text += ".";
					textField.setText(text);
					contadorP++;
					}
			}
		});
		button_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_15.setBounds(109, 202, 48, 30);
		frame.getContentPane().add(button_15);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(10, 12, 284, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnExp = new JButton("Exp!");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numero1 = Float.parseFloat(text);
				resultat = 1;
				while (numero1 > 0) {
					resultat = resultat * numero1;
					numero1--;
				}
				text = String.valueOf(resultat);
				textField.setText(text);
				numero1 = 0;
				numero2 = 0;
				operacio = "";
				contadorP = 0;
				acavat = true;
			}
		});
		btnExp.setBounds(304, 68, 70, 58);
		frame.getContentPane().add(btnExp);
	}
}
