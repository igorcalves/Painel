package br.com.igor.Testes;

import javax.swing.JFrame;
import java.awt.*;
public class Teste extends JFrame {


    public void organizarLayout(Dimension d){
        
        setSize(d);
        setVisible(true);
    }
 public static void main(String[] args) {
    Teste nova = new Teste();

    nova.organizarLayout(new Dimension(800,800));

 }

}
