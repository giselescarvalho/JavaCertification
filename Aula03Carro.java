public class Aula03Carro{
    String modelo;
    int ano;
    Aula03Carro (){
        this.ano = 2021; // ou somente ano = 2014; no construtor
    }                    // é opcional pois n tem nenhuma outra variavel com o nome ano
    void resete(){
        this.ano = 2021; //no método
    }
    public String getDadosImpr(){ //método
        return this.modelo + " : " + ano;
    }
    public void setModelo(String Modelo){
        this.modelo = modelo;
    }
}

