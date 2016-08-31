package bydan.ubuntu.ventanas.comandos.tips;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

public class Tip3AdministracionJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tip3AdministracionJFrame frame = new Tip3AdministracionJFrame();
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
	public Tip3AdministracionJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(30, 30, 638, 675);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelInstall = new JPanel();
		tabbedPane.addTab("Install", null, panelInstall, null);
		panelInstall.setLayout(new MigLayout("", "[][][]", "[][][][][][][][][][][][][][][][][][][][][][][][][][][][]"));
		
		JLabel lblsistema = new JLabel("------SISTEMA-------");
		panelInstall.add(lblsistema, "cell 0 0 2 1,alignx center");
		
		JLabel lblSourcesfuentes = new JLabel("Sources/Fuentes");
		panelInstall.add(lblSourcesfuentes, "cell 0 1");
		
		JLabel lblAdministracioneditsoftwareSources = new JLabel("Administracion->Edit->Software Sources");
		panelInstall.add(lblAdministracioneditsoftwareSources, "cell 1 1");
		
		JLabel lblBusqueda = new JLabel("Busqueda");
		panelInstall.add(lblBusqueda, "cell 0 2");
		
		JLabel lblAptcacheSearchPrograma = new JLabel("apt-cache search programa1");
		panelInstall.add(lblAptcacheSearchPrograma, "cell 1 2");
		
		JLabel lblMostrarInfo = new JLabel("Mostrar Info");
		panelInstall.add(lblMostrarInfo, "cell 0 3");
		
		JLabel lblAptcacheShow = new JLabel("apt-cache show");
		panelInstall.add(lblAptcacheShow, "cell 1 3");
		
		JLabel lblListaInstalados = new JLabel("Lista Instalados");
		panelInstall.add(lblListaInstalados, "cell 0 4");
		
		JLabel lblDpkgl = new JLabel("dpkg -l");
		panelInstall.add(lblDpkgl, "cell 1 4");
		
		JLabel lblActualizacion = new JLabel("--------------ACTUALIZACION------------");
		panelInstall.add(lblActualizacion, "cell 0 6 2 1,alignx center");
		
		JLabel lblLista = new JLabel("Lista");
		panelInstall.add(lblLista, "cell 0 7");
		
		JLabel lblAptgetUpdate = new JLabel("apt-get update");
		panelInstall.add(lblAptgetUpdate, "cell 1 7");
		
		JLabel lblActualizar = new JLabel("Actualizar 1 (Todos)");
		panelInstall.add(lblActualizar, "cell 0 8");
		
		JLabel lblAptgetUpgrade = new JLabel("apt-get upgrade");
		panelInstall.add(lblAptgetUpgrade, "cell 1 8");
		
		JLabel lblActualizar_1 = new JLabel("Actualizar 2 S.O");
		panelInstall.add(lblActualizar_1, "cell 0 9");
		
		JLabel lblAptgetDistupgrade = new JLabel("apt-get dist-upgrade");
		panelInstall.add(lblAptgetDistupgrade, "cell 1 9");
		
		JLabel lblActualizarIndividual = new JLabel("Actualizar Individual");
		panelInstall.add(lblActualizarIndividual, "cell 0 10");
		
		JLabel lblSudoAptgetInstall = new JLabel("sudo apt-get install package1");
		panelInstall.add(lblSudoAptgetInstall, "cell 1 10");
		
		JLabel lblEliminar_2 = new JLabel("Eliminar");
		panelInstall.add(lblEliminar_2, "cell 0 11");
		
		JLabel lblSudoAptgetAutoremove = new JLabel("sudo apt-get autoremove");
		panelInstall.add(lblSudoAptgetAutoremove, "cell 1 11");
		
		JLabel lblAplicaciones = new JLabel("------------APLICACIONES-------------");
		panelInstall.add(lblAplicaciones, "cell 0 13 2 1,alignx center");
		
		JLabel lblInstalar = new JLabel("Instalar/Actualizar");
		panelInstall.add(lblInstalar, "cell 0 14");
		
		JLabel lblAptgetInstallPrograma = new JLabel("apt-get install programa1");
		panelInstall.add(lblAptgetInstallPrograma, "cell 1 14");
		
		JLabel lblDesinstalar = new JLabel("Desinstalar (Sin Config)");
		panelInstall.add(lblDesinstalar, "cell 0 15");
		
		JLabel lblAptgetRemovePrograma = new JLabel("apt-get remove programa1");
		panelInstall.add(lblAptgetRemovePrograma, "cell 1 15");
		
		JLabel lblLimpiarCache = new JLabel("Limpiar Cache");
		panelInstall.add(lblLimpiarCache, "cell 0 16");
		
		JLabel lblAptgetClean = new JLabel("apt-get clean");
		panelInstall.add(lblAptgetClean, "cell 1 16");
		
		JLabel lblEliminar_1 = new JLabel("Eliminar (Hasta Configs)");
		panelInstall.add(lblEliminar_1, "cell 0 17");
		
		JLabel lblAptgetRemovePackagename = new JLabel("apt-get --purge remove package_name");
		panelInstall.add(lblAptgetRemovePackagename, "cell 1 17");
		
		JLabel lblInstalarDesdeCdrom = new JLabel("Instalar/Act desde CdRom");
		panelInstall.add(lblInstalarDesdeCdrom, "cell 0 18");
		
		JLabel lblAptcdromInstallPackagename = new JLabel("apt-cdrom install package_name");
		panelInstall.add(lblAptcdromInstallPackagename, "cell 1 18");
		
		JLabel lblAplicacionesdeb = new JLabel("------------APLICACIONES .deb-------------");
		panelInstall.add(lblAplicacionesdeb, "cell 0 20 2 1,alignx center");
		
		JLabel label_2 = new JLabel("Lista Instalados");
		panelInstall.add(label_2, "cell 0 21");
		
		JLabel label_3 = new JLabel("dpkg -l");
		panelInstall.add(label_3, "cell 1 21");
		
		JLabel label = new JLabel("Instalar");
		panelInstall.add(label, "cell 0 22");
		
		JLabel lblDpkgiArchivodeb = new JLabel("dpkg -i archivo.deb");
		panelInstall.add(lblDpkgiArchivodeb, "cell 1 22");
		
		JLabel label_1 = new JLabel("Desinstalar");
		panelInstall.add(label_1, "cell 0 23");
		
		JLabel lblDpkgeArchivodeb = new JLabel("dpkg -e archivo.deb");
		panelInstall.add(lblDpkgeArchivodeb, "cell 1 23");
		
		JLabel lblEliminar = new JLabel("Eliminar");
		panelInstall.add(lblEliminar, "cell 0 24");
		
		JLabel lblDpkgrPackagename = new JLabel("dpkg -r package_name");
		panelInstall.add(lblDpkgrPackagename, "cell 1 24");
		
		JLabel lblListarArchivosPaquete = new JLabel("Listar Archivos Paquete");
		panelInstall.add(lblListarArchivosPaquete, "cell 0 25");
		
		JLabel lblDpkglPackage = new JLabel("dpkg -L package");
		panelInstall.add(lblDpkglPackage, "cell 1 25");
		
		JLabel lblEstadoPaquete = new JLabel("Estado Paquete");
		panelInstall.add(lblEstadoPaquete, "cell 0 26");
		
		JLabel lblDpkgsPackage = new JLabel("dpkg -s package");
		panelInstall.add(lblDpkgsPackage, "cell 1 26");
		
		JLabel lblArchivoPertenecePaquete = new JLabel("Archivo Pertenece Paquete");
		panelInstall.add(lblArchivoPertenecePaquete, "cell 0 27");
		
		JLabel lblDpkgspathtofile = new JLabel("dpkg -S /path/to/file");
		panelInstall.add(lblDpkgspathtofile, "cell 1 27");
	}

}
