package bydan.ubuntu.ventanas.comandos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bydan.ubuntu.base.Comando;

import javax.swing.JTabbedPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class LogJFrame extends JFrame {

	private JPanel contentPane;
	private JTextArea textAreaInfo;
	private JCheckBox chckbxKernel;
	private JTextField textFieldComandoInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogJFrame frame = new LogJFrame();
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
	public LogJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 555, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Info", null, panel, null);
		panel.setLayout(new MigLayout("", "[grow][]", "[][][][grow]"));
		
		JButton btnKernel = new JButton("Log");
		btnKernel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "tail"; 
				
				if(chckbxKernel.isSelected()) {
					command = command + " -f /var/log/kern.log"; 
				}
				
				String sOutput = Comando.executeCommandWithReturn(command,LogJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		
		chckbxKernel = new JCheckBox("Kernel");
		chckbxKernel.setSelected(true);
		panel.add(chckbxKernel, "cell 0 0");
		panel.add(btnKernel, "flowx,cell 0 1");
		
		textFieldComandoInfo = new JTextField();
		panel.add(textFieldComandoInfo, "cell 0 2,growx");
		textFieldComandoInfo.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, "cell 0 3 2 1,grow");
		
		textAreaInfo = new JTextArea();
		scrollPane.setViewportView(textAreaInfo);
		
		JButton btnKernelInit = new JButton("Kernel Init");
		btnKernelInit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "dmesg"; 
				
				String sOutput = Comando.executeCommandWithReturn(command,LogJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		panel.add(btnKernelInit, "cell 0 1");
		
		JButton btnReboot = new JButton("Reboot");
		btnReboot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "last reboot"; 								
				
				textFieldComandoInfo.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,LogJFrame.this);
				
				textAreaInfo.setText(sOutput);
			}
		});
		panel.add(btnReboot, "cell 0 1");
	}

}
