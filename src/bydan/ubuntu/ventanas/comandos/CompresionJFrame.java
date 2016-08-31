package bydan.ubuntu.ventanas.comandos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import bydan.ubuntu.base.Comando;
import bydan.ubuntu.ventanas.comandos.ejemplos.EjemplosGeneralJFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompresionJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombreOrigenZip;
	private JTextField textFieldNombreDestinoZip;
	private JCheckBox chckbxParaCarpetaZip;
	private JTextArea textAreaZip;
	private JTextField textFieldNombreOrigenTar;
	private JTextField textFieldNombreDestinoTar;
	private JCheckBox chckbxParaCarpetaTar;
	private JTextArea textAreaTar;
	private JTextField textFieldNombreOrigenGzip;
	private JTextField textFieldNombreDestinoGzip;
	private JTextField textFieldPathBaseZip;
	private JTextField textFieldPathBaseTar;
	private JTextField textFieldPathBaseGzip;
	private JCheckBox chckbxParaCarpetaGzip;
	private JTextArea textAreaGzip;
	private JTextField textFieldPathBaseBzip;
	private JTextField textFieldNombreOrigenBzip;
	private JTextField textFieldNombreDestinoBzip;
	private JTextField textFieldComandoZip;
	private JTextField textFieldComandoTar;
	private JTextField textFieldComandoGzip;
	private JTextField textFieldComandoBzip;
	private JTextArea textAreaBzip;
	private JCheckBox checkBoxParaCarpetaBzip;
	private JCheckBox chckbxMaximoGzip;
	private JTextField textFieldPathBaseRar;
	private JTextField textFieldNombreOrigenRar;
	private JTextField textFieldNombreDestinoRar;
	private JTextField textFieldComandoRar;
	private JTextArea textAreaRar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompresionJFrame frame = new CompresionJFrame();
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
	public CompresionJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 488, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "cell 0 0,grow");
		
		JPanel panelZip = new JPanel();
		tabbedPane.addTab("Zip", null, panelZip, null);
		panelZip.setLayout(new MigLayout("", "[grow][grow]", "[][][][][][][grow]"));
		
		JLabel lblPathBase = new JLabel("Path Base");
		panelZip.add(lblPathBase, "cell 0 0,alignx trailing");
		
		textFieldPathBaseZip = new JTextField();
		panelZip.add(textFieldPathBaseZip, "cell 1 0,growx");
		textFieldPathBaseZip.setColumns(10);
		
		JLabel lblPathOrigen = new JLabel("Nombre Origen");
		panelZip.add(lblPathOrigen, "cell 0 1,alignx trailing");
		
		textFieldNombreOrigenZip = new JTextField();
		panelZip.add(textFieldNombreOrigenZip, "cell 1 1,growx");
		textFieldNombreOrigenZip.setColumns(10);
		
		JLabel lblPathDestino = new JLabel("Nombre Destino");
		panelZip.add(lblPathDestino, "cell 0 2,alignx trailing");
		
		textFieldNombreDestinoZip = new JTextField();
		panelZip.add(textFieldNombreDestinoZip, "cell 1 2,growx");
		textFieldNombreDestinoZip.setColumns(10);
		
		chckbxParaCarpetaZip = new JCheckBox("Para Carpeta");
		panelZip.add(chckbxParaCarpetaZip, "cell 1 3");
		
		JButton btnZip = new JButton("zip");
		btnZip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "zip"; 
				
				
				if(chckbxParaCarpetaZip.isSelected()) {
					command=command + " -r";
				}
				
				command=command + " "+ textFieldNombreDestinoZip.getText();
				command=command + " "+ textFieldNombreOrigenZip.getText();
				
				textFieldComandoZip.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,textFieldPathBaseZip.getText(), CompresionJFrame.this);
				
				/*
				String[] comandos=Comando.BuildCommands("COMANDO_CON_PATH_BASE","",command);
				
				String sOutput = Comando.executeCommandsWithReturn(comandos,command,"",CompresionJFrame.this);
				
				for(String sCo:comandos) {
					System.out.println(sCo);
				}
				*/
				
				textAreaZip.setText(sOutput);
			}
		});
		panelZip.add(btnZip, "flowx,cell 0 4");
		
		textFieldComandoZip = new JTextField();
		panelZip.add(textFieldComandoZip, "cell 0 5 2 1,growx");
		textFieldComandoZip.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		panelZip.add(scrollPane, "cell 0 6 2 1,grow");
		
		textAreaZip = new JTextArea();
		scrollPane.setViewportView(textAreaZip);
		
		JButton btnUnzip = new JButton("unzip");
		btnUnzip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "unzip"; 
				
				
				if(chckbxParaCarpetaZip.isSelected()) {
					command=command + " ";
				}
				
				command=command + " "+ textFieldNombreDestinoZip.getText();
				//command=command + " "+ textFieldPathOrigenZip.getText();
				
				textFieldComandoZip.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,textFieldPathBaseZip.getText(),CompresionJFrame.this);
				
				textAreaZip.setText(sOutput);
			}
		});
		panelZip.add(btnUnzip, "cell 0 4");
		
		JPanel panelTar = new JPanel();
		tabbedPane.addTab("Tar", null, panelTar, null);
		panelTar.setLayout(new MigLayout("", "[grow][grow]", "[][][][][][][grow]"));
		
		JLabel lblPathBase_1 = new JLabel("Path Base");
		panelTar.add(lblPathBase_1, "cell 0 0,alignx trailing");
		
		textFieldPathBaseTar = new JTextField();
		panelTar.add(textFieldPathBaseTar, "cell 1 0,growx");
		textFieldPathBaseTar.setColumns(10);
		
		JLabel lblPathOrigen_1 = new JLabel("Nombre Origen");
		panelTar.add(lblPathOrigen_1, "cell 0 1,alignx trailing");
		
		textFieldNombreOrigenTar = new JTextField();
		panelTar.add(textFieldNombreOrigenTar, "cell 1 1,growx");
		textFieldNombreOrigenTar.setColumns(10);
		
		JLabel lblPathDestino_1 = new JLabel("Nombre Destino");
		panelTar.add(lblPathDestino_1, "cell 0 2,alignx trailing");
		
		textFieldNombreDestinoTar = new JTextField();
		panelTar.add(textFieldNombreDestinoTar, "cell 1 2,growx");
		textFieldNombreDestinoTar.setColumns(10);
		
		chckbxParaCarpetaTar = new JCheckBox("Para Carpeta");
		chckbxParaCarpetaTar.setEnabled(false);
		panelTar.add(chckbxParaCarpetaTar, "cell 1 3");
		
		JButton btnTar = new JButton("tar");
		btnTar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "tar"; 
				
				command=command + " -cvzf";
				
				if(chckbxParaCarpetaTar.isSelected()) {
					//command=command + " -r";
				}
				
				command=command + " "+ textFieldNombreDestinoTar.getText();
				command=command + " "+ textFieldNombreOrigenTar.getText();
				
				textFieldComandoTar.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,textFieldPathBaseTar.getText(),CompresionJFrame.this);
				
				textAreaTar.setText(sOutput);
			}
		});
		panelTar.add(btnTar, "flowx,cell 0 4");
		
		textFieldComandoTar = new JTextField();
		panelTar.add(textFieldComandoTar, "cell 0 5 2 1,growx");
		textFieldComandoTar.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panelTar.add(scrollPane_1, "cell 0 6 2 1,grow");
		
		textAreaTar = new JTextArea();
		scrollPane_1.setViewportView(textAreaTar);
		
		JButton btnTarDescomprimir = new JButton("tar Desc.");
		btnTarDescomprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "tar"; 
				
				command=command + " -xvzf";
				
				if(chckbxParaCarpetaTar.isSelected()) {
					command=command + " ";
				}
				
				command=command + " "+ textFieldNombreDestinoTar.getText();
				command=command + " "+ textFieldNombreOrigenTar.getText();
				
				textFieldComandoTar.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,textFieldPathBaseTar.getText(),CompresionJFrame.this);
				
				textAreaZip.setText(sOutput);
			}
		});
		panelTar.add(btnTarDescomprimir, "cell 0 4");
		
		JPanel panelGZip = new JPanel();
		tabbedPane.addTab("GZip", null, panelGZip, null);
		panelGZip.setLayout(new MigLayout("", "[][grow]", "[][][][][][][][grow]"));
		
		JLabel lblPathBase_2 = new JLabel("Path Base");
		panelGZip.add(lblPathBase_2, "cell 0 0,alignx trailing");
		
		textFieldPathBaseGzip = new JTextField();
		panelGZip.add(textFieldPathBaseGzip, "cell 1 0,growx");
		textFieldPathBaseGzip.setColumns(10);
		
		JLabel lblPathOrigen_2 = new JLabel("Nombre Origen");
		panelGZip.add(lblPathOrigen_2, "cell 0 1,alignx trailing");
		
		textFieldNombreOrigenGzip = new JTextField();
		panelGZip.add(textFieldNombreOrigenGzip, "cell 1 1,growx");
		textFieldNombreOrigenGzip.setColumns(10);
		
		JLabel lblPathDestino_2 = new JLabel("Nombre Destino");
		panelGZip.add(lblPathDestino_2, "cell 0 2,alignx trailing");
		
		textFieldNombreDestinoGzip = new JTextField();
		panelGZip.add(textFieldNombreDestinoGzip, "cell 1 2,growx");
		textFieldNombreDestinoGzip.setColumns(10);
		
		chckbxParaCarpetaGzip = new JCheckBox("Para Carpeta");
		panelGZip.add(chckbxParaCarpetaGzip, "cell 1 3");
		
		JButton btnGzip = new JButton("gzip");
		btnGzip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "gzip"; 
				
				command=command + " -c";
				
				if(chckbxParaCarpetaGzip.isSelected()) {				   
					command=command + " -r";
				}
				
				
				if(chckbxMaximoGzip.isSelected()) {
					command=command + " -9";
				}
				
				command=command + " "+ textFieldNombreOrigenGzip.getText();
				
				command=command + " > "+ textFieldNombreDestinoGzip.getText();
				
				textFieldComandoGzip.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,textFieldPathBaseGzip.getText(),CompresionJFrame.this);
				
				textAreaGzip.setText(sOutput);
			}
		});
		
		chckbxMaximoGzip = new JCheckBox("Maximo");
		panelGZip.add(chckbxMaximoGzip, "cell 1 4");
		panelGZip.add(btnGzip, "flowx,cell 0 5");
		
		textFieldComandoGzip = new JTextField();
		panelGZip.add(textFieldComandoGzip, "cell 0 6 2 1,growx");
		textFieldComandoGzip.setColumns(10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		panelGZip.add(scrollPane_2, "cell 0 7 2 1,grow");
		
		textAreaGzip = new JTextArea();
		scrollPane_2.setViewportView(textAreaGzip);
		
		JButton btnGunzip = new JButton("gunzip");
		btnGunzip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "gunzip"; 
				
				
				if(chckbxParaCarpetaGzip.isSelected()) {
					//command=command + " ";
				}
				
				command=command + " "+ textFieldNombreDestinoGzip.getText();
				//command=command + " "+ textFieldPathOrigenZip.getText();
				
				textFieldComandoGzip.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,textFieldPathBaseGzip.getText(),CompresionJFrame.this);
				
				textAreaGzip.setText(sOutput);
			}
		});
		panelGZip.add(btnGunzip, "cell 0 5");
		
		JPanel panelBZip = new JPanel();
		tabbedPane.addTab("BZip", null, panelBZip, null);
		panelBZip.setLayout(new MigLayout("", "[][grow]", "[][][][][][][grow]"));
		
		JLabel label = new JLabel("Path Base");
		panelBZip.add(label, "cell 0 0,alignx trailing");
		
		textFieldPathBaseBzip = new JTextField();
		textFieldPathBaseBzip.setColumns(10);
		panelBZip.add(textFieldPathBaseBzip, "cell 1 0,growx");
		
		JLabel label_1 = new JLabel("Nombre Origen");
		panelBZip.add(label_1, "cell 0 1,alignx trailing");
		
		textFieldNombreOrigenBzip = new JTextField();
		textFieldNombreOrigenBzip.setColumns(10);
		panelBZip.add(textFieldNombreOrigenBzip, "cell 1 1,growx");
		
		JLabel label_2 = new JLabel("Nombre Destino");
		panelBZip.add(label_2, "cell 0 2,alignx trailing");
		
		textFieldNombreDestinoBzip = new JTextField();
		textFieldNombreDestinoBzip.setColumns(10);
		panelBZip.add(textFieldNombreDestinoBzip, "cell 1 2,growx");
		
		checkBoxParaCarpetaBzip = new JCheckBox("Para Carpeta");
		checkBoxParaCarpetaBzip.setEnabled(false);
		panelBZip.add(checkBoxParaCarpetaBzip, "cell 1 3");
		
		JButton btnBzip = new JButton("Bzip");
		btnBzip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "bzip2"; 
				
				//command=command + " -c";
				
				if(checkBoxParaCarpetaBzip.isSelected()) {				   
					//command=command + " -r";
				}
				
				command=command + " "+ textFieldNombreOrigenBzip.getText();
				
				//command=command + " > "+ textFieldNombreDestinoBzip.getText();
				
				textFieldComandoBzip.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,textFieldPathBaseBzip.getText(),CompresionJFrame.this);
				
				textAreaBzip.setText(sOutput);
			}
		});
		panelBZip.add(btnBzip, "flowx,cell 0 4");
		
		textFieldComandoBzip = new JTextField();
		panelBZip.add(textFieldComandoBzip, "cell 0 5 2 1,growx");
		textFieldComandoBzip.setColumns(10);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		panelBZip.add(scrollPane_3, "cell 0 6 2 1,grow");
		
		textAreaBzip = new JTextArea();
		scrollPane_3.setViewportView(textAreaBzip);
		
		JButton btnBunzip = new JButton("BUnzip");
		btnBunzip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "bunzip2"; 
				
				
				if(checkBoxParaCarpetaBzip.isSelected()) {
					//command=command + " ";
				}
				
				command=command + " "+ textFieldNombreDestinoBzip.getText();
				//command=command + " "+ textFieldPathOrigenZip.getText();
				
				textFieldComandoBzip.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,textFieldPathBaseBzip.getText(),CompresionJFrame.this);
				
				textAreaBzip.setText(sOutput);
			}
		});
		panelBZip.add(btnBunzip, "cell 0 4");
		
		JPanel panelRar = new JPanel();
		tabbedPane.addTab("Rar", null, panelRar, null);
		panelRar.setLayout(new MigLayout("", "[][grow]", "[][][][][][grow]"));
		
		JLabel label_3 = new JLabel("Path Base");
		panelRar.add(label_3, "cell 0 0,alignx trailing");
		
		textFieldPathBaseRar = new JTextField();
		textFieldPathBaseRar.setColumns(10);
		panelRar.add(textFieldPathBaseRar, "cell 1 0,growx");
		
		JLabel label_4 = new JLabel("Nombre Origen");
		panelRar.add(label_4, "cell 0 1,alignx trailing");
		
		textFieldNombreOrigenRar = new JTextField();
		textFieldNombreOrigenRar.setColumns(10);
		panelRar.add(textFieldNombreOrigenRar, "cell 1 1,growx");
		
		JLabel label_5 = new JLabel("Nombre Destino");
		panelRar.add(label_5, "cell 0 2,alignx trailing");
		
		textFieldNombreDestinoRar = new JTextField();
		textFieldNombreDestinoRar.setColumns(10);
		panelRar.add(textFieldNombreDestinoRar, "cell 1 2,growx");
		
		JButton btnRar = new JButton("rar");
		btnRar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "rar"; 
				
				command=command + " a";
												
				
				command=command + " "+ textFieldNombreDestinoRar.getText();
				
				command=command + " "+ textFieldNombreOrigenRar.getText();
												
				textFieldComandoRar.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,textFieldPathBaseRar.getText(),CompresionJFrame.this);
				
				textAreaRar.setText(sOutput);
			}
		});
		panelRar.add(btnRar, "flowx,cell 0 3");
		
		textFieldComandoRar = new JTextField();
		textFieldComandoRar.setColumns(10);
		panelRar.add(textFieldComandoRar, "cell 0 4 2 1,growx");
		
		JScrollPane scrollPane_4 = new JScrollPane();
		panelRar.add(scrollPane_4, "cell 0 5 2 1,grow");
		
		textAreaRar = new JTextArea();
		scrollPane_4.setViewportView(textAreaRar);
		
		JButton btnUnrar = new JButton("unrar");
		btnUnrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "rar"; 
				
				command=command + " x";
								
				
				command=command + " "+ textFieldNombreDestinoRar.getText();
				//command=command + " "+ textFieldPathOrigenZip.getText();
				
				textFieldComandoRar.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,textFieldPathBaseRar.getText(),CompresionJFrame.this);
				
				textAreaRar.setText(sOutput);
			}
		});
		panelRar.add(btnUnrar, "cell 0 3");
		
		JPanel panelEjemplos = new JPanel();
		tabbedPane.addTab("Ejemplos", null, panelEjemplos, null);
		panelEjemplos.setLayout(new MigLayout("", "[]", "[][][][]"));
		
		JButton btnZip_1 = new JButton("zip");
		btnZip_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("zip", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("zip");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnZip_1, "cell 0 0");
		
		JButton btnRar_1 = new JButton("rar");
		btnRar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("rar", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("rar");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnRar_1, "cell 0 1");
		
		JButton btnTar_1 = new JButton("tar");
		btnTar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("tar", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("tar");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnTar_1, "cell 0 2");
		
		JButton btnGzip_1 = new JButton("gzip");
		btnGzip_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("gzip", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("gzip");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnGzip_1, "cell 0 3");
	}
}
