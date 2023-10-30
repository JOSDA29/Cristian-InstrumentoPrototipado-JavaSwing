package ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class ventanaPrincipal implements ActionListener{

	public JFrame frame;
	private JTextField txtTexto;
	private JButton btnTraspasa1;
	private JButton btnTraspasa2;
	private JTextField etiTexto1;
	private JTextField etiTexto2;

	public ventanaPrincipal() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.getContentPane().setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtTexto.setForeground(new Color(0, 0, 0));
		txtTexto.setToolTipText("");
		txtTexto.setHorizontalAlignment(SwingConstants.CENTER);
		txtTexto.setText("Digite un texto");
		txtTexto.setBounds(145, 42, 202, 32);
		frame.getContentPane().add(txtTexto);
		txtTexto.setColumns(10);
		
		btnTraspasa1 = new JButton("Trapasar ");
		btnTraspasa1.setBackground(new Color(0, 0, 0));
		btnTraspasa1.setForeground(new Color(255, 255, 255));
		btnTraspasa1.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnTraspasa1.setBounds(80, 140, 101, 30);
		btnTraspasa1.addActionListener(this);
		frame.getContentPane().add(btnTraspasa1);
		
		btnTraspasa2 = new JButton("Traspasar");
		btnTraspasa2.setForeground(new Color(255, 255, 255));
		btnTraspasa2.setBackground(new Color(0, 0, 0));
		btnTraspasa2.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnTraspasa2.setBounds(309, 140, 101, 30);
		btnTraspasa2.addActionListener(this);
		frame.getContentPane().add(btnTraspasa2);
		
		etiTexto1 = new JTextField();
		etiTexto1.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto1.setEditable(false);
		etiTexto1.setBounds(31, 97, 202, 32);
		frame.getContentPane().add(etiTexto1);
		etiTexto1.setColumns(10);
		
		etiTexto2 = new JTextField();
		etiTexto2.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto2.setEditable(false);
		etiTexto2.setColumns(10);
		etiTexto2.setBounds(253, 97, 202, 32);
		frame.getContentPane().add(etiTexto2);
		frame.setBounds(100, 100, 497, 245);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnTraspasa1) {
			String contenido = txtTexto.getText();
			etiTexto1.setText(contenido);
		} else if(e.getSource() == btnTraspasa2) {
			String contenido = txtTexto.getText();
			etiTexto2.setText(contenido);
		};
		
	}
}
