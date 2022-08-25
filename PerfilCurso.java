package bim2pt1;

import java.util.ArrayList;

public class PerfilCurso extends Perfil{
    
    private int codCurso = 0;
    private String diretor = "";
    private String sala = "";
    private ArrayList professores = new ArrayList();
    private ArrayList Alunos = new ArrayList();
    
    public PerfilCurso(String nome,int codCurso, String diretor, String sala) {
        super(nome);
        this.codCurso = codCurso;
        this.diretor = diretor;
        this.sala = sala;
    }

    public void addAluno(PerfilAluno aluno){
        this.Alunos.add(aluno.getNome());
    }
    public void tirarAluno(PerfilAluno aluno){
        this.Alunos.remove(aluno.getNome());
    }
    
    public void adicionarProfessor(PerfilProfessor feso){
        professores.add(feso.getNome());
    }
    
    public void removerProfessor(PerfilProfessor feso){
        professores.remove(feso.getNome());
    }
    
    public void mudarSala(String sl){
        this.sala = sl;
    }

    public ArrayList getAlunos() {
        return Alunos;
    }

    public void setAlunos(ArrayList Alunos) {
        this.Alunos = Alunos;
    }

    
    
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public ArrayList getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList professores) {
        this.professores = professores;
    }

    @Override
    public String toString() {
        String tos ="Perfil Curso\n";
        if(!(this.codCurso == 0)){tos+="Codigo do Curso: "+this.getCodCurso()+"\n";}
        if(!this.diretor.equals("")){tos+="Diretor: "+this.diretor+"\n";}
        if(!this.sala.equals("")){tos+="Sala: "+this.getSala()+"\n";}
        if(!this.professores.toString().equals("[]")){tos+="Professores: "+this.professores.toString()+"\n";}
        tos+= super.toString();
        return tos;
    }
    
    
}
