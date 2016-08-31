package bydan.ubuntu.ventanas.comandos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import bydan.ubuntu.base.Comando;
import bydan.ubuntu.base.Constantes;
import bydan.ubuntu.ventanas.comandos.ejemplos.EjemplosGeneralJFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class DiscosJFrame extends JFrame {

	private JPanel contentPane;
	private JTextArea textAreaEspacio;
	private JCheckBox chckbxEntendible;
	private JTextField textFieldPathBase;
	private JTextField textFieldNombreArchivo;
	private JTextField textFieldDispositivo;
	private JTextArea textAreaAvanzado;
	private JTextField textFieldComandoAvanzado;
	private JTextArea textAreaParticion;
	private JCheckBox chckbxResumenParticion;
	private JComboBox comboBoxDisco;
	private JTextField textFieldComandoInfo;
	private JTextArea textAreaInfo;
	private JTextField textFieldComandoParticion;
	private JTextField textFieldComandoEspacio;
	private JCheckBox chckbxResumenTotal;
	private JCheckBox chckbxOrden;
	private JTextField textFieldBuscarParticiones;
	private JTextField textFieldBuscarParticionesLs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiscosJFrame frame = new DiscosJFrame();
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
	public DiscosJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 581, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "cell 0 0,grow");
		
		JPanel panelInfo = new JPanel();
		tabbedPane.addTab("Info", null, panelInfo, null);
		panelInfo.setLayout(new MigLayout("", "[][grow]", "[][][][grow]"));
		
		JLabel lblDisco = new JLabel("Disco");
		panelInfo.add(lblDisco, "cell 0 0,alignx trailing");
		
		comboBoxDisco = new JComboBox();
		comboBoxDisco.setModel(new DefaultComboBoxModel(new String[] {"sda1", "sda2", "sda3", "sda4", "sda5"}));
		panelInfo.add(comboBoxDisco, "cell 1 0,growx");
		
		JButton btnInfoDisco = new JButton("Info Disco");
		btnInfoDisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + " 'hdparm -i /dev/"; 
				String disco="";
				
				disco=(String)comboBoxDisco.getSelectedItem();
				
				command=command + disco;
				
				command=command+"'";
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,DiscosJFrame.this);
								
				textAreaParticion.setText(sOutput);
			}
		});
		panelInfo.add(btnInfoDisco, "cell 0 1");
		
		textFieldComandoInfo = new JTextField();
		panelInfo.add(textFieldComandoInfo, "cell 0 2 2 1,growx");
		textFieldComandoInfo.setColumns(10);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		panelInfo.add(scrollPane_3, "cell 0 3 2 1,grow");
		
		textAreaInfo = new JTextArea();
		scrollPane_3.setViewportView(textAreaInfo);
		
		JPanel panelEspacio = new JPanel();
		tabbedPane.addTab("Espacio", null, panelEspacio, null);
		panelEspacio.setLayout(new MigLayout("", "[grow][grow]", "[][][][][][][][grow]"));
		
		JLabel lblPathDisco = new JLabel("Path Base");
		panelEspacio.add(lblPathDisco, "flowy,cell 0 0,alignx right");
		
		JButton btnDf = new JButton("df");
		btnDf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "df"; 
				
				
				if(chckbxEntendible.isSelected()) {
					command=command + " -h";
				}
				
				
				command=command + " "+ textFieldPathBase.getText();				
				
				textFieldComandoEspacio.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,DiscosJFrame.this);
								
				textAreaEspacio.setText(sOutput);
			}
		});
		
		textFieldPathBase = new JTextField();
		textFieldPathBase.setToolTipText("/dev/sda3");
		panelEspacio.add(textFieldPathBase, "cell 1 0,alignx left");
		textFieldPathBase.setColumns(35);
		
		JLabel lblNombreArchivo = new JLabel("Nombre Archivo");
		panelEspacio.add(lblNombreArchivo, "cell 0 1,alignx trailing");
		
		textFieldNombreArchivo = new JTextField();
		panelEspacio.add(textFieldNombreArchivo, "flowy,cell 1 1,alignx left");
		textFieldNombreArchivo.setColumns(30);
		
		chckbxEntendible = new JCheckBox("Entendible");
		panelEspacio.add(chckbxEntendible, "cell 1 2");
		
		chckbxResumenTotal = new JCheckBox("Resumen Total");
		panelEspacio.add(chckbxResumenTotal, "cell 1 3");
		
		chckbxOrden = new JCheckBox("Orden");
		panelEspacio.add(chckbxOrden, "cell 1 4");
		panelEspacio.add(btnDf, "flowx,cell 0 5");
		
		JButton btnConLs = new JButton("Con ls");
		btnConLs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "ls -lSrh"; 
							
				command=command + " "+ textFieldPathBase.getText();				
				
				if(!textFieldNombreArchivo.getText().equals("")) {
					command=command + "/"+ textFieldNombreArchivo.getText();			
				}
				                                      
				textFieldComandoEspacio.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,DiscosJFrame.this);
								
				textAreaEspacio.setText(sOutput);
			}
		});
		panelEspacio.add(btnConLs, "cell 1 5");
		
		textFieldComandoEspacio = new JTextField();
		panelEspacio.add(textFieldComandoEspacio, "cell 0 6 2 1,growx");
		textFieldComandoEspacio.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		panelEspacio.add(scrollPane, "cell 0 7 2 1,grow");
		
		textAreaEspacio = new JTextArea();
		scrollPane.setViewportView(textAreaEspacio);
		
		JButton btnDu = new JButton("du");
		btnDu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "du"; 
				
				
				if(chckbxEntendible.isSelected()) {
					command=command + " -h";
				}
				
				
				if(chckbxResumenTotal.isSelected()) {

					if(!chckbxOrden.isSelected()) {
						command=command + " -s";
					} else {
						command=command + " -sk";
					}
				}				
								
				
				command=command + " "+ textFieldPathBase.getText();				
				
				if(!textFieldNombreArchivo.getText().equals("")) {
					command=command + "/"+ textFieldNombreArchivo.getText();			
				}
				
				
				if(chckbxOrden.isSelected()) {
					command=command + " | sort -rn";
				}
				
				textFieldComandoEspacio.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,DiscosJFrame.this);
								
				textAreaEspacio.setText(sOutput);
			}
		});
		panelEspacio.add(btnDu, "cell 0 5");
		
		JPanel panelParticion = new JPanel();
		tabbedPane.addTab("Particiones", null, panelParticion, null);
		panelParticion.setLayout(new MigLayout("", "[][][grow][grow]", "[][][][][][grow]"));
		
		chckbxResumenParticion = new JCheckBox("Resumen");
		panelParticion.add(chckbxResumenParticion, "cell 1 0");
		
		JLabel lblBuscar = new JLabel("Buscar (/dev/sda)");
		panelParticion.add(lblBuscar, "cell 1 1,alignx trailing");
		
		textFieldBuscarParticiones = new JTextField();
		panelParticion.add(textFieldBuscarParticiones, "cell 2 1 2 1,growx");
		textFieldBuscarParticiones.setColumns(10);
		
		JButton btnFdisk = new JButton("fdisk");
		btnFdisk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO+" 'fdisk -l"; 				
				
				if(!textFieldBuscarParticiones.getText().isEmpty()) {
					command=command+" "+textFieldBuscarParticiones.getText();
				}
				
				command=command+"'";
						
				textFieldComandoParticion.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,DiscosJFrame.this);
								
				textAreaParticion.setText(sOutput);
			}
		});
		
		JLabel lblBuscarLs = new JLabel("Buscar ls");
		panelParticion.add(lblBuscarLs, "cell 1 2,alignx trailing");
		
		textFieldBuscarParticionesLs = new JTextField();
		textFieldBuscarParticionesLs.setText("/dev/sd*");
		panelParticion.add(textFieldBuscarParticionesLs, "cell 2 2 2 1,growx");
		textFieldBuscarParticionesLs.setColumns(10);
		panelParticion.add(btnFdisk, "flowx,cell 0 3");
		
		JButton btnDf_1 = new JButton("df");
		btnDf_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "df"; 
				
				
				if(chckbxResumenParticion.isSelected()) {
					command=command + " -h";
				}
				
				textFieldComandoParticion.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,DiscosJFrame.this);
								
				textAreaParticion.setText(sOutput);
			}
		});
		
		JButton btnLs = new JButton("ls");
		btnLs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = /*Constantes.GKSUDO+*/" ls "; 				
				
				if(!textFieldBuscarParticionesLs.getText().isEmpty()) {
					command=command+" "+textFieldBuscarParticionesLs.getText();
				}
				
				//command=command+"";
						
				textFieldComandoParticion.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,DiscosJFrame.this);
								
				textAreaParticion.setText(sOutput);
			}
		});
		panelParticion.add(btnLs, "flowx,cell 1 3");
		panelParticion.add(btnDf_1, "cell 1 3");
		
		JButton btnFstab = new JButton("fstab");
		btnFstab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "cat /etc/fstab"; 				
				
				textFieldComandoParticion.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,DiscosJFrame.this);
								
				textAreaParticion.setText(sOutput);
			}
		});
		
		JButton btnMount = new JButton("mount");
		btnMount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "mount"; 
				
				/*
				if(chckbxResumenParticion.isSelected()) {
					command=command + " -h";
				}
				*/
				
				textFieldComandoParticion.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,DiscosJFrame.this);
								
				textAreaParticion.setText(sOutput);
			}
		});
		panelParticion.add(btnMount, "cell 2 3");
		panelParticion.add(btnFstab, "flowx,cell 3 3");
		
		textFieldComandoParticion = new JTextField();
		panelParticion.add(textFieldComandoParticion, "cell 0 4 4 1,growx");
		textFieldComandoParticion.setColumns(10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		panelParticion.add(scrollPane_2, "cell 0 5 4 1,grow");
		
		textAreaParticion = new JTextArea();
		scrollPane_2.setViewportView(textAreaParticion);
		
		JButton btnMount_1 = new JButton("mount 2");
		btnMount_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "cat /proc/mounts"; 				
				
				textFieldComandoParticion.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,DiscosJFrame.this);
								
				textAreaParticion.setText(sOutput);
			}
		});
		panelParticion.add(btnMount_1, "cell 3 3");
		
		JPanel panelAvanzado = new JPanel();
		tabbedPane.addTab("Avanzado", null, panelAvanzado, null);
		panelAvanzado.setLayout(new MigLayout("", "[][grow]", "[][][][grow]"));
		
		JLabel lblDispositivo = new JLabel("Dispositivo");
		panelAvanzado.add(lblDispositivo, "cell 0 0,alignx trailing");
		
		textFieldDispositivo = new JTextField();
		panelAvanzado.add(textFieldDispositivo, "cell 1 0,growx");
		textFieldDispositivo.setColumns(10);
		
		JButton btnFsck = new JButton("fsck");
		btnFsck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "fsck"; 
				
				
				command=command + " "+ textFieldDispositivo.getText();				
				
				textFieldComandoAvanzado.setText(command);
				
				String sOutput = "";//Comando.executeCommandWithReturn(command,DiscosJFrame.this);
								
				textAreaAvanzado.setText(sOutput);
				
			}
		});
		btnFsck.setToolTipText("Chequea sistema y repara, no debe estar montado");
		panelAvanzado.add(btnFsck, "cell 0 1 2 1");
		
		JButton btnSync = new JButton("sync");
		btnSync.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "sync"; 
									
				textFieldComandoAvanzado.setText(command);
				
				String sOutput = "";//Comando.executeCommandWithReturn(command,DiscosJFrame.this);
								
				textAreaAvanzado.setText(sOutput);
			}
		});
		btnSync.setToolTipText("Sincroniza archivos de Cache y Disco Duro");
		panelAvanzado.add(btnSync, "flowx,cell 1 1");
		
		JButton btnBadblocks = new JButton("badblocks");
		btnBadblocks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "badblocks"; 
								
				command=command + " "+ textFieldDispositivo.getText();				
				
				textFieldComandoAvanzado.setText(command);
				
				String sOutput = "";//Comando.executeCommandWithReturn(command,DiscosJFrame.this);
								
				textAreaAvanzado.setText(sOutput);
			}
		});
		btnBadblocks.setToolTipText("Busca errores en particion");
		panelAvanzado.add(btnBadblocks, "cell 1 1");
		
		textFieldComandoAvanzado = new JTextField();
		panelAvanzado.add(textFieldComandoAvanzado, "cell 0 2 2 1,growx");
		textFieldComandoAvanzado.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panelAvanzado.add(scrollPane_1, "cell 0 3 2 1,grow");
		
		textAreaAvanzado = new JTextArea();
		scrollPane_1.setViewportView(textAreaAvanzado);
		
		JPanel panelEjemplo = new JPanel();
		tabbedPane.addTab("Ejemplo", null, panelEjemplo, null);
		panelEjemplo.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JButton btnDu_1 = new JButton("du");
		btnDu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("du", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("du");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplo.add(btnDu_1, "cell 0 1");
		
		JButton btnMount_2 = new JButton("mount");
		btnMount_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("mount", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("mount");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplo.add(btnMount_2, "cell 0 2");
	}

}
