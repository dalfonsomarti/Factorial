import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;


public class Finestra1 {

	private JFrame frame;
	private JTextField textField;
	String str = new String();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra1 window = new Finestra1();
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
	public Finestra1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
			
		
		textField = new JTextField();
		textField.setBounds(108, 11, 200, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
				
		
		JButton btnBoto = new JButton("Boto1");
		btnBoto.setBounds(10, 94, 200, 98);
		btnBoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				str = textField.getText();
				textField.setText("");
				
				if (str == ""){
					
					textField.setText("S'ha d'escriure text");
				
				}
			}
		});
		btnBoto.setBackground(Color.GREEN);
		frame.getContentPane().add(btnBoto);
		
		
		JButton btnBoto_1 = new JButton("Boto2");
		btnBoto_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(str);
			}
		});
		btnBoto_1.setBackground(Color.ORANGE);
		btnBoto_1.setBounds(224, 94, 200, 98);
		frame.getContentPane().add(btnBoto_1);
		
		
		
		
		
	}
}
