package ejercicio10;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ventanaPrincipal implements ActionListener{

	public JFrame frame;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	private JTextField txtEtiTexto;
	private JButton btnConcatenar;
	private JButton btnVaciar;

	public ventanaPrincipal() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.getContentPane().setLayout(null);
		
		txtPalabra1 = new JTextField();
		txtPalabra1.setBounds(43, 43, 150, 25);
		frame.getContentPane().add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setColumns(10);
		txtPalabra2.setBounds(210, 43, 150, 25);
		frame.getContentPane().add(txtPalabra2);
		
		JLabel lblPalabra1 = new JLabel("Primera Palabra");
		lblPalabra1.setBounds(43, 18, 109, 20);
		frame.getContentPane().add(lblPalabra1);
		
		JLabel lblPalabraDos = new JLabel("Segunda Palabra");
		lblPalabraDos.setBounds(210, 18, 109, 20);
		frame.getContentPane().add(lblPalabraDos);
		
		txtEtiTexto = new JTextField();
		txtEtiTexto.setEditable(false);
		txtEtiTexto.setBounds(43, 128, 317, 56);
		frame.getContentPane().add(txtEtiTexto);
		txtEtiTexto.setColumns(10);
		
		btnConcatenar = new JButton("Concatenar");
		btnConcatenar.setBackground(new Color(0, 0, 0));
		btnConcatenar.setForeground(new Color(255, 255, 255));
		btnConcatenar.setBounds(80, 85, 120, 30);
		btnConcatenar.addActionListener(this);
		frame.getContentPane().add(btnConcatenar);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.setForeground(Color.WHITE);
		btnVaciar.setBackground(Color.BLACK);
		btnVaciar.setBounds(210, 85, 120, 30);
		btnVaciar.addActionListener(this);
		frame.getContentPane().add(btnVaciar);
		frame.setBounds(100, 100, 411, 242);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String palabra1 = txtPalabra1.getText(), palabra2 = txtPalabra2.getText();
		String palabra = txtEtiTexto.getText();
		if (e.getSource() == btnConcatenar) {
				palabra +=palabra1+palabra2;
				txtEtiTexto.setText(palabra);
		} else if (e.getSource() == btnVaciar) {
			txtEtiTexto.setText("");
	}
		
	}

}
