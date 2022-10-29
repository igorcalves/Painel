package br.com.igor.Senhas.Modelo;

import javax.swing.JOptionPane;

import br.com.igor.Senhas.Visao.SenhaPrincipal;

public class ProcessarSenha {

    public static ProcessarSenha instancia = new ProcessarSenha();

    
    private  String senha;
    
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void cadastrasSenha(String senha){
        this.senha = senha;
    }

    public  Boolean Processar(String valor){
        if(valor.equals(senha)){
         return true;   
        }
        return false;
    
}
    public ProcessarSenha getInstancia() {
        return instancia;
    }

    public void confirmarSenha(String valor){
        String numero = JOptionPane.showInputDialog("Digite A senha Novamente!");
        while (!numero.equals(valor)){  
             numero = JOptionPane.showInputDialog("Senha Diferente da Cadastrada!!!");
             
        }
        JOptionPane.showMessageDialog(null,"Senha Cadastrada com sucesso");
        setSenha(valor);
        ProcessarComandoBotao.painelPrincipalSenha.dispose();
        SenhaPrincipal.criart();
    }

}