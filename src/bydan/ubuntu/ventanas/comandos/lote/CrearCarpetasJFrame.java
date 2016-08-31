package bydan.ubuntu.ventanas.comandos.lote;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import bydan.ubuntu.base.Comando;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.JCheckBox;

public class CrearCarpetasJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPathBase;
	private JTextField textFieldNumeroCarpetasArchivos;
	private JTextArea textAreaGeneral;
	private JCheckBox chckbxParaArchivos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearCarpetasJFrame frame = new CrearCarpetasJFrame();
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
	public CrearCarpetasJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "cell 0 0,grow");
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("General", null, panel, null);
		panel.setLayout(new MigLayout("", "[][grow]", "[][][][][grow]"));
		
		JLabel lblPathBase = new JLabel("Path Base");
		panel.add(lblPathBase, "cell 0 0,alignx trailing");
		
		textFieldPathBase = new JTextField();
		textFieldPathBase.setText("/home/bydan/carpetas");
		panel.add(textFieldPathBase, "cell 1 0,growx");
		textFieldPathBase.setColumns(10);
		
		JLabel lblNumCarpetas = new JLabel("Num Carpetas/Archivos");
		panel.add(lblNumCarpetas, "cell 0 1,alignx trailing");
		
		textFieldNumeroCarpetasArchivos = new JTextField();
		textFieldNumeroCarpetasArchivos.setText("5");
		panel.add(textFieldNumeroCarpetasArchivos, "cell 1 1,growx");
		textFieldNumeroCarpetasArchivos.setColumns(10);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "";
				String commandBase = "mkdir";
				String extension = "";
				//String[] commands = null;
				
				if(chckbxParaArchivos.isSelected()) {
					commandBase = "touch";
					extension = ".txt";
				}
				
				Integer iNumeroCarpetas=Integer.parseInt(textFieldNumeroCarpetasArchivos.getText());
				
				//commands = new String[iNumeroCarpetas+2];
				
				//commands[0]="bash";
				//commands[1]="-c";
				
				File fileFolder = new File(textFieldPathBase.getText());
				
				fileFolder.mkdirs();
								
				for(Integer i=2;i<(iNumeroCarpetas+2);i++) {
					command = " "+commandBase+" "+textFieldPathBase.getText() + "/" + i + extension ; 
					
					Comando.executeCommand(command,textFieldPathBase.getText());
					
					//commands[i]=command;
				}
				
					
				//SOLO SE EJECUTA 1 COMANDO A LA VEZ
				/*
				for(String sCommand:commands){
					System.out.print(sCommand);
				}
				
				Comando.executeCommands(commands,command,textFieldPathBase.getText());
				*/	
				
				
				String commandLs = "";
				
				commandLs = "ls -a "+ textFieldPathBase.getText();				
				
				String sOutput = Comando.executeCommandWithReturn(commandLs,CrearCarpetasJFrame.this,false);
				
				textAreaGeneral.setText(sOutput);
			}
		});
		
		chckbxParaArchivos = new JCheckBox("Para Archivos");
		panel.add(chckbxParaArchivos, "cell 1 2");
		panel.add(btnProcesar, "cell 0 3");
		
		JButton btnVer = new JButton("Ver");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String commandLs = "";
				
				commandLs = "ls -a "+ textFieldPathBase.getText();				
				
				String sOutput = Comando.executeCommandWithReturn(commandLs,CrearCarpetasJFrame.this,true);
				
				textAreaGeneral.setText(sOutput);
			}
		});
		panel.add(btnVer, "cell 1 3");
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, "cell 0 4 2 1,grow");
		
		textAreaGeneral = new JTextArea();
		scrollPane.setViewportView(textAreaGeneral);
	}

}
