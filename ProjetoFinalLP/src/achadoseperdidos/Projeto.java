package achadoseperdidos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class Projeto extends JFrame {

	private JPanel contentPane;
	private JTextField textTitulo;
	private JTextField textObjetivo;
	private JTextField textEndereco;
	private JTextField textData;
	private JTextField textStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Projeto frame = new Projeto();
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
	public Projeto() {
		setForeground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Titulo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setBounds(10, 56, 89, 14);
		contentPane.add(lblNewLabel);
		
		textTitulo = new JTextField();
		textTitulo.setBackground(Color.LIGHT_GRAY);
		textTitulo.setBounds(117, 53, 89, 20);
		contentPane.add(textTitulo);
		textTitulo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Objetivo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 102, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		textObjetivo = new JTextField();
		textObjetivo.setBackground(Color.LIGHT_GRAY);
		textObjetivo.setBounds(117, 99, 89, 20);
		contentPane.add(textObjetivo);
		textObjetivo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Endereco Completo");
		lblNewLabel_2.setForeground(UIManager.getColor("Button.focus"));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 144, 115, 14);
		contentPane.add(lblNewLabel_2);
		
		textEndereco = new JTextField();
		textEndereco.setBackground(Color.LIGHT_GRAY);
		textEndereco.setBounds(120, 141, 86, 20);
		contentPane.add(textEndereco);
		textEndereco.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Inicio");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 182, 96, 14);
		contentPane.add(lblNewLabel_3);
		
		textData = new JTextField();
		textData.setBackground(Color.LIGHT_GRAY);
		textData.setBounds(120, 179, 86, 20);
		contentPane.add(textData);
		textData.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("PROJETO SOCIAL");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_4.setBounds(135, 11, 130, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Status");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 225, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textStatus = new JTextField();
		textStatus.setBackground(Color.LIGHT_GRAY);
		textStatus.setBounds(120, 222, 86, 20);
		contentPane.add(textStatus);
		textStatus.setColumns(10);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(278, 221, 89, 23);
		contentPane.add(btnSalvar);
	}
}
