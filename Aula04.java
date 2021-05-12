public class Aula04 {
    public static void main(String [] args){
        Aula03Carro c = new Aula03Carro();
        c.ano = 2021;
        c.modelo = "Tiggo";
        System.out.println(c.modelo);

        if(15 > 10){
            Aula03Carro c2 = new Aula03Carro();
            c2.ano = 2019;
            System.out.println(c2.ano);
        }

        Aula03Carro c3;
        for(int i=0; i>10; i++){
            c3 = new Aula03Carro();
        }
//        System.out.println(c3);   variavel foi criada fora do escopo e pode ser acessada fora tbm
    }

}

//ciclo de vida de um objeto