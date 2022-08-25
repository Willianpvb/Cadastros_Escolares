package bim2pt1;

import java.util.ArrayList;

public class PerfilDisciplina extends Perfil{
    private PerfilProfessor professor ;
    private int codDisciplina = 0;
    private ArrayList turmas = new ArrayList(); 
    private PerfilSetor setor ;
    private ArrayList alunos = new ArrayList();
    
    public PerfilDisciplina(String nome,int codDisciplina,PerfilSetor setor) {
        super(nome);
        this.codDisciplina = codDisciplina;
        this.setor = setor;
    }

    @Override
    public String toString() {
        String tos = "Perfil Disciplina\n"+super.toString();
        if(!(this.setor == null)){tos+="Setor: "+this.setor.getNome()+"\n";}
        if(!(this.professor == null )){tos+="Professor responsavel: "+this.professor.getNome()+"\n";}
        if(!(this.codDisciplina == 0)){tos+="Codigo da Disciplina: "+this.codDisciplina+"\n";}
        if(!this.turmas.toString().equals("[]")){tos+="Turmas: "+this.turmas+"\n";}
        if(!this.alunos.toString().equals("[]")){tos+="Alunos: "+this.alunos+"\n";}
        return tos;
    }
    public void addTurma(PerfilTurma turma){
        turmas.add(turma.getNome());
    }
    public void removerTurma(PerfilTurma turma){
        turmas.remove(turma.getNome());
    }
    
    public void addAluno(PerfilAluno aluno){
        alunos.add(aluno.getNome());
    }
     public void remoAluno(PerfilAluno aluno){
        alunos.remove(aluno.getNome());
    }
         
    public PerfilProfessor getProfessor() {
        return professor;
    }

    public void setProfessor(PerfilProfessor professor) {
        this.professor = professor;
    }

    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public ArrayList getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList turmas) {
        this.turmas = turmas;
    }
    
    
    
}
