public class Aula05TestaPessoa {
    public static void main (String [] args){
        Aula05Pessoa p = new Aula05Pessoa();
        p.setNome("GISZ", 20);

        String nome = p.getNome();
        System.out.println(nome);

        System.out.println(p.getNome());
        p.getNome();
    }
}
