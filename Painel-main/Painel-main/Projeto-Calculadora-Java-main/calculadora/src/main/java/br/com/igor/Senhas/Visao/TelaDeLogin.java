package br.com.igor.Senhas.Visao;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;







public class TelaDeLogin {

    public void criarTelaLogin(){
        
        JPanel labelPrincipal = new JPanel();

        JLabel botao = new JLabel();
        botao.setLayout(new FlowLayout(FlowLayout.TRAILING));
        JButton entrar = new JButton("Entrar");
        JButton cancelar = new JButton("Canelar");

       
        JFrame telaL = new JFrame();
        telaL.getContentPane();
        telaL.setLayout(new GridLayout(2,2));
    
        telaL.setLocationRelativeTo(null);
        telaL.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        telaL.setSize(320,150);

        
        Label labelLogin = new Label();
        labelLogin.criarLabel("Login  ");

        Label labelSenha = new Label();
        labelSenha.criarLabel("Senha");        
        JTextField textoLogin = new JTextField(20);

        
        JTextField textoSenha = new JTextField(20);
        

        botao.add(entrar);
        botao.add(cancelar);

        labelPrincipal.add(labelLogin.label);
        labelPrincipal.add(textoLogin);
        labelPrincipal.add(labelSenha.label);
        labelPrincipal.add(textoSenha);
        //labelPrincipal.setBackground(new Color(128,128 ,128));
        botao.setBackground(new Color(128,128 ,128));

        telaL.add(labelPrincipal);
        telaL.add(botao, BorderLayout.PAGE_END);


       
        telaL.setVisible(true);
    }
    
}
