package bydan.ubuntu.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;

import bydan.ubuntu.base.Comando;
import bydan.ubuntu.base.Constantes;
import bydan.ubuntu.base.Funciones;
import bydan.ubuntu.ventanas.comandos.ConfiguracionJFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MenuGeneralJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Funciones.CargarConfiguracion();
					
					MenuGeneralJFrame frame = new MenuGeneralJFrame();
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
	public MenuGeneralJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 187);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][]", "[][][][]"));
		
		JButton btnAplicaciones = new JButton("Aplicaciones");
		btnAplicaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuAplicacionesJFrame menuAplicacionesJFrame=new MenuAplicacionesJFrame();
				
				menuAplicacionesJFrame.show();
			}
		});
		contentPane.add(btnAplicaciones, "cell 3 1");
		
		JButton btnComandos = new JButton("Comandos");
		btnComandos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuComandosJFrame menuComandosJFrame=new MenuComandosJFrame();
				
				menuComandosJFrame.show();
			}
		});
		contentPane.add(btnComandos, "cell 3 2");
		
		JButton btnConfiguracion = new JButton("Configuracion");
		btnConfiguracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConfiguracionJFrame configuracionJFrame = new ConfiguracionJFrame();
				
				configuracionJFrame.show();				
			}
		});
		contentPane.add(btnConfiguracion, "cell 3 3");
	}
}
