public class Aula08Precedencia {
    public static void main (String args[]) {
        int a = 15 * 10 + 1;
        System.out.println(a); //sem precedencia, executado normal

        int b = 15 * (10 + 1); // 15 * 11, fez o 10+1 primeiro
        System.out.println(b);

        System.out.println(15 + 0 + "é cento e cinquente"); //nao está concatenando e sim somando
        System.out.println(15 + (0 + " é cento e cinquenta"));

        System.out.println(("gis"+"carv").length()); //com parenteses pega gis+carvalho

    }
}
