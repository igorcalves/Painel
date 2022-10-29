package br.com.igor.Senhas.Visao;

import javax.swing.JFrame;

import java.awt.*;

public class SegundoPainel {

    private final static SegundoPainel instancia = new SegundoPainel();

    public static  SegundoPainel getInstancia() {
        return instancia;
    }

    public static void main(String[] args) {
        CriadorDeFrame segundaT = new CriadorDeFrame();
        segundaT.setExtendedState(JFrame.MAXIMIZED_BOTH);
        segundaT.getContentPane().setBackground(Color.GRAY);    
        segundaT.setLayout(new FlowLayout());
        CriarComponentes BotoesCima = new CriarComponentes();
        CriarComponentes BotoesCima1 = new CriarComponentes();
        CriarComponentes BotoesCima2 = new CriarComponentes();


        BotoesCima.criarBotao("Func1", segundaT);
        BotoesCima1.criarBotao("Func1", segundaT);
        BotoesCima2.criarBotao("Func1", segundaT);
        










        segundaT.setVisible(true);
    }

     
  

    
    
}
