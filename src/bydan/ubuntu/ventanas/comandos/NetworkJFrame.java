package bydan.ubuntu.ventanas.comandos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bydan.ubuntu.base.Comando;
import bydan.ubuntu.base.Constantes;
import bydan.ubuntu.ventanas.comandos.ejemplos.EjemplosGeneralJFrame;

import javax.swing.JTabbedPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;

public class NetworkJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldComandoInfo;
	private JTextArea textAreaInfo;
	private JTextField textFieldComandoNetstat;
	private JTextArea textAreaNetstat;
	private JTextField textFieldComandoRoute;
	private JTextArea textAreaRoute;
	private JTextField textFieldInterface;
	private JCheckBox chckbxNumeric;
	private JTextField textFieldHost;
	private JTextField textFieldInterfaceWireless;
	private JTextField textFieldComandoWireless;
	private JTextArea textAreaWireless;
	private JCheckBox chckbxTx;
	private JTextField textFieldHostRoute;
	private JTextField textFieldBusquedaNetstat;
	private JTextField textFieldComandoNmap;
	private JTextArea textAreaNmap;
	private JTextField textFieldIpNmap;
	private JTextField textFieldIp;
	private JTextField textFieldComandoPing;
	private JTextField textFieldNumeroPaquetes;
	private JTextArea textAreaPing;
	private JCheckBox chckbxEstadisticas;
	private JCheckBox chckbxRouting;
	private JCheckBox chckbxTcp;
	private JCheckBox chckbxListening;
	private JCheckBox chckbxNumeros;
	private JTextField textFieldUrl;
	private JTextField textFieldComandoDig;
	private JTextArea textAreaDig;
	private JTextField textFieldUrlIp;
	private JCheckBox chckbxCname;
	private JCheckBox chckbxSoa;
	private JCheckBox chckbxTodos;
	private JTextField textFieldComandoHost;
	private JTextArea textAreaHost;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NetworkJFrame frame = new NetworkJFrame();
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
	public NetworkJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 650, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelInfo = new JPanel();
		tabbedPane.addTab("Info", null, panelInfo, null);
		panelInfo.setLayout(new MigLayout("", "[][][][]", "[][][][][][][][][][][grow]"));
		
		JLabel lblNombreInterfaz = new JLabel("Nombre Interfaz");
		panelInfo.add(lblNombreInterfaz, "cell 0 0,alignx trailing");
		
		textFieldInterface = new JTextField();
		textFieldInterface.setText("enp3s0");
		panelInfo.add(textFieldInterface, "cell 1 0,alignx left");
		textFieldInterface.setColumns(10);
		
		JLabel lblUrl = new JLabel("Url");
		panelInfo.add(lblUrl, "cell 0 1");
		
		textFieldHost = new JTextField();
		textFieldHost.setText("www.google.com");
		panelInfo.add(textFieldHost, "cell 1 1,alignx left");
		textFieldHost.setColumns(10);
		
		JLabel lblTarjetaDeRed = new JLabel("Tarjeta de Red");
		panelInfo.add(lblTarjetaDeRed, "cell 0 2");
		
		JButton btnWirelessConfig = new JButton("Wireless Config");
		btnWirelessConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "iwconfig"; 				
				String comillas="";
														
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		
		JButton btnRedConfig = new JButton("ifconfig Red");
		btnRedConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "ifconfig"; 				
				String comillas="";
										
				command=command + " " + textFieldInterface.getText();
						
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnRedConfig, "cell 1 2");
		
		JLabel lblEstadoEnlace = new JLabel("Estado Enlace");
		panelInfo.add(lblEstadoEnlace, "cell 2 2");
		
		JButton btnMiitool = new JButton("mii-tool ");
		btnMiitool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO+ " mii-tool "; 				
										
				command=command + " " + textFieldInterface.getText();
						
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnMiitool, "cell 3 2");
		
		JLabel lblInhalambrico = new JLabel("Inhalambrico");
		panelInfo.add(lblInhalambrico, "cell 0 3");
		panelInfo.add(btnWirelessConfig, "cell 1 3");
		
		JLabel lblEstadisticas = new JLabel("Estadisticas");
		panelInfo.add(lblEstadisticas, "cell 2 3");
		
		JButton btnEthtool = new JButton("ethtool");
		btnEthtool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = /*Constantes.GKSUDO+*/ " ethtool "; 				
				
				if(chckbxTx.isSelected()) {
					command=command + " -S";
				}
				
				command=command + " " + textFieldInterface.getText();
						
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnEthtool, "flowx,cell 3 3");
		
		JLabel lblPc = new JLabel("PC");
		panelInfo.add(lblPc, "cell 0 4");
		
		JButton btnHostname = new JButton("Hostname");
		btnHostname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "hostname"; 				
				String comillas="";
														
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnHostname, "cell 1 4");
		
		JLabel lblDns = new JLabel("DNS");
		panelInfo.add(lblDns, "cell 2 4");
		
		JButton btnWhois = new JButton("whois");
		btnWhois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "whois"; 				
				
										
				command=command + " " +textFieldHost.getText();
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnWhois, "cell 3 4");
		
		JLabel lblArp = new JLabel("Arp");
		panelInfo.add(lblArp, "cell 0 5");
		
		JButton btnArp = new JButton("Arp");
		btnArp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "arp"; 				
				String comillas="";
														
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnArp, "cell 1 5");
		
		JLabel lblDriver = new JLabel("Driver");
		panelInfo.add(lblDriver, "cell 2 5");
		
		JButton btnEthtool_1 = new JButton("ethtool");
		btnEthtool_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "ethtool -i"; 								
				
				command=command + " " +textFieldInterface.getText();
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnEthtool_1, "cell 3 5");
		
		JLabel lblIpLink = new JLabel("Ip Link");
		panelInfo.add(lblIpLink, "cell 0 6");
		
		JButton btnIpLink = new JButton("ip link");
		btnIpLink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "ip link show"; 				
														
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnIpLink, "flowx,cell 1 6");
		
		JLabel lblHost = new JLabel("Host");
		panelInfo.add(lblHost, "cell 0 7");
		
		JLabel lblArchivos = new JLabel("Archivos");
		panelInfo.add(lblArchivos, "cell 0 8");
		
		JButton btnHosts = new JButton("hosts");
		btnHosts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "cat /etc/hosts"; 								
				
				//command=command + " " +textFieldHost.getText();
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnHosts, "flowx,cell 1 8");
		
		JButton btnResolvconf = new JButton("resolv.conf");
		btnResolvconf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "cat /etc/resolv.conf"; 								
				
				//command=command + " " +textFieldHost.getText();
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnResolvconf, "cell 2 8");
		
		textFieldComandoInfo = new JTextField();
		panelInfo.add(textFieldComandoInfo, "cell 0 9 4 1,growx");
		textFieldComandoInfo.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panelInfo.add(scrollPane_1, "cell 0 10 4 1,grow");
		
		textAreaInfo = new JTextArea();
		scrollPane_1.setViewportView(textAreaInfo);
		
		JButton btnHost = new JButton("Host");
		btnHost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "host"; 								
									
				command=command + " " +textFieldHost.getText();
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnHost, "flowx,cell 1 7");
		
		JButton btnNslookup = new JButton("nslookup");
		btnNslookup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "nslookup"; 								
				
				command=command + " " +textFieldHost.getText();
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnNslookup, "cell 1 7");
		
		JButton btnIpAddress = new JButton("ip address show");
		btnIpAddress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String command = "ip address show"; 				
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnIpAddress, "cell 1 6");
		
		JButton btnInterfaces = new JButton("interfaces");
		btnInterfaces.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "cat /etc/network/interfaces"; 								
				
				//command=command + " " +textFieldHost.getText();
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnInterfaces, "cell 1 8");
		
		chckbxTx = new JCheckBox("Tx");
		panelInfo.add(chckbxTx, "cell 3 3");
		
		JPanel panelPing = new JPanel();
		tabbedPane.addTab("Ping", null, panelPing, null);
		panelPing.setLayout(new MigLayout("", "[][grow]", "[][][][][grow]"));
		
		JLabel lblIp_1 = new JLabel("Ip");
		panelPing.add(lblIp_1, "cell 0 0,alignx trailing");
		
		textFieldIp = new JTextField();
		textFieldIp.setText("127.0.0.1");
		panelPing.add(textFieldIp, "cell 1 0,growx");
		textFieldIp.setColumns(10);
		
		JButton btnPing = new JButton("ping");
		btnPing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "ping"; 				
				String comillas="";
										
				command=command + " -c " +textFieldNumeroPaquetes.getText() + " "+ textFieldIp.getText();
						
				textFieldComandoPing.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaPing.setText(sOutput);
			}
		});
		
		JLabel lblNumPackets = new JLabel("Num Packets");
		panelPing.add(lblNumPackets, "cell 0 1,alignx trailing");
		
		textFieldNumeroPaquetes = new JTextField();
		textFieldNumeroPaquetes.setText("3");
		panelPing.add(textFieldNumeroPaquetes, "cell 1 1,growx");
		textFieldNumeroPaquetes.setColumns(10);
		panelPing.add(btnPing, "cell 1 2");
		
		textFieldComandoPing = new JTextField();
		panelPing.add(textFieldComandoPing, "cell 0 3 2 1,growx");
		textFieldComandoPing.setColumns(10);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		panelPing.add(scrollPane_5, "cell 0 4 2 1,grow");
		
		textAreaPing = new JTextArea();
		scrollPane_5.setViewportView(textAreaPing);
		
		JPanel panelNetstat = new JPanel();
		tabbedPane.addTab("Netstat", null, panelNetstat, null);
		panelNetstat.setLayout(new MigLayout("", "[][grow]", "[][][][][][][][][][grow]"));
		
		JButton btnNetstat = new JButton("Netstat");
		btnNetstat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "netstat"; 				
				String comillas="";
				
				
				if(chckbxEstadisticas.isSelected()) {
					command=command + " -i";
				}
				
				if(chckbxRouting.isSelected()) {
					command=command + " -r";
				}
				
				
				
				
				if(chckbxTcp.isSelected()) {
					command=command + " -t";
				}
				
				if(chckbxListening.isSelected()) {
					command=command + " -l";
				}
				
				if(chckbxNumeros.isSelected()) {
					command=command + " -n";
				}
				
				
				textFieldComandoNetstat.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaNetstat.setText(sOutput);
			}
		});
		
		JLabel lblBusqueda = new JLabel("Busqueda");
		panelNetstat.add(lblBusqueda, "cell 0 0,alignx trailing");
		
		textFieldBusquedaNetstat = new JTextField();
		panelNetstat.add(textFieldBusquedaNetstat, "cell 1 0,growx");
		textFieldBusquedaNetstat.setColumns(10);
		
		chckbxEstadisticas = new JCheckBox("Estadisticas");
		panelNetstat.add(chckbxEstadisticas, "cell 1 1");
		
		chckbxRouting = new JCheckBox("Routing");
		panelNetstat.add(chckbxRouting, "cell 1 2");
		
		JLabel lblServiciosPuertos = new JLabel("Servicios Puertos");
		panelNetstat.add(lblServiciosPuertos, "cell 0 3");
		
		chckbxTcp = new JCheckBox("Tcp");
		panelNetstat.add(chckbxTcp, "flowx,cell 1 3");
		
		JLabel lblGeneral = new JLabel("General");
		panelNetstat.add(lblGeneral, "cell 0 4");
		panelNetstat.add(btnNetstat, "cell 1 4");
		
		JLabel lblConexiones = new JLabel("Conexiones");
		panelNetstat.add(lblConexiones, "cell 0 6");
		
		JButton btnConexiones = new JButton("Conexiones");
		btnConexiones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "netstat -tup"; 				
														
				textFieldComandoNetstat.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaNetstat.setText(sOutput);
			}
		});
		panelNetstat.add(btnConexiones, "cell 1 6");
		
		JLabel lblServicios = new JLabel("Servicios");
		panelNetstat.add(lblServicios, "cell 0 7");
		
		JButton btnServicios = new JButton("Servicios");
		btnServicios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + " 'netstat -tupl'"; 				
				
				textFieldComandoNetstat.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaNetstat.setText(sOutput);
			}
		});
		panelNetstat.add(btnServicios, "flowx,cell 1 7");
		
		textFieldComandoNetstat = new JTextField();
		panelNetstat.add(textFieldComandoNetstat, "cell 0 8 2 1,growx");
		textFieldComandoNetstat.setColumns(10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		panelNetstat.add(scrollPane_2, "cell 0 9 2 1,grow");
		
		textAreaNetstat = new JTextArea();
		scrollPane_2.setViewportView(textAreaNetstat);
		
		JButton btnServiciosDetalle = new JButton("Servicios Detalle");
		btnServiciosDetalle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command =Constantes.GKSUDO + " 'netstat -platune'"; 				
				
				textFieldComandoNetstat.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaNetstat.setText(sOutput);
			}
		});
		panelNetstat.add(btnServiciosDetalle, "cell 1 7");
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command =Constantes.GKSUDO + " 'netstat -platune"; 				
				
				command=command + " | grep "+textFieldBusquedaNetstat.getText()+"'";
				
				textFieldComandoNetstat.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaNetstat.setText(sOutput);
			}
		});
		panelNetstat.add(btnBuscar, "cell 1 7");
		
		chckbxListening = new JCheckBox("Listening");
		panelNetstat.add(chckbxListening, "cell 1 3");
		
		chckbxNumeros = new JCheckBox("Numeros");
		panelNetstat.add(chckbxNumeros, "cell 1 3");
		
		JPanel panelNmap = new JPanel();
		tabbedPane.addTab("Nmap", null, panelNmap, null);
		panelNmap.setLayout(new MigLayout("", "[][grow]", "[][][][grow]"));
		
		JButton btnNmap = new JButton("nmap");
		btnNmap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + " 'nmap '"; 				
				
				command=command+" "+textFieldIpNmap.getText();
				
				textFieldComandoNmap.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaNmap.setText(sOutput);
			}
		});
		
		JLabel lblIp = new JLabel("Ip");
		panelNmap.add(lblIp, "cell 0 0");
		
		textFieldIpNmap = new JTextField();
		panelNmap.add(textFieldIpNmap, "cell 1 0,growx");
		textFieldIpNmap.setColumns(10);
		panelNmap.add(btnNmap, "cell 0 1");
		
		JButton btnNmapDetalle = new JButton("nmap Detalle");
		btnNmapDetalle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = Constantes.GKSUDO + " 'nmap -sT -sU -PO -O'"; 				
				
				command=command+" "+textFieldIpNmap.getText();
				
				textFieldComandoNmap.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaNmap.setText(sOutput);
			}
		});
		panelNmap.add(btnNmapDetalle, "cell 1 1");
		
		textFieldComandoNmap = new JTextField();
		panelNmap.add(textFieldComandoNmap, "cell 0 2 2 1,growx");
		textFieldComandoNmap.setColumns(10);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		panelNmap.add(scrollPane_4, "cell 0 3 2 1,grow");
		
		textAreaNmap = new JTextArea();
		scrollPane_4.setViewportView(textAreaNmap);
		
		JPanel panelRoute = new JPanel();
		tabbedPane.addTab("Route", null, panelRoute, null);
		panelRoute.setLayout(new MigLayout("", "[][grow]", "[][][][][][grow]"));
		
		JButton btnRoute = new JButton("Route");
		btnRoute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "route"; 				
				String comillas="";
										
				if(chckbxNumeric.isSelected()) {
					command=command + " -n";
				}
				
				textFieldComandoRoute.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaRoute.setText(sOutput);
			}
		});
		
		chckbxNumeric = new JCheckBox("Numeric");
		panelRoute.add(chckbxNumeric, "cell 0 0");
		
		JLabel lblUrl_1 = new JLabel("Url");
		panelRoute.add(lblUrl_1, "cell 0 1,alignx left");
		
		textFieldHostRoute = new JTextField();
		panelRoute.add(textFieldHostRoute, "cell 1 1,growx");
		textFieldHostRoute.setColumns(10);
		panelRoute.add(btnRoute, "flowx,cell 0 2");
		
		JButton btnIpRoute = new JButton("ip route");
		btnIpRoute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "ip route show"; 				
				String comillas="";
										
				textFieldComandoRoute.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaRoute.setText(sOutput);
			}
		});
		panelRoute.add(btnIpRoute, "cell 1 2");
		
		JButton btnTraceroute = new JButton("traceroute");
		btnTraceroute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "traceroute "+textFieldHostRoute.getText(); 				
				String comillas="";
										
				textFieldComandoRoute.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaRoute.setText(sOutput);
			}
		});
		panelRoute.add(btnTraceroute, "cell 0 3");
		
		textFieldComandoRoute = new JTextField();
		panelRoute.add(textFieldComandoRoute, "cell 0 4 2 1,growx");
		textFieldComandoRoute.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		panelRoute.add(scrollPane, "cell 0 5 2 1,grow");
		
		textAreaRoute = new JTextArea();
		scrollPane.setViewportView(textAreaRoute);
		
		JPanel panelInternet = new JPanel();
		tabbedPane.addTab("Internet", null, panelInternet, null);
		panelInternet.setLayout(new MigLayout("", "[][][]", "[][][][]"));
		
		JLabel lblWget = new JLabel("WGET");
		panelInternet.add(lblWget, "cell 0 0");
		
		JLabel lblTodoSitioWeb = new JLabel("Todo Sitio Web");
		panelInternet.add(lblTodoSitioWeb, "cell 0 1");
		
		JLabel lblWgetr = new JLabel("wget -r www.example.com");
		panelInternet.add(lblWgetr, "cell 2 1");
		
		JLabel lblPorPartes = new JLabel("Por Partes");
		panelInternet.add(lblPorPartes, "cell 0 2");
		
		JLabel lblWgetcWwwexamplecomfileiso = new JLabel("wget -c www.example.com/file.iso");
		panelInternet.add(lblWgetcWwwexamplecomfileiso, "cell 2 2");
		
		JLabel lblCiertaHora = new JLabel("Cierta Hora");
		panelInternet.add(lblCiertaHora, "cell 0 3");
		
		JLabel lblEchowgetc = new JLabel("echo 'wget -c www.example.com/files.iso' | at 09:00");
		panelInternet.add(lblEchowgetc, "cell 2 3");
		
		JPanel panelWireless = new JPanel();
		tabbedPane.addTab("Wireless", null, panelWireless, null);
		panelWireless.setLayout(new MigLayout("", "[][grow]", "[][][][][grow]"));
		
		JLabel lblInterfaceWireless = new JLabel("Interface Wireless");
		panelWireless.add(lblInterfaceWireless, "cell 0 0,alignx trailing");
		
		textFieldInterfaceWireless = new JTextField();
		panelWireless.add(textFieldInterfaceWireless, "cell 1 0,growx");
		textFieldInterfaceWireless.setColumns(10);
		
		JLabel lblMostrarRedes = new JLabel("Mostrar Redes");
		panelWireless.add(lblMostrarRedes, "cell 0 1");
		
		JButton btnRedes = new JButton("Redes");
		btnRedes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "iwlist scan"; 				
														
				textFieldComandoWireless.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaWireless.setText(sOutput);
			}
		});
		panelWireless.add(btnRedes, "cell 1 1");
		
		JLabel lblMostrarConfiguracion = new JLabel("Mostrar Configuracion");
		panelWireless.add(lblMostrarConfiguracion, "cell 0 2");
		
		JButton btnConfiguracion = new JButton("Configuracion");
		btnConfiguracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "iwconfig"; 				
				
				command=command+" "+textFieldInterfaceWireless.getText();
				
				textFieldComandoWireless.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaWireless.setText(sOutput);
			}
		});
		panelWireless.add(btnConfiguracion, "cell 1 2");
		
		textFieldComandoWireless = new JTextField();
		panelWireless.add(textFieldComandoWireless, "cell 0 3 2 1,growx");
		textFieldComandoWireless.setColumns(10);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		panelWireless.add(scrollPane_3, "cell 0 4 2 1,grow");
		
		textAreaWireless = new JTextArea();
		scrollPane_3.setViewportView(textAreaWireless);
		
		JPanel panelDigDns = new JPanel();
		tabbedPane.addTab("Dns Dig", null, panelDigDns, null);
		panelDigDns.setLayout(new MigLayout("", "[][grow]", "[][][][grow]"));
		
		JLabel lblUrl_2 = new JLabel("Url");
		panelDigDns.add(lblUrl_2, "cell 0 0,alignx trailing");
		
		textFieldUrl = new JTextField();
		textFieldUrl.setText("google.com");
		panelDigDns.add(textFieldUrl, "cell 1 0,growx");
		textFieldUrl.setColumns(10);
		
		JButton btnDig = new JButton("dig");
		btnDig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "dig"; 				
				String comillas="";
										
				command=command + " " +textFieldUrl.getText();
						
				textFieldComandoDig.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaDig.setText(sOutput);
			}
		});
		panelDigDns.add(btnDig, "cell 1 1");
		
		textFieldComandoDig = new JTextField();
		panelDigDns.add(textFieldComandoDig, "cell 0 2 2 1,growx");
		textFieldComandoDig.setColumns(10);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		panelDigDns.add(scrollPane_6, "cell 0 3 2 1,grow");
		
		textAreaDig = new JTextArea();
		scrollPane_6.setViewportView(textAreaDig);
		
		JPanel panelHost = new JPanel();
		tabbedPane.addTab("Host", null, panelHost, null);
		panelHost.setLayout(new MigLayout("", "[][grow]", "[][][][][][][grow]"));
		
		JLabel lblUrlip = new JLabel("Url/Ip");
		panelHost.add(lblUrlip, "cell 0 0,alignx trailing");
		
		textFieldUrlIp = new JTextField();
		textFieldUrlIp.setText("google.com");
		panelHost.add(textFieldUrlIp, "cell 1 0,growx");
		textFieldUrlIp.setColumns(10);
		
		chckbxCname = new JCheckBox("CName");
		panelHost.add(chckbxCname, "cell 1 1");
		
		chckbxSoa = new JCheckBox("Soa");
		panelHost.add(chckbxSoa, "cell 1 2");
		
		chckbxTodos = new JCheckBox("Todos");
		panelHost.add(chckbxTodos, "cell 1 3");
		
		JButton btnHost_1 = new JButton("Host");
		btnHost_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "host"; 				
				String comillas="";
										
				
				if(chckbxCname.isSelected()) {
					command=command+" -t CNAME";
				}
				
				if(chckbxSoa.isSelected()) {
					command=command+" -t SOA";
				}
				
				if(chckbxTodos.isSelected()) {
					command=command+" -a";
				}
				
				command=command + " " +textFieldUrlIp.getText();
						
				textFieldComandoHost.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,NetworkJFrame.this);
				
				textAreaHost.setText(sOutput);
			}
		});
		panelHost.add(btnHost_1, "cell 1 4");
		
		textFieldComandoHost = new JTextField();
		panelHost.add(textFieldComandoHost, "cell 0 5 2 1,growx");
		textFieldComandoHost.setColumns(10);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		panelHost.add(scrollPane_7, "cell 0 6 2 1,grow");
		
		textAreaHost = new JTextArea();
		scrollPane_7.setViewportView(textAreaHost);
		
		JPanel panelEjemplos = new JPanel();
		tabbedPane.addTab("Ejemplos", null, panelEjemplos, null);
		panelEjemplos.setLayout(new MigLayout("", "[]", "[][][][][][][]"));
		
		JButton btnWget = new JButton("wget");
		btnWget.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("wget", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("wget");
				
				ejemplosGeneralJFrame.show();
			}
		});
		
		JButton btnRoute_1 = new JButton("route");
		btnRoute_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();

				ejemplosGeneralJFrame.InicializarTitulos("route", "");

				ejemplosGeneralJFrame.CargarEjemplos("route");

				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnRoute_1, "cell 0 0");
		panelEjemplos.add(btnWget, "cell 0 1");
		
		JButton btnIfupdown = new JButton("ifupdown");
		btnIfupdown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("ifupdown", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("ifupdown");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnIfupdown, "cell 0 2");
		
		JButton btnIfconfig = new JButton("ifconfig");
		btnIfconfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("ifconfig", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("ifconfig");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnIfconfig, "cell 0 3");
		
		JButton btnDhclient = new JButton("dhclient");
		btnDhclient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("dhclient", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("dhclient");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnDhclient, "cell 0 4");
		
		JButton btnTcpdump = new JButton("tcpdump");
		btnTcpdump.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("tcpdump", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("tcpdump");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnTcpdump, "cell 0 5");
		
		JButton btnInfoNetwork = new JButton("info network");
		btnInfoNetwork.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("info_network", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("info_network");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelEjemplos.add(btnInfoNetwork, "cell 0 6");
	}

}
