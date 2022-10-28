package StackOverFlow;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CriarComponentes extends JLabel{
	
	static CriarComponentes instancia = new CriarComponentes();
	public static CriarComponentes getInstancia() {
		return instancia;
	}

	private JLabel valor;
	public JLabel criarLabel(String nome ,int distancia, int altura,int larguraDoBotao ,int alturaDoBotao) {
		valor = new JLabel(nome);
		valor.setForeground(Color.white);
		valor.setBounds(distancia,altura,larguraDoBotao,alturaDoBotao);
		
		return valor;

	}
	
	public JButton criarBotao(String nome ,int distancia, int altura,int larguraDoBotao ,int alturaDoBotao) {
		JButton valor = new JButton(nome);
		valor.setBounds(distancia,altura,larguraDoBotao,alturaDoBotao);
		
		return valor;

	}
	
	
	public JTextField criarCaixaDeTexto(int distancia, int altura,int larguraDoBotao ,int alturaDoBotao) {
		JTextField valor = new JTextField();
		valor.setBounds(distancia,altura,larguraDoBotao,alturaDoBotao);

		return valor;

	}
	
	
}
