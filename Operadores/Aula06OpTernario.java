public class Aula06OpTernario {
    public static void main(String args[]){
    //  condicao ? caso_verdadeira : caso_falsa
        int i = 5;
        int resultado = (i == 5 ) ? 100 : 0; // se i for tal valor, devolve 100, se nao (:) devolve zero
        System.out.println(resultado);
        System.out.println(i == 6  ? 100 : 0);// falso, devolve o segundo
                           // os valores devem ser compativeis para variaveis primitivas

    //  OPERADOR DE REFERENCIA
        System.out.println("______");
        String nome = "gis ";
        int tamanho = nome.length();// length é metodo
                          // ponto é o operador de referência
        System.out.println(tamanho);// devolve um numero

    //  OPERADOR DE CONCATENAÇÃO DE STRINGS
        String nomeCompl = "gisele " + "carva";
    //  STRING É A ÚNICA QUE ACEITA OS OPERADORES QUE SAO USADOS EM TIPOS PRIMITIVOS
        System.out.println(nomeCompl);
    }
}