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

public class Menu extends JFrame {

	private JPanel contentPane;
	public String nameFile;
	//private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 375);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnAgenda = new JButton("Cadastrar Agenda");
		Image img = new ImageIcon(this.getClass().getResource("/schedule1.png")).getImage();
		btnAgenda.setIcon(new ImageIcon(img));
		btnAgenda.setForeground(Color.BLACK);
		btnAgenda.setBackground(Color.LIGHT_GRAY);
		btnAgenda.setFont(new Font("Arial", Font.BOLD, 13));
		btnAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastrarAgenda frame = new CadastrarAgenda();
				frame.setVisible(true); 
			}
		});
		btnAgenda.setBounds(149, 158, 210, 40);
		contentPane.add(btnAgenda);
		
		JButton btnProjeto = new JButton("Cadastrar Projeto");
		Image img3 = new ImageIcon(this.getClass().getResource("/create.png")).getImage();
		btnProjeto.setIcon(new ImageIcon(img3));
		btnProjeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroProjeto frame = new CadastroProjeto();
				frame.setVisible(true); 
			}
		});
		btnProjeto.setForeground(Color.BLACK);
		btnProjeto.setBackground(Color.LIGHT_GRAY);
		btnProjeto.setFont(new Font("Arial", Font.BOLD, 13));
		btnProjeto.setBounds(149, 107, 210, 40);
		contentPane.add(btnProjeto);
		
		JButton btnArquivo = new JButton("Carregar Arquivo");
		Image img4 = new ImageIcon(this.getClass().getResource("/upload.png")).getImage();
		btnArquivo.setIcon(new ImageIcon(img4));
		btnArquivo.setForeground(Color.BLACK);
		btnArquivo.setBackground(Color.LIGHT_GRAY);
		btnArquivo.setFont(new Font("Arial", Font.BOLD, 13));
		btnArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameFile = JOptionPane.showInputDialog(null, "Insira o nome do arquivo");
				try {
					ManipuladorJava.Reading(nameFile);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Arquivo Criado com Sucesso");
			}
		});
		btnArquivo.setBounds(149, 214, 210, 40);
		contentPane.add(btnArquivo);
		
		JButton btnSair = new JButton("Sair");
		Image img5 = new ImageIcon(this.getClass().getResource("/close.png")).getImage();
		btnSair.setIcon(new ImageIcon(img5));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Encerrando o programa...");
				System.exit(5);
			}
		});
		btnSair.setForeground(Color.BLACK);
		btnSair.setBackground(Color.LIGHT_GRAY);
		btnSair.setFont(new Font("Arial", Font.BOLD, 13));
		btnSair.setBounds(197, 270, 117, 34);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("Projeto Social");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 15));
		lblNewLabel.setBounds(210, 11, 101, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnCriarArquivo = new JButton("Criar Arquivo");
		Image img6 = new ImageIcon(this.getClass().getResource("/txt.png")).getImage();
		btnCriarArquivo.setIcon(new ImageIcon(img6));
		btnCriarArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameFile = JOptionPane.showInputDialog(null, "Insira o nome do arquivo");
				try {
					ManipuladorJava.CriarArquivo(nameFile);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnCriarArquivo.setForeground(Color.BLACK);
		btnCriarArquivo.setFont(new Font("Arial", Font.BOLD, 13));
		btnCriarArquivo.setBackground(Color.LIGHT_GRAY);
		btnCriarArquivo.setBounds(149, 56, 210, 40);
		contentPane.add(btnCriarArquivo);
	}
}
