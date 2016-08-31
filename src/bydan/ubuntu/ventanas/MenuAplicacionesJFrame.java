package bydan.ubuntu.ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import bydan.ubuntu.base.Comando;
import bydan.ubuntu.base.Constantes;
import bydan.ubuntu.base.Funciones;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MenuAplicacionesJFrame extends JFrame {

	private JPanel contentPane;
	protected String sComando="";
	protected String sParametros="";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Funciones.CargarConfiguracion();
					
					MenuAplicacionesJFrame frame = new MenuAplicacionesJFrame();
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
	public MenuAplicacionesJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 687, 642);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnInicio = new JMenu("Inicio");
		menuBar.add(mnInicio);
		
		JMenu mnTodosLosProgramas = new JMenu("Todos los Programas");
		mnInicio.add(mnTodosLosProgramas);
		
		JMenu mnAccesorios_1 = new JMenu("Accesorios");
		mnTodosLosProgramas.add(mnAccesorios_1);
		
		JMenuItem mntmCalculadora = new JMenuItem("Calculadora");
		mntmCalculadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="gnome-calculator";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gnome-calculator";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAccesorios_1.add(mntmCalculadora);
		
		JMenuItem mntmConexionAEscritorio = new JMenuItem("Conexion a Escritorio remoto");
		mntmConexionAEscritorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="remmina";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="remmina";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAccesorios_1.add(mntmConexionAEscritorio);
		
		JMenuItem mntmComparticionDelEscritorio_1 = new JMenuItem("Comparticion del Escritorio");
		mntmComparticionDelEscritorio_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="vino-preferences";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					
					sComando="vino-preferences";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAccesorios_1.add(mntmComparticionDelEscritorio_1);
		
		JMenuItem mntmEjecutar = new JMenuItem("Ejecutar");
		mntmEjecutar.setEnabled(false);
		mnAccesorios_1.add(mntmEjecutar);
		
		JMenuItem mntmExploradorDeWindows = new JMenuItem("Explorador de Windows");
		mntmExploradorDeWindows.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="nemo";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="nautilus";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAccesorios_1.add(mntmExploradorDeWindows);
		
		JMenuItem mntmPaint = new JMenuItem("Paint");
		mntmPaint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="gimp-2.8";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gimp-2.8";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenuItem mntmGestorDeArchivadores = new JMenuItem("Gestor de Archivadores");
		mntmGestorDeArchivadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="file-roller";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="file-roller";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAccesorios_1.add(mntmGestorDeArchivadores);
		mnAccesorios_1.add(mntmPaint);
		
		JMenuItem mntmWordpad = new JMenuItem("WordPad");
		mntmWordpad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="xed";//"gedit";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gedit";//"gedit";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenuItem mntmCapturadorDePantalla = new JMenuItem("Capturador de Pantalla");
		mntmCapturadorDePantalla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="gnome-screenshot ";
					sParametros="--interactive";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gnome-screenshot ";
					sParametros="--interactive";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAccesorios_1.add(mntmCapturadorDePantalla);
		
		JMenu mnSimbolosDelSistema = new JMenu("Simbolos del Sistema");
		mnAccesorios_1.add(mnSimbolosDelSistema);
		
		JMenuItem mntmSimboloDelSistema = new JMenuItem("Simbolo del Sistema");
		mnSimbolosDelSistema.add(mntmSimboloDelSistema);
		
		JMenuItem mntmXterm = new JMenuItem("XTerm");
		mntmXterm.setEnabled(false);
		mntmXterm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="xterm";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="xterm";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnSimbolosDelSistema.add(mntmXterm);
		
		JMenuItem mntmUxterm = new JMenuItem("UXTerm");
		mntmUxterm.setEnabled(false);
		mntmUxterm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="uxterm";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="uxterm";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnSimbolosDelSistema.add(mntmUxterm);
		mntmSimboloDelSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="gnome-terminal";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gnome-terminal";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAccesorios_1.add(mntmWordpad);
		
		JMenuItem mntmNotas = new JMenuItem("Notas");
		mntmNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="tomboy";
					sParametros="--search";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="tomboy";
					sParametros="--search";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenuItem mntmVisorDeDocumentos = new JMenuItem("Visor de Documentos");
		mntmVisorDeDocumentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="evince";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="evince";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAccesorios_1.add(mntmVisorDeDocumentos);
		mnAccesorios_1.add(mntmNotas);
		
		JMenuItem mntmCalendario = new JMenuItem("Calendario");
		mntmCalendario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="gnome-calendar";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="gnome-calendar";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAccesorios_1.add(mntmCalendario);
		
		JMenu mnAccesibilidad = new JMenu("Accesibilidad");
		mnAccesorios_1.add(mnAccesibilidad);
		
		JMenuItem mntmGeneral_2 = new JMenuItem("General");
		mntmGeneral_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="universal-access";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="unity-control-center";
					sParametros="universal-access";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAccesibilidad.add(mntmGeneral_2);
		
		JMenuItem mntmLupa = new JMenuItem("Lupa");
		mntmLupa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="universal-access";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {					
					sComando="unity-tweak-tool";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAccesibilidad.add(mntmLupa);
		
		JMenuItem mntmNarrador = new JMenuItem("Narrador");
		mntmNarrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="orca";
					sParametros="--replace";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="orca";
					sParametros="--replace";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAccesibilidad.add(mntmNarrador);
		
		JMenuItem mntmTecladoEnPantalla = new JMenuItem("Teclado en Pantalla");
		mntmTecladoEnPantalla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					//sComando="cinnamon-settings";
					//sParametros="applets";
					
					sComando="cinnamon-settings";
					sParametros="universal-access";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="unity-control-center";
					sParametros="universal-access";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAccesibilidad.add(mntmTecladoEnPantalla);
		
		JMenu mnHerramientasDelSistema = new JMenu("Herramientas del Sistema");
		mnAccesorios_1.add(mnHerramientasDelSistema);
		
		JMenuItem mntmEquipo = new JMenuItem("Equipo");
		mntmEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="nemo";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="nautilus";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnHerramientasDelSistema.add(mntmEquipo);
		
		JMenuItem mntmInformacionDelSistema = new JMenuItem("Informacion del Sistema");
		mntmInformacionDelSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="info";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="info";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnHerramientasDelSistema.add(mntmInformacionDelSistema);
		
		JMenuItem mntmInternetExplorer = new JMenuItem("Internet Explorer");
		mntmInternetExplorer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="firefox";
					sParametros="www.google.com";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="firefox";
					sParametros="www.google.com";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnHerramientasDelSistema.add(mntmInternetExplorer);
		
		JMenuItem mntmMapaDeCaracteres = new JMenuItem("Mapa de Caracteres");
		mntmMapaDeCaracteres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="gucharmap";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="gucharmap";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnHerramientasDelSistema.add(mntmMapaDeCaracteres);
		
		JMenuItem mntmMonitorDeRecursos = new JMenuItem("Monitor de Recursos");
		mntmMonitorDeRecursos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="gnome-system-monitor";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gnome-system-monitor";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenuItem mntmMetodoDeEntrada = new JMenuItem("Metodo de Entrada");
		mntmMetodoDeEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="mintlocale";
					sParametros="im";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="region";
					 
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnHerramientasDelSistema.add(mntmMetodoDeEntrada);
		mnHerramientasDelSistema.add(mntmMonitorDeRecursos);
		
		JMenuItem mntmPanelDeControl = new JMenuItem("Panel de Control");
		mntmPanelDeControl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnHerramientasDelSistema.add(mntmPanelDeControl);
		
		JMenuItem mntmPantallaDeBienvenida = new JMenuItem("Pantalla de Bienvenida");
		mntmPantallaDeBienvenida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if(!Constantes.UBUNTU) {
					sComando="mintwelcome";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="mintwelcome";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAccesorios_1.add(mntmPantallaDeBienvenida);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setEnabled(false);
		mnTodosLosProgramas.add(mnMantenimiento);
		
		JMenu mnInicio_1 = new JMenu("Inicio");
		mnTodosLosProgramas.add(mnInicio_1);
		
		JMenuItem mntmGeneral_3 = new JMenuItem("General");
		mntmGeneral_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="startup";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gnome-session-properties";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnInicio_1.add(mntmGeneral_3);
		
		JMenu mnMicrosoftOffice = new JMenu("Microsoft Office");
		mnTodosLosProgramas.add(mnMicrosoftOffice);
		
		JMenuItem mntmGeneral_1 = new JMenuItem("General");
		mntmGeneral_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="libreoffice";//"libreoffice5.1";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="libreoffice";//"libreoffice5.1";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnMicrosoftOffice.add(mntmGeneral_1);
		
		JMenuItem mntmUsuarioX = new JMenuItem("Usuario X");
		mntmUsuarioX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="nemo";
					sParametros="/home/"+Constantes.USUARIO;//%U								
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="nautilus";
					sParametros="/home/"+Constantes.USUARIO;//%U								
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnInicio.add(mntmUsuarioX);
		
		JMenuItem mntmDocumentos = new JMenuItem("Documentos");
		mntmDocumentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="nemo";
					sParametros="/home/"+Constantes.USUARIO+"/Documentos/";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="nautilus";
					sParametros="/home/"+Constantes.USUARIO+"/Documentos/";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnInicio.add(mntmDocumentos);
		
		JMenuItem mntmImagenes = new JMenuItem("Imagenes");
		mntmImagenes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="nemo";
					sParametros="/home/"+Constantes.USUARIO+"/Imágenes/";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="nautilus";
					sParametros="/home/"+Constantes.USUARIO+"/Imágenes/";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnInicio.add(mntmImagenes);
		
		JMenuItem mntmMusica = new JMenuItem("Musica");
		mntmMusica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="nemo";
					sParametros="/home/"+Constantes.USUARIO+"/Música/";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="nautilus";
					sParametros="/home/"+Constantes.USUARIO+"/Música/";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnInicio.add(mntmMusica);
		
		JMenuItem mntmJuegos = new JMenuItem("Juegos");
		mntmJuegos.setEnabled(false);
		mnInicio.add(mntmJuegos);
		
		JMenuItem mntmEquipo_1 = new JMenuItem("Equipo");
		mntmEquipo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="nemo";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="nautilus";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnInicio.add(mntmEquipo_1);
		
		JMenuItem mntmPanelDeControl_1 = new JMenuItem("Panel de Control");
		mntmPanelDeControl_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnInicio.add(mntmPanelDeControl_1);
		
		JMenuItem mntmProgramasPredeterminados = new JMenuItem("Programas Predeterminados");
		mntmProgramasPredeterminados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="default";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="info";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenu mnDispositivosEImpresoras = new JMenu("Dispositivos e Impresoras");
		mnInicio.add(mnDispositivosEImpresoras);
		
		JMenuItem mntmImpresoras_2 = new JMenuItem("Impresoras");
		mntmImpresoras_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="system-config-printer";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="system-config-printer";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnDispositivosEImpresoras.add(mntmImpresoras_2);
		
		JMenuItem mntmDrivers = new JMenuItem("Drivers");
		mntmDrivers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!Constantes.UBUNTU) {
					sComando="driver-manager";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="software-properties-gtk";
					sParametros="--open-tab=4software-properties-gtk --open-tab=4";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnDispositivosEImpresoras.add(mntmDrivers);
		
		JMenuItem mntmPantalla_2 = new JMenuItem("Pantalla");
		mntmPantalla_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="display";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="display";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnDispositivosEImpresoras.add(mntmPantalla_2);
		
		JMenuItem mntmSonido_2 = new JMenuItem("Sonido");
		mntmSonido_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="sound";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="sound";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnDispositivosEImpresoras.add(mntmSonido_2);
		
		JMenuItem mntmTabletaGrafica_2 = new JMenuItem("Tableta Grafica");
		mntmTabletaGrafica_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="wacom";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="unity-control-center";
					sParametros="wacom";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnDispositivosEImpresoras.add(mntmTabletaGrafica_2);
		mnInicio.add(mntmProgramasPredeterminados);
		
		JMenuItem mntmAyudaYSoporte = new JMenuItem("Ayuda y Soporte Tecnico");
		mntmAyudaYSoporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!Constantes.UBUNTU) {
					sComando="yelp";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="yelp";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnInicio.add(mntmAyudaYSoporte);
		
		JMenu mnEscritorio = new JMenu("Escritorio");
		menuBar.add(mnEscritorio);
		
		JMenu mnClicDerecho = new JMenu("Clic Derecho");
		mnEscritorio.add(mnClicDerecho);
		
		JMenuItem mntmResolucionDePantalla = new JMenuItem("Resolucion de Pantalla");
		mntmResolucionDePantalla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="display";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="display";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnClicDerecho.add(mntmResolucionDePantalla);
		
		JMenuItem mntmGadgets = new JMenuItem("Gadgets");
		mntmGadgets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="desklets";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="desklets";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnClicDerecho.add(mntmGadgets);
		
		JMenu mnPersonalizar = new JMenu("Personalizar");
		mnClicDerecho.add(mnPersonalizar);
		
		JMenuItem mntmGeneral = new JMenuItem("General");
		mntmGeneral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="--overview";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnPersonalizar.add(mntmGeneral);
		
		JMenuItem mntmIconosDelEscritorio = new JMenuItem("Iconos del Escritorio");
		mntmIconosDelEscritorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="desktop";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-tweak-tool";
					sParametros="";//"desktop";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnPersonalizar.add(mntmIconosDelEscritorio);
		
		JMenuItem mntmPunterosDelMouse = new JMenuItem("Punteros del Mouse");
		mntmPunterosDelMouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="themes";//mouse
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-tweak-tool";
					sParametros="";//"mouse";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnPersonalizar.add(mntmPunterosDelMouse);
		
		
		JMenuItem mntmFondoDeEscritorio = new JMenuItem("Fondo de Escritorio");
		mntmFondoDeEscritorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="backgrounds";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="appearance";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenuItem mntmTeclado_1 = new JMenuItem("Teclado");
		mntmTeclado_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="keyboard";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="keyboard";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnPersonalizar.add(mntmTeclado_1);
		mnPersonalizar.add(mntmFondoDeEscritorio);
		
		JMenuItem mntmColorDeVentana = new JMenuItem("Color de Ventana");
		mntmColorDeVentana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="themes";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-tweak-tool";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnPersonalizar.add(mntmColorDeVentana);
		
		JMenuItem mntmSonidos = new JMenuItem("Sonidos");
		mntmSonidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="sound";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="sound";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnPersonalizar.add(mntmSonidos);
		
		JMenuItem mntmProtectorDePantalla = new JMenuItem("Protector de Pantalla");
		mntmProtectorDePantalla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="screensaver";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="unity-control-center";
					sParametros="";//"screensaver";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnPersonalizar.add(mntmProtectorDePantalla);
		
		JMenu mnCtrlaltsupr = new JMenu("Ctrl_Alt_Supr");
		menuBar.add(mnCtrlaltsupr);
		
		JMenu mnAdministradorDeTareas = new JMenu("Administrador de Tareas");
		mnCtrlaltsupr.add(mnAdministradorDeTareas);
		
		JMenuItem mntmProcesos = new JMenuItem("Procesos");
		mntmProcesos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				if(!Constantes.UBUNTU) {
					sComando="gnome-system-monitor";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gnome-system-monitor";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAdministradorDeTareas.add(mntmProcesos);
		
		JMenuItem mntmRendimiento = new JMenuItem("Rendimiento");
		mntmRendimiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="gnome-system-monitor";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gnome-system-monitor";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAdministradorDeTareas.add(mntmRendimiento);
		
		JMenuItem mntmUsuarios = new JMenuItem("Usuarios");
		mntmUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="user";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="user-accounts";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAdministradorDeTareas.add(mntmUsuarios);
		
		JMenu mnEquipo = new JMenu("Equipo");
		menuBar.add(mnEquipo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mntmAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!Constantes.UBUNTU) {
					sComando="nemo";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="nautilus";
					sParametros="";//"--new-window";
					 
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnEquipo.add(mntmAbrir);
		
		JMenu mnAdministrar = new JMenu("Administrar");
		mnAdministrar.setEnabled(false);
		mnEquipo.add(mnAdministrar);
		
		JMenu mnPropiedades = new JMenu("Propiedades");
		mnEquipo.add(mnPropiedades);
		
		JMenuItem mntmInformacionBasicaDel = new JMenuItem("Informacion Basica del Equipo");
		mntmInformacionBasicaDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="info";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="unity-control-center";
					sParametros="info";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnPropiedades.add(mntmInformacionBasicaDel);
		
		JMenuItem mntmConfiguracionDeAcceso = new JMenuItem("Configuracion de Acceso Remoto");
		mntmConfiguracionDeAcceso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="vino-preferences";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="vino-preferences";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenu mnAdministradorDeDispositivos = new JMenu("Administrador de Dispositivos");
		mnPropiedades.add(mnAdministradorDeDispositivos);
		
		JMenuItem mntmAdministradorDeDispositivos = new JMenuItem("Drivers");
		mnAdministradorDeDispositivos.add(mntmAdministradorDeDispositivos);
		
		JMenuItem mntmImpresoras_1 = new JMenuItem("Impresoras");
		mntmImpresoras_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="system-config-printer";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="system-config-printer";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAdministradorDeDispositivos.add(mntmImpresoras_1);
		
		JMenuItem mntmSonido_1 = new JMenuItem("Sonido");
		mntmSonido_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="sound";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="sound";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAdministradorDeDispositivos.add(mntmSonido_1);
		
		JMenuItem mntmPantalla_1 = new JMenuItem("Pantalla");
		mntmPantalla_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="display";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="display";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAdministradorDeDispositivos.add(mntmPantalla_1);
		
		JMenuItem mntmTabletaGrafica_1 = new JMenuItem("Tableta Grafica");
		mntmTabletaGrafica_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="wacom";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="unity-control-center";
					sParametros="wacom";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAdministradorDeDispositivos.add(mntmTabletaGrafica_1);
		mntmAdministradorDeDispositivos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="driver-manager";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="software-properties-gtk";
					sParametros="--open-tab=4software-properties-gtk --open-tab=4";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnPropiedades.add(mntmConfiguracionDeAcceso);
		
		JMenu mnConfiguacionAvanzadaDel = new JMenu("Configuacion Avanzada del Sistema");
		mnConfiguacionAvanzadaDel.setEnabled(false);
		mnPropiedades.add(mnConfiguacionAvanzadaDel);
		
		JMenu mnOpciones = new JMenu("Opciones Generales");
		menuBar.add(mnOpciones);
		
		JMenu mnPanelDeControl = new JMenu("Panel de Control");
		mnOpciones.add(mnPanelDeControl);
		
		JMenu mnSistemaYSeguridad = new JMenu("Sistema y Seguridad");
		mnPanelDeControl.add(mnSistemaYSeguridad);
		
		JMenu mnSistema_1 = new JMenu("Sistema");
		mnSistemaYSeguridad.add(mnSistema_1);
		
		JMenuItem mntmInformacion = new JMenuItem("Informacion");
		mntmInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="info";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="info";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnSistema_1.add(mntmInformacion);
		
		JMenuItem mntmPermitirAccesoRemoto = new JMenuItem("Permitir Acceso Remoto");
		mntmPermitirAccesoRemoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="vino-preferences";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="vino-preferences";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnSistema_1.add(mntmPermitirAccesoRemoto);
		
		JMenuItem mntmCopiasDeSeguridad = new JMenuItem("Copias de Seguridad");
		mntmCopiasDeSeguridad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="mintbackup";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="deja-dup";
					 
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenu mnOpcionesDeEnergia = new JMenu("Opciones de Energia");
		mnSistemaYSeguridad.add(mnOpcionesDeEnergia);
		
		JMenuItem mntmEstadisticasDeEnergia = new JMenuItem("Estadisticas de Energia");
		mntmEstadisticasDeEnergia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				if(!Constantes.UBUNTU) {
					sComando="gnome-power-statistics";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gnome-power-statistics";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenuItem mntmGestionDeEnergia = new JMenuItem("Gestion de Energia");
		mntmGestionDeEnergia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="power";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="power";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnOpcionesDeEnergia.add(mntmGestionDeEnergia);
		mnOpcionesDeEnergia.add(mntmEstadisticasDeEnergia);
		
		JMenu mnHerramientasAdministrativas = new JMenu("Herramientas Administrativas");
		mnSistemaYSeguridad.add(mnHerramientasAdministrativas);
		
		JMenuItem mntmVisorDeEventos = new JMenuItem("Visor de Eventos");
		mntmVisorDeEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="gnome-system-log";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gnome-system-log";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenu mnDiscos = new JMenu("Discos");
		mnHerramientasAdministrativas.add(mnDiscos);
		
		JMenuItem mntmUsoDeDisco = new JMenuItem("Uso de Disco");
		mnDiscos.add(mntmUsoDeDisco);
		
		JMenuItem mntmDiscos = new JMenuItem("Discos");
		mntmDiscos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="gnome-disks";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gnome-disks";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnDiscos.add(mntmDiscos);
		
		JMenuItem mntmCrearParticionesDisco = new JMenuItem("Crear Particiones Disco Duro");
		mnDiscos.add(mntmCrearParticionesDisco);
		mntmCrearParticionesDisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="gparted-pkexec";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gparted-pkexec";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mntmUsoDeDisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="baobab";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="baobab";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenuItem mntmDconf = new JMenuItem("DConf");
		mntmDconf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					//gnome-software
					sComando="dconf-editor";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="dconf-editor";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnHerramientasAdministrativas.add(mntmDconf);
		mnHerramientasAdministrativas.add(mntmVisorDeEventos);
		
		JMenuItem mntmNotificaciones = new JMenuItem("Notificaciones");
		mntmNotificaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="notifications";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="notifications";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnHerramientasAdministrativas.add(mntmNotificaciones);
		
		JMenuItem mntmConfiguracionDeEventos = new JMenuItem("Configuracion de Eventos");
		mntmConfiguracionDeEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="pkexec";
					sParametros="xdiagnose";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="pkexec";
					sParametros="xdiagnose";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnHerramientasAdministrativas.add(mntmConfiguracionDeEventos);
		mnSistemaYSeguridad.add(mntmCopiasDeSeguridad);
		
		JMenuItem mntmBootLoader = new JMenuItem("Boot Loader");
		mntmBootLoader.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="kcmshell4";//sudo
					sParametros="kcm_grub2";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="kcmshell4";//sudo
					sParametros="kcm_grub2";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnSistemaYSeguridad.add(mntmBootLoader);
		
		JMenuItem mntmFirewall = new JMenuItem("Firewall");
		mntmFirewall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="gufw";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gufw";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnSistemaYSeguridad.add(mntmFirewall);
		
		JMenu mnRedesEInternet = new JMenu("Redes e Internet");
		mnPanelDeControl.add(mnRedesEInternet);
		
		JMenuItem mntmCentroDeRedes = new JMenuItem("Centro de Redes y Recursos");
		mntmCentroDeRedes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="network";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="unity-control-center";
					sParametros="network";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenuItem mntmConexionesDeRed = new JMenuItem("Conexiones de Red");
		mntmConexionesDeRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="nm-connection-editor";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="nm-connection-editor";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnRedesEInternet.add(mntmConexionesDeRed);
		mnRedesEInternet.add(mntmCentroDeRedes);
		
		JMenuItem mntmBloqueadorDeDominio = new JMenuItem("Bloqueador de Dominio");
		mntmBloqueadorDeDominio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="mintnanny";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="mintnanny";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenuItem mntmComparticionDelEscritorio = new JMenuItem("Comparticion del Escritorio");
		mntmComparticionDelEscritorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="vino-preferences";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="vino-preferences";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnRedesEInternet.add(mntmComparticionDelEscritorio);
		mnRedesEInternet.add(mntmBloqueadorDeDominio);
		
		JMenuItem mntmBluetooth = new JMenuItem("Bluetooth");
		mntmBluetooth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!Constantes.UBUNTU) {
					//sComando="cinnamon-settings";
					//sParametros="bluetooth";
					
					sComando="";
					sParametros="blueberry";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="bluetooth";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnRedesEInternet.add(mntmBluetooth);
		
		JMenuItem mntmConectarConEl = new JMenuItem("Conectar con el Servidor");
		mntmConectarConEl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="nemo";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="nautilus-connect-server";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnRedesEInternet.add(mntmConectarConEl);
		
		JMenuItem mntmCuentasEnLinea = new JMenuItem("Cuentas en Linea");
		mntmCuentasEnLinea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="credentials";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnRedesEInternet.add(mntmCuentasEnLinea);
		
		JMenu mnHardwareYSonido = new JMenu("Hardware y Sonido");
		mnPanelDeControl.add(mnHardwareYSonido);
		
		JMenuItem mntmImpresoras = new JMenuItem("Impresoras");
		mntmImpresoras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="system-config-printer";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="system-config-printer";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenuItem mntmAdministradorDeDispositivos_1 = new JMenuItem("Administrador de Dispositivos");
		mntmAdministradorDeDispositivos_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!Constantes.UBUNTU) {
					sComando="driver-manager";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="software-properties-gtk";
					sParametros="--open-tab=4software-properties-gtk --open-tab=4";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnHardwareYSonido.add(mntmAdministradorDeDispositivos_1);
		mnHardwareYSonido.add(mntmImpresoras);
		
		JMenuItem mntmColor = new JMenuItem("Color");
		mntmColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="color";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="unity-control-center";
					sParametros="color";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenuItem mntmEscaner = new JMenuItem("Escaner");
		mntmEscaner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="simple-scan";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="simple-scan";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnHardwareYSonido.add(mntmEscaner);
		mnHardwareYSonido.add(mntmColor);
		
		JMenuItem mntmSonido = new JMenuItem("Sonido");
		mntmSonido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="sound";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="sound";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnHardwareYSonido.add(mntmSonido);
		
		JMenuItem mntmPantalla = new JMenuItem("Pantalla");
		mntmPantalla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="display";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="display";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnHardwareYSonido.add(mntmPantalla);
		
		JMenuItem mntmMouse = new JMenuItem("Mouse");
		mntmMouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="mouse";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="mouse";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnHardwareYSonido.add(mntmMouse);
		
		JMenuItem mntmTeclado_2 = new JMenuItem("Teclado");
		mntmTeclado_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="keyboard";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="keyboard";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnHardwareYSonido.add(mntmTeclado_2);
		
		JMenu mnUsb = new JMenu("USB");
		mnHardwareYSonido.add(mnUsb);
		
		JMenuItem mntmFormateador = new JMenuItem("Formateador");
		mntmFormateador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="mintstick";
					sParametros="-m format";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="mintstick";
					sParametros="-m format";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnUsb.add(mntmFormateador);
		
		JMenuItem mntmGrabadorDeImagenes = new JMenuItem("Grabador de Imagenes");
		mntmGrabadorDeImagenes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="mintstick";
					sParametros="-m iso";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="usb-creator-gtk";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnUsb.add(mntmGrabadorDeImagenes);
		
		JMenuItem mntmTabletaGrafica = new JMenuItem("Tableta Grafica");
		mntmTabletaGrafica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="wacom";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="wacom";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnHardwareYSonido.add(mntmTabletaGrafica);
		
		JMenuItem mntmReproduccionAutomatica = new JMenuItem("Reproduccion Automatica");
		mntmReproduccionAutomatica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="default";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="default";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnHardwareYSonido.add(mntmReproduccionAutomatica);
		
		JMenu mnProgramas = new JMenu("Programas");
		mnPanelDeControl.add(mnProgramas);
		
		JMenu mnProgramas_1 = new JMenu("Programas");
		mnProgramas.add(mnProgramas_1);
		
		JMenuItem mntmGeneral_4 = new JMenuItem("General");
		mntmGeneral_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="gksu";
					sParametros="mintinstall";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gksu";
					sParametros="mintinstall";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnProgramas_1.add(mntmGeneral_4);
		
		JMenuItem mntmSynaptic = new JMenuItem("Synaptic");
		mntmSynaptic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="synaptic-pkexec";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="synaptic-pkexec";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnProgramas_1.add(mntmSynaptic);
		
		JMenuItem mntmUbuntu = new JMenuItem("Ubuntu");
		mntmUbuntu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				if(!Constantes.UBUNTU) {
					//sComando="/usr/bin/software-center";
					//sParametros="%u";
					
					sComando="gnome-software";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gnome-software";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnProgramas_1.add(mntmUbuntu);
		
		JMenuItem mntmOrigenesDelSoftware = new JMenuItem("Origenes del Software");
		mntmOrigenesDelSoftware.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!Constantes.UBUNTU) {
					sComando="software-sources";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="software-sources";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnProgramas_1.add(mntmOrigenesDelSoftware);
		
		JMenuItem mntmProgramasPredeterminados_1 = new JMenuItem("Programas Predeterminados");
		mntmProgramasPredeterminados_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="default";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="info";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenuItem mntmGestorDeActualizaciones = new JMenuItem("Gestor de Actualizaciones");
		mntmGestorDeActualizaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="mintupdate";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="/usr/bin/update-manager";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnProgramas.add(mntmGestorDeActualizaciones);
		mnProgramas.add(mntmProgramasPredeterminados_1);
		
		JMenuItem mntmGadgetsDeEscritorio = new JMenuItem("Gadgets de Escritorio");
		mntmGadgetsDeEscritorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="desklets";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="desklets";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnProgramas.add(mntmGadgetsDeEscritorio);
		
		JMenuItem mntmExtensiones = new JMenuItem("Extensiones");
		mntmExtensiones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="extensions";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="extensions";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnProgramas.add(mntmExtensiones);
		
		JMenu mnCuentasDeUsuario = new JMenu("Cuentas de Usuario");
		mnPanelDeControl.add(mnCuentasDeUsuario);
		
		JMenuItem mntmCuentasDeUsuario = new JMenuItem("Cuentas de Usuario");
		mntmCuentasDeUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings-users";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="unity-control-center";
					sParametros="user-accounts";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnCuentasDeUsuario.add(mntmCuentasDeUsuario);
		
		JMenuItem mntmDetallesDeCuenta = new JMenuItem("Detalles de Cuenta");
		mntmDetallesDeCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="user";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="user-accounts";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnCuentasDeUsuario.add(mntmDetallesDeCuenta);
		
		JMenuItem mntmVentanaDeEntrada = new JMenuItem("Ventana de Entrada");
		mntmVentanaDeEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="gksu";
					sParametros="/usr/sbin/mdmsetup";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gksu";
					sParametros="/usr/sbin/mdmsetup";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnCuentasDeUsuario.add(mntmVentanaDeEntrada);
		
		JMenuItem mntmContrasenasYClaves = new JMenuItem("Contrasenas y Claves");
		mntmContrasenasYClaves.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!Constantes.UBUNTU) {
					sComando="/usr/bin/seahorse";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="/usr/bin/seahorse";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenuItem mntmPrivasidad = new JMenuItem("Privacidad");
		mntmPrivasidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="privacy";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="activity-log-manager";					
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnCuentasDeUsuario.add(mntmPrivasidad);
		
		JMenuItem mntmPantallaDeEntrada = new JMenuItem("Pantalla de Entrada Nueva(Login)");
		mntmPantallaDeEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="mdmflexiserver";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="mdmflexiserver";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnCuentasDeUsuario.add(mntmPantallaDeEntrada);
		mnCuentasDeUsuario.add(mntmContrasenasYClaves);
		
		JMenu mnAparienciaYPersonalizacion = new JMenu("Apariencia y Personalizacion");
		mnPanelDeControl.add(mnAparienciaYPersonalizacion);
		
		JMenu mnPersonalizacion = new JMenu("Personalizacion");
		mnAparienciaYPersonalizacion.add(mnPersonalizacion);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Tema");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="themes";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-tweak-tool";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenuItem mntmVentanaDeEntrada_1 = new JMenuItem("Ventana de Entrada");
		mntmVentanaDeEntrada_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="gksu";
					sParametros="/usr/sbin/mdmsetup";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gksu";
					sParametros="/usr/sbin/mdmsetup";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnPersonalizacion.add(mntmVentanaDeEntrada_1);
		mnPersonalizacion.add(mntmNewMenuItem);
		
		JMenuItem mntmFondoDeEscritorio_1 = new JMenuItem("Fondo de Escritorio");
		mntmFondoDeEscritorio_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="backgrounds";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="appearance";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnPersonalizacion.add(mntmFondoDeEscritorio_1);
		
		JMenuItem mntmTransparenciaVentanas = new JMenuItem("Transparencia Ventanas");
		mntmTransparenciaVentanas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="windows";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-tweak-tool";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnPersonalizacion.add(mntmTransparenciaVentanas);
		
		JMenuItem mntmProtectorDePantalla_1 = new JMenuItem("Protector de Pantalla");
		mntmProtectorDePantalla_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="screensaver";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="screensaver";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnPersonalizacion.add(mntmProtectorDePantalla_1);
		
		JMenuItem mntmEfectos = new JMenuItem("Efectos");
		mntmEfectos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="effects";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-tweak-tool";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnPersonalizacion.add(mntmEfectos);
		
		JMenuItem mntmEscritorio_1 = new JMenuItem("Escritorio");
		mntmEscritorio_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="desktop";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {					
					sComando="unity-tweak-tool";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnPersonalizacion.add(mntmEscritorio_1);
		
		JMenuItem mntmPaneles = new JMenuItem("Paneles");
		mntmPaneles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="panel";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="panel";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnPersonalizacion.add(mntmPaneles);
		
		JMenuItem mntmGadgetsDeEscritorio_1 = new JMenuItem("Gadgets de Escritorio");
		mntmGadgetsDeEscritorio_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="desklets";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="desklets";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenuItem mntmEscritorio = new JMenuItem("Escritorio");
		mntmEscritorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="desktop";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-tweak-tool";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAparienciaYPersonalizacion.add(mntmEscritorio);
		mnAparienciaYPersonalizacion.add(mntmGadgetsDeEscritorio_1);
		
		JMenuItem mntmBarraDeTareas = new JMenuItem("Barra de Tareas y Menu Inicio");
		mntmBarraDeTareas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="panel";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-tweak-tool";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAparienciaYPersonalizacion.add(mntmBarraDeTareas);
		
		JMenuItem mntmOpcionesDeCarpeta = new JMenuItem("Opciones de Carpeta");
		mntmOpcionesDeCarpeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="nemo";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="nautilus";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAparienciaYPersonalizacion.add(mntmOpcionesDeCarpeta);
		
		JMenu mnVentanas = new JMenu("Ventanas");
		mnAparienciaYPersonalizacion.add(mnVentanas);
		
		JMenuItem mntmAjusteDeVentanas = new JMenuItem("Ajuste de Ventanas");
		mntmAjusteDeVentanas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="tiling";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-tweak-tool";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnVentanas.add(mntmAjusteDeVentanas);
		
		JMenuItem mntmVentanas = new JMenuItem("Ventanas");
		mntmVentanas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="windows";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-tweak-tool";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnVentanas.add(mntmVentanas);
		
		JMenuItem mntmEsquinasActivas = new JMenuItem("Esquinas Activas");
		mntmEsquinasActivas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="hotcorner";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="unity-tweak-tool";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnVentanas.add(mntmEsquinasActivas);
		
		JMenuItem mntmGeneral_6 = new JMenuItem("General");
		mntmGeneral_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {			
					sComando="cinnamon-settings";
					sParametros="general";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="unity-tweak-tool";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnVentanas.add(mntmGeneral_6);
		
		JMenuItem mntmAreasDeTrabajo = new JMenuItem("Areas de Trabajo");
		mntmAreasDeTrabajo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="workspaces";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="appearance";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAparienciaYPersonalizacion.add(mntmAreasDeTrabajo);
		
		JMenuItem mntmGeneral_7 = new JMenuItem("General");
		mntmGeneral_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="unity-control-center";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAparienciaYPersonalizacion.add(mntmGeneral_7);
		
		JMenu mnFuentes = new JMenu("Fuentes");
		mnAparienciaYPersonalizacion.add(mnFuentes);
		
		JMenuItem mntmFuentes = new JMenuItem("Fuentes");
		mnFuentes.add(mntmFuentes);
		
		JMenuItem mntmVisorDeTipografias = new JMenuItem("Visor de Tipografias");
		mntmVisorDeTipografias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="gnome-font-viewer";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="gnome-font-viewer";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnFuentes.add(mntmVisorDeTipografias);
		mntmFuentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="fonts";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="fonts";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenu mnPantalla = new JMenu("Pantalla");
		mnAparienciaYPersonalizacion.add(mnPantalla);
		
		JMenuItem mntmResolucionDePantalla_1 = new JMenuItem("Resolucion de Pantalla");
		mntmResolucionDePantalla_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="display";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="display";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnPantalla.add(mntmResolucionDePantalla_1);
		
		JMenu mnCentroDeAccesibilidad = new JMenu("Centro de Accesibilidad");
		mnAparienciaYPersonalizacion.add(mnCentroDeAccesibilidad);
		
		JMenuItem mntmGeneral_5 = new JMenuItem("General");
		mntmGeneral_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="universal-access";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="universal-access";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnCentroDeAccesibilidad.add(mntmGeneral_5);
		
		JMenuItem mntmLectorDePantalla = new JMenuItem("Lector de Pantalla");
		mntmLectorDePantalla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="orca";
					sParametros="--replace";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="orca";
					sParametros="--replace";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnCentroDeAccesibilidad.add(mntmLectorDePantalla);
		
		JMenu mnRelojIdiomaY = new JMenu("Reloj Idioma y Region");
		mnPanelDeControl.add(mnRelojIdiomaY);
		
		JMenuItem mntmFechaYHora = new JMenuItem("Fecha y Hora");
		mntmFechaYHora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="calendar";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="datetime";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnRelojIdiomaY.add(mntmFechaYHora);
		
		JMenuItem mntmIdioma = new JMenuItem("Idioma");
		mntmIdioma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="mintlocale";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="/usr/bin/gnome-language-selector";
					sParametros="";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnRelojIdiomaY.add(mntmIdioma);
		
		JMenu mnAccesibilidad_1 = new JMenu("Accesibilidad");
		mnPanelDeControl.add(mnAccesibilidad_1);
		
		JMenuItem mntmCentroDeAccesibilidad = new JMenuItem("Centro de Accesibilidad");
		mntmCentroDeAccesibilidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="cinnamon-settings";
					sParametros="universal-access";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="unity-control-center";
					sParametros="universal-access";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAccesibilidad_1.add(mntmCentroDeAccesibilidad);
		
		JMenuItem mntmNarrador_1 = new JMenuItem("Narrador");
		mntmNarrador_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="orca";
					sParametros="--replace";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="orca";
					sParametros="--replace";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAccesibilidad_1.add(mntmNarrador_1);
		
		JMenuItem mntmTecladoEnPantalla_1 = new JMenuItem("Teclado en Pantalla");
		mntmTecladoEnPantalla_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					//sComando="cinnamon-settings";
					//sParametros="applets";
					
					sComando="cinnamon-settings";
					sParametros="universal-access";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="universal-access";
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				}
			}
		});
		mnAccesibilidad_1.add(mntmTecladoEnPantalla_1);
		
		JMenu mnPrincipal = new JMenu("Aplicaciones");
		menuBar.add(mnPrincipal);
		
		JMenu mnBasico = new JMenu("Basico");
		mnPrincipal.add(mnBasico);
		
		JMenu mnEntorno = new JMenu("Entorno");
		mnBasico.add(mnEntorno);
		
		JMenuItem mntmJava = new JMenuItem("Java");
		mntmJava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="openjdk-7-jre";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="openjdk-7-jre";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnEntorno.add(mntmJava);
		
		JMenuItem mntmPynthon = new JMenuItem("Pynthon");
		mntmPynthon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="python";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="python";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnEntorno.add(mntmPynthon);
		
		JMenuItem mntmGtk = new JMenuItem("Gtk");
		mntmGtk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="libgtk-3-0,libgtk2.0-0";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="libgtk-3-0,libgtk2.0-0";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnEntorno.add(mntmGtk);
		
		JMenuItem mntmKde = new JMenuItem("Kde");
		mntmKde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="kde-runtime";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="kde-runtime";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnEntorno.add(mntmKde);
		
		JMenu mnOffice = new JMenu("Oficina");
		mnPrincipal.add(mnOffice);
		
		JMenuItem mntmLibreoffice = new JMenuItem("LibreOffice");
		mntmLibreoffice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="libreoffice";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="libreoffice";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnOffice.add(mntmLibreoffice);
		
		JMenuItem mntmFreemind = new JMenuItem("Free Plane");
		mntmFreemind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="freeplane";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="freeplane";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenu mnVisorDocumentos = new JMenu("Visor Documentos");
		mnOffice.add(mnVisorDocumentos);
		
		JMenuItem mntmVisorPdf = new JMenuItem("Visor Pdf");
		mnVisorDocumentos.add(mntmVisorPdf);
		
		JMenuItem mntmEvince = new JMenuItem("EVince");
		mntmEvince.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="evince";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="evince";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnVisorDocumentos.add(mntmEvince);
		mntmVisorPdf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="xreader";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="xreader";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnOffice.add(mntmFreemind);
		
		JMenuItem mntmDia = new JMenuItem("Dia");
		mntmDia.setEnabled(false);
		mntmDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="dia";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="dia";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenuItem mntmDimm = new JMenuItem("Dimm");
		mntmDimm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="home/"+Constantes.USUARIO+"/dimm/dimm";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="home/"+Constantes.USUARIO+"/dimm/dimm";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
				
			}
		});
		mnOffice.add(mntmDimm);
		mnOffice.add(mntmDia);
		
		JMenu mnCalendario = new JMenu("Calendario");
		mnOffice.add(mnCalendario);
		
		JMenuItem mntmCalendario_1 = new JMenuItem("Calendario");
		mntmCalendario_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="gnome-calendar";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gnome-calendar";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnCalendario.add(mntmCalendario_1);
		
		JMenu mnGraficos = new JMenu("Graficos");
		mnPrincipal.add(mnGraficos);
		
		JMenu mnEditor = new JMenu("Editor");
		mnGraficos.add(mnEditor);
		
		JMenuItem mntmGimp = new JMenuItem("Gimp");
		mntmGimp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="gimp-2.8";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gimp-2.8";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnEditor.add(mntmGimp);
		
		JMenu mnVisor = new JMenu("Visor");
		mnGraficos.add(mnVisor);
		
		JMenuItem mntmVisor = new JMenuItem("Visor");
		mntmVisor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="xviewer";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="xviewer";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnVisor.add(mntmVisor);
		
		JMenuItem mntmEog = new JMenuItem("Eog");
		mntmEog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="eog";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="eog";
					sParametros="";//%U
					
					Comando.executeCommand(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnVisor.add(mntmEog);
		
		JMenu mnEscanear = new JMenu("Escanear");
		mnGraficos.add(mnEscanear);
		
		JMenuItem mntmSimpleScan = new JMenuItem("Simple Scan");
		mntmSimpleScan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="simple-scan";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="simple-scan";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnEscanear.add(mntmSimpleScan);
		
		JMenu mnOrganizador = new JMenu("Organizador");
		mnGraficos.add(mnOrganizador);
		
		JMenuItem mntmPix = new JMenuItem("Pix");
		mntmPix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="pix";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="pix";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnOrganizador.add(mntmPix);
		
		JMenuItem mntmShotwell = new JMenuItem("ShotWell");
		mntmShotwell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="shotwell";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="shotwell";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnOrganizador.add(mntmShotwell);
		
		JMenu mnMultimedia = new JMenu("Multimedia");
		mnPrincipal.add(mnMultimedia);
		
		JMenu mnMultimedia_1 = new JMenu("Multimedia");
		mnMultimedia.add(mnMultimedia_1);
		
		JMenuItem mntmBanshee_1 = new JMenuItem("Banshee");
		mntmBanshee_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="banshee";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="banshee";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);					
				}
			}
		});
		mnMultimedia_1.add(mntmBanshee_1);
		
		JMenuItem mntmVlc = new JMenuItem("VLC");
		mntmVlc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="usr/bin/vlc";
					sParametros="--started-from-file";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="usr/bin/vlc";
					sParametros="--started-from-file";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);					
				}
			}
		});
		mnMultimedia_1.add(mntmVlc);
		
		JMenu mnAudio = new JMenu("Audio");
		mnMultimedia.add(mnAudio);
		
		JMenuItem mntmBanshee = new JMenuItem("Banshee");
		mntmBanshee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="banshee";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="banshee";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);					
				}
			}
		});
		mnAudio.add(mntmBanshee);
		
		JMenuItem mntmRhythmbox = new JMenuItem("Rhythmbox");
		mntmRhythmbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="rhythmbox";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="rhythmbox";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);					
				}
			}
		});
		mnAudio.add(mntmRhythmbox);
		
		JMenu mnVideo = new JMenu("Video");
		mnMultimedia.add(mnVideo);
		
		JMenuItem mntmXplayer = new JMenuItem("XPlayer");
		mntmXplayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="xplayer";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="xplayer";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);					
				}
			}
		});
		mnVideo.add(mntmXplayer);
		
		JMenuItem mntmTotem = new JMenuItem("Totem");
		mntmTotem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="totem";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="totem";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);					
				}
			}
		});
		mnVideo.add(mntmTotem);
		
		JMenu mnCamaraWeb = new JMenu("Camara Web");
		mnMultimedia.add(mnCamaraWeb);
		
		JMenuItem mntmCheese = new JMenuItem("Cheese");
		mntmCheese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="cheese";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="cheese";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnCamaraWeb.add(mntmCheese);
		
		JMenu mnCddvd = new JMenu("CD/DVD");
		mnMultimedia.add(mnCddvd);
		
		JMenuItem mntmBrasero = new JMenuItem("Brasero");
		mntmBrasero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="brasero";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="brasero";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnCddvd.add(mntmBrasero);
		
		JMenu mnInternet = new JMenu("Internet");
		mnPrincipal.add(mnInternet);
		
		JMenu mnNavegador = new JMenu("Navegador");
		mnInternet.add(mnNavegador);
		
		JMenuItem mntmChromium = new JMenuItem("Chromium");
		mntmChromium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="chromium-browser";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="chromium-browser";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnNavegador.add(mntmChromium);
		
		JMenuItem mntmFirefox = new JMenuItem("Firefox");
		mntmFirefox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="firefox";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="firefox";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
				
			}
		});
		mnNavegador.add(mntmFirefox);
		
		JMenuItem mntmTor = new JMenuItem("Tor");
		mnNavegador.add(mntmTor);
		
		JMenu mnArchivos = new JMenu("Archivos");
		mnInternet.add(mnArchivos);
		
		JMenuItem mntmQtorrent = new JMenuItem("QTorrent");
		mntmQtorrent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="qbittorrent";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="qbittorrent";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenuItem mntmTransmission = new JMenuItem("Transmission");
		mntmTransmission.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				if(!Constantes.UBUNTU) {
					sComando="transmission-gtk";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="transmission-gtk";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnArchivos.add(mntmTransmission);
		mnArchivos.add(mntmQtorrent);
		
		JMenuItem mntmFilezilla = new JMenuItem("Filezilla");
		mntmFilezilla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="filezilla";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="filezilla";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnArchivos.add(mntmFilezilla);
		
		JMenuItem mntmDropbox = new JMenuItem("DropBox");
		mntmDropbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="dropbox";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="dropbox";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnArchivos.add(mntmDropbox);
		
		JMenu mnDescarga = new JMenu("Descarga");
		mnInternet.add(mnDescarga);
		
		JMenuItem mntmJdownloader = new JMenuItem("JDownloader");
		mnDescarga.add(mntmJdownloader);
		
		JMenuItem mntmUgetaria = new JMenuItem("UGet-Aria2");
		mntmUgetaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="uget,aria2";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="uget,aria2";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnDescarga.add(mntmUgetaria);
		
		JMenu mnVideoConferencia = new JMenu("Video Conferencia");
		mnInternet.add(mnVideoConferencia);
		
		JMenuItem mntmSkype = new JMenuItem("Skype");
		mnVideoConferencia.add(mntmSkype);
		mntmSkype.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="skype";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="skype";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		
		JMenu mnMail = new JMenu("Mail");
		mnInternet.add(mnMail);
		
		JMenuItem mntmThunderbird = new JMenuItem("Thunderbird");
		mntmThunderbird.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="thunderbird";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="thunderbird";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnMail.add(mntmThunderbird);
		
		JMenu mnMensajeria = new JMenu("Mensajeria");
		mnInternet.add(mnMensajeria);
		
		JMenuItem mntmPidgin = new JMenuItem("Pidgin");
		mntmPidgin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="pidgin";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="pidgin";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnMensajeria.add(mntmPidgin);
		
		JMenu mnChat = new JMenu("Chat");
		mnInternet.add(mnChat);
		
		JMenuItem mntmHexchat = new JMenuItem("HexChat");
		mntmHexchat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="hexchat";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="hexchat";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnChat.add(mntmHexchat);
		
		JMenu mnEscritorioRemoto_1 = new JMenu("Escritorio Remoto");
		mnInternet.add(mnEscritorioRemoto_1);
		
		JMenuItem mntmRemmina_1 = new JMenuItem("Remmina");
		mntmRemmina_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="remmina";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="remmina";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnEscritorioRemoto_1.add(mntmRemmina_1);
		
		JMenuItem mntmTeamviewer = new JMenuItem("TeamViewer");
		mnEscritorioRemoto_1.add(mntmTeamviewer);
		
		JMenuItem mntmSvnc_1 = new JMenuItem("Svnc");
		mntmSvnc_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="svnc";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="svnc";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnEscritorioRemoto_1.add(mntmSvnc_1);
		
		JMenu mnCuentasEnLinea = new JMenu("Cuentas en Linea");
		mnCuentasEnLinea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="unity-control-center";
					sParametros="credentials";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="unity-control-center";
					sParametros="credentials";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnInternet.add(mnCuentasEnLinea);
		
		JMenuItem mntmCuentasEnLinea_1 = new JMenuItem("Cuentas en Linea");
		mnCuentasEnLinea.add(mntmCuentasEnLinea_1);
		
		JMenu mnSistema = new JMenu("Sistema");
		mnPrincipal.add(mnSistema);
		
		JMenu mnAccesorios = new JMenu("Accesorios");
		mnSistema.add(mnAccesorios);
		
		JMenu mnGeneral = new JMenu("General");
		mnAccesorios.add(mnGeneral);
		
		JMenuItem mntmGespeaker = new JMenuItem("Gespeaker");
		mntmGespeaker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="gespeaker";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gespeaker";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnGeneral.add(mntmGespeaker);
		
		JMenuItem mntmDconf_1 = new JMenuItem("DConf");
		mntmDconf_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="dconf-editor";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="dconf-editor";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnGeneral.add(mntmDconf_1);
		
		JMenu mnAntivirus = new JMenu("Antivirus");
		mnAccesorios.add(mnAntivirus);
		
		JMenuItem mntmClamav = new JMenuItem("ClamAv");
		mntmClamav.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="clamav,clamtk";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="clamav,clamtk";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAntivirus.add(mntmClamav);
		
		JMenuItem mntmTipografias = new JMenuItem("Tipografias");
		mntmTipografias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="gnome-font-viewer";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				
				} else {
					sComando="gnome-font-viewer";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnAntivirus.add(mntmTipografias);
		
		JMenu mnPreferencias = new JMenu("Preferencias");
		mnPreferencias.setEnabled(false);
		mnSistema.add(mnPreferencias);
		
		JMenu mnAdministracion_1 = new JMenu("Administracion");
		mnSistema.add(mnAdministracion_1);
		
		JMenu mnEscritorioRemoto = new JMenu("Escritorio Remoto");
		mnAdministracion_1.add(mnEscritorioRemoto);
		
		JMenuItem mntmRemmina = new JMenuItem("Remmina");
		mntmRemmina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="remmina";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="remmina";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnEscritorioRemoto.add(mntmRemmina);
		
		JMenuItem mntmSvnc = new JMenuItem("Svnc");
		mntmSvnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="ssvnc";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="ssvnc";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnEscritorioRemoto.add(mntmSvnc);
		
		JMenu mnRed = new JMenu("Red");
		mnAdministracion_1.add(mnRed);
		
		JMenuItem mntmNmap = new JMenuItem("Nmap");
		mntmNmap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="zenmap";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="zenmap";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnRed.add(mntmNmap);
		
		JMenuItem mntmFirewall_1 = new JMenuItem("Firewall");
		mntmFirewall_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="gufw";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gufw";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnRed.add(mntmFirewall_1);
		
		JMenu mnGeneral_1 = new JMenu("General");
		mnAdministracion_1.add(mnGeneral_1);
		
		JMenuItem mntmGrub = new JMenuItem("Grub");
		mntmGrub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="kde-config-grub2";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="kde-config-grub2";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnGeneral_1.add(mntmGrub);
		
		JMenuItem mntmGparted = new JMenuItem("GParted");
		mntmGparted.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="gparted";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="gparted";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnGeneral_1.add(mntmGparted);
		
		JMenuItem mntmMscorefonts = new JMenuItem("MsCoreFonts");
		mntmMscorefonts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="ttf-mscorefonts-installer";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="ttf-mscorefonts-installer";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnGeneral_1.add(mntmMscorefonts);
		
		JMenu mnServicios = new JMenu("Servicios");
		mnAdministracion_1.add(mnServicios);
		
		JMenu mnSamba = new JMenu("Samba");
		mnServicios.add(mnSamba);
		
		JMenuItem mntmSistemConfigSamba = new JMenuItem("Sistem Config Samba");
		mntmSistemConfigSamba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!Constantes.UBUNTU) {
					sComando="system-config-samba";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="system-config-samba";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnSamba.add(mntmSistemConfigSamba);
		
		JMenu mnProgramacion = new JMenu("Desarrollo");
		mnPrincipal.add(mnProgramacion);
		
		JMenu mnUtil = new JMenu("Utilitarios");
		mnProgramacion.add(mnUtil);
		
		JMenuItem mntmVirtualbox = new JMenuItem("VirtualBox");
		mntmVirtualbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Constantes.UBUNTU) {
					sComando="virtualbox-nonfree";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
					
				} else {
					sComando="virtualbox-nonfree";
					sParametros="";
					
					Comando.executeCommandApplication(sComando+" "+sParametros,MenuAplicacionesJFrame.this);
				}
			}
		});
		mnUtil.add(mntmVirtualbox);
		
		JMenu mnOtros = new JMenu("Otros");
		mnPrincipal.add(mnOtros);
		
		JMenu mnEducacion = new JMenu("Educacion");
		mnEducacion.setEnabled(false);
		mnPrincipal.add(mnEducacion);
		
		JMenu mnCiencia = new JMenu("Ciencia");
		mnCiencia.setEnabled(false);
		mnPrincipal.add(mnCiencia);
		
		JMenu mnJuegos = new JMenu("Juegos");
		mnJuegos.setEnabled(false);
		mnPrincipal.add(mnJuegos);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		if(Constantes.UBUNTU) {
			//HABILITAR
			mntmXterm.setEnabled(true);
			mntmUxterm.setEnabled(true);
			
			//DESHABILITAR
			mntmPantallaDeBienvenida.setEnabled(false);
			mntmGadgets.setEnabled(false);
			mntmBloqueadorDeDominio.setEnabled(false);
			
			mntmSynaptic.setEnabled(false);
			mntmOrigenesDelSoftware.setEnabled(false);
			mntmGadgetsDeEscritorio.setEnabled(false);
			mntmExtensiones.setEnabled(false);
			mntmGeneral_4.setEnabled(false);
			
			mntmVentanaDeEntrada.setEnabled(false);
			mntmPantallaDeEntrada.setEnabled(false);
			mntmGadgetsDeEscritorio_1.setEnabled(false);
			
			mntmProtectorDePantalla_1.setEnabled(false);
			mntmVentanaDeEntrada_1.setEnabled(false);
			mntmPaneles.setEnabled(false);
		}
	}
	
	/*
	if(Constantes.UBUNTU) {
		mntmXterm.setEnabled(true);
		mntmUxterm.setEnabled(true);
	}  
	*/
}
