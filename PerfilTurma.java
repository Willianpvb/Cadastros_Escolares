package bim2pt1;

import java.util.Arrays;

public class PerfilTurma extends Perfil{
    
    private String representate = "";
    private String salap = "";
    private PerfilAluno[] alunos = {};
    private double horarioE = 5;
    private double horarioS = 12;
    private String horario = "De "+Integer.toString((int) horarioE)+" até "+Integer.toString((int) horarioS) ;
    
    public PerfilTurma(String nome,String repre, String sl) {
        super(nome);
        this.representate = repre;
        this.salap =sl;
    }
    @Override
    public String toString() {
        String tos = "Perfil Turma\n"+super.toString();
        if(!(this.representate == null)){tos+="Representante: "+this.representate+"\n";}
        if(!this.salap.equals("")){tos+="Sala da Turma: "+this.getSalap()+"\n";}
        if(!horario.equals("De "+Integer.toString(5)+" até "+Integer.toString(12))){tos+="Horario da Turma: "+this.horario+"\n";}
        if(!Arrays.toString(this.alunos).equals("[]")){tos+= "Alunos: "+Arrays.toString(this.alunos)+"\n"; }
        return tos;
    }
    
    public void alterarHoraEntrada(double horarioE){
        this.horarioE = horarioE;
    }
     public void alterarHoraSaida(double horarioS){
        this.horarioS = horarioS;
    }
    
    public String getRepresentate() {
        return representate;
    }

    public void setRepresentate(String representate) {
        this.representate = representate;
    }

    public String getSalap() {
        return salap;
    }

    public void setSalap(String salap) {
        this.salap = salap;
    }

    public PerfilAluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(PerfilAluno[] alunos) {
        this.alunos = alunos;
    }

    public double getHorarioE() {
        return horarioE;
    }

    public void setHorarioE(double horarioE) {
        this.horarioE = horarioE;
    }

    public double getHorarioS() {
        return horarioS;
    }

    public void setHorarioS(double horarioS) {
        this.horarioS = horarioS;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}
