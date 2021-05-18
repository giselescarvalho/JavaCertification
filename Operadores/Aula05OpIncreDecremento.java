public class Aula05OpIncreDecremento {
    public static void main (String args[]){
        int i = 100;
        i--;    //pós incremento
        System.out.println(i);
        System.out.println(++i); //pré incremento

        i += 4;
        System.out.println("+4= "+i);

        i -= 2;
        System.out.println("-2= "+i);

        i *= 4;
        System.out.println("*4= " +i);

        i /= 4;
        System.out.println("/4= " + i);

        i %= 10;
        System.out.println("%10= " +i);

        byte b = 15;   ///-127 a 128
        b += 113;       //num maximo 112 pra retornar 127
        System.out.println(b);

        int a = 15, bi = 100, c=3;
        a = (bi = c);       //atribuição
        System.out.println("a = " +bi);
    }
}