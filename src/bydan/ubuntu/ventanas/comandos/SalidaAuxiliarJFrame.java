package bydan.ubuntu.ventanas.comandos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;

import bydan.ubuntu.base.Comando;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SalidaAuxiliarJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPathBase;
	private JTextField textFieldNombreArchivo;
	private JCheckBox chckbxSobreEscribir;
	private JTextArea textAreaComandoGeneral;
	private JCheckBox chckbxParaError;
	private JTextArea textAreaSalida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalidaAuxiliarJFrame frame = new SalidaAuxiliarJFrame();
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
	public SalidaAuxiliarJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 501, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[grow][grow]"));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "cell 0 0 1 2,grow");
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Salida", null, panel, null);
		panel.setLayout(new MigLayout("", "[grow][grow]", "[][][][grow][][grow]"));
		
		JLabel lblPathBase = new JLabel("Path Base");
		panel.add(lblPathBase, "cell 0 0,alignx trailing");
		
		textFieldPathBase = new JTextField();
		panel.add(textFieldPathBase, "cell 1 0,alignx left");
		textFieldPathBase.setColumns(25);
		
		JLabel lblNombreArchivo = new JLabel("Nombre Archivo");
		panel.add(lblNombreArchivo, "cell 0 1,alignx trailing");
		
		textFieldNombreArchivo = new JTextField();
		panel.add(textFieldNombreArchivo, "cell 1 1,alignx left");
		textFieldNombreArchivo.setColumns(25);
		
		chckbxSobreEscribir = new JCheckBox("Sobre Escribir");
		panel.add(chckbxSobreEscribir, "cell 0 2");
		
		chckbxParaError = new JCheckBox("Para Error");
		panel.add(chckbxParaError, "cell 1 2");
		
		JLabel lblComandoGeneral = new JLabel("Comando General");
		panel.add(lblComandoGeneral, "cell 0 3");
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, "cell 1 3,grow");
		
		textAreaComandoGeneral = new JTextArea();
		scrollPane.setViewportView(textAreaComandoGeneral);
		
		JButton btnStdout = new JButton("StdOut-Err");
		btnStdout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = ""; 
				
				command=command + textAreaComandoGeneral.getText();				
				
				if(!chckbxParaError.isSelected()) {
					if(chckbxSobreEscribir.isSelected()) {
						command=command + " >>";
						
					} else {
						command=command + " >";
					}
					
				} else {
					if(chckbxSobreEscribir.isSelected()) {
						command=command + " 2>>";
						
					} else {
						command=command + " 2>";
					}
				}
								
				
				command=command + " "+ textFieldPathBase.getText() + "/" + textFieldNombreArchivo.getText();				
				
				//String sOutput = Comando.executeCommandWithReturn(command,SalidaAuxiliarJFrame.this);								
				//textAreaSalida.setText(sOutput);
				
				Comando.executeCommand(command,SalidaAuxiliarJFrame.this);
				
				
				String commandCat = "cat"; 
				
				commandCat=commandCat + " "+ textFieldPathBase.getText() + "/" + textFieldNombreArchivo.getText();
				
				String sOutputCat = Comando.executeCommandWithReturn(commandCat,SalidaAuxiliarJFrame.this);
				
				textAreaSalida.setText(sOutputCat);
			}
		});
		panel.add(btnStdout, "cell 0 4");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel.add(scrollPane_1, "cell 0 5 2 1,grow");
		
		textAreaSalida = new JTextArea();
		scrollPane_1.setViewportView(textAreaSalida);
	}
}
