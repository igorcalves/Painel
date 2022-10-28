package StackOverFlow;

import java.awt.Color;

import javax.swing.JFrame;

public class CriadoDeTelaLogin {

	
	static final CriadoDeTelaLogin instancia = new CriadoDeTelaLogin();

	public static CriadoDeTelaLogin getInstancia() {
		return instancia;
	}
	
	public JFrame criarTela() {
		JFrame tela = new JFrame();
		tela.setLayout(null);
		tela.setSize(300,300);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
			
		
		tela.getContentPane().setBackground(Color.gray);
		tela.setLocationRelativeTo(null);
		tela.add(CriarComponentes.instancia.criarLabel("Nome", 60, 40, 70, 40));
		tela.add(CriarComponentes.instancia.criarCaixaDeTexto(60, 70, 170, 20));
		tela.add(CriarComponentes.instancia.criarLabel("Senha", 60, 90, 70, 40));
		tela.add(CriarComponentes.instancia.criarCaixaDeTexto(60, 120,170, 20));
		tela.add(CriarComponentes.instancia.criarBotao("Entrar", 100, 160, 70, 25));
		tela.add(CriarComponentes.instancia.criarBotao("Cancelar", 180, 160, 85, 25));

	
		tela.setVisible(true);
		
		return tela;
	}
}
