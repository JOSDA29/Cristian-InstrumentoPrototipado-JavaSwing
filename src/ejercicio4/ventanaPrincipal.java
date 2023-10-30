package ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventanaPrincipal implements ActionListener{

	public JFrame frame;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JButton btnActivar;
	private JButton btnDesactivar;
	private JButton btnAceptar;
	private JLabel lblFrase;

	public ventanaPrincipal() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(61, 50, 150, 30);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setText("Ciudad");
		txtCiudad.setBounds(221, 50, 150, 30);
		frame.getContentPane().add(txtCiudad);
		txtCiudad.setColumns(10);
		
		lblFrase = new JLabel("");
		lblFrase.setBounds(61, 98, 310, 30);
		frame.getContentPane().add(lblFrase);
		
		btnActivar = new JButton("Activar");
		btnActivar.setBackground(new Color(0, 0, 0));
		btnActivar.setForeground(new Color(255, 255, 255));
		btnActivar.setBounds(81, 187, 120, 28);
		btnActivar.addActionListener(this);
		frame.getContentPane().add(btnActivar);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBackground(new Color(0, 0, 0));
		btnDesactivar.setForeground(new Color(255, 255, 255));
		btnDesactivar.setBounds(232, 187, 120, 28);
		btnDesactivar.addActionListener(this);
		frame.getContentPane().add(btnDesactivar);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBackground(new Color(0, 0, 0));
		btnAceptar.setForeground(new Color(255, 255, 255));
		btnAceptar.setBounds(152, 145, 120, 28);
		btnAceptar.addActionListener(this);
		frame.getContentPane().add(btnAceptar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nombre= txtNombre.getText();
		String ciudad= txtCiudad.getText();
		String msj= "Su nombre es "+nombre+" y recide en "+ciudad;
		
		if (e.getSource() == btnAceptar) {
			lblFrase.setText(msj);
		} else if (e.getSource() == btnDesactivar) {
			txtNombre.setEnabled(false);
			txtCiudad.setEnabled(false);
		} else if (e.getSource() == btnActivar) {
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);
		}
		
	}
}
