package br.com.igor.Testes;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;
public class Teste {
 
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel janela = new JLabel();
        JLabel janela1 = new JLabel();

        JButton bo = new JButton();
        JButton bo2 = new JButton();
        bo.setPreferredSize(new Dimension(150,30));
        bo2.setPreferredSize(new Dimension(150,30));
        frame.setLayout(new BorderLayout());
        frame.setSize(600,600);


        janela.setLayout(new FlowLayout());
        janela.setForeground(Color.black);
        janela.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        janela.setPreferredSize(new Dimension(180, 60));

        janela1.setLayout(new FlowLayout());
        janela1.setForeground(Color.black);
        janela1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        janela1.setPreferredSize(new Dimension(180, 60));




        janela.add(bo);

        janela1.add(bo2);

        frame.add(janela, BorderLayout.WEST);

        frame.add(janela1, BorderLayout.EAST);

       frame.setVisible(true);
        


    }

}
