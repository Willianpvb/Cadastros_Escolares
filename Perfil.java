package bim2pt1;

import java.util.ArrayList;

public abstract class Perfil {
    private String quemsou = "";
    private String nome = "";
    private String site = "";
    private String genero = "";
    private ArrayList seguidores = new ArrayList();
    private ArrayList seguindo = new ArrayList();   
    private ArrayList<Postagem> postagens = new ArrayList<Postagem>();
    
    public Perfil(String nome) {
        this.nome = nome;
    }
    public ArrayList<Perfil> getSeguidores() {
        return seguidores;
    }
    public void setSeguidores(ArrayList<Perfil> seguidores) {
        this.seguidores = seguidores;
    }
    public ArrayList<Perfil> getSeguindo() {
        return seguindo;
    }
    public void setSeguindo(ArrayList<Perfil> seguindo) {
        this.seguindo = seguindo;
    } 
    public String getQuemsou() {
        return quemsou;
    }
    public void setQuemsou(String quemsou) {
        this.quemsou = quemsou;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSite() {
        return site;
    }
    public void setSite(String site) {
        this.site = site;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero.getTipo();
    }
    public ArrayList<Postagem> getPostagens() {
        return postagens;
    }
    public void setPostagens(Postagem postagens) {
        this.postagens.add(postagens);
    }

    @Override
    public boolean equals(Object obj) {
        
        if(!(obj instanceof Perfil))
            return false;
        Perfil ex = (Perfil) obj;
        if(this.nome.equals(ex.getNome()) && this.genero.equals(ex.getGenero()) && this.quemsou.equals(ex.getQuemsou()) && this.site.equals(ex.getSite()) ){
            if(this.postagens.equals(ex.getPostagens()) && this.seguidores.equals(ex.getSeguidores()) && this.seguindo.equals(ex.getSeguindo())){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        String toP = "";
        if(!(this.quemsou.equals(""))){
           toP+="Perfil: "+this.quemsou+"\n";
        }
        if(!(this.nome.equals(""))){
           toP+="Nome: "+this.nome+"\n";
        } 
        if(!(this.site.equals(""))){
           toP+="Site: "+this.site+"\n";
        } 
        if(!(this.genero.equals(""))){
           toP+="Genero: "+this.genero+"\n";
        } 
        if(!(this.seguidores.toString().equals("[]"))){
            toP+= "Seguidores: "+this.seguidores+"\n";
        }
        if(!(this.seguindo.toString().equals("[]"))){
            toP+= "Seguindo: "+this.seguindo+"\n";
        }
        if(!(this.postagens.toString().equals("[]"))){
            toP+= "Postagens: "+this.postagens.toString()+"\n" ;
        }
        return  toP; 
    }
    
    public void addSeguidor(Perfil seguidor){
        this.seguidores.add(seguidor.getNome());
    }
    public void addPostagem(Postagem post){
        this.postagens.add(post);
    }
    public void seguir(Perfil seguir){
        this.seguindo.add(seguir.getNome());
    }   
    
}
