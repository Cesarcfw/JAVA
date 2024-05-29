package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Telateste {

	private JFrame frame;
	private JTextField textlogin;
	private JTextField textsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telateste window = new Telateste();
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
	public Telateste() {
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
		
		JButton btnsaida = new JButton("sair");
		btnsaida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnsaida.setBounds(156, 204, 89, 23);
		frame.getContentPane().add(btnsaida);
		
		JButton btnlimpar = new JButton("Limpar");
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textlogin.setText(null);
				textsenha.setText(null);
			}
		});
		btnlimpar.setBounds(255, 204, 89, 23);
		frame.getContentPane().add(btnlimpar);
		
		JButton btnAcesso = new JButton("Acessar");
		btnAcesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = textlogin.getText();
				String senha= textsenha.getText();
				Telaentrada.main(null);
			}
		});
		btnAcesso.setBounds(57, 204, 89, 23);
		frame.getContentPane().add(btnAcesso);
		
		textlogin = new JTextField();
		textlogin.setBounds(67, 76, 287, 20);
		frame.getContentPane().add(textlogin);
		textlogin.setColumns(10);
		
		textsenha = new JTextField();
		textsenha.setBounds(67, 129, 287, 20);
		frame.getContentPane().add(textsenha);
		textsenha.setColumns(10);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(190, 51, 46, 14);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(190, 107, 46, 14);
		frame.getContentPane().add(lblSenha);
	}
}
