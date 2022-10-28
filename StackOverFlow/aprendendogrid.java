package StackOverFlow;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class aprendendogrid extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		JFrame framePrincipal = new JFrame();
		framePrincipal.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 70));
		framePrincipal.setSize(new Dimension(300, 300));
		framePrincipal.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		framePrincipal.setLocationRelativeTo(null);
		JButton entrar = new JButton("entrar");
		JButton cancelar = new JButton("Cancelar");
	
		JLabel nome = new JLabel("login");
		nome.setForeground(Color.white);
		JTextField texto = new JTextField();
		JLabel nomeSenha = new JLabel("Senha");
		nomeSenha.setForeground(Color.white);
		JTextField senha = new JTextField();
		JLabel espacar = new JLabel("\n");
		
		texto.setPreferredSize(new Dimension(180,20));
		
		
		JPanel painel = new JPanel();
		painel.setBackground(new Color(128,128,128));
		painel.setLayout(new BoxLayout(painel,BoxLayout.Y_AXIS));
		painel.add(nome);
		painel.add(texto);
		painel.add(nomeSenha);
		painel.add(senha);
		painel.add(espacar);
		painel.add(entrar);
		painel.add(cancelar);
		
		
		
	
		painel.setOpaque(true);
		framePrincipal.getContentPane().setBackground(new Color(128,128,128));
		
		
		
		painel.setVisible(true);
		
		framePrincipal.add(painel);
		
		framePrincipal.setVisible(true);
		
		
		
		
		
		
		
	
		
		
	}
	
}
