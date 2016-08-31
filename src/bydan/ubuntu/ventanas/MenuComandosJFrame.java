package bydan.ubuntu.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import bydan.ubuntu.base.Funciones;
import bydan.ubuntu.ventanas.comandos.ArchivoCarpetaJFrame;
import bydan.ubuntu.ventanas.comandos.BasicoGeneralJFrame;
import bydan.ubuntu.ventanas.comandos.CompresionJFrame;
import bydan.ubuntu.ventanas.comandos.DiscosJFrame;
import bydan.ubuntu.ventanas.comandos.HardwareJFrame;
import bydan.ubuntu.ventanas.comandos.KernelJFrame;
import bydan.ubuntu.ventanas.comandos.LogJFrame;
import bydan.ubuntu.ventanas.comandos.MemoriaJFrame;
import bydan.ubuntu.ventanas.comandos.NetworkJFrame;
import bydan.ubuntu.ventanas.comandos.PipesJFrame;
import bydan.ubuntu.ventanas.comandos.ProcesosJFrame;
import bydan.ubuntu.ventanas.comandos.SalidaAuxiliarJFrame;
import bydan.ubuntu.ventanas.comandos.SistemaJFrame;
import bydan.ubuntu.ventanas.comandos.SoftwareJFrame;
import bydan.ubuntu.ventanas.comandos.UsuariosGruposJFrame;
import bydan.ubuntu.ventanas.comandos.tips.Tip1GeneralJFrame;
import bydan.ubuntu.ventanas.comandos.tips.Tip2ArchivosLinuxJFrame;
import bydan.ubuntu.ventanas.comandos.tips.Tip3AdministracionJFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuComandosJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funciones.CargarConfiguracion();
					
					MenuComandosJFrame frame = new MenuComandosJFrame();
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
	public MenuComandosJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 775, 550);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnBasico = new JMenu("Basico");
		menuBar.add(mnBasico);
		
		JMenuItem mntmGeneral = new JMenuItem("General");
		mntmGeneral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BasicoGeneralJFrame basicoGeneralJFrame=new BasicoGeneralJFrame();
				
				basicoGeneralJFrame.show();
			}
		});
		mnBasico.add(mntmGeneral);
		
		JMenu mnArchivoscarpetas = new JMenu("Archivos/Carpetas");
		menuBar.add(mnArchivoscarpetas);
		
		JMenuItem mntmArchivoscarpetas = new JMenuItem("Archivos-Carpetas");
		mntmArchivoscarpetas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArchivoCarpetaJFrame archivoCarpetaJFrame=new ArchivoCarpetaJFrame();
				
				archivoCarpetaJFrame.show();
			}
		});
		mnArchivoscarpetas.add(mntmArchivoscarpetas);
		
		JMenuItem mntmSalida = new JMenuItem("Salida");
		mntmSalida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SalidaAuxiliarJFrame salidaAuxiliarJFrame=new SalidaAuxiliarJFrame();
				
				salidaAuxiliarJFrame.show();
			}
		});
		mnArchivoscarpetas.add(mntmSalida);
		
		JMenuItem mntmCompresion = new JMenuItem("Compresion");
		mntmCompresion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompresionJFrame compresionJFrame=new CompresionJFrame();
				
				compresionJFrame.show();
			}
		});
		mnArchivoscarpetas.add(mntmCompresion);
		
		JMenu mnProcesos = new JMenu("Procesos");
		menuBar.add(mnProcesos);
		
		JMenuItem mntmProcesos = new JMenuItem("Procesos");
		mntmProcesos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProcesosJFrame procesosJFrame=new ProcesosJFrame();
				
				procesosJFrame.show();
			}
		});
		mnProcesos.add(mntmProcesos);
		
		JMenu mnAdministracion = new JMenu("Administracion");
		menuBar.add(mnAdministracion);
		
		JMenuItem mntmUsuariosgrupos = new JMenuItem("Usuarios-Grupos");
		mntmUsuariosgrupos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UsuariosGruposJFrame usuariosGruposJFrame=new UsuariosGruposJFrame();
				
				usuariosGruposJFrame.show();
			}
		});
		
		JMenuItem mntmSistema = new JMenuItem("Sistema");
		mntmSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SistemaJFrame sistemaJFrame=new SistemaJFrame();
			
				sistemaJFrame.show();
			}
		});
		mnAdministracion.add(mntmSistema);
		mnAdministracion.add(mntmUsuariosgrupos);
		
		JMenuItem mntmDiscos = new JMenuItem("Discos");
		mntmDiscos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DiscosJFrame discosJFrame=new DiscosJFrame();
				
				discosJFrame.show();
			}
		});
		
		JMenuItem mntmHardware = new JMenuItem("Hardware");
		mntmHardware.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HardwareJFrame hardwareJFrame=new HardwareJFrame();
				
				hardwareJFrame.show();
			}
		});
		mnAdministracion.add(mntmHardware);
		
		JMenuItem mntmSoftware = new JMenuItem("Software");
		mntmSoftware.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SoftwareJFrame softwareJFrame=new SoftwareJFrame();
				
				softwareJFrame.show();
			}
		});
		mnAdministracion.add(mntmSoftware);
		mnAdministracion.add(mntmDiscos);
		
		JMenuItem mntmLogs = new JMenuItem("Logs");
		mntmLogs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogJFrame logJFrame=new LogJFrame();
				
				
				logJFrame.show();
			}
		});
		
		JMenuItem mntmNetworking = new JMenuItem("Networking");
		mntmNetworking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NetworkJFrame networkJFrame=new NetworkJFrame();
				
				networkJFrame.show();
			}
		});
		
		JMenuItem mntmMemoria = new JMenuItem("Memoria");
		mntmMemoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemoriaJFrame memoriaJFrame=new MemoriaJFrame();
				
				memoriaJFrame.show();
			}
		});
		mnAdministracion.add(mntmMemoria);
		mnAdministracion.add(mntmNetworking);
		
		JMenuItem mntmKernel = new JMenuItem("Kernel");
		mntmKernel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KernelJFrame kernelJFrame=new KernelJFrame();
			
				kernelJFrame.show();
			}
		});
		mnAdministracion.add(mntmKernel);
		mnAdministracion.add(mntmLogs);
		
		JMenu mnAvanzado = new JMenu("Avanzado");
		menuBar.add(mnAvanzado);
		
		JMenuItem mntmPipes = new JMenuItem("Pipes/Comandos");
		mntmPipes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PipesJFrame pipesJFrame=new PipesJFrame();
				
				pipesJFrame.show();
			}
		});
		mnAvanzado.add(mntmPipes);
		
		JMenu mnTips = new JMenu("Tips");
		menuBar.add(mnTips);
		
		JMenuItem mntmTip = new JMenuItem("Tip 1 General");
		mntmTip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tip1GeneralJFrame tip1JFrame=new Tip1GeneralJFrame();
				
				tip1JFrame.show();
			}
		});
		mnTips.add(mntmTip);
		
		JMenuItem mntmTipArchivos = new JMenuItem("Tip 2 Archivos Linux");
		mntmTipArchivos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tip2ArchivosLinuxJFrame tip2ArchivosLinux=new Tip2ArchivosLinuxJFrame();
				
				tip2ArchivosLinux.show();
			}
		});
		mnTips.add(mntmTipArchivos);
		
		JMenuItem mntmTipAdministracion = new JMenuItem("Tip 3  Administracion");
		mntmTipAdministracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tip3AdministracionJFrame tip3AdministracionLinuxJFrame=new Tip3AdministracionJFrame();
				
				tip3AdministracionLinuxJFrame.show();
			}
		});
		mnTips.add(mntmTipAdministracion);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
}
