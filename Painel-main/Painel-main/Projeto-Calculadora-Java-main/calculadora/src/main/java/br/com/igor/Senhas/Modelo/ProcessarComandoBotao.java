package br.com.igor.Senhas.Modelo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.com.igor.Senhas.Visao.Display;
import br.com.igor.Senhas.Visao.MostrarTexto;
import br.com.igor.Senhas.Visao.SenhaPrincipal;
import br.com.igor.Senhas.Visao.tecladoSenha;

import java.awt.*;



public class ProcessarComandoBotao {
    public static JFrame painelPrincipalSenha;
    public JFrame painelEntrada;

    public static String Log_deslog(String valor){
        if(ProcessarSenha.instancia.Processar(valor)){
            SenhaPrincipal.painelPrincipal.dispose();
            JOptionPane.showMessageDialog(null,"Senha correta Parabéns");
            MostrarTexto.Mostrar();
            valor = "";
        }
        else{
            valor = "erro";
        }

        return valor;
    }

    public static JFrame CriarPainel(){
       
        JFrame janela = new JFrame("Senha");
        janela.setLayout(new BorderLayout());
        janela.setSize(229, 339);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Display display = new Display();
        display.setPreferredSize(new Dimension(225, 60));
        janela.add(display, BorderLayout.NORTH);
        janela.setVisible(true);
        return janela;
        
    }

    public static JFrame cadastrarSenha(){
        SenhaPrincipal.painelPrincipal.dispose();
        JOptionPane.showMessageDialog(null,"Vamos Cadastrar sua nova Senha");
        painelPrincipalSenha = CriarPainel();
        tecladoSenha tecladoSenha = new tecladoSenha();
        painelPrincipalSenha.add(tecladoSenha);

        return painelPrincipalSenha;
        
       
    }

    public static void criart(){
        Memoria.getInstancia().zerar();
        painelPrincipalSenha = cadastrarSenha();
    }


}
