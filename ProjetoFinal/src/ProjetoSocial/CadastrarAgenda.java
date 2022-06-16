package ProjetoSocial;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class CadastrarAgenda extends JFrame {

	private JPanel contentPane;
	private JTextField txtDataA;
	private JTextField txtHora;
	private JTextField txtDesc;
	private JTextField txtAcao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarAgenda frame = new CadastrarAgenda();
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
	public CadastrarAgenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 377);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Projeto Social");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 15));
		lblNewLabel.setBounds(211, 10, 95, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Data");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(132, 81, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hora");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_2.setBounds(132, 117, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Descri\u00E7\u00E3o");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_3.setBounds(132, 156, 77, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("A\u00E7\u00E3o");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_4.setBounds(132, 192, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		txtDataA = new JTextField();
		txtDataA.setBackground(Color.LIGHT_GRAY);
		txtDataA.setBounds(297, 79, 95, 20);
		contentPane.add(txtDataA);
		txtDataA.setColumns(10);
		
		txtHora = new JTextField();
		txtHora.setBackground(Color.LIGHT_GRAY);
		txtHora.setColumns(10);
		txtHora.setBounds(297, 114, 95, 20);
		contentPane.add(txtHora);
		
		txtDesc = new JTextField();
		txtDesc.setBackground(Color.LIGHT_GRAY);
		txtDesc.setColumns(10);
		txtDesc.setBounds(297, 150, 95, 20);
		contentPane.add(txtDesc);
		
		txtAcao = new JTextField();
		txtAcao.setBackground(Color.LIGHT_GRAY);
		txtAcao.setColumns(10);
		txtAcao.setBounds(297, 189, 95, 20);
		contentPane.add(txtAcao);
		
		JButton btnVoltaAgenda = new JButton("Menu");
		btnVoltaAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu frame = new Menu();
				frame.setVisible(true); 
			}
		});
		btnVoltaAgenda.setBackground(Color.LIGHT_GRAY);
		btnVoltaAgenda.setFont(new Font("Arial", Font.BOLD, 11));
		btnVoltaAgenda.setBounds(10, 9, 67, 20);
		contentPane.add(btnVoltaAgenda);
		
		JButton btnSalvaAgenda = new JButton("SALVAR");
		btnSalvaAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ManipuladorJava.WriterAgenda(txtDataA.getText(), txtObjetivo.getText(), txtEndereco.getText(), txtData.getText(), txtStatus.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "Projeto Salvo \nClique em Menu para retornar à página inicial.");
			}
		});
		btnSalvaAgenda.setBackground(Color.LIGHT_GRAY);
		btnSalvaAgenda.setFont(new Font("Arial", Font.BOLD, 13));
		btnSalvaAgenda.setBounds(212, 250, 107, 23);
		contentPane.add(btnSalvaAgenda);
	}
}
