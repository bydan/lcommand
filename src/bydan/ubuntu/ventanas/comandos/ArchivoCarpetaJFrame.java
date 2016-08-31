package bydan.ubuntu.ventanas.comandos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import bydan.ubuntu.base.Comando;
import bydan.ubuntu.ventanas.comandos.ejemplos.EjemplosGeneralJFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSeparator;

import java.awt.Color;
import java.awt.Font;

import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ArchivoCarpetaJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPath;
	private JTextArea textAreaCd;
	private JCheckBox chckbxPwd;
	private JTextArea textAreaLs;
	private JCheckBox chckbxOcultos;
	private JCheckBox chckbxDirectorios;
	private JCheckBox chckbxNoIndice;
	private JCheckBox chckbxListaDetallado;
	private JLabel lblPath_1;
	private JTextField textFieldPathLs;
	private JPanel panelMkDir;
	private JLabel lblNombres;
	private JTextArea textAreaNombresCarpetas;
	private JButton btnMkdir;
	private JTextArea textAreaMkDir;
	private JScrollPane scrollPane_2;
	private JLabel lblPathBase;
	private JTextField textFieldPathBase;
	private JButton btnRmdir;
	private JButton btnRm;
	private JButton btnMv;
	private JLabel lblPathDestino;
	private JTextField textFieldPathDestino;
	private JButton btnCp;
	private JPanel panelArchivos;
	private JLabel lblPathorigen;
	private JLabel lblPathDestino_1;
	private JTextField textFieldPathOrigenArchivos;
	private JTextField textFieldPathDestinoArchivos;
	private JButton btnCat;
	private JButton btnCmp;
	private JButton btnWc;
	private JTextArea textAreaArchivos;
	private JScrollPane scrollPane_3;
	private JLabel lblNombre;
	private JTextField textFieldNombreArchivos;
	private JButton btnLn;
	private JLabel lblLink;
	private JButton btnHead;
	private JButton btnTail;
	private JButton btnSort;
	private JButton btnPaste;
	private JLabel lblleerArchivos;
	private JLabel lblNoFilas;
	private JTextField textFieldNumeroFilasArchivos;
	private JLabel lblNewLabel;
	private JCheckBox chckbxNumeros;
	private JCheckBox chckbxReversa;
	private JCheckBox chckbxUnicos;
	private JPanel panelSearch;
	private JLabel lblPathBusqueda;
	private JTextField textFieldPathBusqueda;
	private JCheckBox chckbxLeible;
	private JCheckBox chckbxSoloTotal;
	private JCheckBox chckbxConTotal;
	private JButton btnDu;
	private JTextArea textAreaBusqueda;
	private JScrollPane scrollPane_4;
	private JCheckBox chckbxTamano;
	private JCheckBox chckbxOrdenTamano;
	private JButton btnFind;
	private JLabel lblCriterio;
	private JTextField textFieldCriterio;
	private JLabel lblCat;
	private JCheckBox chckbxConNumeroFilas;
	private JButton btnDiff;
	private JPanel panelSearchInFiles;
	private JLabel lblPathBusqueda_1;
	private JLabel lblCriterio_1;
	private JTextField textFieldPathBusqueda2;
	private JTextField textFieldCriterio2;
	private JCheckBox chckbxNumAciertos;
	private JCheckBox chckbxMayusMinus;
	private JCheckBox chckbxNumerosLineas;
	private JCheckBox chckbxInvierteResultados;
	private JCheckBox chckbxTodaPalabra;
	private JButton btnGrep;
	private JTextArea textAreaBusqueda2;
	private JScrollPane scrollPane_5;
	private JButton btnTouch;
	private JCheckBox chckbxMore;
	private JLabel lblParametros;
	private JLabel lblFiltros;
	private JLabel lblComparar;
	private JLabel lblLeer;
	private JLabel lblOtros;
	private JButton btnNl;
	private JLabel lblOrdenarcombinar;
	private JButton btnZmore;
	private JButton btnZless;
	private JButton btnMore;
	private JButton btnLess;
	private JCheckBox chckbxRecursivo;
	private JCheckBox chckbxSoloNombreTamanio;
	private JPanel panelEjemplos;
	private JLabel lblArchivos;
	private JButton btnCat_1;
	private JButton btnEjem;
	private JLabel lblArchivoscarpetas;
	private JButton btnCp_1;
	private JButton btnMv_1;
	private JButton btnRm_1;
	private JPanel panelSed;
	private JLabel lblPathBase_1;
	private JLabel lblNombreArchivo;
	private JTextField textFieldPathBaseSed;
	private JTextField textFieldNombreArchivoSed;
	private JLabel lblNuevoArchivo;
	private JTextField textFieldNuevoArchivoSed;
	private JButton btnSed;
	private JButton btnBusqueda;
	private JTextArea textAreaSed;
	private JScrollPane scrollPane_6;
	private JLabel lblCriterioBusqueda;
	private JTextField textFieldCriterioBusquedaSed;
	private JLabel lblPorFilas;
	private JLabel lblNumeroFila;
	private JLabel lblNumeroFilaFinal;
	private JTextField textFieldNumeroFilaSed;
	private JTextField textFieldNumeroFilaFinalSed;
	private JCheckBox chckbxUltimaFilaSed;
	private JCheckBox chckbxRangoFilasInversoSed;
	private JButton btnBusquedaPorFilas;
	private JButton btnEliminarBusqueda;
	private JLabel lblInsertar;
	private JLabel lblTextoInsertar;
	private JTextField textFieldTextoInsertarSed;
	private JButton btnTextoInsertar;
	private JLabel lblReemplazar;
	private JLabel lblBuscarReemplazo;
	private JLabel lblReemplazo;
	private JTextField textFieldBuscarReemplazoSed;
	private JTextField textFieldReemplazoSed;
	private JButton btnReemplazar;
	private JButton btnBuscarFilaY;
	private JButton btnAwk;
	private JPanel panelAwk;
	private JLabel lblPathBase_2;
	private JLabel lblNombreArchivo_1;
	private JLabel lblCriterioBusqueda_1;
	private JTextField textFieldPathBaseAwk;
	private JTextField textFieldNombreArchivoAwk;
	private JTextField textFieldCriterioBusquedaAwk;
	private JButton btnBusqueda_1;
	private JTextArea textAreaAwk;
	private JScrollPane scrollPane_7;
	private JLabel lblTiposcriterios;
	private JLabel lblCampos;
	private JLabel lblCampos_1;
	private JCheckBox chckbxTodosCamposAwk;
	private JTextField textFieldCamposAwk;
	private JButton btnBusquedaCampos;
	private JLabel lblDelimitador;
	private JTextField textFieldDelimitadorAwk;
	private JLabel lblCamposFormato;
	private JLabel lblFormatoCampos;
	private JLabel lblCamposFormtamo;
	private JTextField textFieldFormatoCamposAwk;
	private JTextField textFieldCamposFormatoAwk;
	private JButton btnBusquedaFormatoCampos;
	private JLabel lblPatron;
	private JTextField textFieldPatronLs;
	private JLabel lbltail;
	private JTextField textFieldNumeroFilasLeerArchivos;
	private JButton btnFile;
	private JCheckBox chckbxArchivos;
	private JLabel lblBusqueda;
	private JLabel lblTamanioCarpetas;
	private JLabel lblTipo;
	private JComboBox comboBoxTipoCriterio;
	private JLabel lblReemplazar_1;
	private JButton btnTr;
	private JLabel lblreemplazar;
	private JLabel lblBuscar;
	private JTextField textFieldBuscarArchivos;
	private JLabel lblReemplazar_2;
	private JTextField textFieldReemplazarArchivos;
	private JButton btnLocate;
	private JCheckBox chckbxSimbolosTipo;
	private JButton btnFind_1;
	private JButton btnTr_1;
	private JTextField textFieldComandoLs;
	private JButton btnMkdir_1;
	private JButton btnLocate_1;
	private JLabel lblNumeroColumnas;
	private JTextField textFieldNumeroColumnas;
	private JButton btnRmdir_1;
	private JCheckBox chckbxOrdenAcceso;
	private JTextField textFieldComandoArchivos;
	private JButton btnLn_1;
	private JLabel lblLocate;
	private JCheckBox chckbxNoCoincidencias;
	private JCheckBox chckbxNombreDeArchivo;
	private JCheckBox chckbxNombreExacto;
	private JButton btnNl_1;
	private JButton btnPipes;
	private JButton btnStdoutStderror;
	private JButton btnHeadtail;
	private JButton btnSort_1;
	private JButton btnCut;
	private JButton btnXargs;
	private JButton btnGrep_1;
	private JLabel lblLn;
	private JButton btnLsi;
	private JLabel lblNumInode;
	private JTextField textFieldiNodeArchivos;
	private JButton btnFindInode;
	private JButton btnInfoFileSystem;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArchivoCarpetaJFrame frame = new ArchivoCarpetaJFrame();
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
	public ArchivoCarpetaJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 850, 655);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "cell 0 0,grow");
		
		JPanel panelCd = new JPanel();
		tabbedPane.addTab("cd", null, panelCd, null);
		panelCd.setLayout(new MigLayout("", "[grow][grow]", "[][][][grow]"));
		
		chckbxPwd = new JCheckBox("pwd");
		panelCd.add(chckbxPwd, "cell 0 0,alignx center");
		
		JLabel lblPath = new JLabel("Path");
		panelCd.add(lblPath, "cell 0 1,alignx center");
		
		textFieldPath = new JTextField();
		panelCd.add(textFieldPath, "cell 1 1,alignx left");
		textFieldPath.setColumns(20);
		
		JButton btnCd = new JButton("cd");
		btnCd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "cd"; 
				
				command=command + " "+ textFieldPath.getText();
				
				if(chckbxPwd.isSelected()) {
					command = "pwd";
				}
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaCd.setText(sOutput);
			}
		});
		panelCd.add(btnCd, "cell 0 2");
		
		JScrollPane scrollPane = new JScrollPane();
		panelCd.add(scrollPane, "cell 0 3 2 1,grow");
		
		textAreaCd = new JTextArea();
		scrollPane.setViewportView(textAreaCd);
		
		JPanel panelLs = new JPanel();
		tabbedPane.addTab("ls", null, panelLs, null);
		panelLs.setLayout(new MigLayout("", "[][grow]", "[][][][][][][][][][][][][][grow]"));
		
		lblParametros = new JLabel("PARAMETROS");
		panelLs.add(lblParametros, "cell 0 0");
		
		chckbxOcultos = new JCheckBox("Ocultos(Todos)");
		panelLs.add(chckbxOcultos, "cell 0 1");
		
		chckbxTamano = new JCheckBox("Tamaño");
		panelLs.add(chckbxTamano, "cell 1 1");
		
		chckbxDirectorios = new JCheckBox("Directorios");
		panelLs.add(chckbxDirectorios, "cell 0 2");
		
		chckbxOrdenTamano = new JCheckBox("Orden Tamaño");
		panelLs.add(chckbxOrdenTamano, "cell 1 2");
		
		chckbxNoIndice = new JCheckBox("No Indice(Nodo)");
		panelLs.add(chckbxNoIndice, "flowy,cell 0 3");
		
		JButton btnLs = new JButton("ls");
		btnLs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "ls"; 

				
				if(chckbxOcultos.isSelected()) {
					command = command + " -a"; 
				}
				
				if(chckbxDirectorios.isSelected()) {
					command = command + " -d"; 
				}
				
				if(chckbxNoIndice.isSelected()) {
					command = command + " -i"; 
				}
				
				if(chckbxListaDetallado.isSelected()) {
					command = command + " -l"; 
				}
				
				if(chckbxOrdenAcceso.isSelected()) {
					command = command + " -t"; 
				}
				
				if(chckbxTamano.isSelected()) {
					command = command + " -l -h"; 
				}
				
				if(chckbxOrdenTamano.isSelected()) {
					command = command + " -S"; 
				}
				
				if(chckbxRecursivo.isSelected()) {
					command = command + " -R"; 
				}
				
				if(chckbxSimbolosTipo.isSelected()) {
					command = command + " -F"; 
				}
				
				if(chckbxSoloNombreTamanio.isSelected()) {
					command = command + " -Sshr"; 
				}
				
				
				
				if(!textFieldPatronLs.getText().equals("")) {
					command = command + " " + textFieldPatronLs.getText(); 
				}
				
				
				if(!textFieldPathLs.getText().equals("")) {
					command = command + " " + textFieldPathLs.getText(); 
				}
				
				
				
				
				if(chckbxMore.isSelected()) {
					command = command + " | more"; 
				}
				
				
				if(!textFieldNumeroColumnas.getText().equals("")) {
					command = command + " | pr -T"+textFieldNumeroColumnas.getText()+" -W$COLUMNS"; 
				}
				
				textFieldComandoLs.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaLs.setText(sOutput);
			}
		});
		
		chckbxOrdenAcceso = new JCheckBox("Orden Acceso Reciente");
		panelLs.add(chckbxOrdenAcceso, "cell 1 3");
		
		chckbxRecursivo = new JCheckBox("Recursivo(SubCarpetas)");
		chckbxRecursivo.setToolTipText("Muestra tambien de Subdirectorios, ejm: /etc");
		panelLs.add(chckbxRecursivo, "cell 0 4");
		
		chckbxListaDetallado = new JCheckBox("Lista");
		chckbxListaDetallado.setSelected(true);
		panelLs.add(chckbxListaDetallado, "cell 1 4");
		
		chckbxSimbolosTipo = new JCheckBox("Simbolos Tipo");
		chckbxSimbolosTipo.setToolTipText("Directorios / , Ejecutables ., Links @");
		panelLs.add(chckbxSimbolosTipo, "cell 0 5");
		
		chckbxSoloNombreTamanio = new JCheckBox("Solo Nombre y Tamanio");
		panelLs.add(chckbxSoloNombreTamanio, "cell 1 5");
		
		lblFiltros = new JLabel("FILTROS");
		panelLs.add(lblFiltros, "cell 0 6");
		
		chckbxMore = new JCheckBox("more");
		panelLs.add(chckbxMore, "cell 0 7");
		
		lblNumeroColumnas = new JLabel("Numero Columnas");
		panelLs.add(lblNumeroColumnas, "cell 0 8,alignx trailing");
		
		textFieldNumeroColumnas = new JTextField();
		panelLs.add(textFieldNumeroColumnas, "cell 1 8,growx");
		textFieldNumeroColumnas.setColumns(10);
		
		lblPatron = new JLabel("Patron");
		panelLs.add(lblPatron, "cell 0 9,alignx trailing");
		
		textFieldPatronLs = new JTextField();
		textFieldPatronLs.setText("*");
		panelLs.add(textFieldPatronLs, "cell 1 9,growx");
		textFieldPatronLs.setColumns(10);
		
		lblPath_1 = new JLabel("Path");
		panelLs.add(lblPath_1, "cell 0 10,alignx right");
		
		textFieldPathLs = new JTextField();
		textFieldPathLs.setText("/home/bydan");
		panelLs.add(textFieldPathLs, "cell 1 10,alignx left");
		textFieldPathLs.setColumns(20);
		panelLs.add(btnLs, "flowx,cell 0 11");
		
		textFieldComandoLs = new JTextField();
		panelLs.add(textFieldComandoLs, "cell 0 12 2 1,growx");
		textFieldComandoLs.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panelLs.add(scrollPane_1, "cell 0 13 2 1,grow");
		
		textAreaLs = new JTextArea();
		scrollPane_1.setViewportView(textAreaLs);
		
		btnEjem = new JButton("Ejem");
		btnEjem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("ls", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("ls");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelLs.add(btnEjem, "cell 0 11");
		
		panelMkDir = new JPanel();
		tabbedPane.addTab("mkdir/rmdir/rm/cp/mv", null, panelMkDir, null);
		panelMkDir.setLayout(new MigLayout("", "[grow][grow]", "[][][grow][][grow]"));
		
		lblPathBase = new JLabel("Path Base");
		panelMkDir.add(lblPathBase, "cell 0 0,alignx trailing");
		
		textFieldPathBase = new JTextField();
		panelMkDir.add(textFieldPathBase, "cell 1 0,alignx left");
		textFieldPathBase.setColumns(30);
		
		lblPathDestino = new JLabel("Path Destino");
		panelMkDir.add(lblPathDestino, "cell 0 1,alignx trailing");
		
		textFieldPathDestino = new JTextField();
		textFieldPathDestino.setToolTipText("Usado para mv, mover/copiar archivos/carpetas");
		panelMkDir.add(textFieldPathDestino, "cell 1 1,alignx left");
		textFieldPathDestino.setColumns(30);
		
		lblNombres = new JLabel("Nombre/s");
		panelMkDir.add(lblNombres, "cell 0 2,alignx right,aligny center");
		
		textAreaNombresCarpetas = new JTextArea();
		textAreaNombresCarpetas.setToolTipText("Uno o varios nombres separados por ,");
		textAreaNombresCarpetas.setRows(5);
		textAreaNombresCarpetas.setColumns(20);
		panelMkDir.add(textAreaNombresCarpetas, "cell 1 2,alignx left,aligny top");
		
		btnMkdir = new JButton("mkdir");
		btnMkdir.setToolTipText("Crear Carpetas");
		btnMkdir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArchivoCarpetaJFrame.this.procesar("mkdir");
			}
		});
		panelMkDir.add(btnMkdir, "flowx,cell 0 3");
		
		btnRm = new JButton("rm");
		btnRm.setToolTipText("Eliminar Archivos");
		btnRm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArchivoCarpetaJFrame.this.procesar("rm");
			}
		});
		panelMkDir.add(btnRm, "flowx,cell 1 3");
		
		scrollPane_2 = new JScrollPane();
		panelMkDir.add(scrollPane_2, "cell 0 4 2 1,grow");
		
		textAreaMkDir = new JTextArea();
		scrollPane_2.setViewportView(textAreaMkDir);
		
		btnRmdir = new JButton("rmdir");
		btnRmdir.setToolTipText("Eliminar Carpetas");
		btnRmdir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArchivoCarpetaJFrame.this.procesar("rmdir");
			}
		});
		panelMkDir.add(btnRmdir, "cell 0 3");
		
		btnMv = new JButton("mv");
		btnMv.setToolTipText("Mover Archivos/Carpetas, usa Path Destino, puede Cambiar de Nombre");
		btnMv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArchivoCarpetaJFrame.this.procesar("mv");
			}
		});
		panelMkDir.add(btnMv, "cell 1 3");
		
		btnCp = new JButton("cp");
		btnCp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArchivoCarpetaJFrame.this.procesar("cp");
			}
		});
		btnCp.setToolTipText("Copiar Archivos/Carpetas usa Path Destino, NO Funciona");
		panelMkDir.add(btnCp, "cell 1 3");
		
		panelArchivos = new JPanel();
		tabbedPane.addTab("Archivos", null, panelArchivos, null);
		panelArchivos.setLayout(new MigLayout("", "[105.00,grow][grow][][]", "[][][][][][][][][][][][][][grow]"));
		
		lblPathorigen = new JLabel("Path Origen");
		panelArchivos.add(lblPathorigen, "cell 0 0,alignx trailing");
		
		textFieldPathOrigenArchivos = new JTextField();
		panelArchivos.add(textFieldPathOrigenArchivos, "cell 1 0,alignx left");
		textFieldPathOrigenArchivos.setColumns(25);
		
		lblPathDestino_1 = new JLabel("Path Destino");
		panelArchivos.add(lblPathDestino_1, "flowx,cell 0 1,alignx trailing");
		
		textFieldPathDestinoArchivos = new JTextField();
		panelArchivos.add(textFieldPathDestinoArchivos, "cell 1 1,alignx left");
		textFieldPathDestinoArchivos.setColumns(25);
		
		lblNumInode = new JLabel("Num iNode");
		panelArchivos.add(lblNumInode, "cell 0 2,alignx trailing");
		
		textFieldiNodeArchivos = new JTextField();
		panelArchivos.add(textFieldiNodeArchivos, "cell 1 2,growx");
		textFieldiNodeArchivos.setColumns(10);
		
		lblCat = new JLabel("--------------CAT----------->>>");
		panelArchivos.add(lblCat, "cell 0 3,alignx center");
		
		chckbxConNumeroFilas = new JCheckBox("Con Numero Filas");
		panelArchivos.add(chckbxConNumeroFilas, "cell 1 3");
		
		lbltail = new JLabel("--------------TAIL/HEAD----------->>>");
		panelArchivos.add(lbltail, "cell 0 4,alignx center");
		
		textFieldNumeroFilasLeerArchivos = new JTextField();
		panelArchivos.add(textFieldNumeroFilasLeerArchivos, "cell 1 4,alignx left");
		textFieldNumeroFilasLeerArchivos.setColumns(10);
		
		lblLink = new JLabel("-------------LINK------------->>>");
		lblLink.setFont(new Font("Dialog", Font.BOLD, 12));
		panelArchivos.add(lblLink, "cell 0 5,alignx center");
		
		lblNombre = new JLabel("Nombre");
		panelArchivos.add(lblNombre, "flowx,cell 1 5,alignx left");
		
		lblleerArchivos = new JLabel("-------LEER ARCHIVOS----->>>");
		panelArchivos.add(lblleerArchivos, "cell 0 6,alignx center");
		
		lblNoFilas = new JLabel("No. Filas");
		panelArchivos.add(lblNoFilas, "flowx,cell 1 6,alignx left");
		
		lblNewLabel = new JLabel("-------------SORT-------------->>>");
		panelArchivos.add(lblNewLabel, "cell 0 7,alignx center");
		
		chckbxNumeros = new JCheckBox("Numeros");
		panelArchivos.add(chckbxNumeros, "flowx,cell 1 7,alignx left");
		
		lblreemplazar = new JLabel("--------REEMPLAZAR---------->>>");
		panelArchivos.add(lblreemplazar, "cell 0 8,alignx center");
		
		lblBuscar = new JLabel("Buscar");
		panelArchivos.add(lblBuscar, "flowx,cell 1 8");
		
		lblComparar = new JLabel("COMPARAR");
		panelArchivos.add(lblComparar, "flowx,cell 0 9");
		
		lblOtros = new JLabel("OTROS");
		panelArchivos.add(lblOtros, "flowx,cell 1 9");
		
		lblLeer = new JLabel("LEER");
		panelArchivos.add(lblLeer, "flowx,cell 0 10,alignx center");
		
		lblOrdenarcombinar = new JLabel("ORDENAR-COMBINAR");
		panelArchivos.add(lblOrdenarcombinar, "flowx,cell 1 10");
		
		btnZmore = new JButton("zmore");
		btnZmore.setToolTipText("Para texto comprimido");
		btnZmore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "zmore"; 
				
				/*
				if(chckbxConNumeroFilas.isSelected()) {
					command=command + " -n";
				}
				*/
				
				command=command + " "+ textFieldPathOrigenArchivos.getText();
				
				textFieldComandoArchivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaArchivos.setText(sOutput);
			}
		});
		
		btnMore = new JButton("more");
		btnMore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "more"; 
				
				command=command + " "+ textFieldPathOrigenArchivos.getText();
				
				textFieldComandoArchivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaArchivos.setText(sOutput);
			}
		});
		panelArchivos.add(btnMore, "flowx,cell 0 11");
		
		btnLess = new JButton("less");
		btnLess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "less"; 
				
				command=command + " "+ textFieldPathOrigenArchivos.getText();
				
				textFieldComandoArchivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaArchivos.setText(sOutput);
			}
		});
		panelArchivos.add(btnLess, "cell 0 11");
		panelArchivos.add(btnZmore, "cell 0 11,alignx center");
		
		lblReemplazar_1 = new JLabel("REEMPLAZAR");
		panelArchivos.add(lblReemplazar_1, "flowx,cell 1 11");
		
		textFieldComandoArchivos = new JTextField();
		panelArchivos.add(textFieldComandoArchivos, "cell 0 12 4 1,growx");
		textFieldComandoArchivos.setColumns(10);
		
		scrollPane_3 = new JScrollPane();
		panelArchivos.add(scrollPane_3, "cell 0 13 4 1,grow");
		
		textAreaArchivos = new JTextArea();
		scrollPane_3.setViewportView(textAreaArchivos);
		
		btnCmp = new JButton("cmp");
		btnCmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "cmp"; 
				
				command=command + " " + textFieldPathOrigenArchivos.getText()+ " "+ textFieldPathDestinoArchivos.getText();
				
				textFieldComandoArchivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaArchivos.setText(sOutput);
			}
		});
		btnCmp.setToolTipText("Compara cambios de archivos");
		panelArchivos.add(btnCmp, "cell 0 9");
		
		btnDiff = new JButton("diff");
		btnDiff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "diff"; 
				
				command=command + " " + textFieldPathOrigenArchivos.getText()+ " "+ textFieldPathDestinoArchivos.getText();
				
				textFieldComandoArchivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaArchivos.setText(sOutput);
			}
		});
		panelArchivos.add(btnDiff, "cell 0 9");
		
		btnWc = new JButton("wc");
		btnWc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "wc"; 
				
				command=command + " "+ textFieldPathOrigenArchivos.getText();
				
				textFieldComandoArchivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaArchivos.setText(sOutput);
			}
		});
		
		btnFile = new JButton("file");
		btnFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "file"; 
				
				command=command + " "+ textFieldPathOrigenArchivos.getText();
				
				textFieldComandoArchivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaArchivos.setText(sOutput);
			}
		});
		btnFile.setToolTipText("Identifica que tipo de Archivo es (odt,jpg,zip,etc)");
		panelArchivos.add(btnFile, "cell 1 9");
		btnWc.setToolTipText("WordCount, Resumen de archivo (linea,palabras,caracters)");
		panelArchivos.add(btnWc, "cell 1 9");
		
		btnLn = new JButton("ln");
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "ln -s"; 
				
				command=command + " "+ textFieldPathOrigenArchivos.getText();
				command=command + " "+ textFieldPathDestinoArchivos.getText() + "/" + textFieldNombreArchivos.getText();
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				//textAreaArchivos.setText(sOutput);
				
				String commandLs = "";
				
				commandLs = "ls -i "+ textFieldPathDestinoArchivos.getText();
								
				textFieldComandoArchivos.setText(command);
				
				String sOutputLn = Comando.executeCommandWithReturn(commandLs,ArchivoCarpetaJFrame.this,false);
				
				textAreaArchivos.setText(sOutputLn);
			}
		});
		
		btnTouch = new JButton("touch");
		btnTouch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "touch"; 
				
				//command=command + " "+ textFieldPathOrigenArchivos.getText();				
				command=command + " "+ textFieldPathDestinoArchivos.getText();
				
				textFieldComandoArchivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
								
				textAreaArchivos.setText(sOutput);
			}
		});
		btnTouch.setToolTipText("Crea archivo y cierra");
		panelArchivos.add(btnTouch, "cell 1 9");
		
		lblLn = new JLabel("ln");
		panelArchivos.add(lblLn, "cell 1 9");
		btnLn.setToolTipText("Link/Acceso Directo, -s soft(Acceso Directo), -h hard (Copia)");
		panelArchivos.add(btnLn, "cell 1 9");
		
		btnCat = new JButton("cat");
		btnCat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "cat"; 
				
				if(chckbxConNumeroFilas.isSelected()) {
					command=command + " -n";
				}
				
				command=command + " "+ textFieldPathOrigenArchivos.getText();
				
				textFieldComandoArchivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaArchivos.setText(sOutput);
			}
		});
		btnCat.setToolTipText("Ver Contenido de Archivo");
		panelArchivos.add(btnCat, "cell 0 10");
		
		btnTail = new JButton("tail");
		btnTail.setToolTipText("Muestra X ultimas lineas");
		btnTail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "tail"; 
				
				/*
				if(!textFieldNumeroFilasArchivos.getText().equals("")) {
					command=command + " -n ";// + textFieldNumeroFilasArchivos.getText();				
				}				
				*/
				
				if(!textFieldNumeroFilasLeerArchivos.getText().equals("")) {
					command=command + " -n "+ textFieldNumeroFilasLeerArchivos.getText();				
				}
				
				command=command + " "+ textFieldPathOrigenArchivos.getText();				
				
				textFieldComandoArchivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
								
				textAreaArchivos.setText(sOutput);
			}
		});
		panelArchivos.add(btnTail, "cell 0 10");
		
		btnHead = new JButton("head");
		btnHead.setToolTipText("Muestra X primeras lineas");
		btnHead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "head"; 
				
				/*
				if(!textFieldNumeroFilasArchivos.getText().equals("")) {
					command=command + " -n"+ textFieldNumeroFilasArchivos.getText();				
				}	
				*/
				
				if(!textFieldNumeroFilasLeerArchivos.getText().equals("")) {
					command=command + " -n "+ textFieldNumeroFilasLeerArchivos.getText();				
				}
				
				command=command + " "+ textFieldPathOrigenArchivos.getText();				
				
				textFieldComandoArchivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
								
				textAreaArchivos.setText(sOutput);
			}
		});
		panelArchivos.add(btnHead, "cell 0 10");
		
		btnNl = new JButton("nl");
		btnNl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "nl"; 
				
				command=command + " "+ textFieldPathOrigenArchivos.getText();
				
				textFieldComandoArchivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaArchivos.setText(sOutput);
			}
		});
		btnNl.setToolTipText("Leer con numeracion lineas");
		panelArchivos.add(btnNl, "cell 0 10");
		
		btnZless = new JButton("zless");
		btnZless.setToolTipText("Para texto comprimido");
		btnZless.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "zless"; 
				
				/*
				if(chckbxConNumeroFilas.isSelected()) {
					command=command + " -n";
				}
				*/
				
				command=command + " "+ textFieldPathOrigenArchivos.getText();
				
				textFieldComandoArchivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaArchivos.setText(sOutput);
			}
		});
		panelArchivos.add(btnZless, "cell 0 11");
		
		btnSort = new JButton("sort");
		btnSort.setToolTipText("Ordenar elementos de un archivo");
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "sort"; 
				
				if(chckbxNumeros.isSelected()) {
					command=command + " -n";				
				}				
				
				if(chckbxReversa.isSelected()) {
					command=command + "r";				
				}
				
				if(chckbxUnicos.isSelected()) {
					command=command + " -u";				
				}
				
				command=command + " "+ textFieldPathOrigenArchivos.getText();				
				
				textFieldComandoArchivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
								
				textAreaArchivos.setText(sOutput);
			}
		});
		panelArchivos.add(btnSort, "cell 1 10");
		
		btnPaste = new JButton("paste");
		btnPaste.setToolTipText("Combina filas de 2 archivos");
		btnPaste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "paste"; 
				
				command=command + " "+ textFieldPathOrigenArchivos.getText();				
				command=command + " "+ textFieldPathDestinoArchivos.getText();
				
				textFieldComandoArchivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
								
				textAreaArchivos.setText(sOutput);
			}
		});
		panelArchivos.add(btnPaste, "cell 1 10");
		
		textFieldNombreArchivos = new JTextField();
		textFieldNombreArchivos.setToolTipText("Nombre del Link o Acceso Directo");
		panelArchivos.add(textFieldNombreArchivos, "cell 1 5,alignx left");
		textFieldNombreArchivos.setColumns(20);
		
		textFieldNumeroFilasArchivos = new JTextField();
		panelArchivos.add(textFieldNumeroFilasArchivos, "cell 1 6,alignx left");
		textFieldNumeroFilasArchivos.setColumns(5);
		
		chckbxReversa = new JCheckBox("Reversa");
		panelArchivos.add(chckbxReversa, "cell 1 7");
		
		chckbxUnicos = new JCheckBox("Unicos");
		panelArchivos.add(chckbxUnicos, "cell 1 7,alignx right");
		
		btnTr = new JButton("tr");
		btnTr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "cat"; 
				
				command=command + " "+ textFieldPathOrigenArchivos.getText();
				
				command=command + " | tr ";
				
				command=command + " '"+ textFieldBuscarArchivos.getText()+"'";
				
				command=command + " '"+ textFieldReemplazarArchivos.getText()+"'";
				
				textFieldComandoArchivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaArchivos.setText(sOutput);
			}
		});
		panelArchivos.add(btnTr, "cell 1 11");
		
		textFieldBuscarArchivos = new JTextField();
		textFieldBuscarArchivos.setText("1-9");
		panelArchivos.add(textFieldBuscarArchivos, "cell 1 8");
		textFieldBuscarArchivos.setColumns(10);
		
		lblReemplazar_2 = new JLabel("Reemplazar");
		panelArchivos.add(lblReemplazar_2, "cell 1 8");
		
		textFieldReemplazarArchivos = new JTextField();
		textFieldReemplazarArchivos.setText("aaa");
		panelArchivos.add(textFieldReemplazarArchivos, "cell 1 8");
		textFieldReemplazarArchivos.setColumns(10);
		
		btnLsi = new JButton("ls -i");
		btnLsi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "ls -i"; 								
				
				command=command + " "+ textFieldPathOrigenArchivos.getText();
				
				textFieldComandoArchivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaArchivos.setText(sOutput);
			}
		});
		panelArchivos.add(btnLsi, "cell 1 9");
		
		btnFindInode = new JButton("find inode");
		btnFindInode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "find "+textFieldPathOrigenArchivos.getText()+" -inum "+textFieldiNodeArchivos.getText()+" 2> /dev/null"; 								
				
				//command=command + " "+ textFieldPathOrigenArchivos.getText();
				
				textFieldComandoArchivos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaArchivos.setText(sOutput);
			}
		});
		panelArchivos.add(btnFindInode, "cell 1 9");
		
		panelSearch = new JPanel();
		tabbedPane.addTab("Search/Size Files", null, panelSearch, null);
		panelSearch.setLayout(new MigLayout("", "[grow][grow]", "[][][][][][][][][][][grow]"));
		
		lblBusqueda = new JLabel("-----BUSQUEDA-----");
		panelSearch.add(lblBusqueda, "cell 0 0 2 1,alignx center");
		
		lblPathBusqueda = new JLabel("Path Busqueda");
		panelSearch.add(lblPathBusqueda, "cell 0 1,alignx trailing");
		
		textFieldPathBusqueda = new JTextField();
		textFieldPathBusqueda.setToolTipText("/home/*.txt");
		panelSearch.add(textFieldPathBusqueda, "cell 1 1,alignx left");
		textFieldPathBusqueda.setColumns(25);
		
		lblTipo = new JLabel("Tipo");
		panelSearch.add(lblTipo, "flowx,cell 0 2,alignx trailing");
		
		btnFind = new JButton("find");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "find"; 
				String comillasBusqueda ="";
				
				String sValor=(String)comboBoxTipoCriterio.getSelectedItem();
				
				System.out.println(sValor);
												
				command=command + " "+ textFieldPathBusqueda.getText();		
				
				
				if(sValor.equals("Nombre")) {
					command=command + " -name";
					comillasBusqueda ="\"";
					
				} else if(sValor.equals("Tamaño")) {
					command=command + " -size";
					
				} else if(sValor.equals("Vacio")) {
					command=command + " -empty";
					
				} else if(sValor.equals("Usuario")) {
					command=command + " -user";
				}
				
				
				command=command + " "+comillasBusqueda+ textFieldCriterio.getText()+comillasBusqueda+"";				
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
								
				textAreaBusqueda.setText(sOutput);
			}
		});
		
		lblCriterio = new JLabel("Criterio");
		panelSearch.add(lblCriterio, "cell 0 3,alignx trailing");
		
		textFieldCriterio = new JTextField();
		textFieldCriterio.setToolTipText("Si nombre es exacto empieza con /(Backslash)");
		panelSearch.add(textFieldCriterio, "cell 1 3,alignx left");
		textFieldCriterio.setColumns(10);
		
		lblLocate = new JLabel("LOCATE");
		panelSearch.add(lblLocate, "cell 0 4,alignx right");
		
		chckbxNoCoincidencias = new JCheckBox("No Coincidencias");
		panelSearch.add(chckbxNoCoincidencias, "flowx,cell 1 4");
		panelSearch.add(btnFind, "cell 0 5,alignx right");
		
		btnLocate = new JButton("locate");
		btnLocate.setToolTipText("updatedb");
		btnLocate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "locate"; 
				String comillasBusqueda ="";								
				
				if(chckbxNombreDeArchivo.isSelected()) {
					command=command + " -b";
				}
				
				if(chckbxNoCoincidencias.isSelected()) {
					command=command + " -c";
				}
						
				command=command + " \""+comillasBusqueda+ textFieldCriterio.getText()+comillasBusqueda+"\"";				
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
								
				textAreaBusqueda.setText(sOutput);
			}
		});
		panelSearch.add(btnLocate, "cell 1 5");
		
		lblTamanioCarpetas = new JLabel("----- TAMANIO CARPETAS / ARCHIVOS -----");
		panelSearch.add(lblTamanioCarpetas, "cell 0 6 2 1,alignx center");
		
		chckbxConTotal = new JCheckBox("Con Total");
		panelSearch.add(chckbxConTotal, "cell 0 7,alignx right");
		
		chckbxSoloTotal = new JCheckBox("Solo Total");
		panelSearch.add(chckbxSoloTotal, "cell 1 7,alignx left");
		
		chckbxArchivos = new JCheckBox("Con Archivos");
		panelSearch.add(chckbxArchivos, "flowx,cell 0 8,alignx right");
		
		chckbxLeible = new JCheckBox("Leible");
		panelSearch.add(chckbxLeible, "cell 1 8");
		
		btnDu = new JButton("du");
		btnDu.setToolTipText("Tamanio en Disco");
		btnDu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "du"; 
				
				
				if(chckbxSoloTotal.isSelected()) {
					command=command + " -s";
				}				
				
				if(chckbxConTotal.isSelected()) {
					command=command + " -c";
				}


				if(chckbxArchivos.isSelected()) {
					command=command + " -a";
				}
				
				if(chckbxLeible.isSelected()) {
					command=command + " -h";
				}				
				
				
				
				command=command + " "+ textFieldPathBusqueda.getText();				
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
								
				textAreaBusqueda.setText(sOutput);
			}
		});
		panelSearch.add(btnDu, "flowx,cell 0 9,alignx right");
		
		scrollPane_4 = new JScrollPane();
		panelSearch.add(scrollPane_4, "cell 0 10 2 1,grow");
		
		textAreaBusqueda = new JTextArea();
		scrollPane_4.setViewportView(textAreaBusqueda);
		
		comboBoxTipoCriterio = new JComboBox();
		comboBoxTipoCriterio.setModel(new DefaultComboBoxModel(new String[] {"Nombre", "Tamaño", "Usuario", "Vacio"}));
		panelSearch.add(comboBoxTipoCriterio, "cell 1 2,alignx left");
		
		chckbxNombreDeArchivo = new JCheckBox("Nombre de Archivo");
		panelSearch.add(chckbxNombreDeArchivo, "cell 1 4");
		
		chckbxNombreExacto = new JCheckBox("Nombre Exacto");
		panelSearch.add(chckbxNombreExacto, "cell 1 4");
		
		panelSearchInFiles = new JPanel();
		tabbedPane.addTab("Search in Files", null, panelSearchInFiles, null);
		panelSearchInFiles.setLayout(new MigLayout("", "[grow][grow]", "[][][][][][][grow]"));
		
		lblPathBusqueda_1 = new JLabel("Path Busqueda");
		panelSearchInFiles.add(lblPathBusqueda_1, "cell 0 0,alignx trailing");
		
		textFieldPathBusqueda2 = new JTextField();
		panelSearchInFiles.add(textFieldPathBusqueda2, "cell 1 0,alignx left");
		textFieldPathBusqueda2.setColumns(35);
		
		lblCriterio_1 = new JLabel("Criterio");
		panelSearchInFiles.add(lblCriterio_1, "cell 0 1,alignx trailing");
		
		textFieldCriterio2 = new JTextField();
		panelSearchInFiles.add(textFieldCriterio2, "cell 1 1,alignx left");
		textFieldCriterio2.setColumns(25);
		
		chckbxNumAciertos = new JCheckBox("Num Aciertos");
		panelSearchInFiles.add(chckbxNumAciertos, "cell 0 2");
		
		chckbxInvierteResultados = new JCheckBox("Invierte Resultados");
		panelSearchInFiles.add(chckbxInvierteResultados, "cell 1 2");
		
		chckbxMayusMinus = new JCheckBox("Mayus/Minus");
		panelSearchInFiles.add(chckbxMayusMinus, "cell 0 3");
		
		chckbxTodaPalabra = new JCheckBox("Toda Palabra");
		panelSearchInFiles.add(chckbxTodaPalabra, "cell 1 3");
		
		chckbxNumerosLineas = new JCheckBox("Numeros Lineas");
		panelSearchInFiles.add(chckbxNumerosLineas, "cell 0 4");
		
		btnGrep = new JButton("grep");
		btnGrep.setToolTipText("-E= egrep, -F=fgrep");
		btnGrep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "grep"; 
				
				if(chckbxNumAciertos.isSelected()) {
					command=command + " -c";
				}
				
				if(chckbxInvierteResultados.isSelected()) {
					command=command + " -v";
				}
				
				if(chckbxMayusMinus.isSelected()) {
					command=command + " -i";
				}
				
				if(chckbxTodaPalabra.isSelected()) {
					command=command + " -w";
				}
				
				if(chckbxNumerosLineas.isSelected()) {
					command=command + " -n";
				}
				
				command=command + " \""+ textFieldCriterio2.getText()+"\"";								
				command=command + " "+ textFieldPathBusqueda2.getText();				
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
								
				textAreaBusqueda2.setText(sOutput);
			}
		});
		panelSearchInFiles.add(btnGrep, "cell 0 5");
		
		scrollPane_5 = new JScrollPane();
		panelSearchInFiles.add(scrollPane_5, "cell 0 6 2 1,grow");
		
		textAreaBusqueda2 = new JTextArea();
		scrollPane_5.setViewportView(textAreaBusqueda2);
		
		panelSed = new JPanel();
		tabbedPane.addTab("sed", null, panelSed, null);
		panelSed.setLayout(new MigLayout("", "[][][][grow]", "[][][][][][][][][][][][][grow]"));
		
		lblPathBase_1 = new JLabel("Path Base");
		panelSed.add(lblPathBase_1, "cell 0 0,alignx trailing");
		
		textFieldPathBaseSed = new JTextField();
		textFieldPathBaseSed.setText("/home/bydan/test_command");
		panelSed.add(textFieldPathBaseSed, "cell 1 0 3 1,alignx left");
		textFieldPathBaseSed.setColumns(35);
		
		lblNombreArchivo = new JLabel("Nombre Archivo");
		panelSed.add(lblNombreArchivo, "cell 0 1,alignx trailing");
		
		textFieldNombreArchivoSed = new JTextField();
		textFieldNombreArchivoSed.setText("seddemo.txt");
		panelSed.add(textFieldNombreArchivoSed, "cell 1 1,alignx left");
		textFieldNombreArchivoSed.setColumns(20);
		
		lblCriterioBusqueda = new JLabel("Criterio Busqueda");
		panelSed.add(lblCriterioBusqueda, "cell 0 2,alignx trailing");
		
		textFieldCriterioBusquedaSed = new JTextField();
		textFieldCriterioBusquedaSed.setText("[cC]omputers");
		textFieldCriterioBusquedaSed.setToolTipText("[cC]omputers");
		panelSed.add(textFieldCriterioBusquedaSed, "cell 1 2,alignx left");
		textFieldCriterioBusquedaSed.setColumns(20);
		
		lblNuevoArchivo = new JLabel("Nuevo Archivo");
		panelSed.add(lblNuevoArchivo, "cell 0 3,alignx trailing");
		
		textFieldNuevoArchivoSed = new JTextField();
		panelSed.add(textFieldNuevoArchivoSed, "cell 1 3,alignx left");
		textFieldNuevoArchivoSed.setColumns(20);
		
		btnBusqueda = new JButton("Busqueda");
		btnBusqueda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "sed"; 
				String sCriterio = "";
				String sMostrarResultados="";
						
				command=command + " -n";
								
				if(textFieldNuevoArchivoSed.getText().equals("")){
					sCriterio = " '/"+textFieldCriterioBusquedaSed.getText()+"/p'";
					
				} else {
					sCriterio = " '/"+textFieldCriterioBusquedaSed.getText()+"/w "+textFieldPathBaseSed.getText()+"/"+textFieldNuevoArchivoSed.getText()+"'";
				}
				
				
				
				command=command + sCriterio;
				
				command=command + " "+textFieldPathBaseSed.getText()+"/"+ textFieldNombreArchivoSed.getText();
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaSed.setText(sOutput);
			}
		});
		
		lblPorFilas = new JLabel("-------------POR FILAS");
		panelSed.add(lblPorFilas, "cell 0 4 2 1,alignx center");
		
		lblReemplazar = new JLabel("REEMPLAZAR");
		panelSed.add(lblReemplazar, "cell 2 4 2 1,alignx center");
		
		lblNumeroFila = new JLabel("Numero Fila");
		panelSed.add(lblNumeroFila, "cell 0 5,alignx trailing");
		
		textFieldNumeroFilaSed = new JTextField();
		panelSed.add(textFieldNumeroFilaSed, "cell 1 5,alignx left");
		textFieldNumeroFilaSed.setColumns(5);
		
		lblBuscarReemplazo = new JLabel("Buscar Reemplazo");
		panelSed.add(lblBuscarReemplazo, "cell 2 5,alignx trailing");
		
		textFieldBuscarReemplazoSed = new JTextField();
		textFieldBuscarReemplazoSed.setText("[kK]umar");
		panelSed.add(textFieldBuscarReemplazoSed, "cell 3 5,alignx left");
		textFieldBuscarReemplazoSed.setColumns(10);
		
		lblNumeroFilaFinal = new JLabel("Numero Fila Final");
		panelSed.add(lblNumeroFilaFinal, "cell 0 6,alignx trailing");
		
		textFieldNumeroFilaFinalSed = new JTextField();
		panelSed.add(textFieldNumeroFilaFinalSed, "cell 1 6,alignx left");
		textFieldNumeroFilaFinalSed.setColumns(10);
		
		lblReemplazo = new JLabel("Reemplazo");
		panelSed.add(lblReemplazo, "cell 2 6,alignx trailing");
		
		textFieldReemplazoSed = new JTextField();
		textFieldReemplazoSed.setText("Roy");
		panelSed.add(textFieldReemplazoSed, "cell 3 6,alignx left");
		textFieldReemplazoSed.setColumns(10);
		
		chckbxUltimaFilaSed = new JCheckBox("Ultima Fila");
		panelSed.add(chckbxUltimaFilaSed, "cell 0 7,alignx right");
		
		chckbxRangoFilasInversoSed = new JCheckBox("Rango Filas Inverso");
		panelSed.add(chckbxRangoFilasInversoSed, "cell 1 7,alignx left");
		
		lblInsertar = new JLabel("------------INSERTAR");
		panelSed.add(lblInsertar, "cell 0 8 2 1,alignx center");
		
		lblTextoInsertar = new JLabel("Texto Insertar");
		panelSed.add(lblTextoInsertar, "cell 0 9,alignx trailing");
		
		textFieldTextoInsertarSed = new JTextField();
		textFieldTextoInsertarSed.setText("Student Information\\n2011");
		panelSed.add(textFieldTextoInsertarSed, "cell 1 9,alignx left");
		textFieldTextoInsertarSed.setColumns(10);
		panelSed.add(btnBusqueda, "flowx,cell 0 10");
		
		btnBusquedaPorFilas = new JButton("Busqueda por Filas");
		btnBusquedaPorFilas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "sed"; 
				String sCriterio = "";
				String sMostrarResultados="";
						
				command=command + " -n";
								
				if(!chckbxUltimaFilaSed.isSelected()) {
					if(!chckbxRangoFilasInversoSed.isSelected()) {
						if(textFieldNumeroFilaFinalSed.getText().equals("")){
							sCriterio = " '"+textFieldNumeroFilaSed.getText()+"p'";
							
						} else {
							sCriterio = " '"+textFieldNumeroFilaSed.getText()+","+textFieldNumeroFilaFinalSed.getText()+"p'";
						}
						
					} else {
						if(textFieldNumeroFilaFinalSed.getText().equals("")){
							sCriterio = " '"+textFieldNumeroFilaSed.getText()+"!p'";
							
						} else {
							sCriterio = " '"+textFieldNumeroFilaSed.getText()+","+textFieldNumeroFilaFinalSed.getText()+"!p'";
						}
					}
				} else {
					sCriterio = " '$p'";
				}
				
				
				command=command + sCriterio;
				
				command=command + " "+textFieldPathBaseSed.getText()+"/"+ textFieldNombreArchivoSed.getText();
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaSed.setText(sOutput);
			}
		});
		
		btnReemplazar = new JButton("Reemplazar");
		btnReemplazar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "sed"; 
				String sCriterio = "";
				String sMostrarResultados="";
						
				//command=command + " -n";
				command=command + " 's/"+textFieldBuscarReemplazoSed.getText()+"/"+textFieldReemplazoSed.getText()+"/g'";//+textFieldNuevoArchivoSed.getText()+"'";
				
				
				
				
				//command=command + sCriterio;
				
				command=command + " "+textFieldPathBaseSed.getText()+"/"+ textFieldNombreArchivoSed.getText();
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaSed.setText(sOutput);
			}
		});
		panelSed.add(btnReemplazar, "cell 3 10");
		panelSed.add(btnBusquedaPorFilas, "cell 0 11");
		
		btnTextoInsertar = new JButton("Insertar Texto ");
		btnTextoInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String command = "sed"; 
					String sCriterio = "";
					String sMostrarResultados="";
							
					command=command + " '1i";
					
					command=command + " " + textFieldTextoInsertarSed.getText() + "'";
					
					
					//textFieldNombreArchivoSed
					//sCriterio = " '/"+textFieldCriterioBusquedaSed.getText()+"/d' "+textFieldPathBaseSed.getText()+"/"+textFieldNombreArchivoSed.getText()+"";				
					
								
					command=command + " " + textFieldPathBaseSed.getText()+"/"+textFieldNombreArchivoSed.getText();
					
					//command=command + " >> "+textFieldPathBaseSed.getText()+"/"+ textFieldNuevoArchivoSed.getText();
					
					String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
					
					textAreaSed.setText(sOutput);
			}
		});
		panelSed.add(btnTextoInsertar, "cell 1 11");
		
		btnBuscarFilaY = new JButton("Buscar Fila y Reemplazar");
		btnBuscarFilaY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "sed"; 
				String sCriterio = "";
				String sMostrarResultados="";
						
				//command=command + " -n";
				command=command + " '/"+textFieldCriterioBusquedaSed.getText()+"/s/"+textFieldBuscarReemplazoSed.getText()+"/"+textFieldReemplazoSed.getText()+"/'";//+textFieldNuevoArchivoSed.getText()+"'";
				
				
				
				
				//command=command + sCriterio;
				
				command=command + " "+textFieldPathBaseSed.getText()+"/"+ textFieldNombreArchivoSed.getText();
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaSed.setText(sOutput);
			}
		});
		panelSed.add(btnBuscarFilaY, "cell 3 11");
		
		scrollPane_6 = new JScrollPane();
		panelSed.add(scrollPane_6, "cell 0 12 4 1,grow");
		
		textAreaSed = new JTextArea();
		scrollPane_6.setViewportView(textAreaSed);
		
		btnEliminarBusqueda = new JButton("Eliminar Busqueda");
		btnEliminarBusqueda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "sed"; 
				String sCriterio = "";
				String sMostrarResultados="";
						
				//command=command + " -n";
				
				
				//textFieldNombreArchivoSed
				sCriterio = " '/"+textFieldCriterioBusquedaSed.getText()+"/d' "+textFieldPathBaseSed.getText()+"/"+textFieldNombreArchivoSed.getText()+"";				
				
							
				command=command + sCriterio;
				
				command=command + " >> "+textFieldPathBaseSed.getText()+"/"+ textFieldNuevoArchivoSed.getText();
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaSed.setText(sOutput);
			}
		});
		panelSed.add(btnEliminarBusqueda, "flowx,cell 1 10");
		
		panelAwk = new JPanel();
		tabbedPane.addTab("awk", null, panelAwk, null);
		panelAwk.setLayout(new MigLayout("", "[][][][grow]", "[][][][][][][][][][grow]"));
		
		lblPathBase_2 = new JLabel("Path Base");
		panelAwk.add(lblPathBase_2, "cell 0 0,alignx trailing");
		
		textFieldPathBaseAwk = new JTextField();
		textFieldPathBaseAwk.setText("/home/bydan/test_command");
		panelAwk.add(textFieldPathBaseAwk, "cell 1 0 3 1,alignx left");
		textFieldPathBaseAwk.setColumns(35);
		
		lblNombreArchivo_1 = new JLabel("Nombre Archivo");
		panelAwk.add(lblNombreArchivo_1, "cell 0 1,alignx trailing");
		
		textFieldNombreArchivoAwk = new JTextField();
		textFieldNombreArchivoAwk.setText("awkdemo.txt");
		panelAwk.add(textFieldNombreArchivoAwk, "cell 1 1,alignx left");
		textFieldNombreArchivoAwk.setColumns(20);
		
		lblCriterioBusqueda_1 = new JLabel("Criterio Busqueda");
		panelAwk.add(lblCriterioBusqueda_1, "cell 0 2,alignx trailing");
		
		textFieldCriterioBusquedaAwk = new JTextField();
		textFieldCriterioBusquedaAwk.setToolTipText("Expresion Regular. M[ei]*ra* ; Multiples Busquedas: civil|electrical");
		textFieldCriterioBusquedaAwk.setText("Pass");
		panelAwk.add(textFieldCriterioBusquedaAwk, "cell 1 2,alignx left");
		textFieldCriterioBusquedaAwk.setColumns(15);
		
		btnBusqueda_1 = new JButton("Busqueda");
		btnBusqueda_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "awk"; 
				String sCriterio = "";
				String sMostrarResultados="";
						
				//command=command + " -n";
								
				command=command + " '/"+textFieldCriterioBusquedaAwk.getText()+"/ {print}'";
																
				//command=command + sCriterio;
				
				command=command + " "+textFieldPathBaseAwk.getText()+"/"+ textFieldNombreArchivoAwk.getText();
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaAwk.setText(sOutput);
			}
		});
		
		lblTiposcriterios = new JLabel("civil|electrical ; M[ei]*ra*");
		panelAwk.add(lblTiposcriterios, "cell 1 3");
		
		lblCampos = new JLabel("CAMPOS");
		panelAwk.add(lblCampos, "cell 0 4");
		
		lblCamposFormato = new JLabel("CAMPOS FORMATO");
		panelAwk.add(lblCamposFormato, "cell 2 4");
		
		lblCampos_1 = new JLabel("Campos (1,2,3)");
		panelAwk.add(lblCampos_1, "cell 0 5,alignx trailing");
		
		textFieldCamposAwk = new JTextField();
		textFieldCamposAwk.setToolTipText("1,1,2,3, etc  Separados por ,");
		panelAwk.add(textFieldCamposAwk, "cell 1 5,alignx left");
		textFieldCamposAwk.setColumns(10);
		
		lblFormatoCampos = new JLabel("Formato Campos ");
		panelAwk.add(lblFormatoCampos, "cell 2 5,alignx trailing");
		
		textFieldFormatoCamposAwk = new JTextField();
		textFieldFormatoCamposAwk.setText("%4d %-25s %-15s \\n");
		panelAwk.add(textFieldFormatoCamposAwk, "cell 3 5,growx");
		textFieldFormatoCamposAwk.setColumns(30);
		
		lblDelimitador = new JLabel("Delimitador");
		panelAwk.add(lblDelimitador, "cell 0 6,alignx trailing");
		
		textFieldDelimitadorAwk = new JTextField();
		textFieldDelimitadorAwk.setText("|");
		panelAwk.add(textFieldDelimitadorAwk, "cell 1 6,alignx left");
		textFieldDelimitadorAwk.setColumns(5);
		
		lblCamposFormtamo = new JLabel("Campos Formato");
		panelAwk.add(lblCamposFormtamo, "cell 2 6,alignx trailing");
		
		textFieldCamposFormatoAwk = new JTextField();
		textFieldCamposFormatoAwk.setText("NR,$2,$3");
		panelAwk.add(textFieldCamposFormatoAwk, "cell 3 6,growx");
		textFieldCamposFormatoAwk.setColumns(30);
		
		chckbxTodosCamposAwk = new JCheckBox("Todos Campos");
		chckbxTodosCamposAwk.setSelected(true);
		panelAwk.add(chckbxTodosCamposAwk, "cell 1 7");
		panelAwk.add(btnBusqueda_1, "cell 0 8");
		
		btnBusquedaCampos = new JButton("Busqueda Campos");
		btnBusquedaCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "awk"; 
				String sCriterio = "";
				String sMostrarResultados="";
						
				command=command + " -F";
				
				command=command + " \""+textFieldDelimitadorAwk.getText()+"\"";
				
				command=command + " '/"+textFieldCriterioBusquedaAwk.getText()+"/ {print ME_CAMPOS}'";
																
				//command=command + sCriterio;
				
				
				if(chckbxTodosCamposAwk.isSelected()){
					command=command.replace("ME_CAMPOS", "$0");
					
				} else {
					String sCampos=textFieldCamposAwk.getText();
					String sCamposMostrar="";
							
					String[] arrCampos=sCampos.split(",");
					Boolean esPrimero=true;
					
					for(String sCampoActual:arrCampos){
						if(!esPrimero){
							sCamposMostrar+=",";
						}
						
						sCamposMostrar+="$"+sCampoActual;
						
						if(esPrimero){
							esPrimero=false;
						}												
					}
					
					command=command.replace("ME_CAMPOS", sCamposMostrar);
				}
				        
				
				command=command + " "+textFieldPathBaseAwk.getText()+"/"+ textFieldNombreArchivoAwk.getText();
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaAwk.setText(sOutput);
			}
		});
		panelAwk.add(btnBusquedaCampos, "cell 1 8");
		
		btnBusquedaFormatoCampos = new JButton("Busqueda Formato Campos");
		btnBusquedaFormatoCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "awk"; 
				String sCriterio = "";
				String sMostrarResultados="";
						
				command=command + " -F";
				
				command=command + " \""+textFieldDelimitadorAwk.getText()+"\"";
				
				command=command + " '/"+textFieldCriterioBusquedaAwk.getText()+"/ {printf \"ME_FORMATO\" , ME_CAMPOS}'";
																
				//command=command + sCriterio;
				
				command=command.replace("ME_FORMATO", textFieldFormatoCamposAwk.getText());
					
				command=command.replace("ME_CAMPOS", textFieldCamposFormatoAwk.getText());
								        				
				command=command + " "+textFieldPathBaseAwk.getText()+"/"+ textFieldNombreArchivoAwk.getText();
				
				String sOutput = Comando.executeCommandWithReturn(command,ArchivoCarpetaJFrame.this);
				
				textAreaAwk.setText(sOutput);
			}
		});
		panelAwk.add(btnBusquedaFormatoCampos, "cell 3 8");
		
		scrollPane_7 = new JScrollPane();
		panelAwk.add(scrollPane_7, "cell 0 9 4 1,grow");
		
		textAreaAwk = new JTextArea();
		scrollPane_7.setViewportView(textAreaAwk);
		
		panelEjemplos = new JPanel();
		tabbedPane.addTab("Ejemplos", null, panelEjemplos, null);
		panelEjemplos.setLayout(new MigLayout("", "[][][]", "[][][][][][][][][][][][][][]"));
		
		lblArchivoscarpetas = new JLabel("Archivos/Carpetas");
		panelEjemplos.add(lblArchivoscarpetas, "cell 0 0");
		
		lblArchivos = new JLabel("Archivos");
		panelEjemplos.add(lblArchivos, "cell 1 0");
		
		btnCat_1 = new JButton("cat");
		btnCat_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("cat", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("cat");
				
				ejemplosGeneralJFrame.show();
			}
		});
		
		btnCp_1 = new JButton("cp");
		btnCp_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("cp", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("cp");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnCp_1, "cell 0 1");
		panelEjemplos.add(btnCat_1, "cell 1 1");
		
		btnMv_1 = new JButton("mv");
		btnMv_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("mv", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("mv");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnMv_1, "cell 0 2");
		
		btnRm_1 = new JButton("rm");
		btnRm_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("rm", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("rm");
				
				ejemplosGeneralJFrame.show();
			}
		});
		
		btnSed = new JButton("sed");
		btnSed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("sed", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("sed");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnSed, "cell 1 2");
		panelEjemplos.add(btnRm_1, "cell 0 3");
		
		btnAwk = new JButton("awk");
		btnAwk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("awk", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("awk");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnAwk, "cell 1 3");
		
		btnMkdir_1 = new JButton("mkdir");
		btnMkdir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("mkdir", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("mkdir");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnMkdir_1, "cell 0 4");
		
		btnTr_1 = new JButton("tr");
		btnTr_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("tr", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("tr");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnTr_1, "cell 1 4");
		
		btnFind_1 = new JButton("find");
		btnFind_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("find", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("find");
				
				ejemplosGeneralJFrame.show();
			}
		});
		
		btnRmdir_1 = new JButton("rmdir");
		btnRmdir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("rmdir", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("rmdir");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnRmdir_1, "cell 0 5");
		panelEjemplos.add(btnFind_1, "cell 1 5");
		
		btnLocate_1 = new JButton("locate");
		btnLocate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("locate", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("locate");
				
				ejemplosGeneralJFrame.show();
			}
		});
		
		btnLn_1 = new JButton("ln");
		btnLn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("ln", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("ln");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnLn_1, "cell 0 6");
		panelEjemplos.add(btnLocate_1, "cell 1 6");
		
		btnNl_1 = new JButton("nl");
		btnNl_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("nl", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("nl");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnNl_1, "cell 0 7");
		
		btnPipes = new JButton("pipes");
		btnPipes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("pipes", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("pipes");
				
				ejemplosGeneralJFrame.show();
			}
		});
		
		btnGrep_1 = new JButton("grep");
		btnGrep_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("grep", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("grep");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnGrep_1, "cell 1 7");
		panelEjemplos.add(btnPipes, "cell 0 8");
		
		btnStdoutStderror = new JButton("stdout stderror");
		btnStdoutStderror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("stdouterror", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("stdouterror");
				
				ejemplosGeneralJFrame.show();
			}
		});
		
		btnInfoFileSystem = new JButton("info file system");
		btnInfoFileSystem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("info_file_system", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("info_file_system");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnInfoFileSystem, "cell 1 8");
		panelEjemplos.add(btnStdoutStderror, "cell 0 9");
		
		btnHeadtail = new JButton("head-tail");
		btnHeadtail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("head_tail", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("head_tail");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnHeadtail, "cell 0 10");
		
		btnSort_1 = new JButton("sort");
		btnSort_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("sort", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("sort");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnSort_1, "cell 0 11");
		
		btnCut = new JButton("cut");
		btnCut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("cut", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("cut");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnCut, "cell 0 12");
		
		btnXargs = new JButton("xargs");
		btnXargs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("xargs", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("xargs");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnXargs, "cell 0 13");
	}
	
	public void procesar(String sTipo) {
		String command = sTipo; 
		
		if(!textAreaNombresCarpetas.getText().contains(",")) {
			command=command + " "+ textFieldPathBase.getText() + textAreaNombresCarpetas.getText();					
		
		} else {
			String[] arrCarpetas=textAreaNombresCarpetas.getText().split(",");
			String sCarpetas="";
			
			for(String sCarpeta:arrCarpetas) {
				sCarpetas+=" " + textFieldPathBase.getText() + sCarpeta;
			}
			
			command=command + sCarpetas;
		}
		
		if(sTipo.equals("mv") || sTipo.equals("cp")) {
			command=command + " "+ textFieldPathDestino.getText();	
		
		} else if(sTipo.equals("rm")) {
			command=command + " -Rf";
		}
		
		Comando.executeCommand(command,ArchivoCarpetaJFrame.this);
						
		
		String commandLs = "";
		
		if(textFieldPathDestino.getText().equals("")) {
			commandLs = "ls -a "+ textFieldPathBase.getText();
			
		} else {
			commandLs = "ls -a "+ textFieldPathDestino.getText();
		}
		
		String sOutput = Comando.executeCommandWithReturn(commandLs,ArchivoCarpetaJFrame.this,false);
		
		textAreaMkDir.setText(sOutput);
	}
}
