package bim2pt1;

import java.util.ArrayList;

public class PerfilSetor extends Perfil{
    
    private int codSetor = 0;
    private ArrayList<PerfilDisciplina> disciplinas = new ArrayList<PerfilDisciplina>();
    private String diretor = "";
    
    
    public PerfilSetor(String nome,int codSetor, String diretor) {
        super(nome);
        this.codSetor = codSetor;
        this.diretor = diretor;
    }
    
    public void addDiciplina(PerfilDisciplina disciplina){
        disciplinas.add(disciplina);
    }
    public void trocarDiretor(String diretor){
        this.diretor = diretor;
    }
    public void removeDiciplina(PerfilDisciplina disciplina){
        disciplinas.remove(disciplina);
    }

    public int getCodSetor() {
        return codSetor;
    }

    public void setCodSetor(int codSetor) {
        this.codSetor = codSetor;
    }

    public ArrayList getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        String tos = "Perfil Setor\n";
        if(!this.diretor.equals("")){tos+="Diretor: "+this.diretor+"\n";}
        if(this.codSetor != 0){tos+="Codigo do Setor: "+this.codSetor+"\n";}
        if(this.diretor.equals("")){tos+= "Diretor do Setor: "+this.diretor+"\n";}
        tos += super.toString();
        if(!(this.disciplinas.toString().equals("[]"))){tos+= "Disciplinas: "+this.disciplinas.toString()+"\n";}
        return tos;
    }
    
    
}
