package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;

public class ventanaPrincipal implements KeyListener, ActionListener{

	public JFrame frame;
	private JTextField txtTexto;
	private JTextField etiTexto;
	private JButton btnVaciar;

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
		
		txtTexto = new JTextField();
		txtTexto.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtTexto.setHorizontalAlignment(SwingConstants.CENTER);
		txtTexto.setBounds(41, 44, 338, 45);
		frame.getContentPane().add(txtTexto);
		txtTexto.setColumns(10);
		txtTexto.addKeyListener(this);
		
		etiTexto = new JTextField();
		etiTexto.setFont(new Font("Verdana", Font.PLAIN, 11));
		etiTexto.setEditable(false);
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setColumns(10);
		etiTexto.setBounds(41, 124, 338, 45);
		frame.getContentPane().add(etiTexto);
		
		btnVaciar = new JButton("VACIAR");
		btnVaciar.setForeground(new Color(255, 255, 255));
		btnVaciar.setBackground(new Color(0, 0, 0));
		btnVaciar.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnVaciar.setBounds(151, 194, 120, 30);
		btnVaciar.addActionListener(this);
		frame.getContentPane().add(btnVaciar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnVaciar) {
			txtTexto.setText("");
			etiTexto.setText("");
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		String contenido = txtTexto.getText();
	    etiTexto.setText(contenido);
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
