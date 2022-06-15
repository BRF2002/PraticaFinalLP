package ProjetoSocial;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroProjeto extends JFrame {

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
					CadastroProjeto frame = new CadastroProjeto();
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
	public CadastroProjeto() {
		setForeground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Titulo");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(61, 52, 89, 14);
		contentPane.add(lblNewLabel);
		
		textTitulo = new JTextField();
		textTitulo.setFont(new Font("Arial", Font.PLAIN, 13));
		textTitulo.setForeground(Color.BLACK);
		textTitulo.setBackground(Color.LIGHT_GRAY);
		textTitulo.setBounds(216, 52, 197, 20);
		contentPane.add(textTitulo);
		textTitulo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Objetivo");
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(61, 86, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		textObjetivo = new JTextField();
		textObjetivo.setFont(new Font("Arial", Font.PLAIN, 13));
		textObjetivo.setForeground(Color.BLACK);
		textObjetivo.setBackground(Color.LIGHT_GRAY);
		textObjetivo.setBounds(216, 83, 197, 20);
		contentPane.add(textObjetivo);
		textObjetivo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Endereco Completo");
		lblNewLabel_2.setBackground(Color.GRAY);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_2.setBounds(60, 120, 146, 14);
		contentPane.add(lblNewLabel_2);
		
		textEndereco = new JTextField();
		textEndereco.setFont(new Font("Arial", Font.PLAIN, 13));
		textEndereco.setForeground(Color.BLACK);
		textEndereco.setBackground(Color.LIGHT_GRAY);
		textEndereco.setBounds(216, 117, 197, 20);
		contentPane.add(textEndereco);
		textEndereco.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Inicio");
		lblNewLabel_3.setBackground(Color.GRAY);
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_3.setBounds(61, 154, 96, 14);
		contentPane.add(lblNewLabel_3);
		
		textData = new JTextField();
		textData.setFont(new Font("Arial", Font.PLAIN, 13));
		textData.setForeground(Color.BLACK);
		textData.setBackground(Color.LIGHT_GRAY);
		textData.setBounds(216, 148, 197, 20);
		contentPane.add(textData);
		textData.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("PROJETO SOCIAL");
		lblNewLabel_4.setFont(new Font("Impact", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(163, 11, 138, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Status");
		lblNewLabel_5.setBackground(Color.GRAY);
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_5.setBounds(61, 188, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textStatus = new JTextField();
		textStatus.setFont(new Font("Arial", Font.PLAIN, 13));
		textStatus.setForeground(Color.BLACK);
		textStatus.setBackground(Color.LIGHT_GRAY);
		textStatus.setBounds(216, 185, 197, 20);
		contentPane.add(textStatus);
		textStatus.setColumns(10);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalvar.setFont(new Font("Arial", Font.BOLD, 13));
		btnSalvar.setBackground(Color.LIGHT_GRAY);
		btnSalvar.setForeground(Color.BLACK);
		btnSalvar.setBounds(162, 227, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnVoltaProjeto = new JButton("Menu");
		btnVoltaProjeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu frame = new Menu();
				frame.setVisible(true); 
			}
		});
		btnVoltaProjeto.setFont(new Font("Arial", Font.BOLD, 11));
		btnVoltaProjeto.setBackground(Color.LIGHT_GRAY);
		btnVoltaProjeto.setBounds(10, 9, 67, 20);
		contentPane.add(btnVoltaProjeto);
	}
}