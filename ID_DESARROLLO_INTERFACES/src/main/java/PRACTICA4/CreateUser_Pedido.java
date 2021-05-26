package PRACTICA4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateUser_Pedido extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateUser_Pedido frame = new CreateUser_Pedido();
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
	public CreateUser_Pedido() {

		// PANEL PRINCIPAL//
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128)));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// IMAGEN DE FONDO BBDD//
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\arbex\\OneDrive\\Escritorio\\BBDD.png"));
		lblNewLabel.setBounds(0, 0, 298, 400);
		contentPane.add(lblNewLabel);
		
		//BOTON DE CREAR EL CLIENTE//
		JButton botonCrearCliente = new JButton("CREAR CLIENTE");
		botonCrearCliente.setForeground(Color.BLACK);
		botonCrearCliente.setBackground(Color.WHITE);
		Border line = new LineBorder(Color.BLACK);
		Border margin = new EmptyBorder(5, 15, 5, 15);
		Border compound = new CompoundBorder(line, margin);
		botonCrearCliente.setBorder(compound);
		
		botonCrearCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				try {
					ClienteGUI.main(null);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		botonCrearCliente.setBounds(355, 160, 174, 40);
		contentPane.add(botonCrearCliente);
		
		//BOTON DE CREAR EL PEDIDO//
		JButton btnCrearPedido = new JButton("CREAR PEDIDO");
		btnCrearPedido.setForeground(Color.BLACK);
		btnCrearPedido.setBackground(Color.WHITE);
		Border line1 = new LineBorder(Color.BLACK);
		Border margin2 = new EmptyBorder(5, 15, 5, 15);
		Border compound3 = new CompoundBorder(line1, margin2);
		btnCrearPedido.setBorder(compound3);
		
		btnCrearPedido.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				PedidoGUI PGUI = new PedidoGUI(null);
				PGUI.setVisible(true);
				
			}
		});
		
		btnCrearPedido.setBounds(355, 229, 174, 40);
		contentPane.add(btnCrearPedido);
		
		//BOTON DE CERRAR EL FRAME//
		JButton botonX = new JButton("X");
		botonX.setForeground(Color.BLACK);
		botonX.setBackground(Color.WHITE);
		Border line2 = new LineBorder(Color.BLACK);
		Border margin3 = new EmptyBorder(5, 15, 5, 15);
		Border compound4 = new CompoundBorder(line2, margin3);
		botonX.setBorder(compound4);
		
		botonX.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				System.exit(EXIT_ON_CLOSE);
			}
		});
		
		botonX.setBounds(501, 11, 89, 23);
		contentPane.add(botonX);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		
		
	}

}
