package StackOverFlow;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class aprendendogrid2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		JFrame framePrincipal = new JFrame();
		framePrincipal.setLayout(null);
		framePrincipal.setSize(new Dimension(300, 160));
		framePrincipal.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		framePrincipal.setLocationRelativeTo(null);
		JButton entrar = new JButton("entrar");
		entrar.setBackground(new Color(100, 100, 100));
		JButton cancelar = new JButton("Cancelar");
		cancelar.setBackground(new Color(100, 100, 100));
		JLabel nome = new JLabel("login");
		nome.setForeground(Color.white);
		JTextField texto = new JTextField();
		JLabel nomeSenha = new JLabel("Senha");
		nomeSenha.setForeground(Color.white);
		JTextField senha = new JTextField();

		
		texto.setPreferredSize(new Dimension(180,20));
		
		
		JPanel painel = new JPanel();
		JPanel painel1 = new JPanel();
		
		painel.setBackground(new Color(128,128,128));
		painel.setLayout(null);
		nome.setBounds(10, 300, 40,40);
		painel.add(nome);
		texto.setBounds(10, 300, 40,40);
		painel.add(texto);
		painel.add(nomeSenha);
		painel.add(senha);
	
		painel1.add(entrar);
		painel1.add(cancelar);
		painel1.setBackground(new Color(128,128,128));
	
		
		
		
	
		painel.setOpaque(true);
		framePrincipal.getContentPane().setBackground(new Color(128,128,128));
		
		
		
		painel.setVisible(true);
		
		framePrincipal.setResizable(false);
		framePrincipal.add(nome);
		//framePrincipal.add(painel1);
		framePrincipal.setVisible(true);
		
		
		
		
		
		
		
	
		
		
	}
	
}
