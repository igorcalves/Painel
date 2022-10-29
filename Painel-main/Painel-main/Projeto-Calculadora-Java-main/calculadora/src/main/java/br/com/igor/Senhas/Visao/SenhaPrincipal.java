package br.com.igor.Senhas.Visao;

import javax.swing.JFrame;

import br.com.igor.Senhas.Modelo.Memoria;

public class SenhaPrincipal extends JFrame {
    public static JFrame painelPrincipal;
    public static void main(String[] args) {
        
       TelaDeLogin t1 = new TelaDeLogin();
       t1.criarTelaLogin();
       



       

      

    
}

public static void criart(){
    Memoria.getInstancia().zerar();
    painelPrincipal = NovoPainel.CriarPainel();
}
}


