package PRACTICA2_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;

public class VistaPractica {

	private JFrame frame;
	private JTextField textFieldID;
	private JTextField textFieldNOMBRE;
	private JTextField textFieldCORREO;
	private JTextField textFieldTLF;
	private JTextField textFieldDRCC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPractica window = new VistaPractica();
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
	public VistaPractica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 383, 236);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATOS");
		lblNewLabel.setBounds(10, 11, 69, 29);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setBounds(30, 51, 16, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setBounds(30, 76, 49, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Correo\r\n:");
		lblNewLabel_3.setBounds(30, 101, 46, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tel\u00E9fono:");
		lblNewLabel_4.setBounds(30, 126, 53, 14);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Direcci\u00F3n:");
		lblNewLabel_5.setBounds(30, 151, 53, 14);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.getContentPane().add(lblNewLabel_5);
		
		textFieldID = new JTextField();
		textFieldID.setBounds(101, 49, 86, 20);
		frame.getContentPane().add(textFieldID);
		textFieldID.setColumns(10);
		
		textFieldNOMBRE = new JTextField();
		textFieldNOMBRE.setBounds(101, 74, 86, 20);
		frame.getContentPane().add(textFieldNOMBRE);
		textFieldNOMBRE.setColumns(10);
		
		textFieldCORREO = new JTextField();
		textFieldCORREO.setBounds(101, 99, 86, 20);
		frame.getContentPane().add(textFieldCORREO);
		textFieldCORREO.setColumns(10);
		
		textFieldTLF = new JTextField();
		textFieldTLF.setBounds(101, 124, 86, 20);
		frame.getContentPane().add(textFieldTLF);
		textFieldTLF.setColumns(10);
		
		textFieldDRCC = new JTextField();
		textFieldDRCC.setBounds(101, 149, 86, 20);
		frame.getContentPane().add(textFieldDRCC);
		textFieldDRCC.setColumns(10);
		
		JButton btnNewButton = new JButton("GUARDAR");
		btnNewButton.setBounds(197, 48, 143, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LISTAR");
		btnNewButton_1.setBounds(197, 73, 143, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("editar");
		btnNewButton_2.setBounds(197, 98, 73, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("OK");
		btnNewButton_3.setBounds(271, 98, 69, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("ELIMINAR");
		btnNewButton_4.setBounds(197, 126, 143, 45);
		frame.getContentPane().add(btnNewButton_4);
		
	}
}
