package ejercicio5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ventanaPrincipal implements MouseListener {

	public JFrame frame;
	private JLabel lblEtiOcultar;
	private JLabel lblEtiPal4;
	private JLabel lblEtiPal3;
	private JLabel lblEtiPal2;
	private JLabel lblEtiPal1;

	public ventanaPrincipal() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBounds(100, 100, 450, 210);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		lblEtiPal1 = new JLabel("I");
		lblEtiPal1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEtiPal1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiPal1.setBounds(80, 50, 46, 20);
		frame.getContentPane().add(lblEtiPal1);
		
		lblEtiPal2 = new JLabel("AM");
		lblEtiPal2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEtiPal2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiPal2.setBounds(140, 50, 46, 20);
		frame.getContentPane().add(lblEtiPal2);
		
		lblEtiPal3 = new JLabel("JOSDA");
		lblEtiPal3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEtiPal3.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiPal3.setBounds(200, 50, 70, 20);
		frame.getContentPane().add(lblEtiPal3);
		
		lblEtiPal4 = new JLabel("QUINVAR");
		lblEtiPal4.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiPal4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEtiPal4.setBounds(280, 50, 80, 20);
		frame.getContentPane().add(lblEtiPal4);
		
		lblEtiOcultar = new JLabel("OCULTAR");
		lblEtiOcultar.setBackground(new Color(0, 0, 0));
		lblEtiOcultar.setForeground(new Color(255, 255, 255));
		lblEtiOcultar.setOpaque(true);
		lblEtiOcultar.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblEtiOcultar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtiOcultar.setBounds(150, 90, 127, 30);
		lblEtiOcultar.addMouseListener(this);
		frame.getContentPane().add(lblEtiOcultar);
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
		if (e.getSource()== lblEtiOcultar) {
			lblEtiPal1.setVisible(false);
			lblEtiPal2.setVisible(false);
			lblEtiPal3.setVisible(false);
			lblEtiPal4.setVisible(false);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource()== lblEtiOcultar) {
			lblEtiPal1.setVisible(true);
			lblEtiPal2.setVisible(true);
			lblEtiPal3.setVisible(true);
			lblEtiPal4.setVisible(true);
		}		
	}

}
