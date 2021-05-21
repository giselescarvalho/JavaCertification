public class Aula09IgualdadeStrings {
    public static void main (String args[]) {
        String nome = new String("Gisele");
        String nome1 = "Gisele"; //construção literal de String ""
        String nome2 = "Gisele";

        System.out.println(nome1 == nome2); //true, pq sao tipos iguais
        System.out.println(nome == nome1); //false, pq sao tipos diferentes

        System.out.println("com equals: " + nome.equals(nome2)); //true, com a utilização do equais

    }
}
