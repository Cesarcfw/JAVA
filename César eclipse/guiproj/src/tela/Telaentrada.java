package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Telaentrada {

	private JFrame frmLoginMalFeito;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telaentrada window = new Telaentrada();
					window.frmLoginMalFeito.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Telaentrada() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginMalFeito = new JFrame();
		frmLoginMalFeito.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\autologon\\Desktop\\lgotorto.png"));
		frmLoginMalFeito.setTitle("Login mal feito");
		frmLoginMalFeito.setBounds(100, 100, 450, 300);
		frmLoginMalFeito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginMalFeito.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(53, 188, 253));
		panel.setBounds(76, 30, 271, 40);
		frmLoginMalFeito.getContentPane().add(panel);
		
		JLabel lblPainel = new JLabel("Teste tela de login");
		lblPainel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblPainel);
		
		JButton btnsair = new JButton("Sair");
		btnsair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnsair.setBounds(164, 157, 89, 23);
		frmLoginMalFeito.getContentPane().add(btnsair);
	}
}
