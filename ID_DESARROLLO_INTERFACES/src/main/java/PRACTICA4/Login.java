package PRACTICA4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textUsername;
	private JPasswordField textPassword;
	
	private static final String usuario = "admin";
	private static final String contraseña = "admin";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		
		//PANEL PRINCIPAL//
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//PANEL DEL USUARIO//
		JPanel panel = new JPanel();
		panel.setBackground(new Color(123, 104, 238));
		panel.setBounds(317, 144, 250, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//TEXTO DE USERNAME//
		textUsername = new JTextField();
		textUsername.setBackground(new Color(255, 255, 224));
		textUsername.setText("Username");
		textUsername.setBounds(10, 11, 170, 20);
		panel.add(textUsername);
		textUsername.setColumns(10);
		
		//PANEL DE LA CONTRASEÑA//
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(123, 104, 238));
		panel_1.setBounds(317, 195, 250, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		//TEXTO DE LA CONTRASEÑA//
		textPassword = new JPasswordField();
		textPassword.setBackground(new Color(255, 255, 224));
		textPassword.setText("Password");
		textPassword.setBounds(10, 11, 170, 20);
		panel_1.add(textPassword);
		
		
		//BOTON DE CERRAR EL JFRAME//
		JButton botonX = new JButton("X");
		botonX.setForeground(Color.BLACK);
		botonX.setBackground(Color.WHITE);
		Border line = new LineBorder(Color.BLACK);
		Border margin = new EmptyBorder(5, 15, 5, 15);
		Border compound = new CompoundBorder(line, margin);
		botonX.setBorder(compound);
		botonX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(EXIT_ON_CLOSE);
				
			}
		});
		botonX.setBackground(new Color(192, 192, 192));
		botonX.setBounds(545, 11, 45, 31);
		contentPane.add(botonX);
		
		
		//CHECKBOX DE LA CONTRASEÑA//
		JCheckBox checkBox = new JCheckBox("Ver contraseña");
		checkBox.setForeground(Color.BLACK);
		checkBox.setBackground(Color.WHITE);
		Border line2 = new LineBorder(Color.BLACK);
		Border margin3 = new EmptyBorder(5, 15, 5, 15);
		Border compound4 = new CompoundBorder(line2, margin3);
		botonX.setBorder(compound4);
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkBox.isSelected()) {
					
					textPassword.setEchoChar((char)0);
					
				} else {
					
					textPassword.setEchoChar('*');
					
				}
				
			}
		});
		checkBox.setBounds(317, 250, 113, 23);
		contentPane.add(checkBox);
		
		
		//BOTON DE LOGIN PARA ACCEDER A LA PANTALLA DOS//
		JButton botonLogin = new JButton("LOGIN");
		botonLogin.setForeground(Color.BLACK);
		botonLogin.setBackground(Color.WHITE);
		Border line3 = new LineBorder(Color.BLACK);
		Border margin4 = new EmptyBorder(5, 15, 5, 15);
		Border compound5 = new CompoundBorder(line3, margin4);
		botonLogin.setBorder(compound5);
		botonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!usuario.equals("admin") && !contraseña.equals("admin")) {
					
					JOptionPane.showMessageDialog(null, "Usuario y contraseña incorrectos.");
					
				} else {
					
					CreateUser_Pedido CUP = new CreateUser_Pedido();
					CUP.setVisible(true);
				}
				
				
			}
		});
		
		botonLogin.setBounds(368, 294, 156, 40);
		contentPane.add(botonLogin);
		
		
		//IMAGEN DE FONDO BBDD//
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\arbex\\OneDrive\\Escritorio\\BBDD.png"));
		lblNewLabel.setBounds(0, 0, 298, 400);
		contentPane.add(lblNewLabel);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		
	}
}
