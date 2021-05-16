class Aula07String {
    public static void main (String[] args){
        String string = "gis";
        //string.toUpperCase();//depois de criada a string nao muda, fica minúscula
        //System.out.println(string);
        string = string.toUpperCase();
        System.out.println(string);
        System.out.println(string.charAt(1));
        System.out.println(string.charAt(2));
        System.out.println(string.length()); //tamanho
        System.out.println(string.isEmpty());// está preenchida
        System.out.println(" ".isEmpty()); // preenchida com espaços
        System.out.println("".isEmpty());  //true pq está com 0 caracteres

        String cer = "   Bora tira a certificação   ".toUpperCase().trim();
        System.out.println(cer);

        String nomeDireito = "java";
        String nomeIndireto = new String ("java");
        System.out.println(nomeDireito.substring(1,3));

        char [] nome = new char[]{'j', 'a', 'v','a'};
        String nome1 = new String (nome);
        System.out.println(nome1);

        StringBuilder sb1 = new StringBuilder("JAVA");
        String nome2 = new String(sb1);
        System.out.println(nome2);

        String texto = "Ficando maluca tentando tirar a certificação java e aws";
        System.out.println(texto.indexOf("tirar")); //devolve a posição ou -1 se nao existir
        System.out.println(texto.lastIndexOf("a")); //última letra "a"
        System.out.println(texto.indexOf("r", 7)); // a partir de 7 procura a letra "r"
        System.out.println(texto.startsWith("Ficando")); //true pq realmente começa assim
        System.out.println(texto.endsWith("tirar"));     //false pq nao termina assim
    }
}
/* string.toUpperCase(); maiúsculo
   string.toLowerCase(); minúsculo
   trim() ;             tira espaços em branco da esquerda e direita
   substring;       recebe indice de começo e fim ou só começo e devolve uma substring
   concat;              adiciona e devolve uma string na string atual
   String replace(char oldChar, char newChar);
   String replace(CharSequence target, CharSequence replacement);
   "string 1".compareTo("String 2");         devolve 0 se for verdadeiro
   "Certificado".compareToIgnoreCase("certificado"); devolve 0
*/