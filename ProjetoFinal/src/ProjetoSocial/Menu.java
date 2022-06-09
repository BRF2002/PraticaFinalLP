package ProjetoSocial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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

public class Menu extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAgenda = new JButton("Cadastrar Agenda");
		btnAgenda.setForeground(Color.BLACK);
		btnAgenda.setBackground(Color.GRAY);
		btnAgenda.setFont(new Font("Arial", Font.BOLD, 13));
		btnAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAgenda.setBounds(143, 104, 148, 23);
		contentPane.add(btnAgenda);
		
		JButton btnProjeto = new JButton("Cadastrar Projeto");
		btnProjeto.setForeground(Color.BLACK);
		btnProjeto.setBackground(Color.GRAY);
		btnProjeto.setVerticalAlignment(SwingConstants.TOP);
		btnProjeto.setFont(new Font("Arial", Font.BOLD, 13));
		btnProjeto.setBounds(143, 53, 148, 23);
		contentPane.add(btnProjeto);
		
		JButton btnArquivo = new JButton("Carregar Arquivo");
		btnArquivo.setForeground(Color.BLACK);
		btnArquivo.setBackground(Color.GRAY);
		btnArquivo.setFont(new Font("Arial", Font.BOLD, 13));
		btnArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnArquivo.setBounds(143, 155, 148, 23);
		contentPane.add(btnArquivo);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setForeground(Color.BLACK);
		btnSair.setBackground(Color.GRAY);
		btnSair.setFont(new Font("Arial", Font.BOLD, 13));
		btnSair.setBounds(174, 208, 89, 23);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("Projeto Social");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 15));
		lblNewLabel.setBounds(172, 11, 101, 14);
		contentPane.add(lblNewLabel);
	}
}
