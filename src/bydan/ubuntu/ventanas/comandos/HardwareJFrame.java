package bydan.ubuntu.ventanas.comandos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bydan.ubuntu.base.Comando;
import bydan.ubuntu.base.Constantes;

import javax.swing.JTabbedPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class HardwareJFrame extends JFrame {

	private JPanel contentPane;
	private JTextArea textAreaHardware;
	private JTextField textFieldComandoHardware;
	private JCheckBox chckbxResumen;
	private JCheckBox chckbxRoot;
	private JTextField textFieldBusquedaDispositivos;
	private JTextField textFieldComandoDispositivos;
	private JTextArea textAreaDispositivos;
	private JCheckBox chckbxConMoreDispositivos;
	private JTextField textFieldComandoUsb;
	private JTextArea textAreaUsb;
	private JTextField textFieldComandoCpu;
	private JTextArea textAreaCpu;
	private JCheckBox chckbxArbolUsb;
	private JCheckBox chckbxArboldispositivos;
	private JTextField textFieldComandoCdrom;
	private JComboBox comboBoxTipoCdrom;
	private JCheckBox chckbxNumeroIdentificacion;
	private JTextField textFieldVendorDispositivo;
	private JCheckBox chckbxDetalleUsb;
	private JCheckBox chckbxModulosKernel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HardwareJFrame frame = new HardwareJFrame();
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
	public HardwareJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 824, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelCpu = new JPanel();
		tabbedPane.addTab("Cpu", null, panelCpu, null);
		panelCpu.setLayout(new MigLayout("", "[grow]", "[][][grow]"));
		
		JButton btnInfoCpu = new JButton("Info Cpu");
		btnInfoCpu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "cat /proc/cpuinfo"; 								
														
				textFieldComandoCpu.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,HardwareJFrame.this);
				
				textAreaCpu.setText(sOutput);
			}
		});
		
		JButton btnArch = new JButton("Arch");
		btnArch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "arch"; 								
				
				textFieldComandoCpu.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,HardwareJFrame.this);
				
				textAreaCpu.setText(sOutput);
			}
		});
		panelCpu.add(btnArch, "flowx,cell 0 0");
		
		JButton btnLscpu = new JButton("lscpu");
		btnLscpu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "lscpu"; 								
				
				textFieldComandoCpu.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,HardwareJFrame.this);
				
				textAreaCpu.setText(sOutput);
			}
		});
		panelCpu.add(btnLscpu, "cell 0 0");
		panelCpu.add(btnInfoCpu, "cell 0 0");
		
		textFieldComandoCpu = new JTextField();
		panelCpu.add(textFieldComandoCpu, "cell 0 1,growx");
		textFieldComandoCpu.setColumns(10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		panelCpu.add(scrollPane_2, "cell 0 2,grow");
		
		textAreaCpu = new JTextArea();
		scrollPane_2.setViewportView(textAreaCpu);
		
		JButton btnInterrupciones = new JButton("Interrupciones");
		btnInterrupciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "cat /proc/interrupts"; 								
				
				textFieldComandoCpu.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,HardwareJFrame.this);
				
				textAreaCpu.setText(sOutput);
			}
		});
		panelCpu.add(btnInterrupciones, "cell 0 0");
		
		JPanel panelMemoria = new JPanel();
		tabbedPane.addTab("Memoria", null, panelMemoria, null);
		panelMemoria.setLayout(new MigLayout("", "[]", "[]"));
		
		JButton btnMemoria = new JButton("Memoria");
		btnMemoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemoriaJFrame memoriaJFrame=new MemoriaJFrame();
				
				memoriaJFrame.show();
			}
		});
		panelMemoria.add(btnMemoria, "cell 0 0");
		
		JPanel panelHardware = new JPanel();
		tabbedPane.addTab("Hardware", null, panelHardware, null);
		panelHardware.setLayout(new MigLayout("", "[][grow]", "[][][][][grow]"));
		
		JLabel lblhardware = new JLabel("-----------------HARDWARE------------");
		panelHardware.add(lblhardware, "cell 0 0 2 1");
		
		chckbxRoot = new JCheckBox("Root");
		panelHardware.add(chckbxRoot, "cell 0 1,alignx right");
		
		chckbxResumen = new JCheckBox("Resumen");
		panelHardware.add(chckbxResumen, "cell 1 1");
		
		JButton btnHardware = new JButton("Hardware");
		btnHardware.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "lshw"; 				
				String comillas="";
				
				if(chckbxRoot.isSelected()) {
					comillas="'";
					
					command = Constantes.GKSUDO + " "+comillas+command;
				}
				
				if(chckbxResumen.isSelected()) {
					command = command + " -short";
				}
				
				command = command+comillas;
						
				textFieldComandoHardware.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,HardwareJFrame.this);
				
				textAreaHardware.setText(sOutput);
			}
		});
		panelHardware.add(btnHardware, "flowx,cell 1 2");
		
		textFieldComandoHardware = new JTextField();
		panelHardware.add(textFieldComandoHardware, "cell 0 3 2 1,growx");
		textFieldComandoHardware.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		panelHardware.add(scrollPane, "cell 0 4 2 1,grow");
		
		textAreaHardware = new JTextArea();
		scrollPane.setViewportView(textAreaHardware);
		
		JButton btnHardware_1 = new JButton("Hardware 2");
		btnHardware_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = Constantes.GKSUDO + " 'dmidecode -q'"; 				
				String comillas="";
														
				textFieldComandoHardware.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,HardwareJFrame.this);
				
				textAreaHardware.setText(sOutput);
			}
		});
		panelHardware.add(btnHardware_1, "cell 1 2");
		
		JButton btnSmbios = new JButton("SMBIOS");
		btnSmbios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + " 'dmidecode'"; 				
				//String comillas="";
														
				textFieldComandoHardware.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,HardwareJFrame.this);
				
				textAreaHardware.setText(sOutput);
			}
		});
		panelHardware.add(btnSmbios, "cell 1 2");
		
		JPanel panelDispositivos = new JPanel();
		tabbedPane.addTab("Dispositivos", null, panelDispositivos, null);
		panelDispositivos.setLayout(new MigLayout("", "[][grow]", "[][][][][][][][][][][][grow]"));
		
		JLabel label = new JLabel("-----------------DISPOSITIVOS------------");
		panelDispositivos.add(label, "cell 0 0 2 1");
		
		JLabel label_1 = new JLabel("Busqueda");
		panelDispositivos.add(label_1, "cell 0 1");
		
		textFieldBusquedaDispositivos = new JTextField();
		textFieldBusquedaDispositivos.setColumns(10);
		panelDispositivos.add(textFieldBusquedaDispositivos, "flowx,cell 1 1,growx");
		
		JLabel label_2 = new JLabel("Audio,audio,AC");
		panelDispositivos.add(label_2, "cell 1 1,alignx trailing");
		
		JLabel lblBusqueda = new JLabel("Busqueda 2");
		panelDispositivos.add(lblBusqueda, "cell 0 2,alignx trailing");
		
		textFieldVendorDispositivo = new JTextField();
		panelDispositivos.add(textFieldVendorDispositivo, "flowx,cell 1 2,alignx left");
		textFieldVendorDispositivo.setColumns(25);
		
		chckbxConMoreDispositivos = new JCheckBox("Con More");
		panelDispositivos.add(chckbxConMoreDispositivos, "cell 1 3");
		
		JButton button = new JButton("Buscar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "lspci"; 				
				
				if(chckbxArboldispositivos.isSelected()) {
					command = command + " -tv"; 	
				}
				
				if(chckbxNumeroIdentificacion.isSelected()) {
					command = command + " -nn"; 	
				}				
				
				
				if(chckbxModulosKernel.isSelected()) {
					command = command + " -k"; 	
				}
				
				if(!textFieldBusquedaDispositivos.getText().equals("")) {
					command = command + " | grep";
					command = command + " " + textFieldBusquedaDispositivos.getText();
				}
				
				
				if(chckbxConMoreDispositivos.isSelected()) {
					command = command + " | more";
				}
				
				textFieldComandoDispositivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,HardwareJFrame.this);
				
				textAreaDispositivos.setText(sOutput);
			}
		});
		
		chckbxArboldispositivos = new JCheckBox("Arbol");
		panelDispositivos.add(chckbxArboldispositivos, "cell 1 4");
		
		chckbxModulosKernel = new JCheckBox("Modulos Kernel");
		panelDispositivos.add(chckbxModulosKernel, "cell 1 5");
		
		chckbxNumeroIdentificacion = new JCheckBox("Numero Identificacion");
		panelDispositivos.add(chckbxNumeroIdentificacion, "cell 1 6");
		panelDispositivos.add(button, "flowx,cell 1 7");
		
		JLabel label_3 = new JLabel("--------------------NVIDIA---------------");
		panelDispositivos.add(label_3, "cell 0 8 2 1");
		
		JButton buttonNvidia = new JButton("NVidia");
		buttonNvidia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "glxinfo | grep rendering"; 				
				
				textFieldComandoDispositivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,HardwareJFrame.this);
				
				textAreaDispositivos.setText(sOutput);
			}
		});
		panelDispositivos.add(buttonNvidia, "cell 1 9");
		
		textFieldComandoDispositivos = new JTextField();
		textFieldComandoDispositivos.setColumns(10);
		panelDispositivos.add(textFieldComandoDispositivos, "cell 0 10 2 1,growx");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panelDispositivos.add(scrollPane_1, "cell 0 11 2 1,grow");
		
		textAreaDispositivos = new JTextArea();
		scrollPane_1.setViewportView(textAreaDispositivos);
		
		JButton btnBuscarVendordevice = new JButton("Buscar vendor:device");
		btnBuscarVendordevice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "lspci"; 				
				
				command = command + " -d "+textFieldVendorDispositivo.getText(); 	
				
				
				command = command + " -vvv"; 	
								
				
				
				
				textFieldComandoDispositivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,HardwareJFrame.this);
				
				textAreaDispositivos.setText(sOutput);
			}
		});
		panelDispositivos.add(btnBuscarVendordevice, "cell 1 7");
		
		JLabel lbld = new JLabel("8086:2d13= Numero Identificacion");
		panelDispositivos.add(lbld, "cell 1 2");
		
		JLabel label_4 = new JLabel("");
		panelDispositivos.add(label_4, "cell 1 2");
		
		JPanel panelUsb = new JPanel();
		tabbedPane.addTab("Usb", null, panelUsb, null);
		panelUsb.setLayout(new MigLayout("", "[][grow]", "[][][][][grow]"));
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "lsusb"; 				
				String comillas="";
				
				if(chckbxArbolUsb.isSelected()) {
					command = command + " -t"; 	
				}
						
				
				if(chckbxDetalleUsb.isSelected()) {
					command = command + " -v"; 	
				}
				
				textFieldComandoUsb.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,HardwareJFrame.this);
				
				textAreaUsb.setText(sOutput);
			}
		});
		
		chckbxArbolUsb = new JCheckBox("Arbol");
		chckbxArbolUsb.setSelected(true);
		panelUsb.add(chckbxArbolUsb, "cell 1 0");
		
		chckbxDetalleUsb = new JCheckBox("Detalle");
		panelUsb.add(chckbxDetalleUsb, "cell 1 1");
		panelUsb.add(btnBuscar, "cell 1 2");
		
		textFieldComandoUsb = new JTextField();
		textFieldComandoUsb.setColumns(10);
		panelUsb.add(textFieldComandoUsb, "cell 0 3 2 1,growx");
		
		JScrollPane scrollPane_3 = new JScrollPane();
		panelUsb.add(scrollPane_3, "cell 0 4 2 1,grow");
		
		textAreaUsb = new JTextArea();
		scrollPane_3.setViewportView(textAreaUsb);
		
		JPanel panelCdRom = new JPanel();
		tabbedPane.addTab("Cd Rom", null, panelCdRom, null);
		panelCdRom.setLayout(new MigLayout("", "[][grow]", "[][][][]"));
		
		JButton btnAbrir = new JButton("Eject");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "eject "+comboBoxTipoCdrom.getSelectedItem(); 
				
				textFieldComandoCdrom.setText(command);
				
				Comando.executeCommand(command, HardwareJFrame.this);

			}
		});
		
		JLabel lblT = new JLabel("Tipo");
		panelCdRom.add(lblT, "cell 0 0,alignx trailing");
		
		comboBoxTipoCdrom = new JComboBox();
		comboBoxTipoCdrom.setModel(new DefaultComboBoxModel(new String[] {"cdrom"}));
		panelCdRom.add(comboBoxTipoCdrom, "cell 1 0,alignx left");
		panelCdRom.add(btnAbrir, "cell 0 1");
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "eject -t "+comboBoxTipoCdrom.getSelectedItem(); 
				
				textFieldComandoCdrom.setText(command);
				
				Comando.executeCommand(command, HardwareJFrame.this);
			}
		});
		panelCdRom.add(btnCerrar, "cell 0 2");
		
		textFieldComandoCdrom = new JTextField();
		panelCdRom.add(textFieldComandoCdrom, "cell 0 3 2 1,growx");
		textFieldComandoCdrom.setColumns(10);
		
		JPanel panelDiscos = new JPanel();
		tabbedPane.addTab("Discos", null, panelDiscos, null);
		panelDiscos.setLayout(new MigLayout("", "[]", "[]"));
		
		JButton btnDiscos = new JButton("Discos");
		btnDiscos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DiscosJFrame discosJFrame=new DiscosJFrame();
				
				discosJFrame.show();
			}
		});
		panelDiscos.add(btnDiscos, "cell 0 0");
		
		JPanel panelModulos = new JPanel();
		tabbedPane.addTab("Modulos", null, panelModulos, null);
		panelModulos.setLayout(new MigLayout("", "[]", "[]"));
		
		JButton btnModulosKernel = new JButton("Modulos Kernel");
		btnModulosKernel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KernelJFrame kernelJFrame=new KernelJFrame();
				
				kernelJFrame.show();
			}
		});
		panelModulos.add(btnModulosKernel, "cell 0 0");
	}

}
