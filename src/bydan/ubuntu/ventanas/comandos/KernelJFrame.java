package bydan.ubuntu.ventanas.comandos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bydan.ubuntu.base.Comando;
import bydan.ubuntu.ventanas.comandos.ejemplos.EjemplosGeneralJFrame;

import javax.swing.JTabbedPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class KernelJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldComandoModulos;
	private JTextArea textAreaModulos;
	private JScrollPane scrollPane;
	private JLabel lblModulo;
	private JTextField textFieldModulo;
	private JButton btnModuloInfo;
	private JLabel lblPath;
	private JTextField textFieldPathModulo;
	private JButton btnPathParametros;
	private JButton btnInfoLogs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KernelJFrame frame = new KernelJFrame();
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
	public KernelJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 534, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelModulos = new JPanel();
		tabbedPane.addTab("Modulos", null, panelModulos, null);
		panelModulos.setLayout(new MigLayout("", "[][grow]", "[][][][][][grow]"));
		
		JButton btnModulosKernel = new JButton("Modulos");
		btnModulosKernel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "lsmod"; 				
				String comillas="";
				
				
						
				textFieldComandoModulos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,KernelJFrame.this);
				
				textAreaModulos.setText(sOutput);
			}
		});
		
		lblModulo = new JLabel("Modulo");
		panelModulos.add(lblModulo, "cell 0 0,alignx trailing");
		
		textFieldModulo = new JTextField();
		panelModulos.add(textFieldModulo, "cell 1 0,growx");
		textFieldModulo.setColumns(10);
		
		lblPath = new JLabel("Path");
		panelModulos.add(lblPath, "cell 0 1,alignx trailing");
		
		textFieldPathModulo = new JTextField();
		textFieldPathModulo.setText("/proc/sys");
		panelModulos.add(textFieldPathModulo, "cell 1 1,growx");
		textFieldPathModulo.setColumns(10);
		panelModulos.add(btnModulosKernel, "cell 0 2");
		
		btnModuloInfo = new JButton("Modulo Info");
		btnModuloInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "modinfo " + textFieldModulo.getText(); 				
				String comillas="";
				
				
						
				textFieldComandoModulos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,KernelJFrame.this);
				
				textAreaModulos.setText(sOutput);
			}
		});
		panelModulos.add(btnModuloInfo, "cell 1 2");
		
		btnPathParametros = new JButton("Path Parametros");
		btnPathParametros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "ls -l"; 				
				String comillas="";
				
				command=command + " "+textFieldPathModulo.getText();
						
				textFieldComandoModulos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,KernelJFrame.this);
				
				textAreaModulos.setText(sOutput);
			}
		});
		panelModulos.add(btnPathParametros, "cell 0 3");
		
		btnInfoLogs = new JButton("Info LOGs");
		btnInfoLogs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("info-log", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("info-log");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelModulos.add(btnInfoLogs, "cell 1 3");
		
		textFieldComandoModulos = new JTextField();
		panelModulos.add(textFieldComandoModulos, "cell 0 4 2 1,growx");
		textFieldComandoModulos.setColumns(10);
		
		scrollPane = new JScrollPane();
		panelModulos.add(scrollPane, "cell 0 5 2 1,grow");
		
		textAreaModulos = new JTextArea();
		scrollPane.setViewportView(textAreaModulos);
	}

}
