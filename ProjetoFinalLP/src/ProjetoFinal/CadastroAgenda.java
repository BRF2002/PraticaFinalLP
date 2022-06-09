package ProjetoFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class CadastroAgenda extends JFrame {


		private JPanel contentPane;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						CadastroAgenda frame = new CadastroAgenda();
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
		public CadastroAgenda() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBackground(Color.WHITE);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Projeto Social");
			lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 14));
			lblNewLabel.setBounds(163, 11, 95, 14);
			contentPane.add(lblNewLabel);
			
			JLabel lblDataAgnd = new JLabel("Data:");
			lblDataAgnd.setFont(new Font("Arial", Font.BOLD, 13));
			lblDataAgnd.setBounds(63, 59, 46, 14);
			contentPane.add(lblDataAgnd);
			
			JLabel lblHoraAgnd = new JLabel("Hora:");
			lblHoraAgnd.setFont(new Font("Arial", Font.BOLD, 13));
			lblHoraAgnd.setBounds(63, 101, 46, 14);
			contentPane.add(lblHoraAgnd);
			
			JLabel lblNewLabel_2_1 = new JLabel("Descri\u00E7\u00E3o:");
			lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 13));
			lblNewLabel_2_1.setBounds(63, 149, 75, 14);
			contentPane.add(lblNewLabel_2_1);
			
			textField = new JTextField();
			textField.setForeground(Color.BLACK);
			textField.setFont(new Font("Arial", Font.BOLD, 13));
			textField.setColumns(10);
			textField.setBackground(Color.GRAY);
			textField.setBounds(163, 56, 197, 20);
			contentPane.add(textField);
			
			textField_1 = new JTextField();
			textField_1.setForeground(Color.BLACK);
			textField_1.setFont(new Font("Arial", Font.BOLD, 13));
			textField_1.setColumns(10);
			textField_1.setBackground(Color.GRAY);
			textField_1.setBounds(163, 98, 197, 20);
			contentPane.add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setForeground(Color.BLACK);
			textField_2.setFont(new Font("Arial", Font.BOLD, 13));
			textField_2.setColumns(10);
			textField_2.setBackground(Color.GRAY);
			textField_2.setBounds(163, 146, 197, 20);
			contentPane.add(textField_2);
			
			textField_3 = new JTextField();
			textField_3.setForeground(Color.BLACK);
			textField_3.setFont(new Font("Arial", Font.BOLD, 13));
			textField_3.setColumns(10);
			textField_3.setBackground(Color.GRAY);
			textField_3.setBounds(163, 192, 197, 20);
			contentPane.add(textField_3);
			
			JLabel lblNewLabel_2_1_1 = new JLabel("A\u00E7\u00E3o:");
			lblNewLabel_2_1_1.setFont(new Font("Arial", Font.BOLD, 13));
			lblNewLabel_2_1_1.setBounds(63, 195, 75, 14);
			contentPane.add(lblNewLabel_2_1_1);
		}
	}
