package PRACTICA4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.util.Calendar;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import PRACTICA2_3.*;
import java.awt.event.ActionListener;

public class PedidoGUI extends JFrame {

	PedidoDAO PDAO = new PedidoDAO();

	private JTextField tf_idpedido;
	private JTextField tf_idcliente;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PedidoGUI frame = new PedidoGUI(args);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PedidoGUI(final String [] args) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitulo = new JLabel("NUEVO PEDIDO");
		lblTitulo.setBounds(11, 12, 239, 31);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));

		JLabel lblIDPedido = new JLabel("ID Pedido");
		lblIDPedido.setBounds(11, 54, 97, 24);
		lblIDPedido.setForeground(new Color(147, 112, 219));
		lblIDPedido.setFont(new Font("Arial", Font.BOLD, 14));

		JLabel lblIDCliente = new JLabel("ID Cliente");
		lblIDCliente.setBounds(11, 105, 97, 24);
		lblIDCliente.setForeground(new Color(147, 112, 219));
		lblIDCliente.setFont(new Font("Arial", Font.BOLD, 14));

		JLabel lblComentarios = new JLabel("Comentarios");
		lblComentarios.setBounds(293, 181, 97, 24);
		lblComentarios.setForeground(new Color(147, 112, 219));
		lblComentarios.setFont(new Font("Arial", Font.BOLD, 14));

		final JTextArea txtrComentarios = new JTextArea();
		txtrComentarios.setBounds(396, 182, 173, 106);

		tf_idpedido = new JTextField();
		tf_idpedido.setBounds(99, 54, 151, 26);
		tf_idpedido.setColumns(15);
		tf_idpedido.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();

				if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
					e.consume();
				}
			}
		});

		tf_idcliente = new JTextField();
		tf_idcliente.setBounds(99, 105, 151, 26);
		tf_idcliente.setColumns(10);
		tf_idcliente.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();

				// Verificar si la tecla pulsada no es un digito
				if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /* corresponde a BACK_SPACE */)) {
					e.consume(); // ignorar el evento de teclado
				}
			}
		});

		JLabel fechaPedido = new JLabel("Fecha de creacion");
		fechaPedido.setBounds(10, 163, 130, 24);
		fechaPedido.setForeground(new Color(147, 112, 219));
		fechaPedido.setFont(new Font("Arial", Font.BOLD, 14));

		JLabel fechaEsperada = new JLabel("Fecha esperada");
		fechaEsperada.setBounds(11, 198, 119, 24);
		fechaEsperada.setForeground(new Color(147, 112, 219));
		fechaEsperada.setFont(new Font("Arial", Font.BOLD, 14));

		JLabel fechaEntrega = new JLabel("Fecha de entrega");
		fechaEntrega.setBounds(11, 229, 152, 24);
		fechaEntrega.setForeground(new Color(147, 112, 219));
		fechaEntrega.setFont(new Font("Arial", Font.BOLD, 14));

		JLabel estado = new JLabel("Estado");
		estado.setBounds(11, 264, 97, 24);
		estado.setForeground(new Color(147, 112, 219));
		estado.setFont(new Font("Arial", Font.BOLD, 14));

		JSpinner spinnerFechaPedido = new JSpinner();
		spinnerFechaPedido.setBounds(150, 166, 119, 20);
		spinnerFechaPedido.setModel(
				new SpinnerDateModel(new Date(1606863600000L), new Date(1606863600000L), null, Calendar.DAY_OF_YEAR));

		JSpinner spinnerFechaEsperada = new JSpinner();
		spinnerFechaEsperada.setBounds(150, 201, 119, 20);
		spinnerFechaEsperada.setModel(
				new SpinnerDateModel(new Date(1606863600000L), new Date(1606863600000L), null, Calendar.DAY_OF_YEAR));

		JSpinner spinnerFechaEntrega = new JSpinner();
		spinnerFechaEntrega.setBounds(150, 232, 119, 20);
		spinnerFechaEntrega.setModel(
				new SpinnerDateModel(new Date(1606863600000L), new Date(1606863600000L), null, Calendar.DAY_OF_MONTH));

		JComboBox<String> comboBox_estado = new JComboBox<String>();
		comboBox_estado.setBounds(150, 264, 115, 26);
		comboBox_estado.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_estado.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Entregado", "Facturando" }));

		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(424, 312, 101, 46);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		Border line = new LineBorder(Color.BLACK);
		Border margin = new EmptyBorder(5, 15, 5, 15);
		Border compound = new CompoundBorder(line, margin);
		btnNewButton.setBorder(compound);
		btnNewButton.setBounds(11, 312, 145, 27);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
				Pedido p = new  Pedido.PedidoBuilder(5).setFecha_creacion((Date) spinnerFechaPedido.getValue()).
						setFecha_entrega((Date) spinnerFechaEntrega.getValue()).build();
				PDAO.guardar(p);

				txtrComentarios.setText(null);
				tf_idcliente.setText(null);
				tf_idpedido.setText(null);
				
				} catch (Exception e2) {
					
					e2.printStackTrace();
				}
			}
		});
		
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		
		JButton btnNewButton_1 = new JButton("Volver al menu");
		btnNewButton_1.setBounds(486, 331, 101, 46);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.WHITE);
		Border line2 = new LineBorder(Color.BLACK);
		Border margin2 = new EmptyBorder(5, 15, 5, 15);
		Border compound2 = new CompoundBorder(line2, margin2);
		btnNewButton_1.setBorder(compound2);
		btnNewButton_1.setBounds(11, 312, 145, 27);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				dispose();
				Main.main(args);
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 16));
		contentPane.setLayout(null);
		contentPane.add(lblTitulo);
		contentPane.add(lblIDPedido);
		contentPane.add(tf_idpedido);
		contentPane.add(lblComentarios);
		contentPane.add(txtrComentarios);
		contentPane.add(lblIDCliente);
		contentPane.add(tf_idcliente);
		contentPane.add(fechaEntrega);
		contentPane.add(fechaEsperada);
		contentPane.add(fechaPedido);
		contentPane.add(spinnerFechaEsperada);
		contentPane.add(spinnerFechaPedido);
		contentPane.add(spinnerFechaEntrega);
		contentPane.add(btnNewButton);
		contentPane.add(estado);
		contentPane.add(comboBox_estado);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("X");
		btnNewButton_2.setBounds(486, 331, 101, 46);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBackground(Color.WHITE);
		Border line1 = new LineBorder(Color.BLACK);
		Border margin1 = new EmptyBorder(5, 15, 5, 15);
		Border compound1 = new CompoundBorder(line1, margin1);
		btnNewButton_2.setBorder(compound1);
		btnNewButton_2.setBounds(11, 312, 145, 27);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(EXIT_ON_CLOSE);
				
			}
		});
		btnNewButton_2.setBounds(480, 12, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
