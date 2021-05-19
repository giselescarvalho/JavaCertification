public class Aula07Casting {
    public static void main (String args[]){
        double d = 15.3;
        int i = (int) d; //Casting = um tipo maior, mais especifico, assumindo risco de perder infos colocando em um menor
        System.out.println(i);
    }
}
