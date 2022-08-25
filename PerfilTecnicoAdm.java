package bim2pt1;
public class PerfilTecnicoAdm extends Perfil{
    
    private int matricula = 0;
    private String cargo = "";
    private PerfilSetor st;
    
    public PerfilTecnicoAdm(String nome,int mat, String cargo,PerfilSetor st) {
        super(nome);
        this.cargo = cargo;
        this.matricula = mat;
        this.st = st;
    }

    public PerfilSetor getSetor() {
        return st;
    }

    public void setSetor(PerfilSetor st) {
        this.st = st;
    }
    

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        String tos = "Perfil Tecnico ADM\n"+super.toString();
        if(!this.st.toString().equals("[]")){tos+= "Setor: "+this.st.getNome()+"\n";}
        if(!(this.matricula == 0)){tos+= "Matricula: "+this.matricula+"\n";}
        if(!this.cargo.equals("")){tos+= "Cargo: "+this.cargo+"\n";}
        return tos;
    }
    
    
}
