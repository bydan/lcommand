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
import bydan.ubuntu.ventanas.comandos.ejemplos.EjemplosGeneralJFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ProcesosJFrame extends JFrame {

	private JPanel contentPane;
	private JTextArea textAreaPs;
	private JCheckBox checkBoxMasAtributos;
	private JCheckBox chckbxTodosProcesos;
	private JButton btnTop;
	private JCheckBox chckbxJerarquia;
	private JCheckBox chckbxDetalle;
	private JLabel lblNumProceso;
	private JTextField textFieldNumeroProceso;
	private JLabel lblNombreProceso;
	private JTextField textFieldNombreProceso;
	private JButton btnKill;
	private JTextField textFieldComandoInfo;
	private JButton btnKillall;
	private JButton btnNice;
	private JCheckBox chckbxTodosLosProcesos;
	private JPanel panelEjemplos;
	private JButton btnPs_1;
	private JButton btnKill_1;
	private JButton btnPstree;
	private JCheckBox chckbxProcesosLinux;
	private JLabel lblKill;
	private JCheckBox chckbxCerrar;
	private JCheckBox chckbxRecargarConfig;
	private JPanel panelDetalleGeneral;
	private JLabel lblFicherosAbiertos;
	private JButton btnMostrar;
	private JTextField textFieldComandoDetalleGenerall;
	private JTextArea textAreaDetalleGeneral;
	private JScrollPane scrollPane_1;
	private JLabel lblPathAbierto;
	private JTextField textFieldPathAbierto;
	private JButton btnMostrarUsoPath;
	private JPanel panelLlamadas;
	private JLabel lblTipoProceso;
	private JComboBox comboBoxTipoProceso;
	private JButton btnLlamadasSistema;
	private JButton btnLlamadasBiblioteca;
	private JTextField textFieldComandoLlamadas;
	private JTextArea textAreaLlamadas;
	private JScrollPane scrollPane_2;
	private JPanel panelInterrupciones;
	private JButton btnVerTiempoReal;
	private JTextField textFieldComandoInterrupciones;
	private JTextArea textAreaInterrupciones;
	private JScrollPane scrollPane_3;
	private JPanel panelSistema;
	private JLabel lblLogReebot;
	private JButton btnLogReboot;
	private JTextField textFieldComandoSistema;
	private JTextArea textAreaSistema;
	private JScrollPane scrollPane_4;
	private JCheckBox chckbxProcesosAux;
	private JButton btnTop_1;
	private JCheckBox chckbxProcesosLinux2;
	private JButton btnPgrep;
	private JLabel lblNombreUsuario;
	private JTextField textFieldNombreUsuario;
	private JCheckBox chckbxPorUsuario;
	private JCheckBox chckbxG;
	private JButton btnMemoria;
	private JButton btnNicerenice;
	private JCheckBox chckbxMostrarPadres;
	private JCheckBox chckbxBuscarNombreProceso;
	private JButton btnLoadInfo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProcesosJFrame frame = new ProcesosJFrame();
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
	public ProcesosJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 581, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "cell 0 0,grow");
		
		JPanel panelInfo = new JPanel();
		tabbedPane.addTab("Info", null, panelInfo, null);
		panelInfo.setLayout(new MigLayout("", "[][grow]", "[][][][][][][][][][][][][][][grow]"));
		
		lblNumProceso = new JLabel("Num. Proceso");
		panelInfo.add(lblNumProceso, "cell 0 0,alignx trailing");
		
		textFieldNumeroProceso = new JTextField();
		panelInfo.add(textFieldNumeroProceso, "cell 1 0,growx");
		textFieldNumeroProceso.setColumns(10);
		
		lblNombreProceso = new JLabel("Nombre Proceso");
		panelInfo.add(lblNombreProceso, "cell 0 1,alignx trailing");
		
		textFieldNombreProceso = new JTextField();
		panelInfo.add(textFieldNombreProceso, "cell 1 1,growx");
		textFieldNombreProceso.setColumns(10);
		
		lblNombreUsuario = new JLabel("Nombre Usuario");
		panelInfo.add(lblNombreUsuario, "cell 0 2,alignx trailing");
		
		textFieldNombreUsuario = new JTextField();
		textFieldNombreUsuario.setToolTipText("bydan,root");
		panelInfo.add(textFieldNombreUsuario, "cell 1 2,growx");
		textFieldNombreUsuario.setColumns(10);
		
		chckbxPorUsuario = new JCheckBox("Por Usuario");
		panelInfo.add(chckbxPorUsuario, "cell 1 3");
		
		checkBoxMasAtributos = new JCheckBox("Mas Atributos");
		panelInfo.add(checkBoxMasAtributos, "flowx,cell 0 4");
		
		chckbxDetalle = new JCheckBox("Detalle");
		panelInfo.add(chckbxDetalle, "cell 1 4");
		
		chckbxTodosProcesos = new JCheckBox("Todos los Procesos");
		panelInfo.add(chckbxTodosProcesos, "cell 0 5");
		
		JButton btnPs = new JButton("ps");
		btnPs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "ps"; 
				
				if(checkBoxMasAtributos.isSelected()) {
					command = command + " -f"; 
				}
				
				if(chckbxTodosProcesos.isSelected()) {
					command = command + " -ax"; 
				}
				
				if(chckbxTodosLosProcesos.isSelected()) {
					command = command + " -A"; 
				}				
				
				if(chckbxJerarquia.isSelected()) {
					command = command + " -H"; 
				}
				
				if(chckbxDetalle.isSelected()) {
					command = command + " -l"; 
				}
				
				
				if(chckbxProcesosLinux.isSelected()) {
					command = command + " -eafw"; 					
				}
				
				if(chckbxProcesosLinux2.isSelected()) {
					command = command + " -ef"; 					
				}
				
				if(chckbxProcesosAux.isSelected()) {
					command = command + " aux"; 					
				}
				
				
				if(chckbxMostrarPadres.isSelected()) {
					command = command + " --forest"; 
				}
				
				if(chckbxBuscarNombreProceso.isSelected()) {
					if(!textFieldNombreProceso.getText().isEmpty()) {
						command = command + " | grep "+textFieldNombreProceso.getText(); 
					}
				}
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ProcesosJFrame.this);
				
				textAreaPs.setText(sOutput);
			}
		});
		
		chckbxTodosLosProcesos = new JCheckBox("Todos los Procesos Resumen");
		panelInfo.add(chckbxTodosLosProcesos, "cell 1 5");
		
		chckbxJerarquia = new JCheckBox("Jerarquia");
		panelInfo.add(chckbxJerarquia, "cell 0 6");
		
		chckbxProcesosLinux = new JCheckBox("Procesos Linux");
		panelInfo.add(chckbxProcesosLinux, "flowx,cell 1 6");
		
		chckbxProcesosAux = new JCheckBox("Procesos Aux");
		panelInfo.add(chckbxProcesosAux, "cell 0 7");
		
		chckbxProcesosLinux2 = new JCheckBox("Procesos Linux 2");
		panelInfo.add(chckbxProcesosLinux2, "cell 1 7");
		
		chckbxMostrarPadres = new JCheckBox("Mostrar Padres");
		panelInfo.add(chckbxMostrarPadres, "cell 0 8");
		
		chckbxBuscarNombreProceso = new JCheckBox("Buscar Nombre Proceso");
		panelInfo.add(chckbxBuscarNombreProceso, "cell 1 8");
		
		lblKill = new JLabel("KILL");
		panelInfo.add(lblKill, "cell 0 9");
		
		chckbxCerrar = new JCheckBox("Cerrar");
		panelInfo.add(chckbxCerrar, "cell 0 10");
		
		chckbxRecargarConfig = new JCheckBox("Recargar Config");
		panelInfo.add(chckbxRecargarConfig, "cell 1 10");
		panelInfo.add(btnPs, "flowx,cell 0 11");
		
		btnKill = new JButton("kill");
		btnKill.setToolTipText("Solo con Num Proceso");
		btnKill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "kill"; 				
				
				
				if(chckbxCerrar.isSelected()) {
					command = " -9";
				}
				
				if(chckbxRecargarConfig.isSelected()) {
					command = " -1";
				}
				
				command = command + " " + textFieldNumeroProceso.getText();
								
						
				textFieldComandoInfo.setText(command);
								
				String sOutput = Comando.executeCommandWithReturn(command,ProcesosJFrame.this);
				
				textAreaPs.setText(sOutput);
			}
		});
		panelInfo.add(btnKill, "flowx,cell 1 11");
		
		btnPgrep = new JButton("pgrep");
		btnPgrep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "pgrep"; 				
				
				if(!chckbxPorUsuario.isSelected()) {
					command=command +" "+textFieldNombreProceso.getText();
				} else {
					command=command +" -u "+textFieldNombreUsuario.getText();
				}
				
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ProcesosJFrame.this);
				
				textAreaPs.setText(sOutput);
			}
		});
		panelInfo.add(btnPgrep, "flowx,cell 0 12");
		
		btnMemoria = new JButton("Memoria");
		btnMemoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemoriaJFrame memoriaJFrame=new MemoriaJFrame();
				
				memoriaJFrame.show();
			}
		});
		panelInfo.add(btnMemoria, "flowx,cell 1 12");
		
		textFieldComandoInfo = new JTextField();
		textFieldComandoInfo.setText("Comando Actual");
		textFieldComandoInfo.setFont(new Font("Dialog", Font.BOLD, 14));
		panelInfo.add(textFieldComandoInfo, "cell 0 13 2 1,growx");
		textFieldComandoInfo.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		panelInfo.add(scrollPane, "cell 0 14 2 1,grow");
		
		textAreaPs = new JTextArea();
		scrollPane.setViewportView(textAreaPs);
		
		btnTop = new JButton("top");
		btnTop.setToolTipText("Procesos Principales y en Vivo");
		btnTop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "top"; 				
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ProcesosJFrame.this);
				
				textAreaPs.setText(sOutput);
			}
		});
		panelInfo.add(btnTop, "cell 0 11");
		
		btnKillall = new JButton("killall");
		btnKillall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "killall ";//-9 				
				
				command = command + " " + textFieldNombreProceso.getText();
						
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ProcesosJFrame.this);
				
				textAreaPs.setText(sOutput);
			}
		});
		panelInfo.add(btnKillall, "cell 1 11");
		
		btnNice = new JButton("nice");
		btnNice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "nice"; 								
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ProcesosJFrame.this);
				
				textAreaPs.setText(sOutput);
			}
		});
		panelInfo.add(btnNice, "cell 0 11");
		
		btnPstree = new JButton("pstree");
		btnPstree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "pstree"; 								
				
				if(chckbxG.isSelected()) {
					command=command+" -G";
				}
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ProcesosJFrame.this);
				
				textAreaPs.setText(sOutput);
			}
		});
		panelInfo.add(btnPstree, "cell 0 12");
		
		chckbxG = new JCheckBox("G");
		panelInfo.add(chckbxG, "cell 0 12");
		
		btnLoadInfo = new JButton("load Info");
		btnLoadInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command="cat /proc/loadavg";
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ProcesosJFrame.this);
				
				textAreaPs.setText(sOutput);
			}
		});
		panelInfo.add(btnLoadInfo, "cell 1 12");
		
		panelDetalleGeneral = new JPanel();
		tabbedPane.addTab("Detalle", null, panelDetalleGeneral, null);
		panelDetalleGeneral.setLayout(new MigLayout("", "[][grow]", "[][][][][grow]"));
		
		lblFicherosAbiertos = new JLabel("Ficheros Abiertos");
		panelDetalleGeneral.add(lblFicherosAbiertos, "cell 0 0");
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "lsof -p $$"; 								
				
				textFieldComandoDetalleGenerall.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ProcesosJFrame.this);
				
				textAreaDetalleGeneral.setText(sOutput);
			}
		});
		
		lblPathAbierto = new JLabel("Path Abierto");
		panelDetalleGeneral.add(lblPathAbierto, "cell 0 1,alignx trailing");
		
		textFieldPathAbierto = new JTextField();
		textFieldPathAbierto.setText("/home/bydan");
		panelDetalleGeneral.add(textFieldPathAbierto, "cell 1 1,growx");
		textFieldPathAbierto.setColumns(10);
		panelDetalleGeneral.add(btnMostrar, "flowx,cell 1 2");
		
		textFieldComandoDetalleGenerall = new JTextField();
		panelDetalleGeneral.add(textFieldComandoDetalleGenerall, "cell 0 3 2 1,growx");
		textFieldComandoDetalleGenerall.setColumns(10);
		
		scrollPane_1 = new JScrollPane();
		panelDetalleGeneral.add(scrollPane_1, "cell 0 4 2 1,grow");
		
		textAreaDetalleGeneral = new JTextArea();
		scrollPane_1.setViewportView(textAreaDetalleGeneral);
		
		btnMostrarUsoPath = new JButton("Mostrar Uso Path");
		btnMostrarUsoPath.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "lsof"; 								
				
				command=command + " " + textFieldPathAbierto.getText(); 
						
				textFieldComandoDetalleGenerall.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ProcesosJFrame.this);
				
				textAreaDetalleGeneral.setText(sOutput);
			}
		});
		panelDetalleGeneral.add(btnMostrarUsoPath, "cell 1 2");
		
		panelLlamadas = new JPanel();
		tabbedPane.addTab("Llamadas", null, panelLlamadas, null);
		panelLlamadas.setLayout(new MigLayout("", "[][grow]", "[][][][grow]"));
		
		lblTipoProceso = new JLabel("Tipo Proceso");
		panelLlamadas.add(lblTipoProceso, "cell 0 0");
		
		comboBoxTipoProceso = new JComboBox();
		comboBoxTipoProceso.setModel(new DefaultComboBoxModel(new String[] {"ls", "cp", "mv", "tree"}));
		panelLlamadas.add(comboBoxTipoProceso, "cell 1 0,growx");
		
		btnLlamadasSistema = new JButton("Llamadas Sistema");
		btnLlamadasSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "strace -c "+comboBoxTipoProceso.getSelectedItem()+" >/dev/null"; 								
				
				textFieldComandoLlamadas.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ProcesosJFrame.this);
				
				textAreaLlamadas.setText(sOutput);
			}
		});
		panelLlamadas.add(btnLlamadasSistema, "cell 0 1");
		
		btnLlamadasBiblioteca = new JButton("Llamadas Biblioteca");
		btnLlamadasBiblioteca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "strace -f -e open "+comboBoxTipoProceso.getSelectedItem()+" >/dev/null"; 								
				
				textFieldComandoLlamadas.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ProcesosJFrame.this);
				
				textAreaLlamadas.setText(sOutput);
			}
		});
		panelLlamadas.add(btnLlamadasBiblioteca, "cell 1 1");
		
		textFieldComandoLlamadas = new JTextField();
		panelLlamadas.add(textFieldComandoLlamadas, "cell 0 2 2 1,growx");
		textFieldComandoLlamadas.setColumns(10);
		
		scrollPane_2 = new JScrollPane();
		panelLlamadas.add(scrollPane_2, "cell 0 3 2 1,grow");
		
		textAreaLlamadas = new JTextArea();
		scrollPane_2.setViewportView(textAreaLlamadas);
		
		panelInterrupciones = new JPanel();
		tabbedPane.addTab("Interrupciones", null, panelInterrupciones, null);
		panelInterrupciones.setLayout(new MigLayout("", "[grow]", "[][][grow]"));
		
		btnVerTiempoReal = new JButton("Ver Tiempo Real");
		btnVerTiempoReal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "watch -n1 'cat /proc/interrupts'"; 								
				
				textFieldComandoInterrupciones.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ProcesosJFrame.this);
				
				textAreaInterrupciones.setText(sOutput);
			}
		});
		panelInterrupciones.add(btnVerTiempoReal, "cell 0 0");
		
		textFieldComandoInterrupciones = new JTextField();
		panelInterrupciones.add(textFieldComandoInterrupciones, "cell 0 1,growx");
		textFieldComandoInterrupciones.setColumns(10);
		
		scrollPane_3 = new JScrollPane();
		panelInterrupciones.add(scrollPane_3, "cell 0 2,grow");
		
		textAreaInterrupciones = new JTextArea();
		scrollPane_3.setViewportView(textAreaInterrupciones);
		
		panelSistema = new JPanel();
		tabbedPane.addTab("Sistema", null, panelSistema, null);
		panelSistema.setLayout(new MigLayout("", "[][grow]", "[][][grow]"));
		
		lblLogReebot = new JLabel("Log Reboot");
		panelSistema.add(lblLogReebot, "cell 0 0");
		
		btnLogReboot = new JButton("Log Reboot");
		btnLogReboot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "last reboot"; 								
				
				textFieldComandoSistema.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ProcesosJFrame.this);
				
				textAreaSistema.setText(sOutput);
			}
		});
		panelSistema.add(btnLogReboot, "cell 1 0");
		
		textFieldComandoSistema = new JTextField();
		panelSistema.add(textFieldComandoSistema, "cell 0 1 2 1,growx");
		textFieldComandoSistema.setColumns(10);
		
		scrollPane_4 = new JScrollPane();
		panelSistema.add(scrollPane_4, "cell 0 2 2 1,grow");
		
		textAreaSistema = new JTextArea();
		scrollPane_4.setViewportView(textAreaSistema);
		
		panelEjemplos = new JPanel();
		tabbedPane.addTab("Ejemplos", null, panelEjemplos, null);
		panelEjemplos.setLayout(new MigLayout("", "[]", "[][][][]"));
		
		btnPs_1 = new JButton("ps");
		btnPs_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("ps", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("ps");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnPs_1, "cell 0 0");
		
		btnKill_1 = new JButton("kill");
		btnKill_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("kill", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("kill");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnKill_1, "cell 0 1");
		
		btnTop_1 = new JButton("top");
		btnTop_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("top", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("top");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnTop_1, "cell 0 2");
		
		btnNicerenice = new JButton("nice_renice");
		btnNicerenice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("nice_renice", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("nice_renice");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnNicerenice, "cell 0 3");
	}
}
