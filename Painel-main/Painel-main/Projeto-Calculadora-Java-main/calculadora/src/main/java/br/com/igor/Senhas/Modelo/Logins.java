package br.com.igor.Senhas.Modelo;

public class Logins {
    private static Logins instancia = new Logins();
    
    private String nome = "igor.pereira";
    private String senha = "404466Ig@r";
    public static Logins getInstancia() {
        return instancia;
    }
    public String getNome() {
        return nome;
    }
    public String getSenha() {
        return senha;
    }
    
}
