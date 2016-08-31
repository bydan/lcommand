package bydan.ubuntu.ventanas.comandos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JTextField;

import bydan.ubuntu.base.Comando;
import bydan.ubuntu.base.Constantes;
import bydan.ubuntu.ventanas.comandos.ejemplos.EjemplosGeneralJFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

import java.awt.Label;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class BasicoGeneralJFrame extends JFrame {

	private JPanel contentPane;
	private JTextArea textAreaWho;
	private JTextField textFieldComandoType;
	private JTextField textFieldPath;
	private JTextArea textAreaLs;
	private JCheckBox chckbxHora;
	private JCheckBox chckbxMes;	
	private JCheckBox chckbxAnio;
	private JTextField textFieldDate;
	private JTextField textFieldAnio;
	private JTextField textFieldMes;
	private JTextArea textAreaCal;
	private JTextField textFieldEcho;
	private JTextArea textAreaEcho;
	
	private JCheckBox chckbxShell;	
	private JCheckBox chckbxHome;	
	private JCheckBox chckbxPath;	
	private JCheckBox chckbxLogname;	
	private JCheckBox chckbxEnv;
	private JCheckBox chckbxSet;
	private JPanel panelHistory;
	private JLabel lblValor;
	private JTextField textFieldHistory;
	private JButton btnHistory;
	private JTextArea textAreaHistory;
	private JScrollPane scrollPane_4;
	private JButton btnWho;
	private JPanel panelMan;
	private JLabel lblTipo;
	private JComboBox comboBoxTipo;
	private JButton btnMan;
	private JTextArea textAreaMan;
	private JScrollPane scrollPane_5;
	private JPanel panelPwdOtros;
	private JButton btnPwd;
	private JLabel lblBusqueda;
	private JTextField textFieldManBusqueda;
	private JButton btnMank;
	private JButton btnHelp;
	private JButton btnWhatIs;
	private JButton btnUname;
	private JTextArea textAreaPwd;
	private JScrollPane scrollPane_6;
	private JPanel panelUname;
	private JLabel lblKernel;
	private JLabel lblNombre;
	private JLabel lblRelease;
	private JLabel lblVersion;
	private JTextField textFieldKernelNombre;
	private JTextField textFieldKernelRelease;
	private JTextField textFieldKernelVersion;
	private JLabel lblPc;
	private JLabel lblMaquina;
	private JLabel lblProcesador;
	private JLabel lblHardware;
	private JTextField textFieldMaquina;
	private JTextField textFieldProcesador;
	private JTextField textFieldHardware;
	private JButton btnUname_1;
	private JLabel lblNodo;
	private JTextField textFieldNodo;
	private JLabel lblSo;
	private JTextField textFieldSistemaOperativo;
	private JButton btnApropos;
	private JComboBox comboBoxTipoComando;
	private JCheckBox checkBoxIdActual;
	private JButton btnInfo;
	private JButton btnTty;
	private JButton btnEjem;
	private JLabel lblPatron;
	private JTextField textFieldPatron;
	private JLabel lblOpciones;
	private JTextField textFieldOpciones;
	private JCheckBox chckbxGroups;
	private JCheckBox chckbxArchivoHistoria;
	private JCheckBox chckbxHostname;
	private JCheckBox chckbxPid;
	private JCheckBox chckbxPwd;
	private JCheckBox chckbxRandom;
	private JCheckBox chckbxSeconds;
	private JCheckBox chckbxUid;
	private JPanel panelGeneral;
	private JButton btnUptime;
	private JTextArea textAreaGeneral;
	private JScrollPane scrollPane_7;
	private JButton btnLsbrelease;
	private JTextArea textAreaUname;
	private JScrollPane scrollPane_8;
	private JButton btnWhich;
	private JButton btnArch;
	private JTextField textFieldComandoUname;
	private JButton btnKVersion;
	private JTextField textFieldComandoMan;
	private JButton btnWhereis;
	private JPanel panelEjemplo;
	private JButton btnHistory_1;
	private JTextArea textAreaType;
	private JScrollPane scrollPane_9;
	private JCheckBox chckbxTodosType;
	private JButton btnAlias;
	private JTextField textFieldComandoGeneral;
	private JLabel lblBusquedaEcho;
	private JTextField textFieldEchoBusqueda;
	private JButton btnEchoBusqueda;
	private JButton btnManf;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasicoGeneralJFrame frame = new BasicoGeneralJFrame();
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
	public BasicoGeneralJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 582, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "cell 0 0,grow");
		
		JPanel panelWho = new JPanel();
		tabbedPane.addTab("Who", null, panelWho, null);
		panelWho.setLayout(new MigLayout("", "[grow]", "[][grow]"));
		
		JButton btnWhoIAm = new JButton("Who I Am");
		btnWhoIAm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "";;// /*Constantes.SUDO +*/ "who am i"; 
								
				command = "whoami"; 
				
				//command=command+ " "+textf
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);

				textAreaWho.setText(sOutput);
			}
		});
		
		btnWho = new JButton("Who");
		btnWho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "who"; 
				
				//command=command+ " "+textf
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);

				textAreaWho.setText(sOutput);
			}
		});
		panelWho.add(btnWho, "flowx,cell 0 0");
		panelWho.add(btnWhoIAm, "cell 0 0");
		
		JScrollPane scrollPane = new JScrollPane();
		panelWho.add(scrollPane, "cell 0 1,grow");
		
		textAreaWho = new JTextArea();
		scrollPane.setViewportView(textAreaWho);
		
		JPanel panelType = new JPanel();
		tabbedPane.addTab("Type", null, panelType, null);
		
		JButton btnType = new JButton("Type");
		btnType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = /*Constantes.SUDO +*/ "type"; 
				
				if(chckbxTodosType.isSelected()) {
					command=command + " -a";
				}
				
				command=command + " "+ comboBoxTipoComando.getSelectedItem();
				
				textFieldComandoType.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
								
				textAreaType.setText(sOutput);
			}
		});
		panelType.setLayout(new MigLayout("", "[68px,grow][grow]", "[15px][][25px][][grow]"));
		
		JLabel lblComando = new JLabel("Comando");
		panelType.add(lblComando, "cell 0 0,alignx trailing,aligny top");
		
		comboBoxTipoComando = new JComboBox();
		comboBoxTipoComando.setModel(new DefaultComboBoxModel(new String[] {"ps", "ls", "ll", "cd", "man"}));
		panelType.add(comboBoxTipoComando, "cell 1 0,growx");
		
		chckbxTodosType = new JCheckBox("Todos");
		panelType.add(chckbxTodosType, "cell 1 1");
		panelType.add(btnType, "flowy,cell 0 2,alignx left,aligny top");
		
		textFieldComandoType = new JTextField();
		panelType.add(textFieldComandoType, "cell 0 3 2 1,alignx left");
		textFieldComandoType.setColumns(20);
		
		scrollPane_9 = new JScrollPane();
		panelType.add(scrollPane_9, "cell 0 4 2 1,grow");
		
		textAreaType = new JTextArea();
		scrollPane_9.setViewportView(textAreaType);
		
		JPanel panelLs = new JPanel();
		tabbedPane.addTab("Ls", null, panelLs, null);
		panelLs.setLayout(new MigLayout("", "[grow][grow]", "[][][][][grow]"));
		
		JButton btnLs = new JButton("Ls");
		btnLs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "ls"; 
				
				command=command + " "+ textFieldOpciones.getText();
				
				command=command + " "+ textFieldPatron.getText();
				
				command=command + " "+ textFieldPath.getText();
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaLs.setText(sOutput);
			}
		});
		
		lblOpciones = new JLabel("Opciones");
		panelLs.add(lblOpciones, "cell 0 0,alignx trailing");
		
		textFieldOpciones = new JTextField();
		textFieldOpciones.setText("-a");
		panelLs.add(textFieldOpciones, "cell 1 0,growx");
		textFieldOpciones.setColumns(10);
		
		lblPatron = new JLabel("Patron");
		panelLs.add(lblPatron, "cell 0 1,alignx trailing");
		
		textFieldPatron = new JTextField();
		textFieldPatron.setText("*");
		panelLs.add(textFieldPatron, "cell 1 1,growx");
		textFieldPatron.setColumns(10);
		
		JLabel lblPath = new JLabel("Path");
		panelLs.add(lblPath, "cell 0 2,alignx trailing");
		
		textFieldPath = new JTextField();
		textFieldPath.setText("/home/bydan");
		panelLs.add(textFieldPath, "cell 1 2,alignx left");
		textFieldPath.setColumns(30);
		panelLs.add(btnLs, "flowx,cell 0 3");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panelLs.add(scrollPane_1, "cell 0 4 2 1,grow");
		
		textAreaLs = new JTextArea();
		scrollPane_1.setViewportView(textAreaLs);
		
		btnEjem = new JButton("Ejem");
		btnEjem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("ls", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("ls");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelLs.add(btnEjem, "cell 0 3");
		
		JPanel panelDate = new JPanel();
		tabbedPane.addTab("date", null, panelDate, null);
		panelDate.setLayout(new MigLayout("", "[grow][grow]", "[][][][][][]"));
		
		chckbxHora = new JCheckBox("Hora");
		panelDate.add(chckbxHora, "cell 0 0");
		
		chckbxMes = new JCheckBox("Mes");
		panelDate.add(chckbxMes, "cell 0 1");
		
		chckbxAnio = new JCheckBox("Año");
		panelDate.add(chckbxAnio, "cell 0 2");
		
		JButton btnDate = new JButton("date");
		btnDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "date"; 
				
				
				if(chckbxHora.isSelected()) {
					command = command + " +%T"; 
				}
				
				if(chckbxMes.isSelected()) {
					command = command + " +%m"; 
				}

				if(chckbxAnio.isSelected()) {
					command = command + " +%y"; 
				}

				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textFieldDate.setText(sOutput);
			}
		});
		panelDate.add(btnDate, "cell 0 3,aligny top");
		
		textFieldDate = new JTextField();
		panelDate.add(textFieldDate, "cell 0 4 2 1,alignx left");
		textFieldDate.setColumns(40);
		
		JPanel panelCal = new JPanel();
		tabbedPane.addTab("cal", null, panelCal, null);
		panelCal.setLayout(new MigLayout("", "[grow][grow]", "[][][][grow]"));
		
		JLabel lblAnio = new JLabel("Año");
		panelCal.add(lblAnio, "flowx,cell 0 0,alignx left");
		
		JLabel lblMes = new JLabel("Mes");
		panelCal.add(lblMes, "flowx,cell 0 1,alignx left");
		
		JButton btnCal = new JButton("cal");
		btnCal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "cal"; 
												
				command =command + " " + textFieldMes.getText();

				command =command + " " + textFieldAnio.getText();
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaCal.setText(sOutput);
			}
		});
		panelCal.add(btnCal, "cell 0 2");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		panelCal.add(scrollPane_2, "cell 0 3 2 1,alignx left,growy");
		
		textAreaCal = new JTextArea();
		textAreaCal.setColumns(25);
		scrollPane_2.setViewportView(textAreaCal);
		
		textFieldAnio = new JTextField();
		panelCal.add(textFieldAnio, "cell 0 0,alignx left");
		textFieldAnio.setColumns(5);
		
		textFieldMes = new JTextField();
		panelCal.add(textFieldMes, "cell 0 1,alignx left");
		textFieldMes.setColumns(5);
		
		JPanel panelEcho = new JPanel();
		tabbedPane.addTab("echo/Vars", null, panelEcho, null);
		panelEcho.setLayout(new MigLayout("", "[][grow]", "[][][][][][][][][][][][grow]"));
		
		chckbxShell = new JCheckBox("Shell");
		panelEcho.add(chckbxShell, "cell 0 0");
		
		chckbxGroups = new JCheckBox("Groups");
		panelEcho.add(chckbxGroups, "cell 1 0");
		
		chckbxHome = new JCheckBox("Home");
		panelEcho.add(chckbxHome, "cell 0 1");
		
		chckbxArchivoHistoria = new JCheckBox("Archivo Historia");
		panelEcho.add(chckbxArchivoHistoria, "cell 1 1");
		
		chckbxPath = new JCheckBox("Path");
		panelEcho.add(chckbxPath, "cell 0 2");
		
		chckbxHostname = new JCheckBox("HostName");
		panelEcho.add(chckbxHostname, "cell 1 2");
		
		chckbxLogname = new JCheckBox("LogName");
		panelEcho.add(chckbxLogname, "cell 0 3");
		
		chckbxPid = new JCheckBox("Pid");
		panelEcho.add(chckbxPid, "cell 1 3");
		
		chckbxSet = new JCheckBox("Set");
		panelEcho.add(chckbxSet, "cell 0 4");
		
		chckbxPwd = new JCheckBox("Pwd");
		panelEcho.add(chckbxPwd, "cell 1 4");
		
		chckbxEnv = new JCheckBox("Env");
		panelEcho.add(chckbxEnv, "cell 0 5");
		
		JButton btnEcho = new JButton("echo");
		btnEcho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "echo"; 
				String sEnv  = "";
				
				if(chckbxShell.isSelected()) {
					command = command + " $SHELL"; 
					sEnv  = System.getenv("SHELL");
				}
				
				if(chckbxHome.isSelected()) {
					command = command + " $HOME";
					sEnv  = System.getenv("HOME");
				}
				
				if(chckbxPath.isSelected()) {
					command = command + " $PATH"; 
					sEnv  = System.getenv("PATH");
				}
				
				if(chckbxLogname.isSelected()) {
					command = command + " $LOGNAME"; 
					sEnv  = System.getenv("LOGNAME");
				}
				
				if(chckbxGroups.isSelected()) {
					command = command + " $GROUPS"; 
					sEnv  = System.getenv("GROUPS");
				}
				
				if(chckbxArchivoHistoria.isSelected()) {
					command = command + " $HISTFILE"; 
					sEnv  = System.getenv("HISTFILE");
				}
				
				if(chckbxHostname.isSelected()) {
					command = command + " $HOSTNAME"; 
					sEnv  = System.getenv("HOSTNAME");
				}
				
				if(chckbxPid.isSelected()) {
					command = command + " $PID"; 
					sEnv  = System.getenv("PID");
				}
				
				if(chckbxPwd.isSelected()) {
					command = command + " $PWD"; 
					sEnv  = System.getenv("PWD");
				}
				
				if(chckbxRandom.isSelected()) {
					command = command + " $RANDOM"; 
					sEnv  = System.getenv("RANDOM");
				}
				
				if(chckbxSeconds.isSelected()) {
					command = command + " $SECONDS"; 
					sEnv  = System.getenv("SECONDS");
				}
				
				if(chckbxUid.isSelected()) {
					command = command + " $UID"; 
					sEnv  = System.getenv("UID");
				}
				
				if(chckbxEnv.isSelected()) {
					command = "env";// | more 
				}
				
				if(chckbxSet.isSelected()) {
					command = Constantes.GKSUDO + "set | more";//  
				}
				
				
				if(!textFieldEcho.getText().equals("")) {
					command = command + " " + textFieldEcho.getText(); 
				}
				
				if(checkBoxIdActual.isSelected()) {
					command = command +  " $$";// | more 
				}
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaEcho.setText(sOutput + sEnv);
				
				//System.out.println(sEnv);
			}
		});
		
		chckbxRandom = new JCheckBox("Random");
		panelEcho.add(chckbxRandom, "cell 1 5");
		
		checkBoxIdActual = new JCheckBox("$$");
		panelEcho.add(checkBoxIdActual, "cell 0 6");
		
		chckbxSeconds = new JCheckBox("Seconds");
		panelEcho.add(chckbxSeconds, "cell 1 6");
		
		chckbxUid = new JCheckBox("Uid");
		panelEcho.add(chckbxUid, "cell 1 7");
		
		lblBusquedaEcho = new JLabel("Busqueda Echo");
		panelEcho.add(lblBusquedaEcho, "cell 0 8,alignx trailing");
		
		textFieldEchoBusqueda = new JTextField();
		textFieldEchoBusqueda.setText("/etc/t*");
		panelEcho.add(textFieldEchoBusqueda, "cell 1 8,growx");
		textFieldEchoBusqueda.setColumns(10);
		panelEcho.add(btnEcho, "cell 0 9");
		
		btnEchoBusqueda = new JButton("Echo Busqueda");
		btnEchoBusqueda.setToolTipText("echo /etc/*.conf");
		btnEchoBusqueda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command="echo ";

				command=command + " "+textFieldEchoBusqueda.getText();
						
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaEcho.setText(sOutput);
			}
		});
		panelEcho.add(btnEchoBusqueda, "cell 1 9");
		
		textFieldEcho = new JTextField();
		panelEcho.add(textFieldEcho, "cell 0 10 2 1,alignx left");
		textFieldEcho.setColumns(20);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		panelEcho.add(scrollPane_3, "cell 0 11 2 1,grow");
		
		textAreaEcho = new JTextArea();
		scrollPane_3.setViewportView(textAreaEcho);
		
		panelHistory = new JPanel();
		tabbedPane.addTab("history", null, panelHistory, null);
		panelHistory.setLayout(new MigLayout("", "[grow][grow]", "[][][grow]"));
		
		lblValor = new JLabel("Valor");
		panelHistory.add(lblValor, "cell 0 0,alignx trailing");
		
		textFieldHistory = new JTextField();
		panelHistory.add(textFieldHistory, "cell 1 0,alignx left");
		textFieldHistory.setColumns(10);
		
		btnHistory = new JButton("history");
		btnHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = /*Constantes.SUDO_PIPE +*/ "history"; 
				
				command =command + " " + textFieldHistory.getText();
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaHistory.setText(sOutput);
			}
		});
		panelHistory.add(btnHistory, "cell 0 1");
		
		scrollPane_4 = new JScrollPane();
		panelHistory.add(scrollPane_4, "cell 0 2 2 1,grow");
		
		textAreaHistory = new JTextArea();
		scrollPane_4.setViewportView(textAreaHistory);
		
		panelMan = new JPanel();
		tabbedPane.addTab("man/helps", null, panelMan, null);
		panelMan.setLayout(new MigLayout("", "[grow][grow]", "[][][][][][grow]"));
		
		lblTipo = new JLabel("Tipo");
		panelMan.add(lblTipo, "cell 0 0,alignx trailing");
		
		comboBoxTipo = new JComboBox();
		comboBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"adduser", "cd", "less", "ls", "man", "ps", "passwd"}));
		panelMan.add(comboBoxTipo, "cell 1 0,growx");
		
		btnMan = new JButton("1._man");
		btnMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "man"; 
				
				command =command + " " + comboBoxTipo.getSelectedItem();
				
				textFieldComandoMan.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaMan.setText(sOutput);
			}
		});
		
		lblBusqueda = new JLabel("Busqueda");
		panelMan.add(lblBusqueda, "cell 0 1,alignx trailing");
		
		textFieldManBusqueda = new JTextField();
		textFieldManBusqueda.setText("password");
		panelMan.add(textFieldManBusqueda, "cell 1 1,alignx left");
		textFieldManBusqueda.setColumns(35);
		panelMan.add(btnMan, "flowx,cell 0 2");
		
		btnInfo = new JButton("2._info");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "info"; 
				
				command =command + " " + comboBoxTipo.getSelectedItem();
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaMan.setText(sOutput);
			}
		});
		panelMan.add(btnInfo, "flowx,cell 0 3");
		
		btnWhereis = new JButton("whereis");
		btnWhereis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "whereis"; 
				
				command =command + " " + comboBoxTipo.getSelectedItem();
				
				textFieldComandoMan.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaMan.setText(sOutput);
			}
		});
		panelMan.add(btnWhereis, "flowx,cell 1 3");
		
		textFieldComandoMan = new JTextField();
		panelMan.add(textFieldComandoMan, "cell 0 4 2 1,growx");
		textFieldComandoMan.setColumns(10);
		
		scrollPane_5 = new JScrollPane();
		panelMan.add(scrollPane_5, "cell 0 5 2 1,grow");
		
		textAreaMan = new JTextArea();
		scrollPane_5.setViewportView(textAreaMan);
		
		btnWhatIs = new JButton("4._what is");
		btnWhatIs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "whatis"; 
				
				command = command + " " + comboBoxTipo.getSelectedItem();
							
				textFieldComandoMan.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaMan.setText(sOutput);
			}
		});
		
		btnManf = new JButton("man -f");
		btnManf.setToolTipText("Secciones=whatis");
		btnManf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "man -f"; 				
				
				command=command + " " + comboBoxTipo.getSelectedItem();
				
				textFieldComandoMan.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaMan.setText(sOutput);
			}
		});
		panelMan.add(btnManf, "flowx,cell 1 2");
		
		btnHelp = new JButton("3.--help");
		btnHelp.setToolTipText("Resumen");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = ""; 
				
				command = "" + comboBoxTipo.getSelectedItem();
				
				command =command + " --help";
				
				textFieldComandoMan.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaMan.setText(sOutput);
			}
		});
		panelMan.add(btnHelp, "cell 1 2");
		panelMan.add(btnWhatIs, "cell 1 2");
		
		btnApropos = new JButton("apropos");
		btnApropos.setToolTipText("Busqueda segun comando");
		btnApropos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "apropos"; 				
				
				command=command + " " + textFieldManBusqueda.getText();
				
				textFieldComandoMan.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaMan.setText(sOutput);
			}
		});
		panelMan.add(btnApropos, "cell 1 2");
		
		btnWhich = new JButton("which");
		btnWhich.setToolTipText("Desde donde se ejecuta");
		btnWhich.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "which"; 
				
				command =command + " " + comboBoxTipo.getSelectedItem();
				
				textFieldComandoMan.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaMan.setText(sOutput);
			}
		});
		panelMan.add(btnWhich, "cell 0 3");
		
		btnMank = new JButton("man -k");
		btnMank.setToolTipText("Busqueda (x) donde x=seccion=apropos");
		btnMank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "man -k"; 				
			
				command=command + " " + textFieldManBusqueda.getText();
				
				textFieldComandoMan.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaMan.setText(sOutput);
			}
		});
		panelMan.add(btnMank, "cell 0 2");
		
		panelPwdOtros = new JPanel();
		tabbedPane.addTab("pwd/otros", null, panelPwdOtros, null);
		panelPwdOtros.setLayout(new MigLayout("", "[grow]", "[][grow]"));
		
		btnPwd = new JButton("pwd");
		btnPwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "pwd"; 
				
				textFieldComandoMan.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaPwd.setText(sOutput);
			}
		});
		panelPwdOtros.add(btnPwd, "flowx,cell 0 0");
		
		btnUname = new JButton("uname");
		btnUname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "uname -a"; 
				
				textFieldComandoMan.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaPwd.setText(sOutput);
			}
		});
		panelPwdOtros.add(btnUname, "cell 0 0");
		
		scrollPane_6 = new JScrollPane();
		panelPwdOtros.add(scrollPane_6, "cell 0 1,grow");
		
		textAreaPwd = new JTextArea();
		scrollPane_6.setViewportView(textAreaPwd);
		
		btnTty = new JButton("tty");
		btnTty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "tty"; 
				
				textFieldComandoMan.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaPwd.setText(sOutput);
			}
		});
		panelPwdOtros.add(btnTty, "cell 0 0");
		
		panelUname = new JPanel();
		tabbedPane.addTab("Kernel/Release", null, panelUname, null);
		panelUname.setLayout(new MigLayout("", "[grow][109.00,grow][][grow]", "[][][][][][][][grow]"));
		
		lblKernel = new JLabel("KERNEL");
		panelUname.add(lblKernel, "cell 0 0");
		
		lblPc = new JLabel("PC");
		panelUname.add(lblPc, "cell 2 0");
		
		lblNombre = new JLabel("Nombre");
		panelUname.add(lblNombre, "cell 0 1,alignx trailing");
		
		textFieldKernelNombre = new JTextField();
		panelUname.add(textFieldKernelNombre, "cell 1 1,alignx left");
		textFieldKernelNombre.setColumns(10);
		
		lblMaquina = new JLabel("Maquina");
		panelUname.add(lblMaquina, "cell 2 1,alignx trailing");
		
		textFieldMaquina = new JTextField();
		panelUname.add(textFieldMaquina, "cell 3 1,alignx left");
		textFieldMaquina.setColumns(10);
		
		lblRelease = new JLabel("Release");
		panelUname.add(lblRelease, "cell 0 2,alignx trailing");
		
		textFieldKernelRelease = new JTextField();
		panelUname.add(textFieldKernelRelease, "cell 1 2,alignx left");
		textFieldKernelRelease.setColumns(20);
		
		lblProcesador = new JLabel("Procesador");
		panelUname.add(lblProcesador, "cell 2 2,alignx trailing");
		
		textFieldProcesador = new JTextField();
		panelUname.add(textFieldProcesador, "cell 3 2,alignx left");
		textFieldProcesador.setColumns(10);
		
		lblVersion = new JLabel("Version");
		panelUname.add(lblVersion, "cell 0 3,alignx trailing");
		
		textFieldKernelVersion = new JTextField();
		panelUname.add(textFieldKernelVersion, "cell 1 3,alignx left");
		textFieldKernelVersion.setColumns(20);
		
		lblHardware = new JLabel("Hardware");
		panelUname.add(lblHardware, "cell 2 3,alignx trailing");
		
		textFieldHardware = new JTextField();
		panelUname.add(textFieldHardware, "cell 3 3,alignx left");
		textFieldHardware.setColumns(10);
		
		btnUname_1 = new JButton("uname");
		btnUname_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "uname "; 
				String commands = "";
				
				String sKernelName = Comando.executeCommandWithReturn(command+"-s",BasicoGeneralJFrame.this);commands+=command+"-s;";
				String sNodeName = Comando.executeCommandWithReturn(command+"-n",BasicoGeneralJFrame.this);commands+=command+"-n;";
				String sKernelRelease= Comando.executeCommandWithReturn(command+"-r",BasicoGeneralJFrame.this);commands+=command+"-r;";
				String sKernelVersion = Comando.executeCommandWithReturn(command+"-v",BasicoGeneralJFrame.this);commands+=command+"-v;";
				
				String sMaquina = Comando.executeCommandWithReturn(command+"-m",BasicoGeneralJFrame.this);commands+=command+"-m;";				
				String sProcesador= Comando.executeCommandWithReturn(command+"-p",BasicoGeneralJFrame.this);commands+=command+"-p;";
				String sHardware = Comando.executeCommandWithReturn(command+"-i",BasicoGeneralJFrame.this);commands+=command+"-i;";
				String sSistemaOperativo = Comando.executeCommandWithReturn(command+"-o",BasicoGeneralJFrame.this);commands+=command+"-o;";
				
				textFieldKernelNombre.setText(sKernelName);
				textFieldNodo.setText(sNodeName);
				textFieldKernelRelease.setText(sKernelRelease);
				textFieldKernelVersion.setText(sKernelVersion);
				
				textFieldMaquina.setText(sMaquina);
				textFieldProcesador.setText(sProcesador);
				textFieldHardware.setText(sHardware);
				textFieldSistemaOperativo.setText(sSistemaOperativo);								
				
				
				textFieldComandoUname.setText(commands);
			}
		});
		
		lblNodo = new JLabel("Nodo");
		panelUname.add(lblNodo, "cell 0 4,alignx trailing");
		
		textFieldNodo = new JTextField();
		panelUname.add(textFieldNodo, "cell 1 4,alignx left");
		textFieldNodo.setColumns(10);
		
		lblSo = new JLabel("S.O");
		panelUname.add(lblSo, "cell 2 4,alignx trailing");
		
		textFieldSistemaOperativo = new JTextField();
		panelUname.add(textFieldSistemaOperativo, "cell 3 4,growx");
		textFieldSistemaOperativo.setColumns(10);
		panelUname.add(btnUname_1, "cell 0 5");
		
		btnLsbrelease = new JButton("lsb_release");
		btnLsbrelease.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "lsb_release -a"; 
				
				textFieldComandoUname.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaUname.setText(sOutput);
			}
		});
		panelUname.add(btnLsbrelease, "flowx,cell 1 5");
		
		btnArch = new JButton("Arch");
		btnArch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "arch"; 
				
				textFieldComandoUname.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaUname.setText(sOutput);
			}
		});
		panelUname.add(btnArch, "cell 2 5");
		
		btnKVersion = new JButton("K. Version");
		btnKVersion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "cat /proc/version"; 
				
				textFieldComandoUname.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);
				
				textAreaUname.setText(sOutput);
			}
		});
		panelUname.add(btnKVersion, "cell 3 5");
		
		textFieldComandoUname = new JTextField();
		panelUname.add(textFieldComandoUname, "cell 0 6 4 1,growx");
		textFieldComandoUname.setColumns(10);
		
		scrollPane_8 = new JScrollPane();
		panelUname.add(scrollPane_8, "cell 0 7 4 1,grow");
		
		textAreaUname = new JTextArea();
		scrollPane_8.setViewportView(textAreaUname);
		
		panelGeneral = new JPanel();
		tabbedPane.addTab("General", null, panelGeneral, null);
		panelGeneral.setLayout(new MigLayout("", "[grow]", "[][][grow]"));
		
		btnUptime = new JButton("Uptime");
		btnUptime.setToolTipText("Hace que tiempo prendida pc");
		btnUptime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "uptime"; 
				
				textFieldComandoGeneral.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);

				textAreaGeneral.setText(sOutput);
			}
		});
		panelGeneral.add(btnUptime, "flowx,cell 0 0");
		
		textFieldComandoGeneral = new JTextField();
		panelGeneral.add(textFieldComandoGeneral, "cell 0 1,growx");
		textFieldComandoGeneral.setColumns(10);
		
		scrollPane_7 = new JScrollPane();
		panelGeneral.add(scrollPane_7, "cell 0 2,grow");
		
		textAreaGeneral = new JTextArea();
		scrollPane_7.setViewportView(textAreaGeneral);
		
		btnAlias = new JButton("alias");
		btnAlias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "alias"; 
			
				textFieldComandoGeneral.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,BasicoGeneralJFrame.this);

				textAreaGeneral.setText(sOutput);
			}
		});
		panelGeneral.add(btnAlias, "cell 0 0");
		
		panelEjemplo = new JPanel();
		tabbedPane.addTab("Ejemplo", null, panelEjemplo, null);
		panelEjemplo.setLayout(new MigLayout("", "[]", "[]"));
		
		btnHistory_1 = new JButton("history");
		btnHistory_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("history", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("history");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplo.add(btnHistory_1, "cell 0 0");
	}
}
