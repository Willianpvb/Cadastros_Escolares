package bim2pt1;

public class PerfilAluno extends Perfil{
    
    private int matricula = 0;
    private String turma = "";
    private int cargah = 4;
    private String senhaSuap = "";
    
    public PerfilAluno(String nome, int matricula, String turma, String senhaSuap ) throws InterruptedException {
        super(nome);
        this.matricula = matricula;
        this.turma = turma;
        this.senhaSuap = senhaSuap;
    }

    @Override
    public String toString() {
        String toS = "Perfil Aluno\n"+super.toString();
        if(!turma.equals("")){toS+="Turma: "+this.turma+"\n";}
        if(!(matricula == 0)){toS+= "Matricula: "+this.matricula+"\n";}
        return toS; 
        
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
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

    
    
   
   

    
    
    
}
