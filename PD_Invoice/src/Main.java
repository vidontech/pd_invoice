import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;

public class Main {

	private JFrame frmPdInvoice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmPdInvoice.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}
	//test
	/**
	 * Initialize the contents of the frame.
	 */
	//test2
	private void initialize() {
		frmPdInvoice = new JFrame();
		frmPdInvoice.setTitle("PD Invoice");
		frmPdInvoice.setBounds(100, 100, 450, 300);
		frmPdInvoice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPdInvoice.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 261);
		frmPdInvoice.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("\u041D\u043E\u0432\u0430", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("\u0421\u043F\u0440\u0430\u0432\u043A\u0438", null, panel_1, null);
	}
}
