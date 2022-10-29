package br.com.igor.Senhas.Visao;

import javax.swing.JFrame;

import java.awt.*;


public class CriadorDeFrame extends JFrame {
    
  

    CriadorDeFrame(Dimension d, Color cor){
        setSize(d);
        setBackground(cor);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getContentPane().setBackground(cor);



    }
    CriadorDeFrame(){
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }


}
