package bydan.ubuntu.ventanas.comandos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import bydan.ubuntu.base.ClipboardRunnable;
import bydan.ubuntu.base.Comando;
import bydan.ubuntu.base.Constantes;
import bydan.ubuntu.ventanas.comandos.ejemplos.EjemplosGeneralJFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;

import java.awt.Font;

public class UsuariosGruposJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JTextArea textAreaUsuarios;
	private JCheckBox chckbxUsuarioActual;
	private JCheckBox chckbxNombreUsuarioActual;
	private JCheckBox chckbxGrupoActual;
	private JCheckBox chckbxValores;
	private JTextField textFieldPathArchivo;
	private JTextField textFieldPathCarpeta;
	private JTextField textFieldUsuarioPermisos;
	private JTextField textFieldGrupoPermisos;
	private JCheckBox chckbxAplicarCarpeta;
	private JCheckBox chckbxDuenoLectura;
	private JCheckBox chckbxDuenoEscritura;
	private JCheckBox chckbxDuenoEjecusion;
	private JCheckBox chckbxGrupoLectura;
	private JCheckBox chckbxGrupoEscritura;
	private JCheckBox chckbxGrupoEjecusion;
	private JCheckBox chckbxOtrosLectura;
	private JCheckBox chckbxOtrosEscritura;
	private JCheckBox chckbxOtrosEjecusion;
	private JTextArea textAreaPermisos;
	private JCheckBox chckbxClipboard;
	private JCheckBox chckbxRecursivo;
	private JPanel panelInfo;
	private JLabel lblUsuario_1;
	private JTextField textFieldUsuarioInfo;
	private JButton btnWhoAmI;
	private JTextArea textAreaInfo;
	private JScrollPane scrollPane_2;
	private JButton btnGroups;
	private JButton btnWho;
	private JButton btnW;
	private JPanel panelGrupos;
	private JLabel lblNombreGrupo;
	private JTextField textFieldNombreGrupo;
	private JButton btnAddgroup;
	private JButton btnGroupdel;
	private JTextArea textAreaGrupos;
	private JScrollPane scrollPane_3;
	private JTextField textFieldComandoGrupos;
	private JTextField textFieldComandoUsuarios;
	private JButton btnId_1;
	private JLabel lblUsuarioGrupo;
	private JTextField textFieldUsuarioGrupo;
	private JButton btnUsuarioGrupo;
	private JButton btnGroups_1;
	private JButton btnQuitarUsuarioGrupo;
	private JButton btnLogname;
	private JButton btnGroupmod;
	private JLabel lblGroupmod;
	private JLabel lblNombreGrupoNuevo;
	private JTextField textFieldNombreGrupoNuevo;
	private JButton btnPass;
	private JLabel lblGruposAlCrear;
	private JLabel lblGrupoPrincipal;
	private JLabel lblGrupoExtra;
	private JTextField textFieldGrupoPrincipal;
	private JTextField textFieldGrupoExtra;
	private JButton btnAddGrupoExtra;
	private JPanel panelEjemplos;
	private JLabel lblPermisos;
	private JButton btnChmod_1;
	private JCheckBox chckbxUsarMetodoSimbolicoPermisos;
	private JCheckBox chckbxMetodoSimbolicoResumenPermisos;
	private JLabel lblPermisos_1;
	private JButton btnCarpeta;
	private JButton btnArchivo;
	private JButton btnLast;
	private JButton btnFinger;
	private JButton btnPasswords;
	private JButton btnListaGrupos;
	private JTextField textFieldComandoInfo;
	private JButton btnChown_1;
	private JButton btnChattr;
	private JButton btnVerPermisosEspeciales;
	private JLabel lblWho;
	private JCheckBox chckbxTodos;
	private JLabel lblUsuario_2;
	private JButton btnUseradd;
	private JButton btnUsers;
	private JButton btnUseradd_1;
	private JButton btnPwck;
	private JButton btnGroupadd;
	private JButton btnInfopermisos;
	private JButton btnInfogroups;
	private JPanel panelPermisosEspeciales;
	private JLabel lblPathArchivo_1;
	private JLabel lblPathCarpeta_1;
	private JTextField textFieldPathArchivoAtributos;
	private JTextField textFieldPathCarpetaAtributos;
	private JCheckBox chckbxAccessTime;
	private JCheckBox chckbxNoRemover;
	private JCheckBox chckbxCompresion;
	private JCheckBox chckbxCambiosDisco;
	private JCheckBox chckbxBackup;
	private JCheckBox chckbxIndexing;
	private JCheckBox chckbxJournal;
	private JCheckBox chckbxNoRecuperar;
	private JCheckBox chckbxRecuperable;
	private JTextField textFieldComandoAtributos;
	private JTextArea textAreaAtributos;
	private JScrollPane scrollPane_4;
	private JButton btnMostrarAtributos;
	private JCheckBox chckbxAplicarCarpetaAtributos;
	private JButton btnChattr_1;
	private JCheckBox chckbxRecursivoAtributos;
	private JCheckBox chckbxConQuitarAtributos;
	private JButton btnGetent;
	private JButton btnEtcGroup;
	private JLabel lblGrupo_2;
	private JTextField textFieldGrupoInfo;
	private JButton btnGetentGroup;
	private JButton btnCatGroup;
	private JButton btnId_2;
	private JButton btnChgrp_1;
	private JButton btnW_1;
	private JButton btnGroupadd_1;
	private JButton btnUseraddInfo;
	private JButton btnLohindefsInfo;
	private JButton btnChage;
	private JButton btnLoginHistory;
	private JButton btnUsermod;
	private JButton btnUserdel_1;
	private JButton btnGroupmod_1;
	private JButton btnNewgrp;
	private JButton btnId_3;
	private JButton btnStat;
	private JTextField textFieldComandoPermisos;
	private JButton btnUmask;
	private JButton btnUmask_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuariosGruposJFrame frame = new UsuariosGruposJFrame();
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
	public UsuariosGruposJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 810, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "cell 0 0,grow");
		
		JPanel panelUsuarios = new JPanel();
		tabbedPane.addTab("Usuarios", null, panelUsuarios, null);
		panelUsuarios.setLayout(new MigLayout("", "[][grow]", "[][][][][][][][][][][][grow]"));
		
		JLabel lblNombreUsuario = new JLabel("Usuario");
		panelUsuarios.add(lblNombreUsuario, "cell 0 0,alignx trailing");
		
		textFieldUsuario = new JTextField();
		panelUsuarios.add(textFieldUsuario, "cell 1 0,alignx left");
		textFieldUsuario.setColumns(15);
		
		JButton btnAdduser = new JButton("adduser");
		btnAdduser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = Constantes.GKSUDO + " 'adduser"; 
				
				command=command + " "+ textFieldUsuario.getText();				
				
				if(!textFieldGrupoPrincipal.getText().equals("")){
					command=command + " --ingroup "+ textFieldGrupoPrincipal.getText();			
				}
				
				command=command + "'";
				
				textFieldComandoUsuarios.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
								
				textAreaUsuarios.setText(sOutput);
			}
		});
		
		chckbxClipboard = new JCheckBox("Clipboard");
		chckbxClipboard.setEnabled(false);
		panelUsuarios.add(chckbxClipboard, "cell 1 1");
		
		lblGruposAlCrear = new JLabel("---------------------Grupos al Crear Usuario------------------");
		panelUsuarios.add(lblGruposAlCrear, "cell 0 2 2 1,alignx left");
		
		lblGrupoPrincipal = new JLabel("Grupo Principal");
		panelUsuarios.add(lblGrupoPrincipal, "cell 0 3,alignx trailing");
		
		textFieldGrupoPrincipal = new JTextField();
		panelUsuarios.add(textFieldGrupoPrincipal, "cell 1 3,growx");
		textFieldGrupoPrincipal.setColumns(10);
		
		lblGrupoExtra = new JLabel("Grupo Extra");
		panelUsuarios.add(lblGrupoExtra, "cell 0 4,alignx trailing");
		
		textFieldGrupoExtra = new JTextField();
		textFieldGrupoExtra.setToolTipText("Se anade 1 a 1, NO Multiple");
		panelUsuarios.add(textFieldGrupoExtra, "cell 1 4,growx");
		textFieldGrupoExtra.setColumns(10);
		
		JLabel lblmostrarUsuarios = new JLabel("-----------------------Mostrar Usuarios------------------");
		panelUsuarios.add(lblmostrarUsuarios, "cell 0 5 2 1");
		
		chckbxUsuarioActual = new JCheckBox("Usuario Actual");
		panelUsuarios.add(chckbxUsuarioActual, "cell 0 6");
		
		chckbxGrupoActual = new JCheckBox("Grupo Actual");
		panelUsuarios.add(chckbxGrupoActual, "cell 1 6");
		
		chckbxNombreUsuarioActual = new JCheckBox("Nombre Usuario Actual");
		panelUsuarios.add(chckbxNombreUsuarioActual, "cell 0 7");
		
		chckbxValores = new JCheckBox("Valores");
		panelUsuarios.add(chckbxValores, "cell 1 7");
		panelUsuarios.add(btnAdduser, "flowx,cell 0 8");
		
		btnLohindefsInfo = new JButton("login.defs info");
		btnLohindefsInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + " cat /etc/login.defs"; 
				
				//cat /etc/login.defs				
				//grep -Ev \'^#|^$\' /etc/login.defs
				
				textFieldComandoUsuarios.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
								
				textAreaUsuarios.setText(sOutput);
			}
		});
		panelUsuarios.add(btnLohindefsInfo, "cell 1 9");
		
		textFieldComandoUsuarios = new JTextField();
		textFieldComandoUsuarios.setText("Comando Actual");
		textFieldComandoUsuarios.setFont(new Font("Dialog", Font.BOLD, 16));
		panelUsuarios.add(textFieldComandoUsuarios, "cell 0 10 2 1,growx");
		textFieldComandoUsuarios.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		panelUsuarios.add(scrollPane, "cell 0 11 2 1,grow");
		
		textAreaUsuarios = new JTextArea();
		scrollPane.setViewportView(textAreaUsuarios);
		
		btnPass = new JButton("passwd");
		btnPass.setToolTipText("Cambiar clave");
		btnPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + " passwd"; 
				
				command=command + " "+ textFieldUsuario.getText();				
				
				textFieldComandoUsuarios.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
								
				textAreaUsuarios.setText(sOutput);
			}
		});
		panelUsuarios.add(btnPass, "cell 1 8");
		
		JButton btnUserdel = new JButton("userdel");
		btnUserdel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + " 'userdel -r"; //GKSUDO_PIPE,SUDO_CLAVE
				
				//command = "userdel -r";
								
				//SE CONFUNDE PARAMETROS DE gksudo con userdel (-r)
				//String command = Constantes.GKSUDO + " userdel -r";
				
				command=command + " "+ textFieldUsuario.getText();				
				
				command=command + "'";
				
			    if(!chckbxClipboard.isSelected()) {
			    	
			    	textFieldComandoUsuarios.setText(command);
			    	
			    	String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
					
					//String sOutput = Comando.executeCommandsWithReturn(new String[]{"bash","-c",Constantes.GKSUDO+" -m 'aaa' -p",command},UsuariosGruposJFrame.this);					
					
					textAreaUsuarios.setText(sOutput);
					
			    } else {
			    	
			    	Comando.GuardarPortaPapeles(command);
			    	
			    	/*
			    	ClipboardRunnable clipboardRunnable = new ClipboardRunnable(command);
				    Thread thread = new Thread(clipboardRunnable);
				    thread.start();
				    */			    						
			    }			    			
			}
		});
		
		btnUseradd_1 = new JButton("useradd");
		btnUseradd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = Constantes.GKSUDO + " 'useradd"; 
				
				command=command + " -m "+ textFieldUsuario.getText();				
				
				if(!textFieldGrupoPrincipal.getText().equals("")){
					command=command + " -g "+ textFieldGrupoPrincipal.getText();			
				}
				
				if(!textFieldGrupoExtra.getText().equals("")){
					command=command + " -G "+ textFieldGrupoExtra.getText();			
				}
				
				command=command + "'";
				
				textFieldComandoUsuarios.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
								
				textAreaUsuarios.setText(sOutput);
			}
		});
		panelUsuarios.add(btnUseradd_1, "cell 0 8");
		panelUsuarios.add(btnUserdel, "cell 0 8");
		
		btnAddGrupoExtra = new JButton("add Grupo Extra");
		btnAddGrupoExtra.setToolTipText("Se anade 1 a 1, NO Multiple");
		btnAddGrupoExtra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + " 'adduser"; 
				
				command=command + " "+ textFieldUsuario.getText();				
				
				if(!textFieldGrupoExtra.getText().equals("")){
					command=command + " --add_extra_groups "+ textFieldGrupoExtra.getText();			
				}
				
				command=command + "'";
				
				textFieldComandoUsuarios.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
								
				textAreaUsuarios.setText(sOutput);
			}
		});
		panelUsuarios.add(btnAddGrupoExtra, "flowx,cell 0 9");
		
		JButton btnId = new JButton("id");
		btnId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "id"; 
				
				//command=command + " "+ textFieldUsuario.getText();				
				
				if(chckbxUsuarioActual.isSelected()) {
					command=command + " -u";
				}
				
				if(chckbxGrupoActual.isSelected()) {
					command=command + " -g";
				}

				if(chckbxNombreUsuarioActual.isSelected()) {
					command=command + " -n -u";
				}

				if(chckbxValores.isSelected()) {
					command=command + " -G";
				}

				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
								
				textAreaUsuarios.setText(sOutput);
			}
		});
		panelUsuarios.add(btnId, "cell 0 9");
		
		btnUseraddInfo = new JButton("useradd info");
		btnUseraddInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + " useradd -D"; 
				
				//command=command + " "+ textFieldUsuario.getText();				
				
				textFieldComandoUsuarios.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
								
				textAreaUsuarios.setText(sOutput);
			}
		});
		panelUsuarios.add(btnUseraddInfo, "cell 0 9");
		
		panelInfo = new JPanel();
		tabbedPane.addTab("Info", null, panelInfo, null);
		panelInfo.setLayout(new MigLayout("", "[][grow]", "[][][][][][][][][grow]"));
		
		lblUsuario_1 = new JLabel("Usuario");
		panelInfo.add(lblUsuario_1, "cell 0 0,alignx trailing");
		
		textFieldUsuarioInfo = new JTextField();
		panelInfo.add(textFieldUsuarioInfo, "cell 1 0,growx");
		textFieldUsuarioInfo.setColumns(10);
		
		btnWhoAmI = new JButton("who am i");
		btnWhoAmI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "whoami";
										
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaInfo.setText(sOutput);
			}			
		});
		
		lblGrupo_2 = new JLabel("Grupo");
		panelInfo.add(lblGrupo_2, "cell 0 1,alignx trailing");
		
		textFieldGrupoInfo = new JTextField();
		panelInfo.add(textFieldGrupoInfo, "cell 1 1,growx");
		textFieldGrupoInfo.setColumns(10);
		
		lblWho = new JLabel("WHO");
		panelInfo.add(lblWho, "cell 0 2,alignx center");
		
		chckbxTodos = new JCheckBox("Todos");
		panelInfo.add(chckbxTodos, "cell 1 3");
		
		panelInfo.add(btnWhoAmI, "flowx,cell 0 4");
		
		btnGroups = new JButton("groups");
		btnGroups.setToolTipText("Puede varios usuarios separados por espacios");
		btnGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "groups";
				
				command =command + " "+textFieldUsuarioInfo.getText();
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaInfo.setText(sOutput);
			}
		});
		
		btnUsers = new JButton("users");
		btnUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "users";
				
				command =command + " "+textFieldUsuarioInfo.getText();
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnUsers, "flowx,cell 1 4");
		
		btnPwck = new JButton("pwck");
		btnPwck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command =Constantes.GKSUDO+ " 'pwck' ";
				
				command =command + " "+textFieldUsuarioInfo.getText();
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaInfo.setText(sOutput);
			}
		});
		btnPwck.setToolTipText("Integridad");
		panelInfo.add(btnPwck, "cell 1 4");
		panelInfo.add(btnGroups, "cell 1 4");
		
		btnPasswords = new JButton("Passwords");
		btnPasswords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "cat /etc/passwd";//"pwck";
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnPasswords, "flowx,cell 0 5");
		
		btnListaGrupos = new JButton("etc Grupos");
		btnListaGrupos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "cat /etc/group";//"grpck";
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnListaGrupos, "flowx,cell 1 5");
		
		btnCatGroup = new JButton("cat group");
		btnCatGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "cat /etc/group | grep "+textFieldGrupoInfo.getText();//"grpck";
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaInfo.setText(sOutput);
			}
		});
		
		btnLoginHistory = new JButton("Login History");
		btnLoginHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "last";
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnLoginHistory, "cell 0 6");
		panelInfo.add(btnCatGroup, "cell 1 6");
		
		textFieldComandoInfo = new JTextField();
		panelInfo.add(textFieldComandoInfo, "cell 0 7 2 1,growx");
		textFieldComandoInfo.setColumns(10);
		
		scrollPane_2 = new JScrollPane();
		panelInfo.add(scrollPane_2, "cell 0 8 2 1,grow");
		
		textAreaInfo = new JTextArea();
		scrollPane_2.setViewportView(textAreaInfo);
		
		btnW = new JButton("w");
		btnW.setToolTipText("Que hacen los usuarios");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "w";
				
				command =command + " " + textFieldUsuarioInfo.getText(); 
						
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnW, "cell 1 4");
		
		btnId_1 = new JButton("id");
		btnId_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "id";
				
				command =command + " " + textFieldUsuarioInfo.getText(); 
						
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnId_1, "cell 1 4");
		
		btnLogname = new JButton("logname");
		btnLogname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "logname";
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnLogname, "cell 1 4");
		
		btnFinger = new JButton("finger");
		btnFinger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "finger";
				
				command = command + " " +textFieldUsuarioInfo.getText();
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaInfo.setText(sOutput);
			}
		});
		
		btnEtcGroup = new JButton("grep etc group");
		btnEtcGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "grep "+textFieldGrupoInfo.getText()+" /etc/group";
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnEtcGroup, "cell 1 5");
		
		btnGetentGroup = new JButton("getent group");
		btnGetentGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "getent group "+textFieldGrupoInfo.getText()+"";
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnGetentGroup, "cell 1 5");
		panelInfo.add(btnFinger, "cell 1 5");
		
		btnWho = new JButton("who");
		btnWho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "who";
				
				if(chckbxTodos.isSelected()) {
					command = command + " -a";
				}
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnWho, "cell 0 4");
		
		btnLast = new JButton("last");
		btnLast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "last";
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnLast, "cell 1 5");
		
		btnGetent = new JButton("getent");
		btnGetent.setToolTipText("Busqueda con nombre usuario");
		btnGetent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "getent passwd";
				
				command=command +" " +textFieldUsuarioInfo.getText();
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnGetent, "cell 0 5");
		
		panelGrupos = new JPanel();
		tabbedPane.addTab("Grupos", null, panelGrupos, null);
		panelGrupos.setLayout(new MigLayout("", "[][grow]", "[][][][][][][][grow]"));
		
		lblNombreGrupo = new JLabel("Nombre Grupo/s");
		panelGrupos.add(lblNombreGrupo, "cell 0 0,alignx trailing");
		
		textFieldNombreGrupo = new JTextField();
		textFieldNombreGrupo.setToolTipText("Grupos Separados por comas x");
		panelGrupos.add(textFieldNombreGrupo, "cell 1 0,growx");
		textFieldNombreGrupo.setColumns(10);
		
		btnAddgroup = new JButton("addgroup");
		btnAddgroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + " addgroup"; 
				
				command=command + " "+ textFieldNombreGrupo.getText();				
				
				textFieldComandoGrupos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
								
				textAreaGrupos.setText(sOutput);
			}
		});
		
		lblUsuarioGrupo = new JLabel("Usuario Grupo");
		panelGrupos.add(lblUsuarioGrupo, "cell 0 1,alignx trailing");
		
		textFieldUsuarioGrupo = new JTextField();
		panelGrupos.add(textFieldUsuarioGrupo, "cell 1 1,growx");
		textFieldUsuarioGrupo.setColumns(10);
		
		lblGroupmod = new JLabel("GROUPMOD");
		panelGrupos.add(lblGroupmod, "cell 0 2");
		
		lblNombreGrupoNuevo = new JLabel("Nombre Grupo Nuevo");
		panelGrupos.add(lblNombreGrupoNuevo, "cell 0 3,alignx trailing");
		
		textFieldNombreGrupoNuevo = new JTextField();
		panelGrupos.add(textFieldNombreGrupoNuevo, "cell 1 3,growx");
		textFieldNombreGrupoNuevo.setColumns(10);
		panelGrupos.add(btnAddgroup, "flowx,cell 0 4");
		
		btnGroupmod = new JButton("groupmod");
		btnGroupmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = Constantes.GKSUDO + " 'groupmod -n"; 
				
				command=command + " "+ textFieldNombreGrupoNuevo.getText();								
				command=command + " "+ textFieldNombreGrupo.getText();				
				command=command + "'";
				
				textFieldComandoGrupos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
								
				textAreaGrupos.setText(sOutput);
			}
		});
		
		btnGroupadd_1 = new JButton("groupadd");
		btnGroupadd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + " groupadd"; 
				
				command=command + " "+ textFieldNombreGrupo.getText();				
				
				textFieldComandoGrupos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
								
				textAreaGrupos.setText(sOutput);
			}
		});
		panelGrupos.add(btnGroupadd_1, "flowx,cell 0 5");
		btnGroupmod.setToolTipText("Cambia Definicion");
		panelGrupos.add(btnGroupmod, "cell 0 5");
		
		btnGroups_1 = new JButton("groups");
		btnGroups_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "groups";
				
				command =command + " "+textFieldUsuarioGrupo.getText();
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaGrupos.setText(sOutput);
			}
		});
		panelGrupos.add(btnGroups_1, "flowx,cell 1 5");
		
		textFieldComandoGrupos = new JTextField();
		textFieldComandoGrupos.setText("Comando Actual");
		textFieldComandoGrupos.setFont(new Font("Dialog", Font.BOLD, 14));
		panelGrupos.add(textFieldComandoGrupos, "cell 0 6 2 1,growx");
		textFieldComandoGrupos.setColumns(10);
		
		scrollPane_3 = new JScrollPane();
		panelGrupos.add(scrollPane_3, "cell 0 7 2 1,grow");
		
		textAreaGrupos = new JTextArea();
		scrollPane_3.setViewportView(textAreaGrupos);
		
		btnUsuarioGrupo = new JButton("Usuario Grupo");
		btnUsuarioGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO_PIPE + " usermod -a -G";
				
				command=command + " "+ textFieldNombreGrupo.getText();				
				
				command=command + " "+ textFieldUsuarioGrupo.getText();
				
				textFieldComandoGrupos.setText(command);
			    	
			    String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
										
				textAreaGrupos.setText(sOutput);				
			}
		});
		panelGrupos.add(btnUsuarioGrupo, "flowx,cell 1 4");
		
		btnGroupdel = new JButton("groupdel");
		btnGroupdel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = Constantes.GKSUDO + " groupdel"; 
				
				command=command + " "+ textFieldNombreGrupo.getText();				
				
				textFieldComandoGrupos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
								
				textAreaGrupos.setText(sOutput);
			}
		});
		panelGrupos.add(btnGroupdel, "cell 0 4");
		
		btnQuitarUsuarioGrupo = new JButton("Quitar Usuario Grupo");
		btnQuitarUsuarioGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO_PIPE + " gpasswd -d";
				
				command=command + " "+ textFieldUsuarioGrupo.getText();
				
				command=command + " "+ textFieldNombreGrupo.getText();				
								
				textFieldComandoGrupos.setText(command);
			    	
			    String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
										
				textAreaGrupos.setText(sOutput);	
			}
		});
		panelGrupos.add(btnQuitarUsuarioGrupo, "cell 1 4");
		
		btnNewgrp = new JButton("newgrp");
		btnNewgrp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + " newgrp"; 
				
				command=command + " "+ textFieldNombreGrupo.getText();				
				
				textFieldComandoGrupos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
								
				textAreaGrupos.setText(sOutput);
			}
		});
		btnNewgrp.setToolTipText("CAmbiar grupo primario");
		panelGrupos.add(btnNewgrp, "cell 1 5");
		
		btnId_3 = new JButton("id");
		btnId_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "id";
				
				command =command + " " + textFieldUsuarioInfo.getText(); 
						
				textFieldComandoGrupos.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);

				textAreaGrupos.setText(sOutput);
			}
		});
		panelGrupos.add(btnId_3, "cell 1 5");
		
		JPanel panelPermisos = new JPanel();
		tabbedPane.addTab("Permisos", null, panelPermisos, null);
		panelPermisos.setLayout(new MigLayout("", "[grow][grow]", "[][][][][][][][][][][][][][][grow]"));
		
		JLabel lblPathArchivo = new JLabel("Path Archivo");
		panelPermisos.add(lblPathArchivo, "cell 0 0,alignx trailing");
		
		textFieldPathArchivo = new JTextField();
		panelPermisos.add(textFieldPathArchivo, "cell 1 0,alignx left");
		textFieldPathArchivo.setColumns(35);
		
		JLabel lblPathCarpeta = new JLabel("Path Carpeta");
		panelPermisos.add(lblPathCarpeta, "cell 0 1,alignx trailing");
		
		textFieldPathCarpeta = new JTextField();
		panelPermisos.add(textFieldPathCarpeta, "cell 1 1,alignx left");
		textFieldPathCarpeta.setColumns(35);
		
		JLabel lblUsuario = new JLabel("Usuario");
		panelPermisos.add(lblUsuario, "cell 0 2,alignx trailing");
		
		textFieldUsuarioPermisos = new JTextField();
		panelPermisos.add(textFieldUsuarioPermisos, "cell 1 2,alignx left");
		textFieldUsuarioPermisos.setColumns(25);
		
		JLabel lblGrupo = new JLabel("Grupo");
		panelPermisos.add(lblGrupo, "cell 0 3,alignx trailing");
		
		textFieldGrupoPermisos = new JTextField();
		panelPermisos.add(textFieldGrupoPermisos, "cell 1 3,alignx left");
		textFieldGrupoPermisos.setColumns(25);
		
		chckbxAplicarCarpeta = new JCheckBox("Aplicar a Carpeta");
		panelPermisos.add(chckbxAplicarCarpeta, "flowx,cell 1 4");
		
		chckbxRecursivo = new JCheckBox("Recursivo");
		chckbxRecursivo.setToolTipText("(-R) Se aplica a subdirectorios y archivos");
		panelPermisos.add(chckbxRecursivo, "cell 1 5");
		
		JLabel lblpermisos = new JLabel("------------------------PERMISOS-----------------------");
		panelPermisos.add(lblpermisos, "cell 0 6 2 1");
		
		chckbxUsarMetodoSimbolicoPermisos = new JCheckBox("Usar Metodo Simbolico");
		panelPermisos.add(chckbxUsarMetodoSimbolicoPermisos, "flowx,cell 1 7");
		
		JLabel lblDueo = new JLabel("DUEÑO");
		panelPermisos.add(lblDueo, "cell 0 8");
		
		chckbxDuenoLectura = new JCheckBox("Lectura");
		panelPermisos.add(chckbxDuenoLectura, "flowx,cell 1 8");
		
		JLabel lblGrupo_1 = new JLabel("GRUPO");
		panelPermisos.add(lblGrupo_1, "cell 0 9");
		
		chckbxGrupoLectura = new JCheckBox("Lectura");
		panelPermisos.add(chckbxGrupoLectura, "flowx,cell 1 9");
		
		JLabel lblOtros = new JLabel("OTROS");
		panelPermisos.add(lblOtros, "cell 0 10");
		
		chckbxOtrosLectura = new JCheckBox("Lectura");
		panelPermisos.add(chckbxOtrosLectura, "flowx,cell 1 10");
		
		JButton btnChmod = new JButton("chmod");
		btnChmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "chmod ";//sudo  
				
				if(!chckbxUsarMetodoSimbolicoPermisos.isSelected()) {
					
					Integer iPermisosDueno=0;
					Integer iPermisosGrupo=0;
					Integer iPermisosOtros=0;
					
					if(chckbxAplicarCarpeta.isSelected()) {
						command=command + " -R";
					}
					
					//command=command + " "+ textFieldGrupoPermisos.getText();				
					
					
					/*DUENO*/
					if(chckbxDuenoLectura.isSelected()) {
						iPermisosDueno+=4;
					}
					
					if(chckbxDuenoEscritura.isSelected()) {
						iPermisosDueno+=2;
					}
					
					if(chckbxDuenoEjecusion.isSelected()) {
						iPermisosDueno+=1;
					}
					/*DUENO_FIN*/
					
					/*DUENO*/
					if(chckbxGrupoLectura.isSelected()) {
						iPermisosGrupo+=4;
					}
					
					if(chckbxGrupoEscritura.isSelected()) {
						iPermisosGrupo+=2;
					}
					
					if(chckbxGrupoEjecusion.isSelected()) {
						iPermisosGrupo+=1;
					}
					/*DUENO_FIN*/
					
					
					/*OTROS*/
					if(chckbxOtrosLectura.isSelected()) {
						iPermisosOtros+=4;
					}
					
					if(chckbxOtrosEscritura.isSelected()) {
						iPermisosOtros+=2;
					}
					
					if(chckbxOtrosEjecusion.isSelected()) {
						iPermisosOtros+=1;
					}
					/*OTROS_FIN*/
					
					
					command=command + " "+ iPermisosDueno + iPermisosGrupo + iPermisosOtros;	
					
					
					if(!chckbxAplicarCarpeta.isSelected()) {
						command=command + " "+ textFieldPathArchivo.getText();
						
					} else {
						command=command + " "+ textFieldPathCarpeta.getText();
					}
					
						
					textFieldComandoPermisos.setText(command);
													
					Comando.executeCommand(command,UsuariosGruposJFrame.this);
									
					
					UsuariosGruposJFrame.this.mostrarPermisos();
					
					
					/*
					String commandLs = "ls -l "; 
					
					if(!chckbxAplicarCarpeta.isSelected()) {
						commandLs=commandLs + " "+ textFieldPathArchivo.getText();
						
					} else {
						commandLs=commandLs + " -d";
						
						commandLs=commandLs + " "+ textFieldPathCarpeta.getText();
					}
					
					String sOutputLs = Comando.executeCommandWithReturn(commandLs,UsuariosGruposJFrame.this,false);
					
					textAreaPermisos.setText(sOutputLs);
					*/
					
				} else {
													
					if(!chckbxMetodoSimbolicoResumenPermisos.isSelected()) {												
						if(chckbxAplicarCarpeta.isSelected()) {
							command=command + " -R";
						}
						
						
						//PERMISOS DUENO
						String sPermisoDueno="";
						String sPermisoDuenoSi="";
						String sPermisoDuenoNo="";
						
						if(chckbxDuenoLectura.isSelected()) {
							sPermisoDuenoSi+="r";
							
						} else {
							sPermisoDuenoNo+="r";
						}
						
						if(chckbxDuenoEscritura.isSelected()) {
							sPermisoDuenoSi+="w";
							
						} else {
							sPermisoDuenoNo+="w";
						}
						
						if(chckbxDuenoEjecusion.isSelected()) {
							sPermisoDuenoSi+="x";
							
						} else {
							sPermisoDuenoNo+="x";
						}
						
						
						
						if(!sPermisoDuenoSi.equals("")) {
							sPermisoDuenoSi="+"+sPermisoDuenoSi;
						}
						
						if(!sPermisoDuenoNo.equals("")) {
							sPermisoDuenoNo="-"+sPermisoDuenoNo;
						}
						
						sPermisoDueno=command + " u" + sPermisoDuenoSi + sPermisoDuenoNo;
						
						if(!chckbxAplicarCarpeta.isSelected()) {
							sPermisoDueno=sPermisoDueno + " "+ textFieldPathArchivo.getText();
							
						} else {
							sPermisoDueno=sPermisoDueno + " "+ textFieldPathCarpeta.getText();
						}
						
													
						textFieldComandoPermisos.setText(sPermisoDueno);
						
						Comando.executeCommand(sPermisoDueno,UsuariosGruposJFrame.this);
																
						UsuariosGruposJFrame.this.mostrarPermisos();
						
						//PERMISOS DUENO
						
						
						
						//PERMISOS GRUPO
						String sPermisoGrupo="";
						String sPermisoGrupoSi="";
						String sPermisoGrupoNo="";
						
						if(chckbxGrupoLectura.isSelected()) {
							sPermisoGrupoSi+="r";
							
						} else {
							sPermisoGrupoNo+="r";
						}
						
						if(chckbxGrupoEscritura.isSelected()) {
							sPermisoGrupoSi+="w";
							
						} else {
							sPermisoGrupoNo+="w";
						}
						
						if(chckbxGrupoEjecusion.isSelected()) {
							sPermisoGrupoSi+="x";
							
						} else {
							sPermisoGrupoNo+="x";
						}
						
						
						
						if(!sPermisoGrupoSi.equals("")) {
							sPermisoGrupoSi="+"+sPermisoGrupoSi;
						}
						
						if(!sPermisoGrupoNo.equals("")) {
							sPermisoGrupoNo="-"+sPermisoGrupoNo;
						}
						
						sPermisoGrupo=command + " g" + sPermisoGrupoSi + sPermisoGrupoNo;
						
						if(!chckbxAplicarCarpeta.isSelected()) {
							sPermisoGrupo=sPermisoGrupo + " "+ textFieldPathArchivo.getText();
							
						} else {
							sPermisoGrupo=sPermisoGrupo + " "+ textFieldPathCarpeta.getText();
						}
						
												
						textFieldComandoPermisos.setText(sPermisoGrupo);
						
						Comando.executeCommand(sPermisoGrupo,UsuariosGruposJFrame.this);
																
						UsuariosGruposJFrame.this.mostrarPermisos();
						
						//PERMISOS GRUPO
						
						
						
						
						//PERMISOS OTROS
						String sPermisoOtros="";
						String sPermisoOtrosSi="";
						String sPermisoOtrosNo="";
						
						if(chckbxOtrosLectura.isSelected()) {
							sPermisoOtrosSi+="r";
							
						} else {
							sPermisoOtrosNo+="r";
						}
						
						if(chckbxOtrosEscritura.isSelected()) {
							sPermisoOtrosSi+="w";
							
						} else {
							sPermisoOtrosNo+="w";
						}
						
						if(chckbxOtrosEjecusion.isSelected()) {
							sPermisoOtrosSi+="x";
							
						} else {
							sPermisoOtrosNo+="x";
						}
						
						
						
						if(!sPermisoOtrosSi.equals("")) {
							sPermisoOtrosSi="+"+sPermisoOtrosSi;
						}
						
						if(!sPermisoOtrosNo.equals("")) {
							sPermisoOtrosNo="-"+sPermisoOtrosNo;
						}
						
						sPermisoOtros=command + " o" + sPermisoOtrosSi + sPermisoOtrosNo;
						
						if(!chckbxAplicarCarpeta.isSelected()) {
							sPermisoOtros=sPermisoOtros + " "+ textFieldPathArchivo.getText();
							
						} else {
							sPermisoOtros=sPermisoOtros + " "+ textFieldPathCarpeta.getText();
						}
						
						
						textFieldComandoPermisos.setText(sPermisoOtros);
						
						Comando.executeCommand(sPermisoOtros,UsuariosGruposJFrame.this);
																
						UsuariosGruposJFrame.this.mostrarPermisos();
						
						//PERMISOS GRUPO
						
						
						
					} else {
						
						String sCommandGeneral=command;
						
						if(chckbxAplicarCarpeta.isSelected()) {
							sCommandGeneral=command + " -R";
						}
						
						//TODOS LOS PERMISOS
						if(chckbxDuenoLectura.isSelected() && chckbxGrupoLectura.isSelected() && chckbxOtrosLectura.isSelected()
						&& chckbxDuenoEscritura.isSelected() &&	chckbxGrupoEscritura.isSelected() && chckbxOtrosEscritura.isSelected()
						&& chckbxDuenoEjecusion.isSelected() && chckbxGrupoEjecusion.isSelected() && chckbxOtrosEjecusion.isSelected()
						) {
							sCommandGeneral=sCommandGeneral + " +rwx";
							
						} else if(!chckbxDuenoLectura.isSelected() && !chckbxGrupoLectura.isSelected() && !chckbxOtrosLectura.isSelected()					
						       && !chckbxDuenoEscritura.isSelected() && !chckbxGrupoEscritura.isSelected() && !chckbxOtrosEscritura.isSelected()
							   && !chckbxDuenoEjecusion.isSelected() && !chckbxGrupoEjecusion.isSelected() && !chckbxOtrosEjecusion.isSelected()
						) {
							
							sCommandGeneral=sCommandGeneral + " -rwx";
								
						} else if(chckbxDuenoLectura.isSelected() && chckbxGrupoLectura.isSelected() && chckbxOtrosLectura.isSelected()
							   && !chckbxDuenoEscritura.isSelected() && !chckbxGrupoEscritura.isSelected() && !chckbxOtrosEscritura.isSelected()
							   && !chckbxDuenoEjecusion.isSelected() && !chckbxGrupoEjecusion.isSelected() && !chckbxOtrosEjecusion.isSelected()
						) {
							sCommandGeneral=sCommandGeneral + " +r";
							
						} else if(chckbxDuenoEscritura.isSelected() &&	chckbxGrupoEscritura.isSelected() && chckbxOtrosEscritura.isSelected()
								&& !chckbxDuenoLectura.isSelected() && !chckbxGrupoLectura.isSelected() && !chckbxOtrosLectura.isSelected()
							    && !chckbxDuenoEjecusion.isSelected() && !chckbxGrupoEjecusion.isSelected() && !chckbxOtrosEjecusion.isSelected()
						) {
							sCommandGeneral=sCommandGeneral + " +w";
						
						} else if(chckbxDuenoEjecusion.isSelected() && chckbxGrupoEjecusion.isSelected() && chckbxOtrosEjecusion.isSelected()
							   && !chckbxDuenoLectura.isSelected() && !chckbxGrupoLectura.isSelected() && !chckbxOtrosLectura.isSelected()					
						       && !chckbxDuenoEscritura.isSelected() && !chckbxGrupoEscritura.isSelected() && !chckbxOtrosEscritura.isSelected()
						) {       
							sCommandGeneral=sCommandGeneral + " +x";
						}
						
						
						if(!chckbxAplicarCarpeta.isSelected()) {
							sCommandGeneral=sCommandGeneral + " "+ textFieldPathArchivo.getText();
							
						} else {
							sCommandGeneral=sCommandGeneral + " "+ textFieldPathCarpeta.getText();
						}
						
						
						textFieldComandoPermisos.setText(sCommandGeneral);
																				
						Comando.executeCommand(sCommandGeneral,UsuariosGruposJFrame.this);
																
						UsuariosGruposJFrame.this.mostrarPermisos();
						
					}
				}
			}
		});
		panelPermisos.add(btnChmod, "flowx,cell 0 11");
		
		JButton btnChown = new JButton("chown");
		btnChown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = Constantes.GKSUDO + "'chown"; 
				
				if(chckbxAplicarCarpeta.isSelected()) {
					command=command + "";//-R
					
					if(chckbxRecursivo.isSelected()) {
						command=command + " -R";
					}
				}
								
				
				command=command + " "+ textFieldUsuarioPermisos.getText();				
				
				if(!chckbxAplicarCarpeta.isSelected()) {
					command=command + " "+ textFieldPathArchivo.getText();
					
				} else {
					command=command + " "+ textFieldPathCarpeta.getText();
				}
				
				command=command + "'";
				
				//Comando.executeCommand(command,UsuariosGruposJFrame.this);
				
				textFieldComandoPermisos.setText(command);
				
				Comando.executeCommand(command,UsuariosGruposJFrame.this);
				
				
				UsuariosGruposJFrame.this.mostrarPermisos();
				
				/*
				String commandLs = "ls -l "; 
				
				if(!chckbxAplicarCarpeta.isSelected()) {
					commandLs=commandLs + " "+ textFieldPathArchivo.getText();
					
				} else {
					commandLs=commandLs + " "+ textFieldPathCarpeta.getText();
				}
				
				String sOutputLs = Comando.executeCommandWithReturn(commandLs,UsuariosGruposJFrame.this,false);
				
				textAreaPermisos.setText(sOutputLs);
				*/
			}
		});
		panelPermisos.add(btnChown, "flowx,cell 1 11");
		
		JButton btnChgrp = new JButton("chgrp");
		btnChgrp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = Constantes.GKSUDO+"'chgrp"; 
				
				if(chckbxAplicarCarpeta.isSelected()) {
					//command=command + " -R";
					
					if(chckbxRecursivo.isSelected()) {
						command=command + " -R";
					}
				}
				
				
				command=command + " "+ textFieldGrupoPermisos.getText();				
				
				if(!chckbxAplicarCarpeta.isSelected()) {
					command=command + " "+ textFieldPathArchivo.getText();
					
				} else {
					command=command + " "+ textFieldPathCarpeta.getText();
				}
				
				command=command + "'";
												
				textFieldComandoPermisos.setText(command);
				
				Comando.executeCommand(command,UsuariosGruposJFrame.this);
								
				
				
				UsuariosGruposJFrame.this.mostrarPermisos();
				
				/*
				String commandLs = "ls -l "; 
				
				if(!chckbxAplicarCarpeta.isSelected()) {
					commandLs=commandLs + " "+ textFieldPathArchivo.getText();
					
				} else {
					commandLs=commandLs + " "+ textFieldPathCarpeta.getText();
				}
				
				String sOutputLs = Comando.executeCommandWithReturn(commandLs,UsuariosGruposJFrame.this,false);
				
				textAreaPermisos.setText(sOutputLs);
				*/
			}
		});
		panelPermisos.add(btnChgrp, "cell 1 11");
		
		lblPermisos_1 = new JLabel("PERMISOS");
		panelPermisos.add(lblPermisos_1, "cell 0 12");
		
		JButton btnVerPermisos = new JButton("Ver Permisos");
		btnVerPermisos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UsuariosGruposJFrame.this.mostrarPermisos();
				
				/*
				String command = "ls -l "; 
				
				if(!chckbxAplicarCarpeta.isSelected()) {
					command=command + " " + textFieldPathArchivo.getText();
					
				} else {			
					command=command + " -d";
					command=command + " "+ textFieldPathCarpeta.getText();
				}
				
				String sOutputLs = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
				
				textAreaPermisos.setText(sOutputLs);
				*/
			}
		});
		panelPermisos.add(btnVerPermisos, "flowx,cell 1 12");
		
		textFieldComandoPermisos = new JTextField();
		panelPermisos.add(textFieldComandoPermisos, "cell 0 13 2 1,growx");
		textFieldComandoPermisos.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panelPermisos.add(scrollPane_1, "cell 0 14 2 1,grow");
		
		textAreaPermisos = new JTextArea();
		scrollPane_1.setViewportView(textAreaPermisos);
		
		chckbxDuenoEscritura = new JCheckBox("Escritura");
		panelPermisos.add(chckbxDuenoEscritura, "cell 1 8");
		
		chckbxDuenoEjecusion = new JCheckBox("Ejecusion");
		panelPermisos.add(chckbxDuenoEjecusion, "cell 1 8");
		
		chckbxGrupoEscritura = new JCheckBox("Escritura");
		panelPermisos.add(chckbxGrupoEscritura, "cell 1 9");
		
		chckbxGrupoEjecusion = new JCheckBox("Ejecusion");
		panelPermisos.add(chckbxGrupoEjecusion, "cell 1 9");
		
		chckbxOtrosEscritura = new JCheckBox("Escritura");
		panelPermisos.add(chckbxOtrosEscritura, "cell 1 10");
		
		chckbxOtrosEjecusion = new JCheckBox("Ejecusion");
		panelPermisos.add(chckbxOtrosEjecusion, "cell 1 10");
		
		chckbxMetodoSimbolicoResumenPermisos = new JCheckBox("Metodo Simbolico Resumen");
		panelPermisos.add(chckbxMetodoSimbolicoResumenPermisos, "cell 1 7");
		
		btnCarpeta = new JButton("Carpeta");
		btnCarpeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "ls -ldh "; 
				
						
				command=command + " "+ textFieldPathCarpeta.getText();
				
				textFieldComandoPermisos.setText(command);
				
				String sOutputLs = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
				
				textAreaPermisos.setText(sOutputLs);
			}
		});
		
		btnVerPermisosEspeciales = new JButton("Ver Permisos Especiales");
		btnVerPermisosEspeciales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarAtributos();
				
				/*
				String command = "lsattr "; 
				
				if(!chckbxAplicarCarpeta.isSelected()) {
					command=command + " " + textFieldPathArchivo.getText();
					
				} else {			
					//command=command + " -d";
					command=command + " "+ textFieldPathCarpeta.getText();
				}
				
				String sOutputLs = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
				
				textAreaPermisos.setText(sOutputLs);
				*/
			}
		});
		panelPermisos.add(btnVerPermisosEspeciales, "cell 1 12");
		
		btnStat = new JButton("stat");
		btnStat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "stat "; 
				
				if(!chckbxAplicarCarpeta.isSelected()) {
					command=command + " " + textFieldPathArchivo.getText();
					
				} else {			
					//command=command + "";
					command=command + " "+ textFieldPathCarpeta.getText();
				}
				
				textFieldComandoPermisos.setText(command);
				
				String sOutputLs = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
				
				textAreaPermisos.setText(sOutputLs);
			}
		});
		panelPermisos.add(btnStat, "cell 1 12");
		
		btnUmask_1 = new JButton("umask");
		btnUmask_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "umask "; 
								
				
				textFieldComandoPermisos.setText(command);
				
				String sOutputLs = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
				
				textAreaPermisos.setText(sOutputLs);
			}
		});
		panelPermisos.add(btnUmask_1, "cell 1 12");
		panelPermisos.add(btnCarpeta, "cell 1 12");
		
		btnArchivo = new JButton("Archivo");
		btnArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "ls -lht "; 
				
				
				command=command + " "+ textFieldPathArchivo.getText();
				
				textFieldComandoPermisos.setText(command);
				
				String sOutputLs = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
				
				textAreaPermisos.setText(sOutputLs);
			}
		});
		panelPermisos.add(btnArchivo, "cell 1 12");
		
		panelPermisosEspeciales = new JPanel();
		tabbedPane.addTab("Permisos Especiales", null, panelPermisosEspeciales, null);
		panelPermisosEspeciales.setLayout(new MigLayout("", "[][grow]", "[][][][][][][][][][][grow]"));
		
		lblPathArchivo_1 = new JLabel("Path Archivo");
		panelPermisosEspeciales.add(lblPathArchivo_1, "cell 0 0,alignx trailing");
		
		textFieldPathArchivoAtributos = new JTextField();
		textFieldPathArchivoAtributos.setText("/home/bydan/at");
		panelPermisosEspeciales.add(textFieldPathArchivoAtributos, "cell 1 0,growx");
		textFieldPathArchivoAtributos.setColumns(10);
		
		lblPathCarpeta_1 = new JLabel("Path Carpeta");
		panelPermisosEspeciales.add(lblPathCarpeta_1, "cell 0 1,alignx trailing");
		
		textFieldPathCarpetaAtributos = new JTextField();
		textFieldPathCarpetaAtributos.setText("/home/bydan");
		panelPermisosEspeciales.add(textFieldPathCarpetaAtributos, "cell 1 1,growx");
		textFieldPathCarpetaAtributos.setColumns(10);
		
		btnMostrarAtributos = new JButton("Ver Atributos");
		btnMostrarAtributos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "lsattr "; 
				
				if(!chckbxAplicarCarpetaAtributos.isSelected()) {
					command=command + " " + textFieldPathArchivoAtributos.getText();
					
				} else {			
					//command=command + " -d";
					command=command + " "+ textFieldPathCarpetaAtributos.getText();
				}
				
				textFieldComandoAtributos.setText(command);
				
				String sOutputLs = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
				
				textAreaAtributos.setText(sOutputLs);
			}
		});
		
		chckbxAplicarCarpetaAtributos = new JCheckBox("Aplicar CArpeta");
		panelPermisosEspeciales.add(chckbxAplicarCarpetaAtributos, "cell 1 2");
		
		chckbxRecursivoAtributos = new JCheckBox("Recursivo ");
		panelPermisosEspeciales.add(chckbxRecursivoAtributos, "cell 1 3");
		
		chckbxConQuitarAtributos = new JCheckBox("Con Quitar Atributos");
		panelPermisosEspeciales.add(chckbxConQuitarAtributos, "cell 1 4");
		panelPermisosEspeciales.add(btnMostrarAtributos, "cell 1 5");
		
		chckbxAccessTime = new JCheckBox("Access Time");
		panelPermisosEspeciales.add(chckbxAccessTime, "cell 0 6");
		
		chckbxNoRemover = new JCheckBox("No REmover");
		panelPermisosEspeciales.add(chckbxNoRemover, "flowx,cell 1 6");
		
		chckbxCompresion = new JCheckBox("Compresion");
		panelPermisosEspeciales.add(chckbxCompresion, "cell 1 6");
		
		chckbxCambiosDisco = new JCheckBox("Cambios Disco");
		panelPermisosEspeciales.add(chckbxCambiosDisco, "cell 1 6");
		
		chckbxBackup = new JCheckBox("Backup");
		panelPermisosEspeciales.add(chckbxBackup, "cell 0 7");
		
		chckbxIndexing = new JCheckBox("Indexing");
		panelPermisosEspeciales.add(chckbxIndexing, "flowx,cell 1 7");
		
		chckbxJournal = new JCheckBox("Journal");
		panelPermisosEspeciales.add(chckbxJournal, "cell 1 7");
		
		chckbxNoRecuperar = new JCheckBox("No Recuperar");
		panelPermisosEspeciales.add(chckbxNoRecuperar, "cell 1 7");
		
		chckbxRecuperable = new JCheckBox("Recuperable");
		panelPermisosEspeciales.add(chckbxRecuperable, "cell 1 7");
		
		btnChattr_1 = new JButton("chattr");
		btnChattr_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO+"'chattr"; 
				String sSimbolo="";
				
				if(chckbxAplicarCarpetaAtributos.isSelected()) {
					//command=command + " -R";
					
					if(chckbxRecursivoAtributos.isSelected()) {
						command=command + " -R";
					}
				}
								
				
				
				
				if(chckbxConQuitarAtributos.isSelected()) {
					sSimbolo="-";
					
				} else {
					sSimbolo="+";
				}
				
							
				if(chckbxAccessTime.isSelected()) {
					command=command + " "+sSimbolo+"A";
				}
				
				
				if(chckbxNoRemover.isSelected()) {
					command=command + " "+sSimbolo+"a";
				}
				
				if(chckbxCompresion.isSelected()) {
					command=command + " "+sSimbolo+"c";
				}
				
				if(chckbxCambiosDisco.isSelected()) {
					command=command + " "+sSimbolo+"D";
				}
				
				if(chckbxBackup.isSelected()) {
					command=command + " "+sSimbolo+"d";
				}
				
				if(chckbxIndexing.isSelected()) {
					command=command + " "+sSimbolo+"i";
				}
				
				if(chckbxJournal.isSelected()) {
					command=command + " "+sSimbolo+"j";
				}
				
				if(chckbxNoRecuperar.isSelected()) {
					command=command + " "+sSimbolo+"s";
				}
				
				if(chckbxRecuperable.isSelected()) {
					command=command + " "+sSimbolo+"u";
				}
				
				if(!chckbxAplicarCarpetaAtributos.isSelected()) {
					command=command + " "+ textFieldPathArchivoAtributos.getText();
					
				} else {
					command=command + " "+ textFieldPathCarpetaAtributos.getText();
				}
				
				
				command=command + "'";
				
				textFieldComandoAtributos.setText(command);
				
				Comando.executeCommand(command,UsuariosGruposJFrame.this);												
				
				
				mostrarAtributos();
				
				//btnMostrarAtributos.doClick();
				
				
			}
		});
		panelPermisosEspeciales.add(btnChattr_1, "cell 0 8");
		
		textFieldComandoAtributos = new JTextField();
		panelPermisosEspeciales.add(textFieldComandoAtributos, "cell 0 9 2 1,growx");
		textFieldComandoAtributos.setColumns(10);
		
		scrollPane_4 = new JScrollPane();
		panelPermisosEspeciales.add(scrollPane_4, "cell 0 10 2 1,grow");
		
		textAreaAtributos = new JTextArea();
		scrollPane_4.setViewportView(textAreaAtributos);
		
		panelEjemplos = new JPanel();
		tabbedPane.addTab("Ejemplos", null, panelEjemplos, null);
		panelEjemplos.setLayout(new MigLayout("", "[]", "[][][][][][][][][][][][][][][][][]"));
		
		lblPermisos = new JLabel("Permisos");
		panelEjemplos.add(lblPermisos, "cell 0 0");
		
		btnChmod_1 = new JButton("chmod");
		btnChmod_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("chmod", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("chmod");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnChmod_1, "cell 0 1");
		
		btnChown_1 = new JButton("chown");
		btnChown_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("chown", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("chown");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnChown_1, "cell 0 2");
		
		btnChattr = new JButton("chattr");
		btnChattr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("chattr", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("chattr");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnChattr, "cell 0 3");
		
		btnInfopermisos = new JButton("info-permisos");
		btnInfopermisos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("info-permisos", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("info-permisos");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnInfopermisos, "cell 0 4");
		
		btnInfogroups = new JButton("info-groups");
		btnInfogroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("info-groups", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("info-groups");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnInfogroups, "cell 0 5");
		
		lblUsuario_2 = new JLabel("Usuario");
		panelEjemplos.add(lblUsuario_2, "cell 0 6");
		
		btnUseradd = new JButton("useradd");
		btnUseradd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("useradd", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("useradd");
				
				ejemplosGeneralJFrame.show();
			}
		});
		
		btnId_2 = new JButton("id");
		btnId_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("id", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("id");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnId_2, "cell 0 7");
		panelEjemplos.add(btnUseradd, "cell 0 8");
		
		btnGroupadd = new JButton("groupadd");
		btnGroupadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("groupadd", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("groupadd");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnGroupadd, "cell 0 9");
		
		btnChgrp_1 = new JButton("chgrp");
		btnChgrp_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("chgrp", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("chgrp");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnChgrp_1, "cell 0 10");
		
		btnW_1 = new JButton("w");
		btnW_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("w", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("w");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnW_1, "cell 0 11");
		
		btnChage = new JButton("chage");
		btnChage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("chage", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("chage");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnChage, "cell 0 12");
		
		btnUsermod = new JButton("usermod");
		btnUsermod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("usermod", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("usermod");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnUsermod, "cell 0 13");
		
		btnUserdel_1 = new JButton("userdel");
		btnUserdel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("userdel", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("userdel");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnUserdel_1, "cell 0 14");
		
		btnGroupmod_1 = new JButton("groupmod");
		btnGroupmod_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("groupmod", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("groupmod");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnGroupmod_1, "cell 0 15");
		
		btnUmask = new JButton("umask");
		btnUmask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("umask", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("umask");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnUmask, "cell 0 16");
	}
	
	public void mostrarPermisos() {
		String command = "ls -l "; 
		
		if(!chckbxAplicarCarpeta.isSelected()) {
			command=command + " " + textFieldPathArchivo.getText();
			
		} else {			
			command=command + " -d";
			command=command + " "+ textFieldPathCarpeta.getText();
		}
		
		textFieldComandoPermisos.setText(command);
		
		String sOutputLs = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
		
		textAreaPermisos.setText(sOutputLs);
	}
	
	public void mostrarAtributos(){
		String command = "lsattr "; 
		
		if(!chckbxAplicarCarpetaAtributos.isSelected()) {
			command=command + " " + textFieldPathArchivoAtributos.getText();
			
		} else {			
			//command=command + " -d";
			command=command + " "+ textFieldPathCarpetaAtributos.getText();
		}
		
		textFieldComandoPermisos.setText(command);
		
		textFieldComandoAtributos.setText(command);
		
		String sOutputLs = Comando.executeCommandWithReturn(command,UsuariosGruposJFrame.this);
		
		textAreaAtributos.setText(sOutputLs);
	}
}
