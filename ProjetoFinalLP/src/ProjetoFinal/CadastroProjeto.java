package ProjetoFinal;

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
			
			JLabel lblTitulo = new JLabel("Titulo:");
			lblTitulo.setForeground(Color.BLACK);
			lblTitulo.setFont(new Font("Arial", Font.BOLD, 13));
			lblTitulo.setBackground(Color.GRAY);
			lblTitulo.setBounds(61, 52, 89, 14);
			contentPane.add(lblTitulo);
			
			textTitulo = new JTextField();
			textTitulo.setFont(new Font("Arial", Font.BOLD, 13));
			textTitulo.setForeground(Color.BLACK);
			textTitulo.setBackground(Color.GRAY);
			textTitulo.setBounds(216, 52, 197, 20);
			contentPane.add(textTitulo);
			textTitulo.setColumns(10);
			
			JLabel lblObjetivo = new JLabel("Objetivo:");
			lblObjetivo.setBackground(Color.GRAY);
			lblObjetivo.setForeground(Color.BLACK);
			lblObjetivo.setFont(new Font("Arial", Font.BOLD, 13));
			lblObjetivo.setBounds(61, 86, 89, 14);
			contentPane.add(lblObjetivo);
			
			textObjetivo = new JTextField();
			textObjetivo.setFont(new Font("Arial", Font.BOLD, 13));
			textObjetivo.setForeground(Color.BLACK);
			textObjetivo.setBackground(Color.GRAY);
			textObjetivo.setBounds(216, 83, 197, 20);
			contentPane.add(textObjetivo);
			textObjetivo.setColumns(10);
			
			JLabel lblEndere = new JLabel("Endereco Completo:");
			lblEndere.setBackground(Color.GRAY);
			lblEndere.setForeground(Color.BLACK);
			lblEndere.setFont(new Font("Arial", Font.BOLD, 13));
			lblEndere.setBounds(60, 120, 146, 14);
			contentPane.add(lblEndere);
			
			textEndereco = new JTextField();
			textEndereco.setFont(new Font("Arial", Font.BOLD, 13));
			textEndereco.setForeground(Color.BLACK);
			textEndereco.setBackground(Color.GRAY);
			textEndereco.setBounds(216, 117, 197, 20);
			contentPane.add(textEndereco);
			textEndereco.setColumns(10);
			
			JLabel lblData = new JLabel("Data de Inicio:");
			lblData.setBackground(Color.GRAY);
			lblData.setForeground(Color.BLACK);
			lblData.setFont(new Font("Arial", Font.BOLD, 13));
			lblData.setBounds(61, 154, 125, 14);
			contentPane.add(lblData);
			
			textData = new JTextField();
			textData.setFont(new Font("Arial", Font.BOLD, 13));
			textData.setForeground(Color.BLACK);
			textData.setBackground(Color.GRAY);
			textData.setBounds(216, 148, 197, 20);
			contentPane.add(textData);
			textData.setColumns(10);
			
			JLabel lblNewLabel_4 = new JLabel("CADASTRE SEU PROJETO SOCIAL");
			lblNewLabel_4.setFont(new Font("Impact", Font.PLAIN, 14));
			lblNewLabel_4.setBounds(121, 11, 197, 20);
			contentPane.add(lblNewLabel_4);
			
			JLabel lblStatus = new JLabel("Status:");
			lblStatus.setBackground(Color.GRAY);
			lblStatus.setForeground(Color.BLACK);
			lblStatus.setFont(new Font("Arial", Font.BOLD, 13));
			lblStatus.setBounds(61, 188, 46, 14);
			contentPane.add(lblStatus);
			
			textStatus = new JTextField();
			textStatus.setFont(new Font("Arial", Font.BOLD, 13));
			textStatus.setForeground(Color.BLACK);
			textStatus.setBackground(Color.GRAY);
			textStatus.setBounds(216, 185, 197, 20);
			contentPane.add(textStatus);
			textStatus.setColumns(10);
			
			JButton btnSalvar = new JButton("SALVAR");
			btnSalvar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnSalvar.setFont(new Font("Arial", Font.BOLD, 13));
			btnSalvar.setBackground(Color.GRAY);
			btnSalvar.setForeground(Color.BLACK);
			btnSalvar.setBounds(162, 227, 89, 23);
			contentPane.add(btnSalvar);
		}
	}



