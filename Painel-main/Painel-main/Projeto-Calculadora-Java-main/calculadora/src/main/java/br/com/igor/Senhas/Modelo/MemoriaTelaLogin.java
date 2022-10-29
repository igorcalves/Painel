package br.com.igor.Senhas.Modelo;

import javax.swing.JOptionPane;

import br.com.igor.Senhas.Visao.CriarComponentes;
import br.com.igor.Senhas.Visao.SenhaPrincipal;

public class MemoriaTelaLogin {

    private static MemoriaTelaLogin instancia = new MemoriaTelaLogin();

    public static MemoriaTelaLogin getInstancia() {
        return instancia;
    }
    public void processarComando(String textoAtual){
        if("Entrar".equals(textoAtual)){
            if(CriarComponentes.getInstancia()
            .getCaixaTexto()
            .getText()
            .equals(Logins.getInstancia().getNome())&&
            CriarComponentes.getInstancia()
            .getCaixaSenha()
            .getText()
            .equals(Logins.getInstancia().getSenha())){
                SenhaPrincipal.painelSenha.dispose();
                SenhaPrincipal.criart();

            }else{
                JOptionPane.showMessageDialog(null, "Login ou Senha Invalida");
            }
        }

        if("Cancelar".equals(textoAtual)){
            SenhaPrincipal.painelSenha.dispose();
        }


    
}
}