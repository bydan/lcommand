package bydan.ubuntu.ventanas.comandos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bydan.ubuntu.base.Comando;
import bydan.ubuntu.base.Constantes;
import bydan.ubuntu.ventanas.comandos.ejemplos.EjemplosGeneralJFrame;

import javax.swing.JTabbedPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SoftwareJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPaqueteBuscar;
	private JTextField textFieldComandoApt;
	private JTextArea textAreaApt;
	private JTextField textFieldNombrePaqueteDeb;
	private JTextField textFieldPathArchivoDeb;
	private JTextField textFieldComandoDeb;
	private JTextArea textAreaDeb;
	private JTextField textFieldComandoLibs;
	private JTextArea textAreaLibs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SoftwareJFrame frame = new SoftwareJFrame();
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
	public SoftwareJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 756, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelApt = new JPanel();
		tabbedPane.addTab("APT", null, panelApt, null);
		panelApt.setLayout(new MigLayout("", "[][grow]", "[][][][][grow]"));
		
		JLabel lblChequear = new JLabel("Chequear");
		panelApt.add(lblChequear, "cell 0 0");
		
		JButton btnChequear = new JButton("Chequear");
		btnChequear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + " 'apt-get check'"; 								
				
				textFieldComandoApt.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,SoftwareJFrame.this);
				
				textAreaApt.setText(sOutput);
			}
		});
		panelApt.add(btnChequear, "cell 1 0");
		
		JLabel lblPaquete = new JLabel("Paquete");
		panelApt.add(lblPaquete, "cell 0 1,alignx trailing");
		
		textFieldPaqueteBuscar = new JTextField();
		panelApt.add(textFieldPaqueteBuscar, "cell 1 1,growx");
		textFieldPaqueteBuscar.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + " 'apt-cache search"; 								
				
				command= command + " " + textFieldPaqueteBuscar.getText()+"'";
				
				textFieldComandoApt.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,SoftwareJFrame.this);
				
				textAreaApt.setText(sOutput);
			}
		});
		panelApt.add(btnBuscar, "cell 1 2");
		
		textFieldComandoApt = new JTextField();
		panelApt.add(textFieldComandoApt, "cell 0 3 2 1,growx");
		textFieldComandoApt.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		panelApt.add(scrollPane, "cell 0 4 2 1,grow");
		
		textAreaApt = new JTextArea();
		scrollPane.setViewportView(textAreaApt);
		
		JPanel panelDeb = new JPanel();
		tabbedPane.addTab("dpkg/aptitude", null, panelDeb, null);
		panelDeb.setLayout(new MigLayout("", "[][grow]", "[][][][][][][][grow]"));
		
		JLabel lblNombrePaquete = new JLabel("Nombre Paquete");
		panelDeb.add(lblNombrePaquete, "cell 0 0,alignx trailing");
		
		textFieldNombrePaqueteDeb = new JTextField();
		panelDeb.add(textFieldNombrePaqueteDeb, "cell 1 0,growx");
		textFieldNombrePaqueteDeb.setColumns(10);
		
		JLabel lblPathArchivo = new JLabel("Path Archivo");
		panelDeb.add(lblPathArchivo, "cell 0 1,alignx trailing");
		
		textFieldPathArchivoDeb = new JTextField();
		panelDeb.add(textFieldPathArchivoDeb, "cell 1 1,growx");
		textFieldPathArchivoDeb.setColumns(10);
		
		JButton btnTodos = new JButton("Todos");
		btnTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + "'dpkg -l'"; 				
				
				textFieldComandoDeb.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,SoftwareJFrame.this);
				
				textAreaDeb.setText(sOutput);
			}
		});
		panelDeb.add(btnTodos, "cell 0 2");
		
		JButton btnBuscarPaquetes = new JButton("Buscar");
		btnBuscarPaquetes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + "'dpkg -l | grep"; 				
				
				command=command + " " + textFieldNombrePaqueteDeb.getText() + "'";
				
				textFieldComandoDeb.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,SoftwareJFrame.this);
				
				textAreaDeb.setText(sOutput);
			}
		});
		panelDeb.add(btnBuscarPaquetes, "flowx,cell 1 2");
		
		JButton btnBuscarSegunArchivo = new JButton("Buscar segun Archivo");
		btnBuscarSegunArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + "'dpkg -S"; 				
				
				command=command + " " + textFieldPathArchivoDeb.getText() + "'";
				
				textFieldComandoDeb.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,SoftwareJFrame.this);
				
				textAreaDeb.setText(sOutput);
			}
		});
		panelDeb.add(btnBuscarSegunArchivo, "cell 1 3");
		
		JLabel lblAptitude = new JLabel("...................................APTITUDE");
		panelDeb.add(lblAptitude, "cell 0 4 2 1");
		
		JButton btnBuscar_1 = new JButton("Buscar");
		btnBuscar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + "'aptitude search"; 				
				
				command=command + " " + textFieldNombrePaqueteDeb.getText() + "'";
				
				textFieldComandoDeb.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,SoftwareJFrame.this);
				
				textAreaDeb.setText(sOutput);
			}
		});
		panelDeb.add(btnBuscar_1, "cell 0 5");
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + "'aptitude show"; 				
				
				command=command + " " + textFieldNombrePaqueteDeb.getText() + "'";
				
				textFieldComandoDeb.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,SoftwareJFrame.this);
				
				textAreaDeb.setText(sOutput);
			}
		});
		panelDeb.add(btnMostrar, "cell 1 5");
		
		textFieldComandoDeb = new JTextField();
		panelDeb.add(textFieldComandoDeb, "cell 0 6 2 1,growx");
		textFieldComandoDeb.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panelDeb.add(scrollPane_1, "cell 0 7 2 1,grow");
		
		textAreaDeb = new JTextArea();
		scrollPane_1.setViewportView(textAreaDeb);
		
		JButton btnInformacion = new JButton("Informacion");
		btnInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + "'dpkg -s"; 				
				
				command=command + " " + textFieldNombrePaqueteDeb.getText() + "'";
				
				textFieldComandoDeb.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,SoftwareJFrame.this);
				
				textAreaDeb.setText(sOutput);
			}
		});
		panelDeb.add(btnInformacion, "cell 1 2");
		
		JButton btnListaFicheros = new JButton("Lista Ficheros");
		btnListaFicheros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + "'dpkg -L"; 				
				
				command=command + " " + textFieldNombrePaqueteDeb.getText() + "'";
				
				textFieldComandoDeb.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,SoftwareJFrame.this);
				
				textAreaDeb.setText(sOutput);
			}
		});
		panelDeb.add(btnListaFicheros, "cell 1 2");
		
		JButton btnListaNoInstalados = new JButton("Lista No Instalados");
		btnListaNoInstalados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + "'dpkg --contents"; 				
				
				command=command + " " + textFieldNombrePaqueteDeb.getText() + "'";
				
				textFieldComandoDeb.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,SoftwareJFrame.this);
				
				textAreaDeb.setText(sOutput);
			}
		});
		panelDeb.add(btnListaNoInstalados, "cell 1 2");
		
		JPanel panelLib = new JPanel();
		tabbedPane.addTab("LIBS", null, panelLib, null);
		panelLib.setLayout(new MigLayout("", "[grow]", "[][][grow]"));
		
		JButton btnSsh = new JButton("ssh");
		btnSsh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "ldd /usr/bin/ssh"; 				
				
				textFieldComandoLibs.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,SoftwareJFrame.this);
				
				textAreaLibs.setText(sOutput);
			}
		});
		panelLib.add(btnSsh, "cell 0 0");
		
		textFieldComandoLibs = new JTextField();
		panelLib.add(textFieldComandoLibs, "cell 0 1,growx");
		textFieldComandoLibs.setColumns(10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		panelLib.add(scrollPane_2, "cell 0 2,grow");
		
		textAreaLibs = new JTextArea();
		scrollPane_2.setViewportView(textAreaLibs);
		
		JPanel panelEjemplos = new JPanel();
		tabbedPane.addTab("Ejemplos", null, panelEjemplos, null);
		panelEjemplos.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JButton btnApt = new JButton("apt");
		btnApt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("apt", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("apt");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnApt, "cell 0 0");
		
		JButton btnDpkg = new JButton("dpkg");
		btnDpkg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("dpkg", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("dpkg");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnDpkg, "cell 0 1");
		
		JButton btnAptitude = new JButton("aptitude");
		btnAptitude.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("aptitude", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("aptitude");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnAptitude, "cell 0 2");
	}

}
