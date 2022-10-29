package br.com.igor.Senhas.Visao;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MostrarTexto {

    public static void Mostrar(){
        JFrame tela = new JFrame();
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setPreferredSize(new Dimension(300, 300));
        String text = "Igor Alves\nÉ o dono desse Programa\nSe saia";
        JTextArea textoarea = new JTextArea(text);
        textoarea.setLineWrap(true);
        textoarea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textoarea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        tela.add(scrollPane);
        tela.pack();
        tela.setVisible(true);


       
    }
    
}
