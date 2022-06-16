package ProjetoSocial;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.*;

public class CadastroProjeto extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtObjetivo;
	private JTextField txtEndereco;
	private JTextField txtData;
	private JTextField txtStatus;

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
		setBounds(100, 100, 540, 382);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Titulo");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(61, 55, 89, 14);
		contentPane.add(lblNewLabel);
		
		txtTitulo = new JTextField();
		txtTitulo.setFont(new Font("Arial", Font.PLAIN, 13));
		txtTitulo.setForeground(Color.BLACK);
		txtTitulo.setBackground(Color.LIGHT_GRAY);
		txtTitulo.setBounds(270, 52, 197, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Objetivo");
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(61, 100, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		txtObjetivo = new JTextField();
		txtObjetivo.setFont(new Font("Arial", Font.PLAIN, 13));
		txtObjetivo.setForeground(Color.BLACK);
		txtObjetivo.setBackground(Color.LIGHT_GRAY);
		txtObjetivo.setBounds(270, 97, 197, 39);
		contentPane.add(txtObjetivo);
		txtObjetivo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Endereco Completo");
		lblNewLabel_2.setBackground(Color.GRAY);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_2.setBounds(61, 150, 146, 14);
		contentPane.add(lblNewLabel_2);
		
		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Arial", Font.PLAIN, 13));
		txtEndereco.setForeground(Color.BLACK);
		txtEndereco.setBackground(Color.LIGHT_GRAY);
		txtEndereco.setBounds(270, 147, 197, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Inicio");
		lblNewLabel_3.setBackground(Color.GRAY);
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_3.setBounds(61, 192, 96, 14);
		contentPane.add(lblNewLabel_3);
		
		txtData = new JTextField();
		txtData.setFont(new Font("Arial", Font.PLAIN, 13));
		txtData.setForeground(Color.BLACK);
		txtData.setBackground(Color.LIGHT_GRAY);
		txtData.setBounds(270, 189, 197, 20);
		contentPane.add(txtData);
		txtData.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("PROJETO SOCIAL");
		lblNewLabel_4.setFont(new Font("Impact", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(184, 10, 138, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Status");
		lblNewLabel_5.setBackground(Color.GRAY);
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_5.setBounds(61, 235, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		txtStatus = new JTextField();
		txtStatus.setFont(new Font("Arial", Font.PLAIN, 13));
		txtStatus.setForeground(Color.BLACK);
		txtStatus.setBackground(Color.LIGHT_GRAY);
		txtStatus.setBounds(270, 232, 197, 20);
		contentPane.add(txtStatus);
		txtStatus.setColumns(10);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent e)  {
				 
				//(String , String txtObjetivo, String txtEndereco, String txtData, String txtStatus)
				try {
					ManipuladorJava.Writer(txtTitulo.getText(), txtObjetivo.getText(), txtEndereco.getText(), txtData.getText(), txtStatus.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, "Projeto Salvo \nClique em Menu para retornar à página inicial.");
				
				
			}
		});
		btnSalvar.setFont(new Font("Arial", Font.BOLD, 13));
		btnSalvar.setBackground(Color.LIGHT_GRAY);
		btnSalvar.setForeground(Color.BLACK);
		btnSalvar.setBounds(233, 290, 89, 23);
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