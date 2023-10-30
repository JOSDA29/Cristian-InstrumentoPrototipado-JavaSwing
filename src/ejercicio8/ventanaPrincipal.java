package ejercicio8;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaPrincipal implements ActionListener{

	public JFrame frame;
	private JLabel lblEtiTexto;
	private JButton btnAzul;
	private JButton btnRojo;
	private JButton btnVerde;
	private JButton btnFondoAzul;
	private JButton btnFondoRojo;
	private JButton btnFondoVerde;
	private JButton btnTrasnparente;
	private JButton btnOpaca;

	public ventanaPrincipal() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBounds(100, 100, 417, 232);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		lblEtiTexto = new JLabel("JOSDA COLOR");
		lblEtiTexto.setForeground(new Color(255, 255, 255));
		lblEtiTexto.setBackground(new Color(0, 0, 0));
		lblEtiTexto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEtiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiTexto.setBounds(100, 11, 200, 25);
		lblEtiTexto.setOpaque(true);
		frame.getContentPane().add(lblEtiTexto);
		
		btnAzul = new JButton("Azul");
		btnAzul.setBackground(new Color(0, 0, 0));
		btnAzul.setForeground(new Color(255, 255, 255));
		btnAzul.setBounds(30, 50, 110, 30);
		btnAzul.addActionListener(this);
		frame.getContentPane().add(btnAzul);
		
		btnRojo = new JButton("Rojo");
		btnRojo.setForeground(new Color(255, 255, 255));
		btnRojo.setBackground(new Color(0, 0, 0));
		btnRojo.setBounds(150, 50, 110, 30);
		btnRojo.addActionListener(this);
		frame.getContentPane().add(btnRojo);
		
		btnVerde = new JButton("Verde");
		btnVerde.setBackground(new Color(0, 0, 0));
		btnVerde.setForeground(new Color(255, 255, 255));
		btnVerde.setBounds(270, 50, 110, 30);
		btnVerde.addActionListener(this);
		frame.getContentPane().add(btnVerde);
		
		btnFondoAzul = new JButton("Fondo Azul");
		btnFondoAzul.setForeground(new Color(255, 255, 255));
		btnFondoAzul.setBackground(new Color(0, 0, 0));
		btnFondoAzul.setBounds(30, 90, 110, 30);
		btnFondoAzul.addActionListener(this);
		frame.getContentPane().add(btnFondoAzul);
		
		btnFondoRojo = new JButton("Fondo Rojo");
		btnFondoRojo.setForeground(new Color(255, 255, 255));
		btnFondoRojo.setBackground(new Color(0, 0, 0));
		btnFondoRojo.setBounds(150, 90, 110, 30);
		btnFondoRojo.addActionListener(this);
		frame.getContentPane().add(btnFondoRojo);
		
		btnFondoVerde = new JButton("Fondo Verde");
		btnFondoVerde.setForeground(new Color(255, 255, 255));
		btnFondoVerde.setBackground(new Color(0, 0, 0));
		btnFondoVerde.setBounds(270, 90, 110, 30);
		btnFondoVerde.addActionListener(this);
		frame.getContentPane().add(btnFondoVerde);
		
		btnTrasnparente = new JButton("Transparente");
		btnTrasnparente.setForeground(new Color(255, 255, 255));
		btnTrasnparente.setBackground(new Color(0, 0, 0));
		btnTrasnparente.setBounds(90, 130, 110, 30);
		btnTrasnparente.addActionListener(this);
		frame.getContentPane().add(btnTrasnparente);
		
		btnOpaca = new JButton("Opaca");
		btnOpaca.setForeground(new Color(255, 255, 255));
		btnOpaca.setBackground(new Color(0, 0, 0));
		btnOpaca.setBounds(210, 130, 110, 30);
		btnOpaca.addActionListener(this);
		frame.getContentPane().add(btnOpaca);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAzul) {
			lblEtiTexto.setForeground(Color.BLUE);
		}else if (e.getSource() == btnRojo) {
			lblEtiTexto.setForeground(Color.RED);
		}else if (e.getSource() == btnVerde) {
			lblEtiTexto.setForeground(Color.GREEN);
		}else if (e.getSource() == btnFondoAzul) {
			lblEtiTexto.setBackground(Color.blue);
		}else if (e.getSource() == btnFondoRojo) {
			lblEtiTexto.setBackground(Color.red);
		}else if (e.getSource() == btnFondoVerde) {
			lblEtiTexto.setBackground(Color.green);
		}else if (e.getSource() == btnTrasnparente) {
			lblEtiTexto.setOpaque(false);
			lblEtiTexto.setBackground(null);
		}else if (e.getSource() == btnOpaca) {
			lblEtiTexto.setOpaque(true);
		}
		
	}
}
