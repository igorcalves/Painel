package br.com.igor.Senhas.Visao;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
public class TelaLogin {

	
	
	public  JFrame criarTela() {
		CriadorDeFrame tela = new CriadorDeFrame(new Dimension(300,240), Color.gray);
		tela.setLayout(null);
        tela.setUndecorated(true);
		CriarComponentes entrar = new CriarComponentes();
        CriarComponentes cancelar = new CriarComponentes();

        JLabel textoPrincipal = new JLabel("Tela De Login Igor");
        textoPrincipal.setBounds(70,10,180,40);
        textoPrincipal.setFont(new Font("helvetica", Font.BOLD, 15));
			
		tela.setLocationRelativeTo(null);
        tela.add(textoPrincipal);
		tela.add(CriarComponentes.instancia.criarLabel("Nome", 60, 40, 70, 40));
		tela.add(CriarComponentes.instancia.criarCaixaDeTexto(60, 70, 170, 20));
		tela.add(CriarComponentes.instancia.criarLabel("Senha", 60, 90, 70, 40));
		tela.add(CriarComponentes.instancia.criarCaixaDeSenha(60, 120,170, 20));
		tela.add(entrar.criarBotao("Entrar", 100, 160, 70, 25));
		tela.add(cancelar.criarBotao("Cancelar", 180, 160, 85, 25));

	
		tela.setVisible(true);
		return tela;
	}
}
