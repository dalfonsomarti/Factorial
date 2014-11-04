import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.FlowLayout;

import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;


public class ProvaUF1Pràctica {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProvaUF1Pràctica window = new ProvaUF1Pràctica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ProvaUF1Pràctica() {
		initialize();
	}
	DecimalFormat decimals = new DecimalFormat("0.00");
	private JFrame frame;
	private JTextField txtValor1;
	private JTextField txtValor2;
	private JTextField txtResultat;
	
	String dades1 = "";
	String dades2 = "";
	float altura = 0;
	float pes = 0;
	float resultat = 0;
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtValor1 = new JTextField();
		txtValor1.setBounds(38, 92, 86, 20);
		frame.getContentPane().add(txtValor1);
		txtValor1.setColumns(10);
		
		txtValor2 = new JTextField();
		txtValor2.setBounds(169, 92, 86, 20);
		frame.getContentPane().add(txtValor2);
		txtValor2.setColumns(10);
		
		txtResultat = new JTextField();
		txtResultat.setBounds(306, 92, 86, 20);
		frame.getContentPane().add(txtResultat);
		txtResultat.setColumns(10);
		
		JButton btnCalcula = new JButton("C\u00E0lcular");
		btnCalcula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Agafo el valor de altura i el transformo a float gaurdant-lo a la variable altura.
				dades1 = txtValor1.getText();
				altura = Float.parseFloat(dades1);
				// Agafo el valor de pes i el transformo a float gaurdant-lo a la variable pes.
				dades2 = txtValor2.getText();
				pes = Float.parseFloat(dades2);
				// Faig el calcul, transformao resultat en string i el mostro a txtResultat.
				txtResultat.setText(String.valueOf(decimals.format(altura / (pes * pes))));
				}
			
		});
		btnCalcula.setFont(new Font("Arial", Font.BOLD, 13));
		btnCalcula.setBounds(106, 156, 89, 23);
		frame.getContentPane().add(btnCalcula);
		
		JButton btnEsborra = new JButton("Esborrar");
		btnEsborra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Esborro els valors.
				dades1 = "";
				txtValor1.setText(dades1);
				txtValor2.setText(dades1);
				txtResultat.setText(dades1);
			}
		});
		btnEsborra.setFont(new Font("Arial", Font.BOLD, 13));
		btnEsborra.setBounds(237, 156, 89, 23);
		frame.getContentPane().add(btnEsborra);
		
		JLabel lblTitol = new JLabel("C\u00E0lcul del IMC");
		lblTitol.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitol.setFont(new Font("Arial", Font.PLAIN, 35));
		lblTitol.setBounds(38, 24, 354, 57);
		frame.getContentPane().add(lblTitol);
		
		JLabel lblaltura = new JLabel("Altura");
		lblaltura.setHorizontalAlignment(SwingConstants.CENTER);
		lblaltura.setFont(new Font("Arial", Font.PLAIN, 13));
		lblaltura.setBounds(59, 116, 46, 14);
		frame.getContentPane().add(lblaltura);
		
		JLabel lblpes = new JLabel("Pes");
		lblpes.setHorizontalAlignment(SwingConstants.CENTER);
		lblpes.setFont(new Font("Arial", Font.PLAIN, 13));
		lblpes.setBounds(190, 116, 46, 14);
		frame.getContentPane().add(lblpes);
		
		JLabel lblImc = new JLabel("IMC");
		lblImc.setHorizontalAlignment(SwingConstants.CENTER);
		lblImc.setFont(new Font("Arial", Font.PLAIN, 13));
		lblImc.setBounds(328, 117, 46, 14);
		frame.getContentPane().add(lblImc);
	}
}
