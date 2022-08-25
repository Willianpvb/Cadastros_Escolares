
package bim2pt1;

public enum Genero {
    MASCULINO("Masculino"),Feminino("Feminino"),INDEFINIDO("Indefinido");

    private String tipo = "";
    Genero(String tipo){ 
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
   
}
