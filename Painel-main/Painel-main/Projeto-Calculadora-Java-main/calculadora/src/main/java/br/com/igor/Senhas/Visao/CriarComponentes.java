package br.com.igor.Senhas.Visao;



import br.com.igor.Senhas.Modelo.MemoriaTelaLogin;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;

public class CriarComponentes extends JLabel implements ActionListener{
    private JLabel valor;
    private JTextField caixaTexto;
    private JPasswordField caixaSenha;

    
    static CriarComponentes instancia = new CriarComponentes();
    
    public JTextField getCaixaTexto() {
        return caixaTexto;
    }




    public void setCaixaTexto(JTextField caixaTexto) {
        this.caixaTexto = caixaTexto;
    }




    public JPasswordField getCaixaSenha() {
        return caixaSenha;
    }




    public void setCaixaSenha(JPasswordField caixaSenha) {
        this.caixaSenha = caixaSenha;
    }



	public static CriarComponentes getInstancia() {
		return instancia;
	}



    
	public JLabel criarLabel(String nome ,int distancia, int altura,int larguraDoBotao ,int alturaDoBotao) {
		valor = new JLabel(nome);
        valor.setForeground(Color.white);
		valor.setBounds(distancia,altura,larguraDoBotao,alturaDoBotao);		
		return valor;

	}
	
	public JButton criarBotao(String nome ,int distancia, int altura,int larguraDoBotao ,int alturaDoBotao) {
        JButton botao = new JButton(nome);
		botao.setBounds(distancia,altura,larguraDoBotao,alturaDoBotao);	
        botao.addActionListener(this);	
		return botao;

	}
    public JButton criarBotao(String nome, JFrame T ) {
        JButton botao = new JButton(nome);
        botao.addActionListener(this);
        T.add(botao);	
		return botao;

	}
	
	
	public JTextField criarCaixaDeTexto(int distancia, int altura,int larguraDoBotao ,int alturaDoBotao) {
		JTextField valor = new JTextField();
		valor.setBounds(distancia,altura,larguraDoBotao,alturaDoBotao);
        this.caixaTexto = valor;
		return valor;

	}

    public JPasswordField criarCaixaDeSenha(int distancia, int altura,int larguraDoBotao ,int alturaDoBotao) {
		JPasswordField valor = new JPasswordField();
		valor.setBounds(distancia,altura,larguraDoBotao,alturaDoBotao);
        this.caixaSenha = valor;
		return valor;

	}

 

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton botao = (JButton) e.getSource();
            MemoriaTelaLogin.getInstancia().processarComando(botao.getText());
         }
        
    }

}