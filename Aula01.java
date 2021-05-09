/*public class Aula01 {
    public static void main(String[]args){
        int idade;                  //variavel local
        idade = 15;                 //inicializando ou int idade = 15;
        System.out.println(idade);  //pode ser impressa
    }
}
*/

class Motor{
}

class Carro {
    int ano;
    char primeiraLetra;
    boolean usado;
    Motor motor;
    String marca;
}

public class Aula01 {
    public static void main (String [] args){
        boolean [] valores = new boolean[10];
        System.out.println(valores[0]);

        Carro carro = new Carro();
        System.out.println(carro.ano);
        System.out.println(carro.primeiraLetra);
        System.out.println(carro.usado);
        System.out.println(carro.motor);
        System.out.println(carro.marca);
    }
}