package PRACTICA4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import PRACTICA2_3.*;

public class ClienteGUI extends JFrame {

	List<Cliente> misClientes = new ArrayList<Cliente>();
	ClienteDAO clienteDao = new ClienteDAO();
	private JPanel contentPane;
	private JTextField nombre;
	private JTextField idCliente;
	private JTextField documento;
	private JTextField email;
	private JTextField contraseña;
	private JTextField nombreCliente;
	private JTextField apellidoCliente;
	private JTextField telefono;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 * @throws MisExcepciones
	 */
	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteGUI frame = new ClienteGUI(args);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws MisExcepciones
	 */
	public ClienteGUI(final String[] args) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 462);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbl_TITULO = new JLabel("NUEVO CLIENTE");
		lbl_TITULO.setBounds(11, 11, 254, 43);
		lbl_TITULO.setBackground(Color.WHITE);
		lbl_TITULO.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TITULO.setFont(new Font("Arial", Font.BOLD, 22));

		JLabel lblNombre = new JLabel("Alias");
		lblNombre.setBounds(350, 105, 94, 17);
		lblNombre.setForeground(new Color(147, 112, 219));
		lblNombre.setFont(new Font("Arial", Font.BOLD, 14));

		nombre = new JTextField();
		nombre.setBounds(473, 103, 149, 20);
		nombre.setColumns(10);

		JLabel lblIdcliente = new JLabel("ID Cliente");
		lblIdcliente.setBounds(350, 71, 94, 20);
		lblIdcliente.setForeground(new Color(147, 112, 219));
		lblIdcliente.setBackground(new Color(147, 112, 219));
		lblIdcliente.setFont(new Font("Arial", Font.BOLD, 14));

		idCliente = new JTextField();
		idCliente.setBounds(473, 72, 149, 20);
		idCliente.setColumns(10);
		idCliente.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /* corresponde a BACK_SPACE */)) {
					e.consume();
				}
			}
		});

		JLabel lblTipoDocumento = new JLabel("Tipo Documento");
		lblTipoDocumento.setBounds(350, 174, 114, 17);
		lblTipoDocumento.setForeground(new Color(147, 112, 219));
		lblTipoDocumento.setFont(new Font("Arial", Font.BOLD, 14));

		final JComboBox<TipoDeDocumento> JComboBox_TipoDocumento = new JComboBox<TipoDeDocumento>();
		JComboBox_TipoDocumento.setBounds(486, 171, 102, 21);
		JComboBox_TipoDocumento.setBackground(new Color(147, 112, 219));
		JComboBox_TipoDocumento.setFont(new Font("Tahoma", Font.BOLD, 14));
		JComboBox_TipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(
				new TipoDeDocumento[] { TipoDeDocumento.DNI, TipoDeDocumento.NIE }));

		if (JComboBox_TipoDocumento.getName() == "DNI") {

		}
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setBounds(11, 720, 92, 17);
		lblDocumento.setForeground(new Color(147, 112, 219));
		lblDocumento.setFont(new Font("Arial", Font.BOLD, 14));

		documento = new JTextField();
		documento.setBounds(132, 719, 151, 20);
		documento.setColumns(10);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(11, 745, 92, 20);
		lblEmail.setForeground(new Color(147, 112, 219));
		lblEmail.setFont(new Font("Arial", Font.BOLD, 14));

		email = new JTextField();
		email.setBounds(132, 746, 151, 20);
		email.setColumns(10);

		JLabel lblPassword = new JLabel("Contraseña");
		lblPassword.setBounds(350, 133, 81, 20);
		lblPassword.setForeground(new Color(147, 112, 219));
		lblPassword.setFont(new Font("Arial", Font.BOLD, 14));
		contraseña = new JTextField();
		contraseña.setBounds(473, 134, 149, 20);
		contraseña.setColumns(10);

		JLabel lblNombreCliente = new JLabel("Nombre Cliente");
		lblNombreCliente.setBounds(350, 257, 111, 20);
		lblNombreCliente.setForeground(new Color(147, 112, 219));
		lblNombreCliente.setFont(new Font("Arial", Font.BOLD, 14));

		nombreCliente = new JTextField();
		nombreCliente.setBounds(471, 258, 151, 20);
		nombreCliente.setColumns(10);

		JLabel lblApellidoCliente = new JLabel("Apellido Cliente");
		lblApellidoCliente.setBounds(350, 288, 111, 20);
		lblApellidoCliente.setForeground(new Color(147, 112, 219));
		lblApellidoCliente.setFont(new Font("Arial", Font.BOLD, 14));

		apellidoCliente = new JTextField();
		apellidoCliente.setBounds(471, 289, 151, 20);
		apellidoCliente.setColumns(10);

		JLabel lblTelefono = new JLabel("Tel\u00E9fono");
		lblTelefono.setBounds(350, 224, 111, 20);
		lblTelefono.setForeground(new Color(147, 112, 219));
		lblTelefono.setFont(new Font("Arial", Font.BOLD, 14));

		telefono = new JTextField();
		telefono.setBounds(471, 225, 151, 20);
		telefono.setColumns(10);
		telefono.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
					e.consume();
				}
			}
		});

		final JLabel lblNewLabel = new JLabel("Ha habido un error al crear el usuario, porfavor pruebe de nuevo");
		lblNewLabel.setBounds(11, 434, 488, 17);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setVisible(false);

		JButton btnNewButton = new JButton("CREAR");
		btnNewButton.setBounds(486, 331, 101, 46);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		Border line = new LineBorder(Color.BLACK);
		Border margin = new EmptyBorder(5, 15, 5, 15);
		Border compound = new CompoundBorder(line, margin);
		btnNewButton.setBorder(compound);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					apellidoCliente.setText(null);
					documento.setText(null);
					email.setText(null);
					idCliente.setText(null);
					nombre.setText(null);
					nombreCliente.setText(null);
					contraseña.setText(null);
					telefono.setText(null);

				} catch (Exception e1) {
					lblNewLabel.setVisible(true);
					e1.printStackTrace();

				}
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));

		JButton btnNewButton_1 = new JButton("MENU");
		btnNewButton_1.setBounds(496, 393, 75, 24);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.WHITE);
		Border line2 = new LineBorder(Color.BLACK);
		Border margin2 = new EmptyBorder(5, 15, 5, 15);
		Border compound2 = new CompoundBorder(line2, margin2);
		btnNewButton_1.setBorder(compound2);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main.main(args);
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		JButton botonX = new JButton("X");
		botonX.setBounds(583, 12, 39, 27);
		botonX.setForeground(Color.BLACK);
		botonX.setBackground(Color.WHITE);
		Border line1 = new LineBorder(Color.BLACK);
		Border margin1 = new EmptyBorder(5, 15, 5, 15);
		Border compound1 = new CompoundBorder(line1, margin1);
		botonX.setBorder(compound1);
		botonX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(EXIT_ON_CLOSE);
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(lblEmail);
		contentPane.add(lblDocumento);
		contentPane.add(lblTelefono);
		contentPane.add(lblNombreCliente);
		contentPane.add(lblApellidoCliente);
		contentPane.add(telefono);
		contentPane.add(apellidoCliente);
		contentPane.add(nombreCliente);
		contentPane.add(email);
		contentPane.add(documento);
		contentPane.add(lblPassword);
		contentPane.add(contraseña);
		contentPane.add(lblIdcliente);
		contentPane.add(idCliente);
		contentPane.add(lblNombre);
		contentPane.add(nombre);
		contentPane.add(lblTipoDocumento);
		contentPane.add(JComboBox_TipoDocumento);
		contentPane.add(lbl_TITULO);
		contentPane.add(botonX);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\arbex\\OneDrive\\Escritorio\\nuevo usuario.png"));
		lblNewLabel_1.setBounds(-130, -71, 470, 577);
		contentPane.add(lblNewLabel_1);
	}
}
