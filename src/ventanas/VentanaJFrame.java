package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JTextField textFieldClave;
	private JTextField textFieldResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaJFrame frame = new VentanaJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow]", "[][][][]"));
		
		JLabel lblUsuario = new JLabel("Usuario");
		contentPane.add(lblUsuario, "cell 0 0,alignx trailing");
		
		textFieldUsuario = new JTextField();
		contentPane.add(textFieldUsuario, "cell 1 0,alignx left");
		textFieldUsuario.setColumns(10);
		
		JLabel lblClave = new JLabel("Clave");
		contentPane.add(lblClave, "cell 0 1,alignx trailing");
		
		textFieldClave = new JTextField();
		textFieldClave.setText("");
		contentPane.add(textFieldClave, "cell 1 1,alignx left");
		textFieldClave.setColumns(10);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Integer x=0;
				Integer y=0;
				Integer z=0;
				
				x=Integer.parseInt(textFieldUsuario.getText());
				y=Integer.parseInt(textFieldClave.getText());
				
				z=x+y;
				
				textFieldResultado.setText(z.toString());
			}
		});
		
		textFieldResultado = new JTextField();
		contentPane.add(textFieldResultado, "cell 1 2,alignx left");
		textFieldResultado.setColumns(10);
		contentPane.add(btnProcesar, "cell 1 3,alignx left");
	}
}
