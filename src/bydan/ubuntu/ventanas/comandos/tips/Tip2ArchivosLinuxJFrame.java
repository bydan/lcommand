package bydan.ubuntu.ventanas.comandos.tips;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

public class Tip2ArchivosLinuxJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tip2ArchivosLinuxJFrame frame = new Tip2ArchivosLinuxJFrame();
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
	public Tip2ArchivosLinuxJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 529, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelUsuario = new JPanel();
		tabbedPane.addTab("Usuario", null, panelUsuario, null);
		panelUsuario.setLayout(new MigLayout("", "[][][][][]", "[][][][][][][][][]"));
		
		JLabel lblPassword = new JLabel("Password");
		panelUsuario.add(lblPassword, "cell 0 0");
		
		JLabel lbletcpasswd = new JLabel("/etc/passwd");
		panelUsuario.add(lbletcpasswd, "cell 2 0");
		
		JLabel lbletcshadow = new JLabel("/etc/shadow");
		panelUsuario.add(lbletcshadow, "cell 4 0");
		
		JLabel lblUsuariosSudo = new JLabel("Usuarios sudo");
		panelUsuario.add(lblUsuariosSudo, "cell 0 1");
		
		JLabel lbletcsudoers = new JLabel("/etc/sudoers");
		panelUsuario.add(lbletcsudoers, "cell 2 1");
		
		JLabel lblGrupos = new JLabel("Grupos");
		panelUsuario.add(lblGrupos, "cell 0 2");
		
		JLabel lbletcgroup = new JLabel("/etc/group");
		panelUsuario.add(lbletcgroup, "cell 2 2");
		
		JLabel lbletcgshadow = new JLabel("/etc/gshadow");
		panelUsuario.add(lbletcgshadow, "cell 2 3");
		
		JLabel lblProfile = new JLabel("Log-in/Profile");
		panelUsuario.add(lblProfile, "cell 0 4");
		
		JLabel lbletcprofile = new JLabel("/etc/profile");
		panelUsuario.add(lbletcprofile, "cell 2 4");
		
		JLabel lbletcissue = new JLabel("/etc/issue");
		panelUsuario.add(lbletcissue, "cell 2 5");
		
		JLabel lblMensajeBienvenida = new JLabel("Mensaje Bienvenida");
		panelUsuario.add(lblMensajeBienvenida, "cell 4 5");
		
		JLabel lblValoresDefectoAdd = new JLabel("Valores Defecto Add");
		panelUsuario.add(lblValoresDefectoAdd, "cell 0 6");
		
		JLabel lbletcdefaultuseradd = new JLabel("/etc/default/useradd ");
		panelUsuario.add(lbletcdefaultuseradd, "cell 2 6");
		
		JLabel lbletclogindefs = new JLabel("/etc/login.defs");
		panelUsuario.add(lbletclogindefs, "cell 2 7");
		
		JLabel lblLoginHistory = new JLabel("Login History");
		panelUsuario.add(lblLoginHistory, "cell 0 8");
		
		JLabel lblvarlogwtmp = new JLabel("/var/log/wtmp");
		panelUsuario.add(lblvarlogwtmp, "cell 2 8");
		
		JPanel panelDocumentacion = new JPanel();
		tabbedPane.addTab("Documentacion", null, panelDocumentacion, null);
		panelDocumentacion.setLayout(new MigLayout("", "[][][]", "[][][][][]"));
		
		JLabel lblInformacion = new JLabel("Informacion");
		panelDocumentacion.add(lblInformacion, "cell 0 0");
		
		JLabel lblusrsharedoc = new JLabel("/usr/share/doc");
		panelDocumentacion.add(lblusrsharedoc, "cell 2 0");
		
		JLabel lblusrsharedochowto = new JLabel("/usr/share/doc/HOWTO");
		panelDocumentacion.add(lblusrsharedochowto, "cell 2 1");
		
		JLabel lblusrdoc = new JLabel("/usr/doc");
		panelDocumentacion.add(lblusrdoc, "cell 2 2");
		
		JLabel lblReadmetxt = new JLabel("readme.txt");
		panelDocumentacion.add(lblReadmetxt, "cell 2 3");
		
		JLabel lblAbrir = new JLabel("Abrir *.gz");
		panelDocumentacion.add(lblAbrir, "cell 0 4");
		
		JLabel lblZcatusrsharedocgimpnewsgz = new JLabel("zcat /usr/share/doc/gimp/NEWS.gz | less");
		panelDocumentacion.add(lblZcatusrsharedocgimpnewsgz, "cell 2 4");
		
		JPanel panelLog = new JPanel();
		tabbedPane.addTab("Logs", null, panelLog, null);
		panelLog.setLayout(new MigLayout("", "[][][]", "[][][][][]"));
		
		JLabel lblGeneral = new JLabel("General");
		panelLog.add(lblGeneral, "cell 0 0");
		
		JLabel lblvarlog = new JLabel("/var/log");
		panelLog.add(lblvarlog, "cell 2 0");
		
		JLabel lblSistema = new JLabel("Sistema");
		panelLog.add(lblSistema, "cell 0 1");
		
		JLabel lblvarlogmessages = new JLabel("/var/log/messages");
		panelLog.add(lblvarlogmessages, "cell 2 1");
		
		JLabel lblKernel = new JLabel("Kernel");
		panelLog.add(lblKernel, "cell 0 2");
		
		JLabel lblvarlogkernlog = new JLabel("/var/log/kern.log");
		panelLog.add(lblvarlogkernlog, "cell 2 2");
		
		JPanel panelRed = new JPanel();
		tabbedPane.addTab("Redes", null, panelRed, null);
		panelRed.setLayout(new MigLayout("", "[][][]", "[][][][][][]"));
		
		JLabel lblIp = new JLabel("Ip");
		panelRed.add(lblIp, "cell 0 0");
		
		JLabel lbletcnetworkinterfaces = new JLabel("/etc/network/interfaces");
		panelRed.add(lbletcnetworkinterfaces, "cell 2 0");
		
		JLabel lblHostdns = new JLabel("Host/Dns");
		panelRed.add(lblHostdns, "cell 0 1");
		
		JLabel lbletchosts = new JLabel("/etc/hosts");
		panelRed.add(lbletchosts, "cell 2 1");
		
		JLabel lbletcnsswitchconf = new JLabel("/etc/nsswitch.conf");
		panelRed.add(lbletcnsswitchconf, "cell 2 2");
		
		JLabel lblDns = new JLabel("DNS");
		panelRed.add(lblDns, "cell 0 4");
		
		JLabel lbletcresolvconf = new JLabel("/etc/resolv.conf");
		panelRed.add(lbletcresolvconf, "cell 2 4");
		
		JLabel lblNsswitchconf = new JLabel("/etc/nsswitch.conf");
		panelRed.add(lblNsswitchconf, "cell 2 5");
		
		JPanel panelDiscos = new JPanel();
		tabbedPane.addTab("Discos", null, panelDiscos, null);
		panelDiscos.setLayout(new MigLayout("", "[][][]", "[][][]"));
		
		JLabel lblMontadosManual = new JLabel("Montados Manual");
		panelDiscos.add(lblMontadosManual, "cell 0 0");
		
		JLabel lbletcmtab = new JLabel("/etc/mtab");
		panelDiscos.add(lbletcmtab, "cell 2 0");
		
		JLabel lblTodosActual = new JLabel("Todos Actual");
		panelDiscos.add(lblTodosActual, "cell 0 1");
		
		JLabel lblMount = new JLabel("mount");
		panelDiscos.add(lblMount, "cell 2 1");
		
		JLabel lblMontadosAutomaticos = new JLabel("Montados Automaticos");
		panelDiscos.add(lblMontadosAutomaticos, "cell 0 2");
		
		JLabel lbletcfstab = new JLabel("/etc/fstab");
		panelDiscos.add(lbletcfstab, "cell 2 2");
		
		JPanel panelInstalacion = new JPanel();
		tabbedPane.addTab("Instalacion", null, panelInstalacion, null);
		panelInstalacion.setLayout(new MigLayout("", "[][][]", "[][][]"));
		
		JLabel lblListasRepositorios = new JLabel("Listas Repositorios");
		panelInstalacion.add(lblListasRepositorios, "cell 0 0");
		
		JLabel lbletcapt = new JLabel("/etc/apt/");
		panelInstalacion.add(lbletcapt, "cell 2 0");
		
		JLabel lbletcaptsourceslistd = new JLabel("/etc/apt/sources.list.d");
		panelInstalacion.add(lbletcaptsourceslistd, "cell 2 1");
		
		JLabel lblVarlibapt = new JLabel("var/lib/apt");
		panelInstalacion.add(lblVarlibapt, "cell 2 2");
		
		JPanel panelKernel = new JPanel();
		tabbedPane.addTab("Kernel", null, panelKernel, null);
		panelKernel.setLayout(new MigLayout("", "[][][]", "[][][][]"));
		
		JLabel lblModulos = new JLabel("Modulos");
		panelKernel.add(lblModulos, "cell 0 0");
		
		JLabel lbletcmodprobed = new JLabel("/etc/modprobe.d");
		panelKernel.add(lbletcmodprobed, "cell 2 0");
		
		JLabel lbletcmodprobeconf = new JLabel("/etc/modprobe.conf");
		panelKernel.add(lbletcmodprobeconf, "cell 2 1");
		
		JLabel lblParametrosConfig = new JLabel("Parametros Config");
		panelKernel.add(lblParametrosConfig, "cell 0 3");
		
		JLabel lblprocsys = new JLabel("/proc/sys/*");
		panelKernel.add(lblprocsys, "cell 2 3");
	}

}
