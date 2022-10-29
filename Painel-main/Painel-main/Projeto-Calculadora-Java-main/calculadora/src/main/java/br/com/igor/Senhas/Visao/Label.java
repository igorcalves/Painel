package br.com.igor.Senhas.Visao;

import java.awt.Color;

import javax.swing.JLabel;

public class Label extends JLabel{
     JLabel label;

    Label(){
        
    }

    public JLabel criarLabel(String nome){
         label = new JLabel(nome);
         label.setForeground(Color.BLACK);
        return label;
    }
    
}
