
package bim2pt1;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    
    private String login ;
    private String senha ;
    private String email ;
    private ArrayList<Perfil> perfis = new ArrayList<Perfil>();

    public Usuario(String login, String senha, String email){
        this.login = login;
        this.senha = senha;
        this.email = email;
    }
    
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite senha: ");
        String senhal = s.next();
        if(senhal.equals(this.senha)){
            this.senha = senha;
        }else{
            System.out.println("Use este metodo novamente");
        }
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Perfil> getPerfis() {
        return perfis;
    }
    public void setPerfis(Perfil perfis) {
        this.perfis.add(perfis);
    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Usuario)){
            return false;
        }else{
            Usuario ex3 = (Usuario) obj;
            if(!(this.email.equals(ex3.getEmail())) && this.login.equals(ex3.getLogin()) && this.senha.equals(ex3.senha) ){
                if(!(this.perfis.equals(ex3.getPerfis()))){
                    return false;
                }
            }
        }
        
        return true;
    }
    @Override
    public String toString() {
        
        String to = "";
        if(!(login.equals(""))){
            to+= "Usuario - "+this.login+"\n";
        }
        if(!(email.equals(""))){
            to+= "e-mail: "+this.email+"\n";
        }
        if(!(this.perfis.toString().equals("[]"))){
            to+= "Perfis -\n"+this.perfis.toString()+"\n";
        }
        
        return to ;
    }
    
    public String addperfil(Perfil perfil){
        this.perfis.add(perfil);
        return "Perfil Atualizado";
    }
    public void excluirPerfil(Perfil perfil){
        this.perfis.remove(perfil);
    }
}
