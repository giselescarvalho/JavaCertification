import java.util.ArrayList;
import java.util.List;

public class Aula01Operadores {
    public static void main(String args[]){

        ArrayList<String> lista = new ArrayList<>(); //referencia para objetos não é valor e sim referencias
        ArrayList<String> lista2 = lista; // referenciando o mesmo objeto na memória
                                            //está copiando a referência

        long idade = 12; //tipo primitivo, byte, short, int, long, double<float
    // byte -> short -> int -> long
    //float -> double
    //char tem o mesmo tamanho do short
        int a = 10;
        long b = 20;
        short c = 3;
        byte d = 4;

        double e = 30.0;
        float f = 40.3f;
        double g = 40.3f; //40.3f é float e está sendo colocada num double
    }
}