package bydan.ubuntu.ventanas.comandos.tips;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;

import bydan.ubuntu.ventanas.comandos.ejemplos.EjemplosGeneralJFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tip1GeneralJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tip1GeneralJFrame frame = new Tip1GeneralJFrame();
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
	public Tip1GeneralJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 778, 603);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "cell 0 0,grow");
		
		JPanel panelGeneral = new JPanel();
		tabbedPane.addTab("General", null, panelGeneral, null);
		panelGeneral.setLayout(new MigLayout("", "[][][][][]", "[][][]"));
		
		JLabel lblLimpiarPantalla = new JLabel("Limpiar Pantalla");
		panelGeneral.add(lblLimpiarPantalla, "cell 0 0");
		
		JLabel lblCtrlL = new JLabel("Ctrl + L");
		panelGeneral.add(lblCtrlL, "cell 2 0");
		
		JLabel lblSalir = new JLabel("Salir");
		panelGeneral.add(lblSalir, "cell 0 1");
		
		JLabel lblQ = new JLabel("1) q");
		panelGeneral.add(lblQ, "cell 2 1");
		
		JLabel lblCtrl_1 = new JLabel("2) Ctrl + D");
		panelGeneral.add(lblCtrl_1, "cell 4 1");
		
		JLabel lblEjecutar = new JLabel("Ejecutar");
		panelGeneral.add(lblEjecutar, "cell 0 2");
		
		JLabel lblGksudo = new JLabel("gksudo");
		panelGeneral.add(lblGksudo, "cell 2 2");
		
		JPanel panelSistema = new JPanel();
		tabbedPane.addTab("Sisstema", null, panelSistema, null);
		panelSistema.setLayout(new MigLayout("", "[][][][][][][][][][][]", "[][][][]"));
		
		JLabel lblApagar = new JLabel("Apagar");
		panelSistema.add(lblApagar, "cell 0 0");
		
		JLabel lblShutdownhNow = new JLabel("shutdown -h now");
		panelSistema.add(lblShutdownhNow, "cell 2 0");
		
		JLabel lblInit = new JLabel("init 0");
		panelSistema.add(lblInit, "cell 4 0");
		
		JLabel lblPoweroff = new JLabel("poweroff");
		panelSistema.add(lblPoweroff, "cell 6 0");
		
		JLabel lblTelinit = new JLabel("telinit 0");
		panelSistema.add(lblTelinit, "cell 8 0");
		
		JLabel lblHalt = new JLabel("halt");
		panelSistema.add(lblHalt, "cell 10 0");
		
		JLabel lblReiniciar = new JLabel("Reiniciar");
		panelSistema.add(lblReiniciar, "cell 0 1");
		
		JLabel lblReebot = new JLabel("reboot");
		panelSistema.add(lblReebot, "cell 2 1");
		
		JLabel lblInit_1 = new JLabel("init 6");
		panelSistema.add(lblInit_1, "cell 4 1");
		
		JLabel lblShutdownrNow = new JLabel("shutdown -r now");
		panelSistema.add(lblShutdownrNow, "cell 6 1");
		
		JLabel lblModoTerminal = new JLabel("Modo Terminal");
		panelSistema.add(lblModoTerminal, "cell 0 2");
		
		JLabel lblCtrlAlt = new JLabel("Ctrl + Alt + F2");
		panelSistema.add(lblCtrlAlt, "cell 2 2");
		
		JLabel lblModoGrafico = new JLabel("Modo Grafico");
		panelSistema.add(lblModoGrafico, "cell 0 3");
		
		JLabel lblCtrlAlt_1 = new JLabel("Ctrl + Alt + F8");
		panelSistema.add(lblCtrlAlt_1, "cell 2 3");
		
		JLabel lblCtrlAlt_2 = new JLabel("Ctrl + Alt + F(1-9)");
		panelSistema.add(lblCtrlAlt_2, "cell 4 3");
		
		JPanel panelProcesos = new JPanel();
		tabbedPane.addTab("Procesos", null, panelProcesos, null);
		panelProcesos.setLayout(new MigLayout("", "[][][]", "[]"));
		
		JLabel lblProcesoActual = new JLabel("Proceso Actual");
		panelProcesos.add(lblProcesoActual, "cell 0 0");
		
		JLabel lblEcho = new JLabel("echo $$");
		panelProcesos.add(lblEcho, "cell 2 0");
		
		JPanel panelTerminal = new JPanel();
		tabbedPane.addTab("Terminal", null, panelTerminal, null);
		panelTerminal.setLayout(new MigLayout("", "[][][][][]", "[][]"));
		
		JLabel lblHistory = new JLabel("History");
		panelTerminal.add(lblHistory, "cell 0 0");
		
		JLabel label = new JLabel("!378");
		panelTerminal.add(label, "cell 2 0");
		
		JLabel lblxxx = new JLabel("!xxx");
		panelTerminal.add(lblxxx, "cell 4 0");
		
		JLabel lblResetear = new JLabel("Resetear");
		panelTerminal.add(lblResetear, "cell 0 1");
		
		JLabel lblReset = new JLabel("reset");
		panelTerminal.add(lblReset, "cell 2 1");
		
		JPanel panelArchivos = new JPanel();
		tabbedPane.addTab("Archivos", null, panelArchivos, null);
		panelArchivos.setLayout(new MigLayout("", "[][][][][][][]", "[][][][][][][][][][][][][][][][][][][][][][][][]"));
		
		JLabel lblSoloCd = new JLabel("Solo cd");
		panelArchivos.add(lblSoloCd, "cell 0 0");
		
		JLabel lblHomebydan = new JLabel("home/bydan");
		panelArchivos.add(lblHomebydan, "cell 2 0");
		
		JLabel lblLsHaciaAtras = new JLabel("ls hacia atras");
		panelArchivos.add(lblLsHaciaAtras, "cell 0 1");
		
		JLabel label_5 = new JLabel("../../");
		panelArchivos.add(label_5, "cell 2 1");
		
		JLabel lblCarpetaActual = new JLabel("Carpeta Actual");
		panelArchivos.add(lblCarpetaActual, "cell 0 2");
		
		JLabel label_12 = new JLabel(".");
		panelArchivos.add(label_12, "cell 2 2");
		
		JLabel lblLsSubcarpetas = new JLabel("ls SubCarpetas");
		panelArchivos.add(lblLsSubcarpetas, "cell 0 3");
		
		JLabel lblrrecursivo = new JLabel("-R (Recursivo)");
		panelArchivos.add(lblrrecursivo, "cell 2 3");
		
		JLabel lblVariosMkdir = new JLabel("Varios mkdir");
		panelArchivos.add(lblVariosMkdir, "cell 0 4");
		
		JLabel lblMkdirCC = new JLabel("mkdir c1 c2 c3 c4 c5");
		panelArchivos.add(lblMkdirCC, "cell 2 4");
		
		JLabel lblWcDinamico = new JLabel("wc Dinamico");
		panelArchivos.add(lblWcDinamico, "cell 0 5");
		
		JLabel lblWc = new JLabel("1) wc");
		panelArchivos.add(lblWc, "cell 2 5");
		
		JLabel lblIngresarPalabras = new JLabel("2) Ingresar Palabras");
		panelArchivos.add(lblIngresarPalabras, "cell 4 5");
		
		JLabel lblCtrl = new JLabel("3) Ctrl + D");
		panelArchivos.add(lblCtrl, "cell 6 5");
		
		JLabel lblPipes = new JLabel("Pipes");
		panelArchivos.add(lblPipes, "cell 0 6");
		
		JLabel lblLsl = new JLabel("ls -l > num_files.txt");
		panelArchivos.add(lblLsl, "cell 2 6");
		
		JLabel lblLsl_1 = new JLabel("ls -l  | more");
		panelArchivos.add(lblLsl_1, "cell 2 7");
		
		JLabel lblLsl_2 = new JLabel("ls -l | wc -l");
		panelArchivos.add(lblLsl_2, "cell 2 8");
		
		JLabel lblSalida = new JLabel("Salida");
		panelArchivos.add(lblSalida, "cell 0 10");
		
		JLabel label_1 = new JLabel("> ,  >>");
		panelArchivos.add(label_1, "cell 2 10");
		
		JLabel lblEntrada = new JLabel("Entrada");
		panelArchivos.add(lblEntrada, "cell 4 10");
		
		JLabel label_2 = new JLabel("<  ,  <<");
		panelArchivos.add(label_2, "cell 6 10");
		
		JLabel lblCrearArchivo = new JLabel("Crear Archivo stdout");
		panelArchivos.add(lblCrearArchivo, "cell 0 11");
		
		JLabel lblCatMiarchivo = new JLabel("1) cat > mi_archivo");
		panelArchivos.add(lblCatMiarchivo, "cell 2 11");
		
		JLabel lblIngresarInfo = new JLabel("2) Ingresar Info");
		panelArchivos.add(lblIngresarInfo, "cell 4 11");
		
		JLabel lblCtrl_2 = new JLabel("3) Ctrl + D");
		panelArchivos.add(lblCtrl_2, "cell 6 11");
		
		JLabel lblAdicionarArchivo = new JLabel("Adicionar Archivo stdout");
		panelArchivos.add(lblAdicionarArchivo, "cell 0 12");
		
		JLabel lblCat = new JLabel("1) cat >> mi_archivo");
		panelArchivos.add(lblCat, "cell 2 12");
		
		JLabel lblIngresarInfo_1 = new JLabel("2) Ingresar Info");
		panelArchivos.add(lblIngresarInfo_1, "cell 4 12");
		
		JLabel lblCtrl_3 = new JLabel("3) Ctrl + D");
		panelArchivos.add(lblCtrl_3, "cell 6 12");
		
		JLabel lblCrearArchivoStderr = new JLabel("Crear Archivo stderr");
		panelArchivos.add(lblCrearArchivoStderr, "cell 0 13");
		
		JLabel label_6 = new JLabel("2>");
		panelArchivos.add(label_6, "cell 2 13");
		
		JLabel lblAdicionarArchivoStderr = new JLabel("Adicionar Archivo stderr");
		panelArchivos.add(lblAdicionarArchivoStderr, "cell 0 14");
		
		JLabel label_7 = new JLabel("2>>");
		panelArchivos.add(label_7, "cell 2 14");
		
		JLabel lblNewLabel = new JLabel("stdout a stderr");
		panelArchivos.add(lblNewLabel, "cell 0 15");
		
		JLabel label_8 = new JLabel("1>&2");
		panelArchivos.add(label_8, "cell 2 15");
		
		JLabel lblStderrAStdout = new JLabel("stderr a stdout");
		panelArchivos.add(lblStderrAStdout, "cell 0 16");
		
		JLabel label_9 = new JLabel("2>&1");
		panelArchivos.add(label_9, "cell 2 16");
		
		JLabel lblStdoutYStderr = new JLabel("stdout y stderr a un fichero");
		panelArchivos.add(lblStdoutYStderr, "cell 0 17");
		
		JLabel label_10 = new JLabel(">&");
		panelArchivos.add(label_10, "cell 2 17");
		
		JLabel lblPaginador = new JLabel("Paginador");
		panelArchivos.add(lblPaginador, "cell 0 19");
		
		JLabel lblLesshomebydanaaatxt = new JLabel("less /home/bydan/aaa.txt");
		panelArchivos.add(lblLesshomebydanaaatxt, "cell 2 19");
		
		JLabel lblTeclasNniniciofinavpage = new JLabel("Teclas: n,N,Inicio,Fin,AvPage");
		panelArchivos.add(lblTeclasNniniciofinavpage, "cell 4 19");
		
		JLabel lblParaCpmvrmCarpetas = new JLabel("Para cp,mv,rm Carpetas");
		panelArchivos.add(lblParaCpmvrmCarpetas, "cell 0 20");
		
		JLabel lblrRecursivo = new JLabel("-R Recursivo");
		panelArchivos.add(lblrRecursivo, "cell 2 20");
		
		JLabel lblBorrarCarpetas = new JLabel("Para rm borrar Carpetas");
		panelArchivos.add(lblBorrarCarpetas, "cell 0 21");
		
		JLabel lblrf = new JLabel("-Rf");
		panelArchivos.add(lblrf, "cell 2 21");
		
		JLabel lblParaRmBorrar = new JLabel("Para rm borrar y Preguntar");
		panelArchivos.add(lblParaRmBorrar, "cell 0 22");
		
		JLabel lblri = new JLabel("-Ri");
		panelArchivos.add(lblri, "cell 2 23");
		
		JPanel panelUsuariosGrupos = new JPanel();
		tabbedPane.addTab("Usuarios/Grupos", null, panelUsuariosGrupos, null);
		panelUsuariosGrupos.setLayout(new MigLayout("", "[][][][][]", "[][][][][]"));
		
		JLabel lblClave = new JLabel("Clave");
		panelUsuariosGrupos.add(lblClave, "cell 0 0");
		
		JLabel lblPasswd = new JLabel("passwd");
		panelUsuariosGrupos.add(lblPasswd, "cell 2 0");
		
		JLabel lblPasswdUsuario = new JLabel("passwd usuario1");
		panelUsuariosGrupos.add(lblPasswdUsuario, "cell 4 0");
		
		JLabel lblClaveRoot = new JLabel("Clave Root");
		panelUsuariosGrupos.add(lblClaveRoot, "cell 0 1");
		
		JLabel lblSudoPasswd = new JLabel("sudo passwd");
		panelUsuariosGrupos.add(lblSudoPasswd, "cell 2 1");
		
		JLabel lblJavaGksudo = new JLabel("Java + Gksudo");
		panelUsuariosGrupos.add(lblJavaGksudo, "cell 0 2");
		
		JLabel lblSiHayProblemas = new JLabel("Problemas");
		panelUsuariosGrupos.add(lblSiHayProblemas, "cell 2 2");
		
		JLabel lblUsarComandoEntre = new JLabel("Comando entre '' Simples");
		panelUsuariosGrupos.add(lblUsarComandoEntre, "cell 4 2");
		
		JLabel lblCambiarUsuario = new JLabel("Cambiar Usuario");
		panelUsuariosGrupos.add(lblCambiarUsuario, "cell 0 3");
		
		JLabel lblSuUsuario = new JLabel("su usuario1");
		panelUsuariosGrupos.add(lblSuUsuario, "cell 2 3");
		
		JLabel lblExpiraClave = new JLabel("Expira Clave");
		panelUsuariosGrupos.add(lblExpiraClave, "cell 0 4");
		
		JLabel lblChagee = new JLabel("10. chage -E 2011-12-31 user1");
		panelUsuariosGrupos.add(lblChagee, "cell 2 4");
		
		JPanel panelPipes = new JPanel();
		tabbedPane.addTab("Pipes", null, panelPipes, null);
		panelPipes.setLayout(new MigLayout("", "[][][][][]", "[][][][][][]"));
		
		JLabel lblBasico = new JLabel("Basico");
		panelPipes.add(lblBasico, "cell 0 0");
		
		JLabel lblOrdenOrdenOrden = new JLabel("orden1; orden2; orden3 > archivo 1");
		panelPipes.add(lblOrdenOrdenOrden, "cell 2 0");
		
		JLabel lblSeparadosPorComas = new JLabel("Separados por punto y comas ,");
		panelPipes.add(lblSeparadosPorComas, "cell 4 0");
		
		JLabel lblBasicoagrupacion = new JLabel("Basico-Agrupacion");
		panelPipes.add(lblBasicoagrupacion, "cell 0 1");
		
		JLabel lblOrdenOrden = new JLabel("( orden1; orden2; orden3 ) > archivo 1");
		panelPipes.add(lblOrdenOrden, "cell 2 1");
		
		JLabel lblParaAgrupar = new JLabel("() para Agrupar en Otro Shell");
		panelPipes.add(lblParaAgrupar, "cell 4 1");
		
		JLabel lblBasicollaves = new JLabel("Basico-Llaves");
		panelPipes.add(lblBasicollaves, "cell 0 2");
		
		JLabel lblOrdenOrden_1 = new JLabel("{ orden1; orden2; orden3 } > archivo 1");
		panelPipes.add(lblOrdenOrden_1, "cell 2 2");
		
		JLabel lblParaAgrupar_1 = new JLabel("{} para Agrupar y mismo Shell");
		panelPipes.add(lblParaAgrupar_1, "cell 4 2");
		
		JLabel lblYLogico = new JLabel("Y (&&) Logico");
		panelPipes.add(lblYLogico, "cell 0 3");
		
		JLabel lblOrdenOrden_2 = new JLabel("orden1 && orden2 > archivo1");
		panelPipes.add(lblOrdenOrden_2, "cell 2 3");
		
		JLabel lblCumpleTodosO = new JLabel("Cumple todos o nada");
		panelPipes.add(lblCumpleTodosO, "cell 4 3");
		
		JLabel lblOLogico = new JLabel("O !! Logico");
		panelPipes.add(lblOLogico, "cell 0 4");
		
		JLabel lblOrdenOrden_3 = new JLabel("orden1 || orden2 > archivo1");
		panelPipes.add(lblOrdenOrden_3, "cell 2 4");
		
		JLabel lblCumpleSi = new JLabel("Cumple 2 si falla 1");
		panelPipes.add(lblCumpleSi, "cell 4 4");
		
		JLabel lblPipesEncausarSalida = new JLabel("Pipes Encausar Salida");
		panelPipes.add(lblPipesEncausarSalida, "cell 0 5");
		
		JLabel lblOrdenOrden_4 = new JLabel("orden1 | orden2 > archivo1");
		panelPipes.add(lblOrdenOrden_4, "cell 2 5");
		
		JLabel lblDeIzquierdaA = new JLabel("De Izquierda a Derecha, encausa, parametros");
		panelPipes.add(lblDeIzquierdaA, "cell 4 5");
		
		JPanel panelRegExp = new JPanel();
		tabbedPane.addTab("Reg Exp", null, panelRegExp, null);
		panelRegExp.setLayout(new MigLayout("", "[][][][][]", "[][][][]"));
		
		JLabel lblCaracteresEspeciales = new JLabel("Caracteres Especiales");
		panelRegExp.add(lblCaracteresEspeciales, "cell 0 0");
		
		JLabel label_3 = new JLabel("* ?");
		panelRegExp.add(label_3, "cell 2 0");
		
		JLabel lblVarios = new JLabel("* Varios, ? Uno");
		panelRegExp.add(lblVarios, "cell 4 0");
		
		JLabel lblRangoDeCaracteres = new JLabel("Rango de Caracteres");
		panelRegExp.add(lblRangoDeCaracteres, "cell 0 1");
		
		JLabel label_4 = new JLabel("[1-9]");
		panelRegExp.add(label_4, "cell 2 1");
		
		JLabel lblUnCaracterDe = new JLabel("Un Caracter de 1 a 9");
		panelRegExp.add(lblUnCaracterDe, "cell 4 1");
		
		JButton btnEjemplos = new JButton("Ejemplos");
		btnEjemplos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("regex", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("regex");
				
				ejemplosGeneralJFrame.show();
				
			}
		});
		
		JLabel lblNoEnRango = new JLabel("No en Rango de Caracteres");
		panelRegExp.add(lblNoEnRango, "cell 0 2");
		
		JLabel label_11 = new JLabel("[ˆ ]");
		panelRegExp.add(label_11, "cell 2 2");
		
		JLabel lblNoComienza = new JLabel("[^0-9]* No comienza con numeros");
		panelRegExp.add(lblNoComienza, "cell 4 2");
		panelRegExp.add(btnEjemplos, "cell 0 3");
		
		JPanel panelComandos = new JPanel();
		tabbedPane.addTab("Comandos", null, panelComandos, null);
		panelComandos.setLayout(new MigLayout("", "[][]", "[]"));
		
		JLabel lblComandosEnTexto = new JLabel("Comandos en Texto $(comando): ");
		panelComandos.add(lblComandosEnTexto, "cell 0 0");
		
		JLabel lblEchoSoyElla = new JLabel("    echo Soy el/la $(whoami)");
		panelComandos.add(lblEchoSoyElla, "cell 1 0");
	}

}
