public class Aula01pt1 {

    String nomeUltimo = "carvalho"; //variável de instância
    static String meio = "s";         //variável estática pode ser acessada a partir de qualquer lugar

    public void m1(String nome) {
        int x=10;
        System.out.println(nome);  //variável local só existe dentro do bloco que foi acessada
    }

    public static void main (String[] args){
        Aula01pt1 t = new Aula01pt1();
        t.m1("gisele " + meio + " " + t.nomeUltimo);
    }
}

/*
    int y=0;
    public void metodoY(parametro Y){
      this.y = y;
    }
*/