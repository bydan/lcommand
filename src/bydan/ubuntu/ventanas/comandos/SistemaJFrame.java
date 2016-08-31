package bydan.ubuntu.ventanas.comandos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bydan.ubuntu.base.Comando;

import javax.swing.JTabbedPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SistemaJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldComandoEncoding;
	private JTextArea textAreaEncoding;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemaJFrame frame = new SistemaJFrame();
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
	public SistemaJFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 497, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Encoding", null, panel, null);
		panel.setLayout(new MigLayout("", "[grow]", "[][][grow]"));
		
		JButton btnMostrarEncoding = new JButton("Mostrar Encoding");
		btnMostrarEncoding.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = "iconv -l"; 
				
				textFieldComandoEncoding.setText(command);
				
				String sOutput = Comando.executeCommandWithReturn(command,SistemaJFrame.this);
				
				textAreaEncoding.setText(sOutput);
			}
		});
		panel.add(btnMostrarEncoding, "cell 0 0");
		
		textFieldComandoEncoding = new JTextField();
		panel.add(textFieldComandoEncoding, "cell 0 1,growx");
		textFieldComandoEncoding.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, "cell 0 2,grow");
		
		textAreaEncoding = new JTextArea();
		scrollPane.setViewportView(textAreaEncoding);
	}

}
