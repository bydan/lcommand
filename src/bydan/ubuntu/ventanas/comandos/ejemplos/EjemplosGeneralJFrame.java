package bydan.ubuntu.ventanas.comandos.ejemplos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.InputStream;
import java.util.Scanner;

public class EjemplosGeneralJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTipo;
	private JLabel lblSubtipo;
	private JTextField textFieldSubTipo;
	private JTextArea textAreaEjemplos;
	private JScrollPane scrollPane;
	private JButton btnCargar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemplosGeneralJFrame frame = new EjemplosGeneralJFrame();
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
	public EjemplosGeneralJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 586, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][][][grow]", "[][][grow]"));
		
		JLabel lblTipo = new JLabel("Tipo:");
		contentPane.add(lblTipo, "cell 0 0,alignx trailing");
		
		textFieldTipo = new JTextField();
		contentPane.add(textFieldTipo, "cell 1 0,alignx left");
		textFieldTipo.setColumns(10);
		
		lblSubtipo = new JLabel("SubTipo:");
		contentPane.add(lblSubtipo, "cell 2 0,alignx trailing");
		
		textFieldSubTipo = new JTextField();
		contentPane.add(textFieldSubTipo, "cell 3 0,alignx left");
		textFieldSubTipo.setColumns(10);
		
		btnCargar = new JButton("Cargar");
		btnCargar.setVisible(false);
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InputStream inputStream = AuxiliarEjemplos.class.getResourceAsStream("cat.txt");
				
				String sData=EjemplosGeneralJFrame.convertStreamToString(inputStream);
				
				textAreaEjemplos.setText(sData);
			}
		});
		contentPane.add(btnCargar, "cell 0 1");
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 2 4 1,grow");
		
		textAreaEjemplos = new JTextArea();
		scrollPane.setViewportView(textAreaEjemplos);
	}
	
	public static String convertStreamToString(InputStream inputStream) {
	    Scanner scanner = new Scanner(inputStream).useDelimiter("\\A");
	    
	    return scanner.hasNext() ? scanner.next() : "";
	}

	public void CargarEjemplos(String sNombreArchivo) {
		InputStream inputStream = AuxiliarEjemplos.class.getResourceAsStream(sNombreArchivo + ".txt");
		
		String sData=EjemplosGeneralJFrame.convertStreamToString(inputStream);
		
		textAreaEjemplos.setText(sData);
	}
	
	public void InicializarTitulos(String sTipo,String sSubTipo) {
		textFieldTipo.setText(sTipo);
		textFieldSubTipo.setText(sSubTipo);
		
		this.setTitle(sTipo+"-"+sSubTipo);
	}
	
	public JTextField getTextFieldTipo() {
		return textFieldTipo;
	}

	public void setTextFieldTipo(JTextField textFieldTipo) {
		this.textFieldTipo = textFieldTipo;
	}

	public JTextField getTextField() {
		return textFieldSubTipo;
	}

	public void setTextField(JTextField textField) {
		this.textFieldSubTipo = textField;
	}

	public JTextArea getTextAreaEjemplos() {
		return textAreaEjemplos;
	}

	public void setTextAreaEjemplos(JTextArea textAreaEjemplos) {
		this.textAreaEjemplos = textAreaEjemplos;
	}

	public JButton getBtnCargar() {
		return btnCargar;
	}

	public void setBtnCargar(JButton btnCargar) {
		this.btnCargar = btnCargar;
	}
}
