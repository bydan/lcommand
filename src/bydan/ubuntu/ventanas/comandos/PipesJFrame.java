package bydan.ubuntu.ventanas.comandos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JScrollPane;

import bydan.ubuntu.base.Comando;

public class PipesJFrame extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private JTextArea textAreaResultado;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JButton btnEjecutar_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PipesJFrame frame = new PipesJFrame();
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
	public PipesJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 684, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow]", "[][][grow]"));
		
		JLabel lblComandos = new JLabel("Comando");
		contentPane.add(lblComandos, "cell 0 0");
		
		scrollPane_1 = new JScrollPane();
		contentPane.add(scrollPane_1, "cell 1 0,grow");
		
		textArea = new JTextArea();
		textArea.setToolTipText("ls -l  /home/bydan | more\n");
		scrollPane_1.setViewportView(textArea);
		textArea.setRows(10);
		textArea.setColumns(30);
		
		JButton btnEjecutar = new JButton("Ejecutar Retorno");
		btnEjecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String domainName = "google.com";
				
				String command = textArea.getText(); //"ping -c 3 " + domainName;
				
				String sOutput = Comando.executeCommandWithReturn(command,true);

				//System.out.println(sOutput);
				
				textAreaResultado.setText(sOutput);
			}
		});
		
		btnEjecutar_1 = new JButton("Ejecutar");
		btnEjecutar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = textArea.getText();
				
				Comando.executeCommand(command);				
			}
		});
		contentPane.add(btnEjecutar_1, "flowx,cell 1 1");
		contentPane.add(btnEjecutar, "cell 1 1");
		
		JLabel lblResultado = new JLabel("Resultado");
		contentPane.add(lblResultado, "cell 0 2");
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 1 2,grow");
		
		textAreaResultado = new JTextArea();
		scrollPane.setViewportView(textAreaResultado);
		textAreaResultado.setEditable(false);
		textAreaResultado.setColumns(30);
		textAreaResultado.setRows(10);
	}

	
}
