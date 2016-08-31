package bydan.ubuntu.ventanas.comandos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bydan.ubuntu.base.Comando;
import bydan.ubuntu.ventanas.comandos.ejemplos.EjemplosGeneralJFrame;

import javax.swing.JTabbedPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class MemoriaJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldComandoInfo;
	private JTextArea textAreaInfo;
	private JCheckBox chckbxResumen;
	private JTextField textFieldComandoSwap;
	private JTextArea textAreaSwap;
	private JCheckBox chckbxMegabytes;
	private JCheckBox chckbxGigabytes;
	private JButton btnEjemplo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemoriaJFrame frame = new MemoriaJFrame();
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
	public MemoriaJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 549, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelInfo = new JPanel();
		tabbedPane.addTab("Info", null, panelInfo, null);
		panelInfo.setLayout(new MigLayout("", "[][grow]", "[][][grow]"));
		
		JButton btnInfoMemoria = new JButton("Info Memoria");
		btnInfoMemoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "free"; 
				
				
				if(chckbxResumen.isSelected()) {
					command = command + " -h"; 
				}
				
				if(chckbxMegabytes.isSelected()) {
					command = command + " -m"; 
				}
				
				if(chckbxGigabytes.isSelected()) {
					command = command + " -g";
				}
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,MemoriaJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		
		chckbxResumen = new JCheckBox("Resumen");
		chckbxResumen.setSelected(true);
		panelInfo.add(chckbxResumen, "flowy,cell 0 0");
		
		chckbxMegabytes = new JCheckBox("Megabytes");
		panelInfo.add(chckbxMegabytes, "cell 0 0");
		
		chckbxGigabytes = new JCheckBox("Gigabytes");
		panelInfo.add(chckbxGigabytes, "cell 0 0");
		panelInfo.add(btnInfoMemoria, "cell 0 0");
		
		JButton btnInfoMemoria_1 = new JButton("Info Memoria 2");
		btnInfoMemoria_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "cat /proc/meminfo"; 
								
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,MemoriaJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		panelInfo.add(btnInfoMemoria_1, "flowx,cell 1 0,aligny bottom");
		
		textFieldComandoInfo = new JTextField();
		panelInfo.add(textFieldComandoInfo, "cell 0 1 2 1,growx");
		textFieldComandoInfo.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		panelInfo.add(scrollPane, "cell 0 2 2 1,grow");
		
		textAreaInfo = new JTextArea();
		scrollPane.setViewportView(textAreaInfo);
		
		btnEjemplo = new JButton("Ejemplo");
		btnEjemplo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EjemplosGeneralJFrame ejemplosGeneralJFrame=new EjemplosGeneralJFrame();
				
				ejemplosGeneralJFrame.InicializarTitulos("free", "");
				
				ejemplosGeneralJFrame.CargarEjemplos("free");
				
				ejemplosGeneralJFrame.show();
			}
		});
		panelInfo.add(btnEjemplo, "cell 1 0");
		
		JPanel panelSwap = new JPanel();
		tabbedPane.addTab("Swap", null, panelSwap, null);
		panelSwap.setLayout(new MigLayout("", "[grow][grow]", "[][][grow]"));
		
		JButton btnInfoSwap = new JButton("Info Swap");
		btnInfoSwap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "cat /proc/swaps"; 
				
				textFieldComandoSwap.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,MemoriaJFrame.this);
				
				textAreaSwap.setText(sOutput);
			}
		});
		panelSwap.add(btnInfoSwap, "cell 0 0");
		
		textFieldComandoSwap = new JTextField();
		panelSwap.add(textFieldComandoSwap, "cell 0 1 2 1,growx");
		textFieldComandoSwap.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panelSwap.add(scrollPane_1, "cell 0 2 2 1,grow");
		
		textAreaSwap = new JTextArea();
		scrollPane_1.setViewportView(textAreaSwap);
	}

}
