package nadar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Marque a caixa e siga para proxima etapa");
		lblTitulo.setFont(new Font("Tw Cen MT", Font.BOLD, 22));
		lblTitulo.setBounds(10, 32, 414, 58);
		frame.getContentPane().add(lblTitulo);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("MARCA");
		chckbxNewCheckBox.setBounds(158, 119, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnFechar.setFont(new Font("Tw Cen MT", Font.PLAIN, 11));
		btnFechar.setBounds(158, 181, 89, 23);
		frame.getContentPane().add(btnFechar);
	}
}
