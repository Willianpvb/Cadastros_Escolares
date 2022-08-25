
package bim2pt1;

public class Postagem {
   private String texto;
   private String foto;
   private String video;

    public Postagem(String texto) {
        this.texto = texto;
        this.foto = "";
        this.video = "";
    }
   
    public Postagem(String Texto,String Foto,String Video){
        this.foto = Foto;
        this.texto = Texto;
        this.video = Video;
    }
    
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Override
    public String toString() {
        String var = "<";
        if(!(this.texto.equals(""))){
            var+= "Texto: "+this.texto+" ";
        }
        if(!(this.foto.equals(""))){
            var+= "| Foto: "+this.foto+" ";
        }
        if(!(this.video.equals(""))){
            var+= "| Video: "+this.video+" ";
        }
        var+=">";
        return var ;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj instanceof Postagem){
            Postagem ex2 = (Postagem) obj;
            if(this.foto.equals(ex2.getFoto()) && this.texto.equals(ex2.getTexto()) && this.video.equals(ex2.getVideo())){
                return true;
            }
        }
    
   
    return false;
    }

}
