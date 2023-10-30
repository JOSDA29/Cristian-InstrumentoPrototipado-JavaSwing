package ejercicio11;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class ventanaPrincipal implements MouseListener, ActionListener{

	public JFrame frame;
	private JTextField txtNumeros;
	private JLabel lblEtiNueve;
	private JLabel lblEtiOcho;
	private JLabel lblEtiSiete;
	private JLabel lblEtiSeis;
	private JLabel lblEtiCinco;
	private JLabel lblEtiCuatro;
	private JLabel lblEtiTres;
	private JLabel lblEtiDos;
	private JLabel lblEtiUno;
	private JLabel lblEtiCero;
	private JButton btnVaciar;

	public ventanaPrincipal() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBounds(100, 100, 468, 249);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		lblEtiCero = new JLabel("0");
		lblEtiCero.setBackground(new Color(0, 0, 0));
		lblEtiCero.setForeground(new Color(255, 255, 255));
		lblEtiCero.setOpaque(true);
		lblEtiCero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEtiCero.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiCero.setBounds(30, 30, 30, 30);
		lblEtiCero.addMouseListener(this);
		frame.getContentPane().add(lblEtiCero);
		
		lblEtiUno = new JLabel("1");
		lblEtiUno.setOpaque(true);
		lblEtiUno.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiUno.setForeground(Color.WHITE);
		lblEtiUno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEtiUno.setBackground(Color.BLACK);
		lblEtiUno.setBounds(70, 30, 30, 30);
		lblEtiUno.addMouseListener(this);
		frame.getContentPane().add(lblEtiUno);
		
		lblEtiDos = new JLabel("2");
		lblEtiDos.setOpaque(true);
		lblEtiDos.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiDos.setForeground(Color.WHITE);
		lblEtiDos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEtiDos.setBackground(Color.BLACK);
		lblEtiDos.setBounds(107, 30, 30, 30);
		lblEtiDos.addMouseListener(this);
		frame.getContentPane().add(lblEtiDos);
		
		lblEtiTres = new JLabel("3");
		lblEtiTres.setOpaque(true);
		lblEtiTres.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiTres.setForeground(Color.WHITE);
		lblEtiTres.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEtiTres.setBackground(Color.BLACK);
		lblEtiTres.setBounds(147, 30, 30, 30);
		lblEtiTres.addMouseListener(this);
		frame.getContentPane().add(lblEtiTres);
		
		lblEtiCuatro = new JLabel("4");
		lblEtiCuatro.setOpaque(true);
		lblEtiCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiCuatro.setForeground(Color.WHITE);
		lblEtiCuatro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEtiCuatro.setBackground(Color.BLACK);
		lblEtiCuatro.setBounds(187, 30, 30, 30);
		lblEtiCuatro.addMouseListener(this);
		frame.getContentPane().add(lblEtiCuatro);
		
		lblEtiCinco = new JLabel("5");
		lblEtiCinco.setOpaque(true);
		lblEtiCinco.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiCinco.setForeground(Color.WHITE);
		lblEtiCinco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEtiCinco.setBackground(Color.BLACK);
		lblEtiCinco.setBounds(227, 30, 30, 30);
		lblEtiCinco.addMouseListener(this);
		frame.getContentPane().add(lblEtiCinco);
		
		lblEtiSeis = new JLabel("6");
		lblEtiSeis.setOpaque(true);
		lblEtiSeis.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiSeis.setForeground(Color.WHITE);
		lblEtiSeis.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEtiSeis.setBackground(Color.BLACK);
		lblEtiSeis.setBounds(267, 30, 30, 30);
		lblEtiSeis.addMouseListener(this);
		frame.getContentPane().add(lblEtiSeis);
		
		lblEtiSiete = new JLabel("7");
		lblEtiSiete.setOpaque(true);
		lblEtiSiete.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiSiete.setForeground(Color.WHITE);
		lblEtiSiete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEtiSiete.setBackground(Color.BLACK);
		lblEtiSiete.setBounds(307, 30, 30, 30);
		lblEtiSiete.addMouseListener(this);
		frame.getContentPane().add(lblEtiSiete);
		
		lblEtiOcho = new JLabel("8");
		lblEtiOcho.setOpaque(true);
		lblEtiOcho.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiOcho.setForeground(Color.WHITE);
		lblEtiOcho.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEtiOcho.setBackground(Color.BLACK);
		lblEtiOcho.setBounds(347, 30, 30, 30);
		lblEtiOcho.addMouseListener(this);
		frame.getContentPane().add(lblEtiOcho);
		
		lblEtiNueve = new JLabel("9");
		lblEtiNueve.setOpaque(true);
		lblEtiNueve.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiNueve.setForeground(Color.WHITE);
		lblEtiNueve.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEtiNueve.setBackground(Color.BLACK);
		lblEtiNueve.setBounds(387, 30, 30, 30);
		lblEtiNueve.addMouseListener(this);
		frame.getContentPane().add(lblEtiNueve);
		
		txtNumeros = new JTextField();
		txtNumeros.setBounds(30, 80, 387, 57);
		frame.getContentPane().add(txtNumeros);
		txtNumeros.setColumns(10);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.setBackground(new Color(0, 0, 0));
		btnVaciar.setForeground(new Color(255, 255, 255));
		btnVaciar.setBounds(150, 155, 150, 30);
		btnVaciar.addActionListener(this);
		frame.getContentPane().add(btnVaciar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnVaciar) {
			txtNumeros.setText("");
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		String num0 = lblEtiCero.getText(),num1 = lblEtiUno.getText(),num2 = lblEtiDos.getText(),num3 = lblEtiTres.getText(),num4 = lblEtiCuatro.getText(),
				num5 = lblEtiCinco.getText(),num6 = lblEtiSeis.getText(),num7 = lblEtiSiete.getText(),num8 = lblEtiOcho.getText(),num9 = lblEtiNueve.getText();
		String palabra = txtNumeros.getText();
		
		if (e.getSource() == lblEtiCero) {
			palabra += num0;
			txtNumeros.setText(palabra);
		}else if (e.getSource() == lblEtiUno) {
			palabra += num1;
			txtNumeros.setText(palabra);
		}else if (e.getSource() == lblEtiDos) {
			palabra += num2;
			txtNumeros.setText(palabra);
		}else if (e.getSource() == lblEtiTres) {
			palabra += num3;
			txtNumeros.setText(palabra);
		}else if (e.getSource() == lblEtiCuatro) {
			palabra += num4;
			txtNumeros.setText(palabra);
		}else if (e.getSource() == lblEtiCinco) {
			palabra += num5;
			txtNumeros.setText(palabra);
		}else if (e.getSource() == lblEtiSeis) {
			palabra += num6;
			txtNumeros.setText(palabra);
		}else if (e.getSource() == lblEtiSiete) {
			palabra += num7;
			txtNumeros.setText(palabra);
		}else if (e.getSource() == lblEtiOcho) {
			palabra += num8;
			txtNumeros.setText(palabra);
		}else if (e.getSource() == lblEtiNueve) {
			palabra += num9;
			txtNumeros.setText(palabra);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
