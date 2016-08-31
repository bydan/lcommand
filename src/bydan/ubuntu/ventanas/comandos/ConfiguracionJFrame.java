package bydan.ubuntu.ventanas.comandos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import bydan.ubuntu.base.Constantes;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfiguracionJFrame extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbxEjecutarBash;
	private JCheckBox chckbxComandosLogArchivo;
	private JCheckBox chckbxComandosResultadosArchivos;
	private JCheckBox chckbxUbuntu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfiguracionJFrame frame = new ConfiguracionJFrame();
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
	public ConfiguracionJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 295, 193);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[]", "[][][][][]"));
		
		chckbxEjecutarBash = new JCheckBox("Ejecutar Bash");
		contentPane.add(chckbxEjecutarBash, "cell 0 0");
		
		chckbxComandosLogArchivo = new JCheckBox("Comandos Log Archivo");
		contentPane.add(chckbxComandosLogArchivo, "cell 0 1");
		
		chckbxComandosResultadosArchivos = new JCheckBox("Comandos Resultados Archivos");
		contentPane.add(chckbxComandosResultadosArchivos, "cell 0 2");
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Constantes.CON_EJECUTAR_BASH=chckbxEjecutarBash.isSelected();
				Constantes.CON_COMANDO_ARCHIVO=chckbxComandosLogArchivo.isSelected();
				Constantes.CON_RESULTADO_COMANDO_ARCHIVO=chckbxComandosResultadosArchivos.isSelected();
				Constantes.UBUNTU=chckbxUbuntu.isSelected();
				
				ConfiguracionJFrame.this.dispose();
			}
		});
		
		chckbxUbuntu = new JCheckBox("Ubuntu");
		contentPane.add(chckbxUbuntu, "cell 0 3");
		contentPane.add(btnGuardar, "flowx,cell 0 4");
		
		JButton btnDefecto = new JButton("Defecto");
		btnDefecto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Constantes.CON_EJECUTAR_BASH=true;
				Constantes.CON_COMANDO_ARCHIVO=false;
				Constantes.CON_RESULTADO_COMANDO_ARCHIVO=false;
				Constantes.UBUNTU=false;
				
				chckbxEjecutarBash.setSelected(Constantes.CON_EJECUTAR_BASH);
				chckbxComandosLogArchivo.setSelected(Constantes.CON_COMANDO_ARCHIVO);
				chckbxUbuntu.setSelected(Constantes.UBUNTU);
			}
		});
		contentPane.add(btnDefecto, "cell 0 4");
		
		this.CargaInicial();
	}

	public void CargaInicial(){
		chckbxEjecutarBash.setSelected(Constantes.CON_EJECUTAR_BASH);
		chckbxComandosLogArchivo.setSelected(Constantes.CON_COMANDO_ARCHIVO);
		chckbxComandosResultadosArchivos.setSelected(Constantes.CON_RESULTADO_COMANDO_ARCHIVO);
	}
}
