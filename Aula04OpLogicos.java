public class Aula04OpLogicos {
    public static boolean metodo(String msg) {
        System.out.println(msg);
        return true;
    }
    public static void main(String args[]) {
        System.out.println(1 == 1 & 1>2); //false conector logicos
        System.out.println(1 == 1 && 1>2);//se o primeiro entrar na condicao, ne executa o segundo
        System.out.println(1 == 1 && metodo("primeiro"));
        System.out.println("__________");
        System.out.println(1 == 1 | 2<1); //true pq é OU
        System.out.println(1 == 1 || 2<1);
        System.out.println(2 != 1 || metodo("segundo"));
        System.out.println("__________");
        System.out.println(1 == 1 ^ 1>2); //ou exclusivo - tabela verdade
        System.out.println(!(1 == 1));    //negacao - tabela verdade -  false

    }
}
//short circuit para && e ||, mas para ^ (ou esclusivo) nao há