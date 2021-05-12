class meuObj{
    int valor;
}

public class Aula02 {
    public static void main (String [] args){
        meuObj o1 = new meuObj();
        o1.valor = 10;   //variavel referencia o objeto
        meuObj o2 = o1;  //variavel referencia o mesmo objeto
       // o1.valor = o1.valor+5; //cria uma nova referencia para o mesmo objeto 
        System.out.println(o1.valor);
        System.out.println(o2.valor);
        //referencias diferentes para o mesmo objeto na memória

        int a = 10;  //tipo primitivo
        int b = a;
        a = a + 5;
        System.out.println("_____________");
        System.out.println(a);
        System.out.println(b);
    }
}
