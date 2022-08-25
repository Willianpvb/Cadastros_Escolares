package bim2pt1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PerfilProfessor extends Perfil{
    
    private int matricula = 0;
    private String[] turmas = {};
    private int cargah = 4;
    private String senhaSuap = "";
    private ArrayList disciplinas =  new ArrayList();
    
    
    
    public PerfilProfessor(String nome, int matricula, String[] turma, String senhaSuap,PerfilDisciplina disciplinas ) throws InterruptedException {
        super(nome);
        this.disciplinas.add(disciplinas.getNome());
        this.matricula = matricula;
        this.turmas = turma;
        this.senhaSuap = senhaSuap;
        
    }

    
    @Override
    public String toString() {
        String toS = "Perfil Professor\n"+super.toString();
        if(!turmas.equals("")){toS+="Ensina nas Turmas: "+Arrays.toString(this.turmas)+"\n";}
        if(!disciplinas.toString().equals("[]")){toS+="Disciplina Lecionada: "+this.disciplinas+"\n";}
        if(!(matricula == 0)){toS+= "Matricula: "+this.matricula+"\n";}
        
        return toS; 
    }
    public void aviso(String texto){
        try {
            for(int i = 0; i < 10;i++){
                Thread.sleep(250);
                System.out.print("!");
            }    
            System.out.print("Aviso: "+texto.toUpperCase());
            for(int i = 0; i < 10;i++){
                Thread.sleep(250);
                System.out.print("!");
            }  
            System.out.println("");
        } catch (InterruptedException ex) {
                Logger.getLogger(PerfilProfessor.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        
        

        
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String[] getTurmas() {
        return turmas;
    }

    public void setTurmas(String[] turmas) {
        this.turmas = turmas;
    }

    public int getCargah() {
        return cargah;
    }

    public void setCargah(int cargah) {
        this.cargah = cargah;
    }

    public String getSenhaSuap() {
        return senhaSuap;
    }

    public void setSenhaSuap(String senhaSuap) {
        this.senhaSuap = senhaSuap;
    }

    public ArrayList getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(PerfilDisciplina disciplina) {
        this.disciplinas.add(disciplina.getNome());
    }

}
