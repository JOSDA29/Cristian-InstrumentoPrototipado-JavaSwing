package ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;

public class ventanaPrincipal implements ActionListener  {

	public JFrame frame;
	private JButton btnOcultarNombre;
	private JButton btnOcultarCiudad;
	private JButton btnVisuCiudad;
	private JButton btnVisuNombre;
	private JLabel etiCiudad;
	private JLabel etiNombre;

	
	public ventanaPrincipal() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		btnVisuNombre = new JButton("Visualizar Nombre");
		btnVisuNombre.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnVisuNombre.setBounds(222, 81, 140, 33);
		btnVisuNombre.addActionListener(this);
		frame.getContentPane().add(btnVisuNombre);
		
		btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnOcultarNombre.setBounds(70, 81, 140, 33);
		btnOcultarNombre.addActionListener(this);
		frame.getContentPane().add(btnOcultarNombre);
		
		btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnOcultarCiudad.setBounds(70, 173, 140, 33);
		btnOcultarCiudad.addActionListener(this);
		frame.getContentPane().add(btnOcultarCiudad);
		
		btnVisuCiudad = new JButton("Visualizar Ciudad");
		btnVisuCiudad.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnVisuCiudad.setBounds(222, 173, 140, 33);
		btnVisuCiudad.addActionListener(this);
		frame.getContentPane().add(btnVisuCiudad);
		
		etiNombre = new JLabel("JOSDA QUINVAR");
		etiNombre.setFont(new Font("Verdana", Font.PLAIN, 12));
		etiNombre.setForeground(new Color(255, 255, 255));
		etiNombre.setBackground(new Color(0, 0, 0));
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setBounds(70, 34, 292, 32);
		etiNombre.setOpaque(true);
		frame.getContentPane().add(etiNombre);
		
		etiCiudad = new JLabel("BOGOTA D.C");
		etiCiudad.setFont(new Font("Verdana", Font.PLAIN, 12));
		etiCiudad.setOpaque(true);
		etiCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		etiCiudad.setForeground(Color.WHITE);
		etiCiudad.setBackground(Color.BLACK);
		etiCiudad.setBounds(70, 130, 292, 32);
		frame.getContentPane().add(etiCiudad);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnVisuNombre) {
			etiNombre.setVisible(true);
		} else if(e.getSource() == btnOcultarNombre) {
			etiNombre.setVisible(false);
		} else if(e.getSource() == btnVisuCiudad) {
			etiCiudad.setVisible(true);
		}else if(e.getSource() == btnOcultarCiudad) {
			etiCiudad.setVisible(false);
		}
		
	}
}
