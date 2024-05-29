package nadar;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JProgressBar;

public class Tela1 {

	private JFrame frame;
	private JTextField textLogin;
	private JLabel lblsenha;
	private JPasswordField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 window = new Tela1();
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
	public Tela1() {
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
		
		JLabel lbllogin = new JLabel("Login");
		lbllogin.setForeground(new Color(0, 0, 0));
		lbllogin.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		lbllogin.setHorizontalAlignment(SwingConstants.CENTER);
		lbllogin.setBounds(197, 56, 46, 14);
		frame.getContentPane().add(lbllogin);
		
		textLogin = new JTextField();
		textLogin.setBounds(84, 81, 273, 20);
		frame.getContentPane().add(textLogin);
		textLogin.setColumns(10);
		
		lblsenha = new JLabel("Senha");
		lblsenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblsenha.setForeground(Color.BLACK);
		lblsenha.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		lblsenha.setBounds(197, 112, 46, 14);
		frame.getContentPane().add(lblsenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Teste", "root", "");
					Statement stmt = con.createStatement();
					String sql = "select * from aluno where login='" + textLogin.getText()+"' and senha='"+textSenha.getText()+"'";
					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Login com Sucesso");
						textLogin.setText(null);
						textSenha.setText(null);
						Inicio.main(null);
				}else {
					JOptionPane.showMessageDialog(null, "Login não permitido");
						textLogin.setText(null);
						textSenha.setText(null);
				}
					con.close();
				} catch (Exception e1) {
					
					System.out.print(e1);}
				
				
				
				
				
				/*String usuario = textLogin.getText();
					String senha= textSenha.getText();
					Inicio.main(null);*/
			}
		});
		btnEntrar.setFont(new Font("Tw Cen MT", Font.PLAIN, 11));
		btnEntrar.setBounds(175, 168, 89, 23);
		frame.getContentPane().add(btnEntrar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnFechar.setFont(new Font("Tw Cen MT", Font.PLAIN, 11));
		btnFechar.setBounds(84, 209, 89, 23);
		frame.getContentPane().add(btnFechar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textLogin.setText(null);
				textSenha.setText(null);
			}
		});
		btnLimpar.setFont(new Font("Tw Cen MT", Font.PLAIN, 11));
		btnLimpar.setBounds(268, 209, 89, 23);
		frame.getContentPane().add(btnLimpar);
		
		textSenha = new JPasswordField();
		textSenha.setBounds(84, 137, 273, 20);
		frame.getContentPane().add(textSenha);
	}
}
