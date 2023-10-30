package ejercicio6;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;

public class ventanaPrincipal implements MouseListener, ActionListener{

	public JFrame frame;
	private JLabel lblEtiNombre;
	private JButton btnAgrandar;
	private JButton btnCentro;
	private JButton btnEsquina;
	private JButton btnDisminuir;
	private int labelWidth = 200;
	private int labelHeight = 40;

	public ventanaPrincipal() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBounds(100, 100, 652, 224);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		lblEtiNombre = new JLabel("JOSDA QUINVAR");
		lblEtiNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEtiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiNombre.setForeground(new Color(255, 255, 255));
		lblEtiNombre.setBackground(new Color(0, 0, 0));
		lblEtiNombre.setBounds(220, 100, 200, 40);
		lblEtiNombre.setOpaque(true);
		frame.getContentPane().add(lblEtiNombre);
		
		btnAgrandar = new JButton("Agrandar");
		btnAgrandar.setBounds(330, 35, 120, 30);
		btnAgrandar.addActionListener(this);
		btnAgrandar.addMouseListener(this);
		frame.getContentPane().add(btnAgrandar);
		
		btnCentro = new JButton("Centro");
		btnCentro.setBounds(175, 35, 120, 30);
		btnCentro.addActionListener(this);
		btnCentro.addMouseListener(this);
		frame.getContentPane().add(btnCentro);
		
		btnEsquina = new JButton("Esquina");
		btnEsquina.setBounds(20, 35, 120, 30);
		btnEsquina.addActionListener(this);
		btnEsquina.addMouseListener(this);
		frame.getContentPane().add(btnEsquina);
		
		btnDisminuir = new JButton("Disminuir");
		btnDisminuir.setBounds(485, 35, 120, 30);
		btnDisminuir.addActionListener(this);
		btnDisminuir.addMouseListener(this);
		frame.getContentPane().add(btnDisminuir);
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
		if (e.getSource() == btnAgrandar) {
			btnAgrandar.setSize(130, 40);
		}else if (e.getSource() == btnCentro) {
			btnCentro.setSize(130, 40);
		}else if (e.getSource() == btnEsquina) {
			btnEsquina.setSize(130, 40);
		}else if (e.getSource() == btnDisminuir) {
			btnDisminuir.setSize(130, 40);
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == btnAgrandar) {
			btnAgrandar.setSize(120, 30);
		}else if (e.getSource() == btnCentro) {
			btnCentro.setSize(120, 30);
		}else if (e.getSource() == btnEsquina) {
			btnEsquina.setSize(120, 30);
		}else if (e.getSource() == btnDisminuir) {
			btnDisminuir.setSize(120, 30);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAgrandar) {
			labelWidth  +=10;
			labelHeight +=10;
			Dimension newSize = new Dimension(labelWidth, labelHeight);
            lblEtiNombre.setPreferredSize(newSize);
            lblEtiNombre.setSize(newSize);
		}else if (e.getSource() == btnCentro) {
			lblEtiNombre.setLocation(190, 100);
		}else if (e.getSource() == btnEsquina) {
			lblEtiNombre.setLocation(0, 0);
		}else if (e.getSource() == btnDisminuir) {
			labelWidth  -=10;
			labelHeight -=10;
			Dimension newSize = new Dimension(labelWidth, labelHeight);
            lblEtiNombre.setPreferredSize(newSize);
            lblEtiNombre.setSize(newSize);
		}
		
	}
}
