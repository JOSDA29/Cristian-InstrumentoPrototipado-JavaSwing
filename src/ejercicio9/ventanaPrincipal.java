package ejercicio9;

import java.awt.EventQueue;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class ventanaPrincipal implements ActionListener{

	public JFrame frame;
	private JTextField txtPrimerTrimestre;
	private JTextField txtSegundoTrimestre;
	private JTextField txtTercerTrimestre;
	private JLabel lblPrimerTrimestre;
	private JLabel lblSegundoTrimestre;
	private JLabel lblTercerTrimestre;
	private JLabel lblEtiNotaFinal;
	private JLabel lblEtiResultado;
	private JButton btnCalcular;
	
	Border bordeSuspendido = BorderFactory.createLineBorder(Color.red, 2);
	Border bordeAprobado = BorderFactory.createLineBorder(Color.black, 2);
	
	public ventanaPrincipal() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.getContentPane().setLayout(null);
		
		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setBounds(20, 55, 120, 25);
		frame.getContentPane().add(txtPrimerTrimestre);
		txtPrimerTrimestre.setColumns(10);
		
		txtSegundoTrimestre = new JTextField();
		txtSegundoTrimestre.setColumns(10);
		txtSegundoTrimestre.setBounds(20, 115, 120, 25);
		frame.getContentPane().add(txtSegundoTrimestre);
		
		txtTercerTrimestre = new JTextField();
		txtTercerTrimestre.setColumns(10);
		txtTercerTrimestre.setBounds(20, 175, 120, 25);
		frame.getContentPane().add(txtTercerTrimestre);
		
		lblEtiNotaFinal = new JLabel("NOTA FINAL: ");
		lblEtiNotaFinal.setBounds(20, 274, 180, 25);
		frame.getContentPane().add(lblEtiNotaFinal);
		
		lblEtiResultado = new JLabel("");
		lblEtiResultado.setBounds(20, 306, 180, 25);
		frame.getContentPane().add(lblEtiResultado);
		
		btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBackground(new Color(0, 0, 0));
		btnCalcular.setForeground(new Color(255, 255, 255));
		btnCalcular.setBounds(20, 220, 120, 30);
		btnCalcular.addActionListener(this);
		frame.getContentPane().add(btnCalcular);
		
		lblPrimerTrimestre = new JLabel("PRIMER TRIMESTRE");
		lblPrimerTrimestre.setBounds(20, 30, 180, 25);
		frame.getContentPane().add(lblPrimerTrimestre);
		
		lblSegundoTrimestre = new JLabel("SEGUNDO TRIMESTRE");
		lblSegundoTrimestre.setBounds(20, 90, 180, 25);
		frame.getContentPane().add(lblSegundoTrimestre);
		
		lblTercerTrimestre = new JLabel("TERCER TRIMESTRE");
		lblTercerTrimestre.setBounds(20, 150, 180, 25);
		frame.getContentPane().add(lblTercerTrimestre);
		frame.setBounds(100, 100, 229, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCalcular) {
			comprobarNumero();
		}
		
	}
	
	private void comprobarNumero() {
		double nota1=0,nota2=0,nota3=0,bandera=0;
		double notaFinal;
		String adv= "Digite un dato numerico";
		
		try {
			nota1 = Integer.parseInt(txtPrimerTrimestre.getText());
		} catch (Exception e) {
			txtPrimerTrimestre.setBorder(bordeSuspendido);
			lblEtiResultado.setText(adv);
			lblEtiResultado.setForeground(Color.red);
			lblEtiNotaFinal.setText("NOTA FINAL:");
			bandera = 1;
		}
		
		try {
			nota2 = Integer.parseInt(txtSegundoTrimestre.getText());
		} catch (Exception e) {
			txtSegundoTrimestre.setBorder(bordeSuspendido);
			lblEtiResultado.setText(adv);
			lblEtiResultado.setForeground(Color.red);
			lblEtiNotaFinal.setText("NOTA FINAL:");
			bandera = 1;
		}

		try {
			nota3 = Integer.parseInt(txtTercerTrimestre.getText());
		} catch (Exception e) {
			txtTercerTrimestre.setBorder(bordeSuspendido);
			lblEtiResultado.setText(adv);
			lblEtiResultado.setForeground(Color.red);
			lblEtiNotaFinal.setText("NOTA FINAL:");
			bandera = 1;
		}
		
		if(bandera == 0) {
			notaFinal= (nota1+nota2+nota3)/3;
			lblEtiNotaFinal.setText("NOTA FINAL: "+notaFinal);
			comprobarResultado(notaFinal);
		}
	}

	private void comprobarResultado(double notaFinal) {
		if (notaFinal < 5) {
			lblEtiResultado.setText("SUSPENDIDO");
			lblEtiNotaFinal.setForeground(Color.red);
			lblEtiResultado.setForeground(Color.red);
			txtPrimerTrimestre.setBorder(bordeSuspendido);
			txtSegundoTrimestre.setBorder(bordeSuspendido);
			txtTercerTrimestre.setBorder(bordeSuspendido);
		} else if (notaFinal > 5){
			lblEtiResultado.setText("APROBADO");
			lblEtiNotaFinal.setForeground(Color.black);
			lblEtiResultado.setForeground(Color.black);
			txtPrimerTrimestre.setBorder(bordeAprobado);
			txtSegundoTrimestre.setBorder(bordeAprobado);
			txtTercerTrimestre.setBorder(bordeAprobado);
		}
		
	}

}
